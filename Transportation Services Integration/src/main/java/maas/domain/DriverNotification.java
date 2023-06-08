package maas.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import maas.TransportationServicesIntegrationApplication;
import maas.domain.AssistanceRequestReceived;

@Entity
@Table(name = "DriverNotification_table")
@Data
public class DriverNotification {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private java.lang.String notificationId;

    private java.lang.String driverName;

    private java.lang.String notificationType;

    @PostPersist
    public void onPostPersist() {
        AssistanceRequestReceived assistanceRequestReceived = new AssistanceRequestReceived(
            this
        );
        assistanceRequestReceived.publishAfterCommit();
    }

    public static DriverNotificationRepository repository() {
        DriverNotificationRepository driverNotificationRepository = TransportationServicesIntegrationApplication.applicationContext.getBean(
            DriverNotificationRepository.class
        );
        return driverNotificationRepository;
    }
}
