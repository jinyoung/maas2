package maas.domain;

import maas.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(
    collectionResourceRel = "passengerLocations",
    path = "passengerLocations"
)
public interface PassengerLocationRepository
    extends PagingAndSortingRepository<PassengerLocation, java.lang.String> {}
