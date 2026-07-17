package com.example.taskmanager.entity;

public class Task {
    private int taskId;
    private String task;
    private Priority priority;

    public Task(String task, Priority priority){
        this.task = task;
        this.priority = priority;
    }
}
