package com.musala.trainings.composite;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileEntry {

    private String name;

    private List<FileEntry> fileEntries;

    public Directory() {
        fileEntries = new ArrayList<FileEntry>();
    }

    @Override
    public void list() {

        System.out.println("Dir: " + name);

        for(FileEntry entry : fileEntries) {
            entry.list();
            System.out.println();
        }
    }

    public void addFileEntry(FileEntry entry) {

        if (!fileEntries.contains(entry)) {
            fileEntries.add(entry);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
