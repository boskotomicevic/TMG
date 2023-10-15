package com.example.tmg;

import java.io.Serializable;

public class taskObject implements Serializable {
    // OVDE JE SVE DOBRO I KAKO TREBA

    private String taskname;
    private double tasklenght;

    public void setTaskName(String taskname){this.taskname = taskname;}
    public String getTaskname(){return taskname;}

    public void setTaskLenght(double tasklenght){this.tasklenght = tasklenght;}
    public double getTasklenght(){return tasklenght;}

    public taskObject(String taskName, double taskLenght){
        setTaskName(taskName);
        setTaskLenght(taskLenght);
    }
}
