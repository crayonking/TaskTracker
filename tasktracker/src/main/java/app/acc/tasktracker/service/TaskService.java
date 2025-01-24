package app.acc.tasktracker.service;

import app.acc.tasktracker.entity.Task;
import app.acc.tasktracker.form.TaskForm;


import java.util.List;

public interface TaskService {

    public List<Task> getAllTasks();

    public void addTask(TaskForm taskForm);
}
