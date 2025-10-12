package com.example.taskmanager.controller;

import com.example.taskmanager.model.Task;
import com.example.taskmanager.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    @Autowired
    private TaskRepository taskRepository;

    @GetMapping
    public List<Task> getAllTasks()
    {
        return taskRepository.findAll();
    }

    @PostMapping
    public Task createTask(@RequestBody Task task)
    {
        return taskRepository.save(task);
    }

    @GetMapping("/(id)")
    public Task getTaskById(@PathVariable Long id)
    {
        return taskRepository.findById(id).orElse(null);
    }

    @PutMapping("/{id}")
    public Task updateTask(@PathVariable Long id, @RequestBody Task taskDetails)
    {
        Task task = taskRepository.findById(id).orElse(null);
        if(task != null)
        {
            task.setTitle(taskDetails.getTitle());
            task.setDescription(taskDetails.getDescription());
            task.setCompleted(taskDetails.isCompleted());
            return taskRepository.save(task);
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public String deleteTask(@PathVariable Long id)
    {
        taskRepository.deleteById(id);
        return "Task deleted";
    }
}
