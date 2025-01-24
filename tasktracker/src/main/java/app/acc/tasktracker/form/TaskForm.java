package app.acc.tasktracker.form;

import app.acc.tasktracker.entity.User;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Data
@Getter
@Setter
public class TaskForm {


    private Long id;

    @NotBlank(message="Title cannot be empty")
    private String title;

    private String description;

    private String status = "PENDING"; // PENDING, IN_PROGRESS, COMPLETED

    private LocalDate dueDate;

    private User createdBy; // Team lead who created the task

    private User assignedTo;

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getStatus() {
        return status;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public User getCreatedBy() {
        return createdBy;
    }

    public User getAssignedTo() {
        return assignedTo;
    }
}
