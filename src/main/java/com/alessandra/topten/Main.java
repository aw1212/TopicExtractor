package com.alessandra.topten;

public class Main {
   
    public static void main(String args[]) {
        System.out.println("Hello world");
        FileExtractor fileExtractor = new FileExtractor("C:/Users/Alessandra/git/TopicExtractor/src/main/java/com/alessandra/topten/testText.txt");
        fileExtractor.extractTextIntoList();        
    }
    
}
