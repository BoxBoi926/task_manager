package com.example.taskmanager.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor

public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long taskId;
    private String task;

    @Enumerated(EnumType.STRING)
    private Priority priority;

    public Task(String task, Priority priority){
        this.task = task;
        this.priority = priority;
    }
}
