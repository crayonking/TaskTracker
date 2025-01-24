package app.acc.tasktracker.service;

import app.acc.tasktracker.entity.User;
import app.acc.tasktracker.form.TaskForm;
import app.acc.tasktracker.form.UserForm;
import app.acc.tasktracker.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    UserRepository userRepository;

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public void addUser(UserForm userForm) {

        User user = new User();

        user.setId(userForm.getId());
        user.setAssignedTasks(userForm.getAssignedTasks());
        user.setCreatedTasks(userForm.getCreatedTasks());
        user.setEmail(userForm.getEmail());
        user.setRole(userForm.getRole());
        user.setPassword(userForm.getPassword());
        user.setUsername(userForm.getUsername());

        userRepository.save(user);

    }

    @Override
    public void deleteUser(long id) {
        userRepository.deleteById(id);
    }

}
