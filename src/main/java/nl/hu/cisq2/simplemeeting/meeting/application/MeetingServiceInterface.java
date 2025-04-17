package nl.hu.cisq2.simplemeeting.meeting.application;

import nl.hu.cisq2.simplemeeting.meeting.application.dto.InviteeDto;
import nl.hu.cisq2.simplemeeting.meeting.application.dto.MeetingDto;
import nl.hu.cisq2.simplemeeting.meeting.application.dto.RescheduleDto;

import java.util.List;
import java.util.UUID;

public interface MeetingServiceInterface {
    void scheduleMeeting(MeetingDto dto);
    List<MeetingDto> showMeeting(UUID meetingId);
    void invite(InviteeDto invitee);
    void respond(InviteeDto invitee);
    void reschedule(RescheduleDto rescheduling);
    List<MeetingDto> listAll();
}
