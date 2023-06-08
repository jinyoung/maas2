package maas.domain;

import maas.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(
    collectionResourceRel = "driverNotifications",
    path = "driverNotifications"
)
public interface DriverNotificationRepository
    extends PagingAndSortingRepository<DriverNotification, java.lang.String> {}
