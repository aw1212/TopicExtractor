package com.alessandra.topten;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Component;

@Component
public class ExtractedTokens {
    
    private List<String> extractedText = new ArrayList<>();
    
    public void addTokenToList(String token) {
        System.out.println(token);
        extractedText.add(token);
    }
    
    public List getList() {
        return extractedText;
    }
    
    public String addToMap() {
        int biggestInt = 0;
        Map<Integer,String> mappy = new HashMap<>();
        for (String item  : extractedText) {
            mappy.put(Collections.frequency(extractedText,item),item);
        }
        for (Map.Entry<Integer,String> entry : mappy.entrySet()) {
            if (entry.getKey() > biggestInt) {
                biggestInt = entry.getKey();
            }
        }
        System.out.println("Topic1: "+ mappy.get(biggestInt));
        return mappy.get(biggestInt);
    }
    
}
