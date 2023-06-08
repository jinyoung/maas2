package maas.common;

import io.cucumber.spring.CucumberContextConfiguration;
import maas.CustomerServiceAndSupportApplication;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { CustomerServiceAndSupportApplication.class })
public class CucumberSpingConfiguration {}
