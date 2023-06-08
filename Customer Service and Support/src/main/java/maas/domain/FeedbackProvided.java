package maas.domain;

import java.util.*;
import lombok.*;
import maas.domain.*;
import maas.infra.AbstractEvent;

@Data
@ToString
public class FeedbackProvided extends AbstractEvent {

    private java.lang.String feedbackId;

    public FeedbackProvided(Feedback aggregate) {
        super(aggregate);
    }

    public FeedbackProvided() {
        super();
    }
}
