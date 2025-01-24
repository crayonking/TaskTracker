package app.acc.tasktracker.controller;

import app.acc.tasktracker.entity.User;
import app.acc.tasktracker.form.UserForm;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface UserApi {

    public List<User> getAllUsers();

    public ResponseEntity<Void> addUser(@RequestBody @Valid UserForm userForm);

    public ResponseEntity<Void> deleteUser(@PathVariable("id") long id);
}
