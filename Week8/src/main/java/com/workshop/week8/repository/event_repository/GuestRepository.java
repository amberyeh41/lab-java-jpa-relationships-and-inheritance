package com.workshop.week8.repository.event_repository;

import com.workshop.week8.enums.event_system.GuestStatus;
import com.workshop.week8.model.event_system.Guest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface GuestRepository extends JpaRepository<Guest, Long> {
    List<Guest> findByStatus(GuestStatus status);
}
