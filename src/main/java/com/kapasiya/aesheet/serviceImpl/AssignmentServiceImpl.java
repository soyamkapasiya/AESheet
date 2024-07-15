package com.kapasiya.aesheet.serviceImpl;

import com.kapasiya.aesheet.entities.Assignment;
import com.kapasiya.aesheet.repository.AssignmentRepository;
import com.kapasiya.aesheet.servicesDef.AssignmentServiceDef;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AssignmentServiceImpl implements AssignmentServiceDef
{
    @Autowired
    AssignmentRepository assignmentRepository;

    @Override
    public Assignment saveAssignment(Assignment assignment)
    {
        return assignmentRepository.save(assignment);
    }

    @Override
    public Assignment getAssignment(long assignmentId)
    {
        return assignmentRepository.getReferenceById(assignmentId);
    }

    @Override
    public Assignment updateAssignment(Assignment assignment)
    {
        return null;
    }

    @Override
    public void deleteAssignment(long assignmentId)
    {
        assignmentRepository.deleteById(assignmentId);
    }
}
