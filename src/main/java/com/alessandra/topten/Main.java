package com.alessandra.topten;

public class Main {
    
    public static void main(String args[]) {
        System.out.println("Hello world");
        FileExtractor fileExtractor = new FileExtractor("/Users/techsupport/NetBeansProjects/topTen/src/main/java/com/alessandra/topten/testText.txt");
        fileExtractor.extractTextIntoList();
    }
    
}
