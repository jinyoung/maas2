package maas.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Data
public class CancelReservationCommand {

    private java.lang.String reservationId;
}
