package com.workshop.week8.repository.task_system;

import com.workshop.week8.model.task_system.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
}
