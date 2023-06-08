package maas.infra;

import maas.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class PassengerLocationHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<PassengerLocation>> {

    @Override
    public EntityModel<PassengerLocation> process(
        EntityModel<PassengerLocation> model
    ) {
        return model;
    }
}
