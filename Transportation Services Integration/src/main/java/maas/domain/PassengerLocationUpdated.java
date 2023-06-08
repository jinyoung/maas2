package maas.domain;

import java.util.*;
import lombok.*;
import maas.domain.*;
import maas.infra.AbstractEvent;

@Data
@ToString
public class PassengerLocationUpdated extends AbstractEvent {

    private java.lang.String passengerName;
    private java.lang.String updatedLocation;

    public PassengerLocationUpdated(PassengerLocation aggregate) {
        super(aggregate);
    }

    public PassengerLocationUpdated() {
        super();
    }
}
