package Class;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Juan_K
 */
public class Writer {
    
    public static String directorio = System.getProperty("user.home");
    
    public static void guardarText(String fileName, String text){
        String filePath = directorio + File.separator + fileName;
        FileWriter w;
    try {
            w = new FileWriter(filePath);
            w.write(text);
            w.close();
        } catch (IOException ex) {
            Logger.getLogger(Writer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
