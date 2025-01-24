package app.acc.tasktracker.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name="tasks")
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 255)
    private String title;

    @Column(columnDefinition = "TEXT")
    private String description;

    @Column(length = 20, nullable = false)
    private String status = "PENDING"; // PENDING, IN_PROGRESS, COMPLETED

    private LocalDate dueDate;

    @ManyToOne
    @JoinColumn(name = "created_by", nullable = false)
    @JsonBackReference("createdBy")
    private User createdBy; // Team lead who created the task

    @ManyToOne
    @JoinColumn(name = "assigned_to", nullable = false)
    @JsonBackReference("assignedTo")
    private User assignedTo; // Employee assigned to the task


}
