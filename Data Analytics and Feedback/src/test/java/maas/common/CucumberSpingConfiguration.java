package maas.common;

import io.cucumber.spring.CucumberContextConfiguration;
import maas.DataAnalyticsAndFeedbackApplication;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { DataAnalyticsAndFeedbackApplication.class })
public class CucumberSpingConfiguration {}
