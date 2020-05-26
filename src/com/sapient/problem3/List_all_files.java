package com.sapient.problem3;

import java.io.File;

public class List_all_files
{
    private static void listFiles(String path) {
        File folder = new File(path);
        File[] files = folder.listFiles();
        for (File file : files){
            if (file.isFile()){
                System.out.println(file.getName());
            }
            else if (file.isDirectory()){
                listFiles(file.getAbsolutePath());
            }
        }
    }
    
    public static void main(String[] args){
        listFiles(".");
    }
}