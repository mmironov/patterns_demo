package com.musala.trainings.composite;

public class Main {

    public static void main(String[] args) {

        File mainActivity = new File();
        mainActivity.setName("MainActivity.java");
        mainActivity.setDescription("Java Source File");
        mainActivity.setContents(new byte[] {2, 4, 17});

        File manifest = new File();
        manifest.setName("AndroidManifex.xml");
        manifest.setDescription("");
        manifest.setContents(new byte[] {0, -1, 17, 5});

        Directory mainDir = new Directory();
        mainDir.setName("main");

        Directory src = new Directory();
        src.setName("src");

        Directory res = new Directory();
        res.setName("res");

        src.addFileEntry(mainActivity);

        mainDir.addFileEntry(src);
        mainDir.addFileEntry(res);
        mainDir.addFileEntry(manifest);

        mainDir.list();
    }
}
