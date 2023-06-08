package maas.domain;

import java.util.*;
import lombok.*;
import maas.domain.*;
import maas.infra.AbstractEvent;

@Data
@ToString
public class SpecialAssistanceRequested extends AbstractEvent {

    private java.lang.String passengerName;
    private java.lang.String assistanceType;

    public SpecialAssistanceRequested(PassengerLocation aggregate) {
        super(aggregate);
    }

    public SpecialAssistanceRequested() {
        super();
    }
}
