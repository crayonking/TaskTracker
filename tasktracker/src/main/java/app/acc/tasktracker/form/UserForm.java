package app.acc.tasktracker.form;

import app.acc.tasktracker.entity.Task;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Data
@Getter
@Setter
public class UserForm {

    private Long id;

    private String username;

    private String password;

    private String email;

    private String role;

    private List<Task> createdTasks;

    private List<Task> assignedTasks;

}
