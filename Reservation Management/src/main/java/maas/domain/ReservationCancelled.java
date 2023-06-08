package maas.domain;

import java.util.*;
import lombok.*;
import maas.domain.*;
import maas.infra.AbstractEvent;

@Data
@ToString
public class ReservationCancelled extends AbstractEvent {

    private java.lang.String reservationId;

    public ReservationCancelled(Reservation aggregate) {
        super(aggregate);
    }

    public ReservationCancelled() {
        super();
    }
}
