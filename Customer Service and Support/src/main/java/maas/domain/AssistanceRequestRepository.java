package maas.domain;

import maas.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(
    collectionResourceRel = "assistanceRequests",
    path = "assistanceRequests"
)
public interface AssistanceRequestRepository
    extends PagingAndSortingRepository<AssistanceRequest, java.lang.String> {}
