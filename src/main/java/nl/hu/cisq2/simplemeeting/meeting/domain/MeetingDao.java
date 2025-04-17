package nl.hu.cisq2.simplemeeting.meeting.domain;

import nl.hu.cisq2.simplemeeting.meeting.domain.error.CouldNotLoad;
import nl.hu.cisq2.simplemeeting.meeting.domain.error.CouldNotSave;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface MeetingDao {
    void save(Meeting meeting) throws CouldNotSave;
    List<Meeting> listAll() throws CouldNotLoad;
    Optional<Meeting> getById(UUID id) throws CouldNotLoad;
    void delete(Meeting meeting) throws CouldNotSave;
}
