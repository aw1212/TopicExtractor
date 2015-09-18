package com.alessandra.topten;

import org.springframework.stereotype.Component;
import java.util.StringTokenizer;
import org.springframework.beans.factory.annotation.Autowired;

@Component
public class Parser {
    
    @Autowired
    private ExtractedText extractedText;
    
    public void parseAndAddToList(String line) {
        StringTokenizer stringTokenizer = new StringTokenizer(line," ");
        int num = stringTokenizer.countTokens();
        System.out.println(line);
        System.out.println(num);
        addTokensToList(stringTokenizer);
        //iterate through line
        //parse method
        //add to list method
    }
    
    public void parse(String item) {
        //use tokenizer
    }
    
    public void addTokensToList(StringTokenizer token) {
        //add to ExtractedTest list
        
    }
    
}
