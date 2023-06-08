package maas.domain;

import maas.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(
    collectionResourceRel = "assistanceStatistics",
    path = "assistanceStatistics"
)
public interface AssistanceStatisticsRepository
    extends
        PagingAndSortingRepository<AssistanceStatistics, java.lang.String> {}
