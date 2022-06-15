package edu.uc.cech.soit.myclassjournal.service;

import edu.uc.cech.soit.myclassjournal.dto.JournalEntry;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Component
public class JournalServiceStub implements IJournalService {
    List<JournalEntry> journalEntryList = new ArrayList<>();

    @Override
    public void save(JournalEntry journalEntry) {
        JournalEntry journalentry = new JournalEntry();
        journalentry.setDate("October 2021");
        journalentry.setNotes("My first entry!");
        journalEntryList.add(journalentry);
    }

    @Override
    public List<JournalEntry> fetchAll() {
        return journalEntryList;
    }
}
