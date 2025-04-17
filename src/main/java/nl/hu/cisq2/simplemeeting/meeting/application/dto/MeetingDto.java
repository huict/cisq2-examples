package nl.hu.cisq2.simplemeeting.meeting.application.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

import java.util.HashMap;
import java.util.Map;

public class MeetingDto {
    public String id;

    @NotNull
    public String description;

    @NotNull
    public String start;

    @NotNull
    public String end;

    @NotEmpty
    public Map<String, String> invitees = new HashMap<>();
}
