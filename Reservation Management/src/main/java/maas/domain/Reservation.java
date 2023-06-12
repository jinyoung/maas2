package maas.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import maas.ReservationManagementApplication;
import maas.domain.ReservationMade;

@Entity
@Table(name = "Reservation_table")
@Data
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private java.lang.String reservationId;

    private java.lang.String passengerName;

    private java.lang.String assistanceType;

    @PostPersist
    public void onPostPersist() {
        ReservationMade reservationMade = new ReservationMade(this);
        reservationMade.publishAfterCommit();
    }

    @PrePersist
    public void onPrePersist() {}

    public static ReservationRepository repository() {
        ReservationRepository reservationRepository = ReservationManagementApplication.applicationContext.getBean(
            ReservationRepository.class
        );
        return reservationRepository;
    }

    public void cancelReservation(
        CancelReservationCommand cancelReservationCommand
    ) {
        //implement business logic here:

        ReservationCancelled reservationCancelled = new ReservationCancelled(
            this
        );
        reservationCancelled.publishAfterCommit();
    }
}
