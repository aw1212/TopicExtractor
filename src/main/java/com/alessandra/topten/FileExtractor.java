package com.alessandra.topten;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import org.springframework.beans.factory.annotation.Autowired;

public class FileExtractor implements Extractable {
    
    private static File extractionFile;
    
    @Autowired
    private Parser parser = new Parser();
    
    FileExtractor(String filePath) {
        extractionFile = new File(filePath);
    }
    
    public void extractTextIntoList() {
        try {
            FileReader fr = new FileReader(extractionFile);
            BufferedReader br = new BufferedReader(fr);
            String line;
            while((line = br.readLine()) != null)
                if (!line.isEmpty())
                    parser.extractTokensFromLineAndAddToList(line.trim());
        }
        catch (FileNotFoundException fnfe) {
            System.out.println(extractionFile + " not found");
        } 
        catch (IOException ex) {
            System.out.println("file issue causing IOException");
        }
    }

}

