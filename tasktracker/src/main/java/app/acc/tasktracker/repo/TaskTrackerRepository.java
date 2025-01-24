package app.acc.tasktracker.repo;

import app.acc.tasktracker.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskTrackerRepository extends JpaRepository<Task,Long> {

}
