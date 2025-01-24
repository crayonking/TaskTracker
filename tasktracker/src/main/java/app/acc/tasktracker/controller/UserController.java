package app.acc.tasktracker.controller;

import app.acc.tasktracker.entity.User;
import app.acc.tasktracker.form.UserForm;
import app.acc.tasktracker.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/allUsers")
    public ResponseEntity<List<User>> getAllUsers() {

        return new  ResponseEntity<>(userService.getAllUsers(),HttpStatus.OK);

    }

    @PostMapping("/addUser")
    public  ResponseEntity<Void> addUser(@RequestBody @Valid UserForm userForm) {
        userService.addUser(userForm);
        return  new ResponseEntity<>(HttpStatus.CREATED);
    }

    @DeleteMapping("/deleteUser/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable("id") long id) {

        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
