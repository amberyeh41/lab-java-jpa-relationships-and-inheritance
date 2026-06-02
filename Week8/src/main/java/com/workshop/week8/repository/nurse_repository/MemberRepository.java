package com.workshop.week8.repository.nurse_repository;

import com.workshop.week8.model.nurse_management.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
}
