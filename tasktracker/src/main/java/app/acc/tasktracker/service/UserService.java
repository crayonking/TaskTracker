package app.acc.tasktracker.service;

import app.acc.tasktracker.entity.User;
import app.acc.tasktracker.form.TaskForm;
import app.acc.tasktracker.form.UserForm;

import java.util.List;

public interface UserService {

    public List<User> getAllUsers();

    public void addUser(UserForm userForm);

    public void deleteUser(long id);
}
