package app.acc.tasktracker.controller;

import app.acc.tasktracker.entity.Task;
import app.acc.tasktracker.form.TaskForm;
import app.acc.tasktracker.service.TaskService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TaskTrackerController  implements  TaskApi{

    @Autowired
    TaskService taskService;

    @GetMapping("/allTasks")
    public ResponseEntity<List<Task>> getAllTasks() {

        List<Task> allTasks = taskService.getAllTasks();

        return new ResponseEntity<>(allTasks,HttpStatus.OK);
    }

    @PostMapping("/addTask")
    public ResponseEntity<Void> addTask(@RequestBody @Valid TaskForm taskForm) {
        taskService.addTask(taskForm);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

}
