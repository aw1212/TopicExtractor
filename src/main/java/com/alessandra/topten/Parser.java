package com.alessandra.topten;

import org.springframework.stereotype.Component;
import java.util.StringTokenizer;
import org.springframework.beans.factory.annotation.Autowired;

@Component
public class Parser {
    
    @Autowired
    private ExtractedText extractedText = new ExtractedText();
    
    private StringTokenizer stringTokenizer;
     
    public void cleanLineAndParse(String line) {
        String punctuation = "\\p{Punct}(?=\\s|$)";
        String cleanLine = line.replaceAll(punctuation, "");
        cleanLine = cleanLine.replaceAll("[()-]", "");
        cleanLine = cleanLine.replace("\"", "");
        extractTokensFromLineAndAddToList(cleanLine);
    }
    
    public void extractTokensFromLineAndAddToList(String cleanLine) {
        String token = null;
        stringTokenizer = new StringTokenizer(cleanLine," ");
        while (stringTokenizer.hasMoreElements()) {
            token = (String) stringTokenizer.nextElement();
            extractedText.addTokenToList(token);
        }     
    }
    
}
