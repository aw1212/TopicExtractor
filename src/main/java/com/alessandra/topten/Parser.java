package com.alessandra.topten;

import org.springframework.stereotype.Component;
import java.util.StringTokenizer;
import org.springframework.beans.factory.annotation.Autowired;

@Component
public class Parser {
    
    @Autowired
    private ExtractedTokens extractedText = new ExtractedTokens();
    
    private StringTokenizer stringTokenizer;
     
    public String removePunctuation(String line) {
        String punctuation = "\\p{Punct}(?=\\s|$)";
        String cleanLine = line.replaceAll(punctuation, "");
        cleanLine = cleanLine.replaceAll("[()-]", "");
        cleanLine = cleanLine.replace("\"", "");
        return cleanLine;
    }
    
    public void extractTokensFromLineAndAddToList(String line) {
        stringTokenizer = new StringTokenizer(removePunctuation(line)," ");
        while (stringTokenizer.hasMoreElements()) {
            String token = (String) stringTokenizer.nextElement();
            extractedText.addTokenToList(token);
        }     
    }
    
}
