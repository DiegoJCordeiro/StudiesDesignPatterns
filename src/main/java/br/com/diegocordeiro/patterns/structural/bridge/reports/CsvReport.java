package br.com.diegocordeiro.patterns.structural.bridge.reports;

import br.com.diegocordeiro.patterns.structural.bridge.models.Record;

import java.util.List;

public class CsvReport implements Report {

    private static final String COLUMN_TITLES = "NAME, LASTNAME, AGE, ENTRY DATE HOUR, DEPARTURE DATE HOUR";
    private static final String BREAK_LINE = "\n";
    private static final String COMMA = ",";
    private static final String SPACE = " ";

    @Override
    public String generateReport(List<Record> records) {

        System.out.println(SPACE);
        System.out.println("----- Generating CSV File -----");
        System.out.println("----- -----");

        StringBuilder builder = new StringBuilder();
        builder.append(COLUMN_TITLES);
        builder.append(BREAK_LINE);

        for(Record record: records) {

            builder.append(record.getName()).append(COMMA);
            builder.append(record.getLastname()).append(COMMA);
            builder.append(record.getAge()).append(COMMA);
            builder.append(record.getEntryDateHour().toString()).append(COMMA);
            builder.append(record.getDepartureDateHour().toString()).append(BREAK_LINE);
        }

        return builder.toString();
    }
}
