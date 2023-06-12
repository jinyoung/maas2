package maas.domain;

import java.util.*;
import lombok.*;
import maas.domain.*;
import maas.infra.AbstractEvent;

@Data
@ToString
public class ReservationMade extends AbstractEvent {

    private java.lang.String reservationId;
}
