package br.com.diegocordeiro.patterns.structural.bridge;

import br.com.diegocordeiro.patterns.ExecutorPatterns;
import br.com.diegocordeiro.patterns.structural.bridge.models.Record;
import br.com.diegocordeiro.patterns.structural.bridge.models.RecordClient;
import br.com.diegocordeiro.patterns.structural.bridge.reports.CsvReport;
import br.com.diegocordeiro.patterns.structural.bridge.reports.JsonReport;
import br.com.diegocordeiro.patterns.structural.bridge.reports.Report;

import java.time.LocalDateTime;
import java.util.Arrays;

public class ExecutorBridge implements ExecutorPatterns {

    @Override
    public void execute() {

        System.out.println("----- Start - Using Bridge Pattern. -----");

        Record firstRecordClient = new RecordClient.Builder()
                .withName("First")
                .withLastName("Client")
                .withAge(18)
                .withEntryDateHour(LocalDateTime.now())
                .withDepartureDateHour(LocalDateTime.now().plusHours(5))
                .build();

        Record secondRecordClient = new RecordClient.Builder()
                .withName("Second")
                .withLastName("Client")
                .withAge(18)
                .withEntryDateHour(LocalDateTime.now())
                .withDepartureDateHour(LocalDateTime.now().plusHours(5))
                .build();

        Record thirdRecordClient = new RecordClient.Builder()
                .withName("Third")
                .withLastName("Client")
                .withAge(18)
                .withEntryDateHour(LocalDateTime.now())
                .withDepartureDateHour(LocalDateTime.now().plusHours(5))
                .build();

        Report reportCsv = new CsvReport();
        String csv = reportCsv.generateReport(Arrays.asList(
                firstRecordClient,
                secondRecordClient,
                thirdRecordClient
        ));
        System.out.printf(csv);

        Report reportJson = new JsonReport();
        String json = reportJson.generateReport(Arrays.asList(
                firstRecordClient,
                secondRecordClient,
                thirdRecordClient
        ));
        System.out.printf(json);

        System.out.println("----- End - Using Bridge Pattern. -----");
    }
}
