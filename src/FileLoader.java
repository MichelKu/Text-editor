
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author miche
 */
public class FileLoader {

    public String filename = null;

    public String loadFile(JTextArea ta) {
        JFileChooser fc = new JFileChooser();

        //String filename = null;
        if (fc.showOpenDialog(null) != JFileChooser.CANCEL_OPTION) {
            filename = fc.getSelectedFile().getAbsolutePath();
        } else {
            //return;  // user cancelled
        }
        try {
            Scanner in = new Scanner(new File(filename));  // might fail
            
            String buffer = "";
            
            //ta.setText("");
            while (in.hasNext()) {
                //ta.append(in.nextLine() + "\n");
                buffer+= in.nextLine() + "\n";
            }
            ta.setText(buffer);
            in.close();
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "File not found: " + filename,
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        return filename;
        
    }

}
