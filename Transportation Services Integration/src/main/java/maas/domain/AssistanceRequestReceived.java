package maas.domain;

import java.util.*;
import lombok.*;
import maas.domain.*;
import maas.infra.AbstractEvent;

@Data
@ToString
public class AssistanceRequestReceived extends AbstractEvent {

    private java.lang.String passengerName;
    private java.lang.String assistanceType;

    public AssistanceRequestReceived(DriverNotification aggregate) {
        super(aggregate);
    }

    public AssistanceRequestReceived() {
        super();
    }
}
