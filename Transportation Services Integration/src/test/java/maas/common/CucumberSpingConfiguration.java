package maas.common;

import io.cucumber.spring.CucumberContextConfiguration;
import maas.TransportationServicesIntegrationApplication;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(
    classes = { TransportationServicesIntegrationApplication.class }
)
public class CucumberSpingConfiguration {}
