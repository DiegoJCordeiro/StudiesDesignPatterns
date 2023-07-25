package br.com.diegocordeiro.patterns.structural.bridge.reports;

import br.com.diegocordeiro.patterns.structural.bridge.models.Record;

import java.util.List;

public class JsonReport implements Report {
    private static final String BREAK_LINE = "\n";
    private static final String COMMA = ",";
    private static final String DOUBLE_POINTS = ":";
    private static final String OPEN_BRACES = "{";
    private static final String CLOSE_BRACES = "}";
    private static final String OPEN_SQUARE_BRACKETS = "[";
    private static final String CLOSE_SQUARE_BRACKETS = "]";
    private static final String QUOTATION_MARKS = "\"";
    private static final String SPACE = " ";

    @Override
    public String generateReport(List<Record> records) {

        System.out.println(SPACE);
        System.out.println("----- Generating JSON File -----");
        System.out.println("----- -----");

        StringBuilder builder = new StringBuilder();

        builder.append(BREAK_LINE)
                .append(OPEN_SQUARE_BRACKETS)
                .append(BREAK_LINE);

        for (Record record: records){
            builder.append(SPACE).append(OPEN_BRACES);
            builder.append(QUOTATION_MARKS)
                    .append("name")
                    .append(QUOTATION_MARKS)
                    .append(DOUBLE_POINTS);
            builder.append(QUOTATION_MARKS)
                    .append(record.getName())
                    .append(QUOTATION_MARKS)
                    .append(COMMA);

            builder.append(QUOTATION_MARKS)
                    .append("lastname")
                    .append(QUOTATION_MARKS)
                    .append(DOUBLE_POINTS);
            builder.append(QUOTATION_MARKS)
                    .append(record.getLastname())
                    .append(QUOTATION_MARKS)
                    .append(COMMA);

            builder.append(QUOTATION_MARKS)
                    .append("age")
                    .append(QUOTATION_MARKS)
                    .append(DOUBLE_POINTS);
            builder.append(record.getAge())
                    .append(COMMA);;

            builder.append(QUOTATION_MARKS)
                    .append("entryDateHour")
                    .append(QUOTATION_MARKS)
                    .append(DOUBLE_POINTS);
            builder.append(QUOTATION_MARKS)
                    .append(record.getEntryDateHour().toString())
                    .append(QUOTATION_MARKS)
                    .append(COMMA);;

            builder.append(QUOTATION_MARKS)
                    .append("departureDateHour")
                    .append(QUOTATION_MARKS)
                    .append(DOUBLE_POINTS);
            builder.append(QUOTATION_MARKS)
                    .append(record.getDepartureDateHour().toString())
                    .append(QUOTATION_MARKS);

            builder.append(CLOSE_BRACES).append(COMMA).append(BREAK_LINE);
        }

        builder.append(CLOSE_SQUARE_BRACKETS).append(BREAK_LINE);

        return builder.toString();
    }
}
