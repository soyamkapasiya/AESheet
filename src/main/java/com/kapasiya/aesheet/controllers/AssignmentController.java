package com.kapasiya.aesheet.controllers;

import com.kapasiya.aesheet.entities.Assignment;
import com.kapasiya.aesheet.repository.AssignmentRepository;
import com.kapasiya.aesheet.servicesDef.AssignmentServiceDef;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class AssignmentController
{
    @Autowired
    AssignmentRepository assignmentRepository;

    @Autowired
    AssignmentServiceDef assignmentServiceDef;

    @PostMapping("/assignment")
    public Assignment saveAssignment(@RequestBody Assignment assignment)
    {
        return assignmentRepository.save(assignment);
    }

    @GetMapping("/assignment")
    public List<Assignment> getAllAssignments()
    {
        return assignmentRepository.findAll();
    }

    @GetMapping("/assignment/{id}")
    public Optional<Assignment> getAssignmentById(@PathVariable long id)
    {
        return assignmentRepository.findById(id);
    }

    @DeleteMapping("/assignment/{id}")
    public void deleteAssignmentById(@PathVariable long id)
    {
        assignmentRepository.deleteById(id);
    }
}
