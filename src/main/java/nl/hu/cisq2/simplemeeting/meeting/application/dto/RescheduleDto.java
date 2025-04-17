package nl.hu.cisq2.simplemeeting.meeting.application.dto;


import jakarta.validation.constraints.NotEmpty;

public class RescheduleDto {
    public String meetingId;

    @NotEmpty
    public String start;

    @NotEmpty
    public String end;
}
