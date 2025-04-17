package nl.hu.cisq2.simplemeeting.meeting;

import nl.hu.cisq2.simplemeeting.meeting.application.MeetingService;
import nl.hu.cisq2.simplemeeting.meeting.application.MeetingServiceInterface;
import nl.hu.cisq2.simplemeeting.meeting.application.dto.MeetingDtoTranslator;
import nl.hu.cisq2.simplemeeting.meeting.data.serialization.JsonMeetingSerializer;
import nl.hu.cisq2.simplemeeting.meeting.data.storage.FileMeetingDao;
import nl.hu.cisq2.simplemeeting.meeting.data.storage.InMemoryMeetingDao;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.nio.file.Paths;

@Configuration
@PropertySource("classpath:meeting.properties")
public class AppConfig {
    @Bean
    public JsonMeetingSerializer jsonMeetingSerializer() {
        return new JsonMeetingSerializer();
    }

    @Bean
    public InMemoryMeetingDao inMemoryMeetingDao() {
        return new InMemoryMeetingDao();
    }

    @Bean
    public FileMeetingDao fileMeetingDao(
            @Value("${storage.filePath}") String storageFile,
            InMemoryMeetingDao cache,
            JsonMeetingSerializer serializer
    ) {
        return new FileMeetingDao(Paths.get(storageFile), cache, serializer);
    }

    @Bean
    public MeetingDtoTranslator meetingDtoTranslator() {
        return new MeetingDtoTranslator();
    }

    @Bean
    public MeetingServiceInterface meetingService(
            MeetingDtoTranslator translator,
            FileMeetingDao dao
    ) {
        return new MeetingService(translator, dao);
    }
}
