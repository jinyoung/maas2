package maas.infra;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import javax.naming.NameParser;
import javax.naming.NameParser;
import javax.transaction.Transactional;
import maas.config.kafka.KafkaProcessor;
import maas.domain.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class PolicyHandler {

    @Autowired
    FeedbackRepository feedbackRepository;

    @Autowired
    AssistanceRequestRepository assistanceRequestRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString) {}

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='ReservationMade'"
    )
    public void wheneverReservationMade_AutoFeedback(
        @Payload ReservationMade reservationMade
    ) {
        ReservationMade event = reservationMade;
        System.out.println(
            "\n\n##### listener AutoFeedback : " + reservationMade + "\n\n"
        );
        // Sample Logic //

    }
}
