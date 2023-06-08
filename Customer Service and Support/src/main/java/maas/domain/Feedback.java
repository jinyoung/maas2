package maas.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import maas.CustomerServiceAndSupportApplication;
import maas.domain.FeedbackProvided;

@Entity
@Table(name = "Feedback_table")
@Data
public class Feedback {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private java.lang.String feedbackId;

    private java.lang.String feedbackText;

    @PostPersist
    public void onPostPersist() {
        FeedbackProvided feedbackProvided = new FeedbackProvided(this);
        feedbackProvided.publishAfterCommit();
    }

    @PrePersist
    public void onPrePersist() {}

    public static FeedbackRepository repository() {
        FeedbackRepository feedbackRepository = CustomerServiceAndSupportApplication.applicationContext.getBean(
            FeedbackRepository.class
        );
        return feedbackRepository;
    }
}
