package app.acc.tasktracker.controller;

import app.acc.tasktracker.entity.Task;
import app.acc.tasktracker.form.TaskForm;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface TaskApi {
    public ResponseEntity<List<Task>> getAllTasks();

    public ResponseEntity<Void> addTask(@RequestBody @Valid TaskForm taskForm);
}
