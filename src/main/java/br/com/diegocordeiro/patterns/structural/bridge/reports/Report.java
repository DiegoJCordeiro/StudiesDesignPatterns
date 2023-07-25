package br.com.diegocordeiro.patterns.structural.bridge.reports;

import br.com.diegocordeiro.patterns.structural.bridge.models.Record;

import java.util.List;

public interface Report {

    public String generateReport(List<Record> records);
}
