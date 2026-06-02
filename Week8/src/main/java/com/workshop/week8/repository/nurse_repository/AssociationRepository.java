package com.workshop.week8.repository.nurse_repository;

import com.workshop.week8.model.nurse_management.Association;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssociationRepository extends JpaRepository<Association, Long> {
}
