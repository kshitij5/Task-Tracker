package com.tasktracker.backend.service;

import com.tasktracker.backend.model.Task;

import java.util.List;

public interface TaskService {
    public List<Task> getAllTask();
    public Task getTaskById(Integer id);
    public Task addTask(Task task);
    public Task updateTask(Task task);
    public void deleteTask(Integer id);
}