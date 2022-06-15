package edu.uc.cech.soit.myclassjournal.service;

import edu.uc.cech.soit.myclassjournal.dto.JournalEntry;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class JournalServiceStub implements IJournalService {


    @Override
    public void save(JournalEntry journalEntry) {

    }

    @Override
    public List<JournalEntry> fetchAll() {
        List<JournalEntry> journalEntryList = new ArrayList<>();

        JournalEntry journalentry = new JournalEntry();
        journalentry.setDate("October 2021");
        journalentry.setNotes("My first entry!");
        journalEntryList.add(journalentry);

        return journalEntryList;
    }
}
