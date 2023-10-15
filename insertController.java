package com.example.tmg;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

import java.io.*;
import java.util.ArrayList;
import java.util.ListIterator;

public class insertController implements Serializable {
    @FXML
    private TextField taskName;
    @FXML
    private TextField taskLenght;
    @FXML
    private DatePicker taskDate;
    @FXML
    private Button saveData;

    // ovde ovo 'com.example.taskmanagergui.Task' jer je to nasa Task klasa iz ovog paketa
    ArrayList<taskObject> alt = new ArrayList<>();
    ListIterator list = null;

    File file = new File("taskTest.txt");

    ObjectOutputStream out = null;
    ObjectInputStream oin = null;

    public void save() throws IOException, ClassNotFoundException {
        if (file.isFile()) {
            oin = new ObjectInputStream(new FileInputStream(file));
            alt = (ArrayList<taskObject>) oin.readObject();
            oin.close();
        }

        String taskname = taskName.getText();
        double tasklenght = Double.parseDouble(taskLenght.getText());


        alt.add(new taskObject(taskname, tasklenght));

        out = new ObjectOutputStream(new FileOutputStream(file));
        out.writeObject(alt);
        out.close();

    }

}
