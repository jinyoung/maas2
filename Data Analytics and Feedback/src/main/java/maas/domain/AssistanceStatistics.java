package maas.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import maas.DataAnalyticsAndFeedbackApplication;

@Entity
@Table(name = "AssistanceStatistics_table")
@Data
public class AssistanceStatistics {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private java.lang.String statisticId;

    private java.lang.String assistanceType;

    private java.lang.Integer numberOfRequests;

    private java.lang.Float averageResponseTime;

    public static AssistanceStatisticsRepository repository() {
        AssistanceStatisticsRepository assistanceStatisticsRepository = DataAnalyticsAndFeedbackApplication.applicationContext.getBean(
            AssistanceStatisticsRepository.class
        );
        return assistanceStatisticsRepository;
    }
}
