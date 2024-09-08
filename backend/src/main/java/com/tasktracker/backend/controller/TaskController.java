package com.tasktracker.backend.controller;

import com.tasktracker.backend.model.Task;
import com.tasktracker.backend.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/tasks/")
public class TaskController {

    @Autowired
    private TaskService taskService;

    @GetMapping()
    public List<Task> getTasks() {
        return taskService.getAllTask();
    }


    @GetMapping()
    public Task getTasksById(Integer id) {
        return taskService.getTaskById(id);
    }


    @PostMapping()
    public Task setTask(Task task) {
        return taskService.addTask(task);
    }


    @DeleteMapping()
    public void removeTask(Integer id) {
         taskService.deleteTask(id);
    }
}