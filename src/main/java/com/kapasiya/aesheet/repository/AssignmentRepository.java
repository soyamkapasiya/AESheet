package com.kapasiya.aesheet.repository;

import com.kapasiya.aesheet.entities.Assignment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssignmentRepository extends JpaRepository<Assignment, Long>
{

}
