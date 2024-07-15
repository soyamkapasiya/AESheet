package com.kapasiya.aesheet.servicesDef;

import com.kapasiya.aesheet.entities.Assignment;


public interface AssignmentServiceDef
{
    public Assignment saveAssignment(Assignment assignment);

    public Assignment getAssignment(long assignmentId);

    public Assignment updateAssignment(Assignment assignment);

    public void deleteAssignment(long assignmentId);
}
