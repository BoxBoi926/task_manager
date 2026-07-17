package com.example.taskmanager.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.taskmanager.entity.Task;
import com.example.taskmanager.service.TaskService;

@RestController
public class TaskController {
    @Autowired
    private TaskService taskService;

    @PostMapping("/tasks/create")
    public Task createTask(@RequestBody Task task) {
        return taskService.createtask(task);
    }

    @GetMapping("/tasks/findTask/{id}")
    public Task findTask(@PathVariable Long id) {
        return taskService.findTask(id);
    }

    @PutMapping("/tasks/update/{id}")
    public Task updateTask(@PathVariable Long id, @RequestBody Task task) {
        return taskService.updateTask(id,task.getTask());
    }

    @DeleteMapping("/tasks/delete/{id}")
    public boolean deleteTask(@PathVariable Long id) {
        return taskService.deleteTask(id);
    }
}
