package maas.common;

import io.cucumber.spring.CucumberContextConfiguration;
import maas.ReservationManagementApplication;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { ReservationManagementApplication.class })
public class CucumberSpingConfiguration {}
