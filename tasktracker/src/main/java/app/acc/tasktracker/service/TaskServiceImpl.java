package app.acc.tasktracker.service;

import app.acc.tasktracker.entity.Task;
import app.acc.tasktracker.entity.User;
import app.acc.tasktracker.form.TaskForm;
import app.acc.tasktracker.repo.TaskTrackerRepository;
import app.acc.tasktracker.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskServiceImpl implements  TaskService{

    @Autowired
    private TaskTrackerRepository taskTrackerRepository;

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<Task> getAllTasks() {
        return taskTrackerRepository.findAll();
    }

//    @Override
//    public void addTask(TaskForm taskForm) {
//
//    }

    public  void addTask(TaskForm taskForm) {

//        User createdBy = userRepository.findById(taskForm.getCreatedBy())
//                .orElseThrow(() -> new RuntimeException("User not found with id " + taskForm.getCreatedBy().getId()));
//        User assignedTo = userRepository.findById(taskForm.getAssignedTo().getId())
//                .orElseThrow(() -> new RuntimeException("User not found with id " + taskForm.getAssignedTo().getId()));

        Task task = new Task();
        task.setTitle(taskForm.getTitle());
        task.setDescription(taskForm.getDescription());
        task.setStatus(taskForm.getStatus());
        task.setDueDate(taskForm.getDueDate());
        task.setCreatedBy(taskForm.getCreatedBy());
        task.setAssignedTo(taskForm.getAssignedTo());

        taskTrackerRepository.save(task);
    }
}
