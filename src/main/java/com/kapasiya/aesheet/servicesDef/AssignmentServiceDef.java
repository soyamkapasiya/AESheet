package com.kapasiya.aesheet.servicesDef;

import com.kapasiya.aesheet.entities.Assignment;
import org.springframework.stereotype.Component;

import java.util.List;


public interface AssignmentServiceDef
{
    public Assignment saveAssignment(Assignment assignment);

    public Assignment getAssignment(long assignmentId);

    public List<Assignment> updateAssignmentDetails(Assignment assignment);

    public void deleteAssignment(long assignmentId);
}
