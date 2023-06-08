package maas.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import maas.TransportationServicesIntegrationApplication;
import maas.domain.PassengerLocationUpdated;
import maas.domain.SpecialAssistanceRequested;

@Entity
@Table(name = "PassengerLocation_table")
@Data
public class PassengerLocation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private java.lang.String passengerName;

    private java.lang.String currentLocation;

    private java.util.Date locationLastUpdate;

    @PostPersist
    public void onPostPersist() {
        PassengerLocationUpdated passengerLocationUpdated = new PassengerLocationUpdated(
            this
        );
        passengerLocationUpdated.publishAfterCommit();

        SpecialAssistanceRequested specialAssistanceRequested = new SpecialAssistanceRequested(
            this
        );
        specialAssistanceRequested.publishAfterCommit();
    }

    @PrePersist
    public void onPrePersist() {}

    public static PassengerLocationRepository repository() {
        PassengerLocationRepository passengerLocationRepository = TransportationServicesIntegrationApplication.applicationContext.getBean(
            PassengerLocationRepository.class
        );
        return passengerLocationRepository;
    }
}
