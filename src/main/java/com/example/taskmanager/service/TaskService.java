package com.example.taskmanager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.taskmanager.entity.Task;
import com.example.taskmanager.repository.TaskRepository;

@Service
public class TaskService {
    @Autowired
    private TaskRepository repository;

    public Task createtask(Task task){
        return repository.save(task);
    }

    public Task findTask(Long id){
        return repository.findById(id).orElseThrow(() -> new RuntimeException("Task was not found with id:" + id));
    }

    public Task updateTask(long id, String updateTask){
        Task task = findTask(id);
        task.setTask(updateTask);
        return repository.save(task);
    }

    public boolean deleteTask(long id){
        if (repository.existsById(id)){
            repository.deleteById(id);
            return true;
        }
        else return false;
    }
}
