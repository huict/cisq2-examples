package nl.hu.cisq2.simplemeeting.meeting.presentation;

import nl.hu.cisq2.simplemeeting.meeting.application.MeetingServiceInterface;
import nl.hu.cisq2.simplemeeting.meeting.application.dto.InviteeDto;
import nl.hu.cisq2.simplemeeting.meeting.application.dto.MeetingDto;
import nl.hu.cisq2.simplemeeting.meeting.application.dto.RescheduleDto;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("meetings")
public class MeetingController {
    private MeetingServiceInterface service;

    public MeetingController(MeetingServiceInterface service) {
        this.service = service;
    }

    @GetMapping(produces = "application/json")
    public List<MeetingDto> getAll() {
        return this.service.listAll();
    }

    @GetMapping(
            path = "/{id}",
            produces = "application/json"
    )
    public List<MeetingDto> getById(@PathVariable String id) {
        return this.service.showMeeting(UUID.fromString(id));
    }

    @PostMapping(produces = "application/json")
    public void newMeeting(@RequestBody @Validated MeetingDto meeting) {
        this.service.scheduleMeeting(meeting);
    }

    @PostMapping(
            path = "/{id}/invitees",
            consumes = "application/json"
    )
    public void invitePerson(
            @PathVariable String id,
            @RequestBody InviteeDto invitee
    ) {
            invitee.meetingId = id;
            this.service.invite(invitee);
    }

    @PutMapping(
            path = "/{id}/invitees/{person}",
            consumes = "application/json"
    )
    public void changeResponseForPerson(
            @PathVariable String id,
            @PathVariable String person,
            @RequestBody InviteeDto invitee
    ) {
        invitee.meetingId = id;
        invitee.person = person;

        this.service.respond(invitee);
    }

    @PatchMapping(
            path = "/{id}",
            consumes = "application/json"
    )
    public void reschedule(
            @PathVariable String id,
            @Validated @RequestBody RescheduleDto rescheduling
    ) {
        rescheduling.meetingId = id;
        this.service.reschedule(rescheduling);
    }
}
