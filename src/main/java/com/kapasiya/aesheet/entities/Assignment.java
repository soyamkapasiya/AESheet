package com.kapasiya.aesheet.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Assignment
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long assignmentId;

    private String stream;

    private String topics;

    private String dailyStatusUpdates;

    private String date;

    public Assignment()
    {

    }
    public Assignment(String stream, String topics, String dailyStatusUpdates, String date) {
        this.stream = stream;
        this.topics = topics;
        this.dailyStatusUpdates = dailyStatusUpdates;
        this.date = date;
    }

    public long getAssignmentId() {
        return assignmentId;
    }

    public void setAssignmentId(int assignmentId) {
        this.assignmentId = assignmentId;
    }

    public String getStream() {
        return stream;
    }

    public void setStream(String stream) {
        this.stream = stream;
    }

    public String getTopics() {
        return topics;
    }

    public void setTopics(String topics) {
        this.topics = topics;
    }

    public String getDailyStatusUpdates() {
        return dailyStatusUpdates;
    }

    public void setDailyStatusUpdates(String dailyStatusUpdates) {
        this.dailyStatusUpdates = dailyStatusUpdates;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Assignment{" +
                "assignmentId=" + assignmentId +
                ", stream='" + stream + '\'' +
                ", topics='" + topics + '\'' +
                ", dailyStatusUpdates='" + dailyStatusUpdates + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
