package Class;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Juan_K
 */
public class Reader {
    
    public static String directorio = System.getProperty("user.home");
    public static String filePath = directorio + File.separator + "default.txt";
        
    public static String readMyFile(String fileName) {
        String text = "";
        filePath = directorio + File.separator + fileName;
        try {
            FileReader r = new FileReader(filePath);
            BufferedReader br = new BufferedReader(r);
            String line;
            while( (line = br.readLine()) != null ){
                text = text.concat(line);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Reader.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Reader.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return text;
    }
    
    public static Integer wordCounter(String text){
        String [] separedWords = text.split("\\s");
        return separedWords.length;
    }
    
    public static Integer characterCount(String text){
        text = text.replace("\\s", "");
        return text.length();
    }
}
