import robots.ResistanceEvaluable;

import java.util.List;
import java.util.stream.Collectors;

public class ResistanceReportPrinter {
        public String printReport(List<ResistanceEvaluable> robots) {
        String intro = "=== Resilience Test Reports ===";
        String report = "";
        report = robots.stream()
                .map(ResistanceEvaluable::getResistanceReport)
                .collect(Collectors.joining("\n"));
        return intro + "\n" + report;
    }

        //modifiqué la clase para que devuelva String y poder testearlo, además cambié el loop por un Stream.
    }

