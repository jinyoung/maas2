package maas.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import maas.CustomerServiceAndSupportApplication;

@Entity
@Table(name = "AssistanceRequest_table")
@Data
public class AssistanceRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private java.lang.String requestId;

    private java.lang.String passengerName;

    private java.lang.String requesterName;

    private java.lang.String requestStatus;

    @PrePersist
    public void onPrePersist() {}

    public static AssistanceRequestRepository repository() {
        AssistanceRequestRepository assistanceRequestRepository = CustomerServiceAndSupportApplication.applicationContext.getBean(
            AssistanceRequestRepository.class
        );
        return assistanceRequestRepository;
    }
}
