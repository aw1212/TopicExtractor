package com.alessandra.topten;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
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
                    parser.parseAndAddToList(line.trim());
        }
        catch (FileNotFoundException fnfe) {
            System.out.println(extractionFile + " not found");
        } catch (IOException ex) {
            Logger.getLogger(FileExtractor.class.getName()).
                    log(Level.SEVERE, null, ex);
        }
    }

}

