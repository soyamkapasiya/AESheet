package com.kapasiya.aesheet.serviceImpl;

import com.kapasiya.aesheet.entities.Assignment;
import com.kapasiya.aesheet.exception.AssignmentNotFound;
import com.kapasiya.aesheet.repository.AssignmentRepository;
import com.kapasiya.aesheet.servicesDef.AssignmentServiceDef;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

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
    public List<Assignment> updateAssignmentDetails(Assignment assignment)
    {
        List<Assignment> list = assignmentRepository.findAll();

        for(Assignment assignment1: list)
        {
//            System.out.println(assignment1.getAssignmentId());
//            System.out.println(assignment.getAssignmentId());

            if (assignment.getAssignmentId()==assignment1.getAssignmentId())
            {
               assignment1.setStream(assignment.getStream());
               assignment1.setTopics(assignment.getTopics());
               assignment1.setDailyStatusUpdates(assignment.getDailyStatusUpdates());
               assignment1.setDate(assignment.getDate());

               return list;
            }
        }
        return null;
    }

    @Override
    public void deleteAssignment(long assignmentId)
    {
        assignmentRepository.deleteById(assignmentId);
    }
}
