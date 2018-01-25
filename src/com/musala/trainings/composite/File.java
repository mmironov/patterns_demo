package com.musala.trainings.composite;

public class File implements FileEntry {

    private String name;
    private String description;
    private byte[] contents;

    @Override
    public void list() {
        System.out.printf("%s: %s (%d bytes)", name, description, contents.length);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setContents(byte[] contents) {
        this.contents = contents;
    }
}
