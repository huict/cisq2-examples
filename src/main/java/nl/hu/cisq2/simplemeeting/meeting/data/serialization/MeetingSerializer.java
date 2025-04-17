package nl.hu.cisq2.simplemeeting.meeting.data.serialization;

import nl.hu.cisq2.simplemeeting.meeting.domain.Meeting;

import java.util.List;

public interface MeetingSerializer {
    String serialize(List<Meeting> meetings);
    List<Meeting> deserialize(String meetingsData);
}
