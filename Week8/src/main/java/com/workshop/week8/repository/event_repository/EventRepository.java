package com.workshop.week8.repository.event_repository;

import com.workshop.week8.model.event_system.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventRepository extends JpaRepository<Event, Long> {
}
