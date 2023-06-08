package maas.infra;

import maas.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class AssistanceRequestHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<AssistanceRequest>> {

    @Override
    public EntityModel<AssistanceRequest> process(
        EntityModel<AssistanceRequest> model
    ) {
        return model;
    }
}
