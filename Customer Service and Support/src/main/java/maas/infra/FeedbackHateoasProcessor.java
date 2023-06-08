package maas.infra;

import maas.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class FeedbackHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<Feedback>> {

    @Override
    public EntityModel<Feedback> process(EntityModel<Feedback> model) {
        return model;
    }
}
