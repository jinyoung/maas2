package maas.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Data
public class MakeReservationCommand {

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private java.lang.String passengerName;

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private java.lang.String assistanceType;
}
