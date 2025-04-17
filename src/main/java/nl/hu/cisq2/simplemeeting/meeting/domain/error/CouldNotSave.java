package nl.hu.cisq2.simplemeeting.meeting.domain.error;

public class CouldNotSave extends RuntimeException {
    public CouldNotSave(Throwable cause) {
        super(cause);
    }
}
