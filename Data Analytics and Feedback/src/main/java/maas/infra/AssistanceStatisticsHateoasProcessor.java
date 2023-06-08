package maas.infra;

import maas.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class AssistanceStatisticsHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<AssistanceStatistics>> {

    @Override
    public EntityModel<AssistanceStatistics> process(
        EntityModel<AssistanceStatistics> model
    ) {
        return model;
    }
}
