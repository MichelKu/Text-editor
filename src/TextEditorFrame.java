
import com.ozten.font.JFontChooser;
import java.awt.Color;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

//@author miche
//Här döper jagfunktioner i förväg då alla klasser skall kunna komma åt dessa.
public class TextEditorFrame extends javax.swing.JFrame {

    JFileChooser fc;
    File f;
    JTextArea textArea;

    //Två st int värden som håller koll på hur många tabbar som skapats samt lagrar dessa i en index lista
    //mer utförlig beskrivning finns längre ner i detta projekt.
    int count;
    int index;

    private String inputFile = null;

    // Ett filter som gör att användaren endast kan se filer med som innehåller kriterierna under
    //men valde att ta bort filtret då andra edtiors kan hitta samt öppna alla format.
    //FileNameExtensionFilter filter = new FileNameExtensionFilter("Text Files", "txt", "text");

    //Creates new form TextEditorFrame
    //Här finns metoden initFirstTab med då denna skapar en instans av en TextArea och JScrollPane
    //En nogrannare beskrivning finns längre ner där alla metoder är samlade.
    public TextEditorFrame() {

        initComponents();
        initFirstTab();
        fc = new JFileChooser();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jToolBar1 = new javax.swing.JToolBar();
        newInFrame = new javax.swing.JButton();
        openInFrame = new javax.swing.JButton();
        saveInFrame = new javax.swing.JButton();
        htmlInFrame = new javax.swing.JButton();
        fontInFrame = new javax.swing.JButton();
        fontColorInFrame = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        newMenu = new javax.swing.JMenuItem();
        openMenu = new javax.swing.JMenuItem();
        saveMenu = new javax.swing.JMenuItem();
        saveAsMenu = new javax.swing.JMenuItem();
        exitMenu = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        clearMenu = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        aboutMenu = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Wanna be Microsoft Word");
        setPreferredSize(new java.awt.Dimension(700, 700));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jTabbedPane1.setBorder(new javax.swing.border.MatteBorder(null));
        getContentPane().add(jTabbedPane1, java.awt.BorderLayout.CENTER);

        jToolBar1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.BELOW_TOP));
        jToolBar1.setRollover(true);

        newInFrame.setIcon(new javax.swing.ImageIcon(getClass().getResource("/folder (2).png"))); // NOI18N
        newInFrame.setText("New");
        newInFrame.setFocusable(false);
        newInFrame.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        newInFrame.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        newInFrame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newInFrameActionPerformed(evt);
            }
        });
        jToolBar1.add(newInFrame);

        openInFrame.setIcon(new javax.swing.ImageIcon(getClass().getResource("/folder.png"))); // NOI18N
        openInFrame.setText("Open");
        openInFrame.setFocusable(false);
        openInFrame.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        openInFrame.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        openInFrame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openInFrameActionPerformed(evt);
            }
        });
        jToolBar1.add(openInFrame);

        saveInFrame.setIcon(new javax.swing.ImageIcon(getClass().getResource("/diskette.png"))); // NOI18N
        saveInFrame.setText("Save");
        saveInFrame.setFocusable(false);
        saveInFrame.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        saveInFrame.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        saveInFrame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveInFrameActionPerformed(evt);
            }
        });
        jToolBar1.add(saveInFrame);

        htmlInFrame.setIcon(new javax.swing.ImageIcon(getClass().getResource("/html.png"))); // NOI18N
        htmlInFrame.setText("HTML");
        htmlInFrame.setFocusable(false);
        htmlInFrame.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        htmlInFrame.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        htmlInFrame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                htmlInFrameActionPerformed(evt);
            }
        });
        jToolBar1.add(htmlInFrame);

        fontInFrame.setIcon(new javax.swing.ImageIcon(getClass().getResource("/font.png"))); // NOI18N
        fontInFrame.setText("Font");
        fontInFrame.setFocusable(false);
        fontInFrame.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        fontInFrame.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        fontInFrame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fontInFrameActionPerformed(evt);
            }
        });
        jToolBar1.add(fontInFrame);

        fontColorInFrame.setIcon(new javax.swing.ImageIcon(getClass().getResource("/color-circle.png"))); // NOI18N
        fontColorInFrame.setText("Font color");
        fontColorInFrame.setFocusable(false);
        fontColorInFrame.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        fontColorInFrame.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        fontColorInFrame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fontColorInFrameActionPerformed(evt);
            }
        });
        jToolBar1.add(fontColorInFrame);

        getContentPane().add(jToolBar1, java.awt.BorderLayout.PAGE_START);

        jMenuBar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jMenu1.setText("File");

        newMenu.setText("New");
        newMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newMenuActionPerformed(evt);
            }
        });
        jMenu1.add(newMenu);

        openMenu.setText("Open");
        openMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openMenuActionPerformed(evt);
            }
        });
        jMenu1.add(openMenu);

        saveMenu.setText("Save");
        saveMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveMenuActionPerformed(evt);
            }
        });
        jMenu1.add(saveMenu);

        saveAsMenu.setText("Save as");
        saveAsMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveAsMenuActionPerformed(evt);
            }
        });
        jMenu1.add(saveAsMenu);

        exitMenu.setText("Exit");
        exitMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuActionPerformed(evt);
            }
        });
        jMenu1.add(exitMenu);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");

        clearMenu.setText("Clear");
        clearMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearMenuActionPerformed(evt);
            }
        });
        jMenu2.add(clearMenu);

        jMenuBar1.add(jMenu2);

        helpMenu.setText("Help");

        aboutMenu.setText("About");
        aboutMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutMenuActionPerformed(evt);
            }
        });
        helpMenu.add(aboutMenu);

        jMenuBar1.add(helpMenu);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Två metoder som körs när man trycker "new" under file. createTabs skapar en ny tab och validateBeforeNew
    //kollar om användaren har sparat ändringar i filen.
    private void newMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newMenuActionPerformed
        createTabs();
        validateBeforeNew();
    }//GEN-LAST:event_newMenuActionPerformed

    // "Save as" knappen finns under file och anropar metoden saveFile som sparar filer. saveFile har värdet null
    // i detta fall då save as är om man vill spara filen med ett nytt namn och ny sökväg även om man öppnar en fil
    //som redan existerar
    private void saveAsMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveAsMenuActionPerformed
        saveFile(null);
    }//GEN-LAST:event_saveAsMenuActionPerformed

    //Knappen "Open" anropar metoderna createTabs som skapar nya tabar samt metoden openMultipleFiles
    //som har funktionen att öppna upp filer i befintlig tab
    private void openMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openMenuActionPerformed

        if (JOptionPane.showConfirmDialog(openInFrame, "Do you want to open the file in a new tab?", null,
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            createTabs();
            openMultipleFiles();
        } else {
            openMultipleFiles();

    }//GEN-LAST:event_openMenuActionPerformed
    }

    //saveFile har värdet inputFile då denna knappen sparar filen till samma namn och sökväg som den öppnade filen
    //om användaren har öppnat en fil från "C/Desktop" så skall programmet komma ihåg denna sökväg samt namn på fil
    //när användaren väljer att spara ändringar i filen
    private void saveMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveMenuActionPerformed
        saveFile(inputFile);
    }//GEN-LAST:event_saveMenuActionPerformed

    //Knappen "Exit" skall avsluta programmet. Metoder validateBeforeClosing skall varna för att det finns osparade ändringar
    //alternativt bara ställa frågan om användaren är säker på att de vill avsluta programmet för att förhindra förlorat arbete
    private void exitMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuActionPerformed
        validateBeforeClosing();
    }//GEN-LAST:event_exitMenuActionPerformed

    //HTML knappen genererar en HTML-mall.
    //int sel samt JTextArea mutipleTabsTextArea låter programmet hålla reda på vilken det befintliga tabben användaren är på
    //Har man öppnat tre st filer och man vill generera en HTML-mall på tabb nummer två skall programmet känna av detta och endast
    //generera HTML-mallen på denna tab
    private void htmlInFrameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_htmlInFrameActionPerformed
        int sel = jTabbedPane1.getSelectedIndex();
        JTextArea multipleTabsTextArea = (JTextArea) (((JScrollPane) jTabbedPane1.getComponentAt(sel)).getViewport()).getComponent(0);

        multipleTabsTextArea.setText("<html>\n"
                + "              <head><titel>My WebPage</titel></head>\n"
                + "              <body>\n"
                + "                   <p>Text goes here</p>\n"
                + "         </body>\n"
                + "</html>");
    }//GEN-LAST:event_htmlInFrameActionPerformed

    //About knappen startar en instans av en ny JFrame som popar upp när man trycker på about. I denna frame finns lite information
    //om programmet
    private void aboutMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutMenuActionPerformed
        AboutFrame aboutPopUp = new AboutFrame();
        aboutPopUp.setVisible(true);
    }//GEN-LAST:event_aboutMenuActionPerformed

    //Precis som knappen "New" under "File" så finns det en "New" i min toolbar som finns tillgänlig direkt. Anledningen till detta är
    //för att jag tror denna funktion är en av de mest vanliga i denna typen av program och jag vill göra denna funktion tillgänlig
    //för användaren på ett smidigt och enkelt sätt.
    private void newInFrameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newInFrameActionPerformed
        createTabs();
        validateBeforeNew();
    }//GEN-LAST:event_newInFrameActionPerformed

    //Precis som funktionen "New" så tror jag att funktionen "Open" är lika vanlig och har även valt att göra denna tillgänlig
    //från min toolbar för att underlätta för användaren.
    private void openInFrameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openInFrameActionPerformed

        if (JOptionPane.showConfirmDialog(openInFrame, "Do you want to open the file in a new tab?", null,
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            createTabs();
            openMultipleFiles();
        } else {
            openMultipleFiles();
    }//GEN-LAST:event_openInFrameActionPerformed
    }

    //Även save funktionen är tillgänlig från min toolbar, jag tror att "Save" är vanliga än "Save as" och har därför valt
    //att endast lägga "Save" funktionen i min toolbar.
    private void saveInFrameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveInFrameActionPerformed
        saveFile(inputFile);
    }//GEN-LAST:event_saveInFrameActionPerformed

    //När man försöker stänga ner programmet med hjälp av krysset längst uppe i höger hörn anropas denna metod.
    //Metoden kontrollerar att användaren har sparat alla ändringar, har användaren inte gjort detta varnar programmet för
    //Detta innan det avslutas
    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
    validateBeforeClosing();
    }//GEN-LAST:event_formWindowClosing

    //Denna metod låter användaren ändra fonten på sitt dokument. Precis som tidigare så håller in sel samt JTextArea reda på vilken
    //tabb användaren befinner sig på, användaren har möjlighet att ha olika fonter på olika dokument i all tabbar.
    private void fontInFrameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fontInFrameActionPerformed

        int sel = jTabbedPane1.getSelectedIndex();
        JTextArea multipleTabsTextArea = (JTextArea)(((JScrollPane)jTabbedPane1.getComponentAt(sel)).getViewport()).getComponent(0);

        JFontChooser tfc = new JFontChooser();
        JOptionPane.showMessageDialog(null, tfc, "Please choose a font", JOptionPane.PLAIN_MESSAGE);
        multipleTabsTextArea.setFont(tfc.getPreviewFont());
    }//GEN-LAST:event_fontInFrameActionPerformed

    //Ger användaren möjlighet att ändra färgen på sin text i de olika dokumenten och tabbarna.
    private void fontColorInFrameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fontColorInFrameActionPerformed

        int sel = jTabbedPane1.getSelectedIndex();
        JTextArea multipleTabsTextArea = (JTextArea)(((JScrollPane)jTabbedPane1.getComponentAt(sel)).getViewport()).getComponent(0);

        JColorChooser colorChooser = new JColorChooser();

        Color color = JColorChooser.showDialog(null, "Pick a color", Color.black);
        multipleTabsTextArea.setForeground(color);
    }//GEN-LAST:event_fontColorInFrameActionPerformed

    //Ger användaren möjligheten att radera all text i textfältet, int sel kollar vilken tabb användaren befinner sig på
    //för att inte radera texten i fel tabb.
    private void clearMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearMenuActionPerformed
        int sel = jTabbedPane1.getSelectedIndex();
        JTextArea multipleTabsTextArea = (JTextArea) (((JScrollPane) jTabbedPane1.getComponentAt(sel)).getViewport()).getComponent(0);

        multipleTabsTextArea.setText("");
    }//GEN-LAST:event_clearMenuActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TextEditorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TextEditorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TextEditorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TextEditorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TextEditorFrame().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem aboutMenu;
    private javax.swing.JMenuItem clearMenu;
    private javax.swing.JMenuItem exitMenu;
    private javax.swing.JButton fontColorInFrame;
    private javax.swing.JButton fontInFrame;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JButton htmlInFrame;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JButton newInFrame;
    private javax.swing.JMenuItem newMenu;
    private javax.swing.JButton openInFrame;
    private javax.swing.JMenuItem openMenu;
    public javax.swing.JMenuItem saveAsMenu;
    private javax.swing.JButton saveInFrame;
    public javax.swing.JMenuItem saveMenu;
    // End of variables declaration//GEN-END:variables

    //Metod som skapar tabbar, denna metod skapar en instans av en ny JTextArea och ScrollPane. Den lägger även till den nya tabben
    // i count för att låta programmet känna av hur många tabbar som skapats.
    public void createTabs() {

        JTextArea ta = new JTextArea();
        JScrollPane jsp = new JScrollPane(ta);
        count = jTabbedPane1.getTabCount() + 1;


        jTabbedPane1.addTab("File " + count + " ", jsp);

        index = jTabbedPane1.getTabCount() - 1;
        jTabbedPane1.setSelectedIndex(index);
    }

    //Denna metod jämför två text strängar med varann för att kunna avgöra om användaren har gjort en ändring i dokumentet.
    //Om ingen ändring har gjorts raderar programmet all text när man trycker på New utan att varna. Har man en osparad ändring varnar programmet för detta.
    public void validateBeforeNew() {

        String originalTextOne = "";
        String textAreaText = textArea.getText();
        int confirmed = 1;

        if (inputFile != null) {

            try {
                Scanner in = new Scanner(new File(inputFile));

                while (in.hasNext()) {
                    originalTextOne += in.nextLine() + "\n";
                }
                in.close();

            } catch (FileNotFoundException e) {
                }
        }
        if (textAreaText.equals(originalTextOne)) {
            textArea.setText("");
        } else if (!textAreaText.equals("")) {
            confirmed = JOptionPane.showConfirmDialog(null, "Do you want to save changes in " + inputFile + "?", "Warning!", JOptionPane.YES_NO_OPTION);

            if (confirmed == 1) {
                textArea.setText("");

            } else if (confirmed == 0) {

                saveFile(null);

            }
        }
    }

    //Precis som funktionen ovan så skall programmet varna om man har osparade ändringar när man försöker stänga ner det.
    //Denna metod scannar också av dokumentet och jämför två text-strängar med varann för att avgöra om en ändring har skett eller inte.
    //Har man inga osparade ändringar skall programmet endast ställa frågan om man är säker på detta val
    public void validateBeforeClosing() {

        String originalText = "";

        if (inputFile != null) {

            try {
                Scanner in = new Scanner(new File(inputFile));

                while (in.hasNext()) {
                    originalText += in.nextLine() + "\n";
                }
                in.close();

            } catch (FileNotFoundException e) {
            }
        }

        String modifiedText = textArea.getText();

        int confirmed = 1;

        if (originalText.equals(modifiedText)) {
            confirmed = JOptionPane.showConfirmDialog(null, "Are you sure you want to exit?", "Exit", JOptionPane.YES_NO_OPTION);

        } else {

            confirmed = JOptionPane.showConfirmDialog(null, "You have unsaved changes! Are you sure you want to exit?", "Warning!", JOptionPane.YES_NO_OPTION);
        }

        if (confirmed == JOptionPane.YES_OPTION) {
            dispose();

        } else {
            this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        }
    }

    //En metod som sparar filer och lägger till ".txt" i slutet av filnamnet för att konvertera den till en txt-fil.
    //Om användaren öppnar en befintlig fil känner metoden av detta och sparar filen till samma sökväg.
    //Är filnamnet == null skall användaren skriva in önskat namn som filen skall få.
    private void saveFile(String name) {

        String txt = ".txt";
        int sel = jTabbedPane1.getSelectedIndex();
        JTextArea multipleTabsTextArea = (JTextArea) (((JScrollPane) jTabbedPane1.getComponentAt(sel)).getViewport()).getComponent(0);


        if (name == null) {
            JFileChooser fc = new JFileChooser();
            if (fc.showSaveDialog(null) != JFileChooser.CANCEL_OPTION) {
                name = fc.getSelectedFile().getAbsolutePath();
            }
        }
        if (name != null) {
            try {
                Formatter out = new Formatter(new File(name + txt));
                inputFile = name + txt;
                out.format("%s", multipleTabsTextArea.getText());
                out.close();

                JOptionPane.showMessageDialog(null, "Saved to " + inputFile,
                        "Save File", JOptionPane.PLAIN_MESSAGE);
            } catch (FileNotFoundException e) {
                JOptionPane.showMessageDialog(null, "Cannot write to file: " + name + txt,
                        "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    //Denna metod anropar en JFileChooser som ger användaren möjligheten att leta efter filer på datorn samt välja
    //vilken fil som skall öppnas. En Scanner med namnet scn scannar av innehållet i filen "f" som är filen användaren har valt.
    //"buffer" lagrar denna texten och sedan presenteras texten i en TextArea med hjälp av
    //multipleTabsTextArea.setText(buffer); ----- denna rad ser till att texten läses in på den tabb som användaren befinner sig på.
    public void openMultipleFiles() {

        if (fc.showOpenDialog(fc) == JFileChooser.APPROVE_OPTION) {

            if (fc.getSelectedFile() != null) {
                f = fc.getSelectedFile();
            }

            try {
                Scanner scn = new Scanner(new FileInputStream(f));
                String buffer = "";
                while (scn.hasNext()) {
                    buffer += scn.nextLine() + "\n";
                }
                System.out.println(index);

                int sel = jTabbedPane1.getSelectedIndex();

                JTextArea multipleTabsTextArea = (JTextArea)(((JScrollPane)jTabbedPane1.getComponentAt(sel)).getViewport()).getComponent(0);
                multipleTabsTextArea.setText(buffer);


            } catch (FileNotFoundException ex) {
                Logger.getLogger(TextEditorFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    //En metod som initierar den första tabben när programmet startas. Den skapar en TextArea och lägger till en JScrollPane på denna.
    //count hämtar värdet på tabben vilket i detta fall är 1. Index lagrar också värdet på tabben för att sedan kunna avgöra vilken tabb
    //en tabb befinner sig på-
    private void initFirstTab() {
        textArea = new JTextArea();
        JScrollPane jsp = new JScrollPane(textArea);
        jTabbedPane1.add(jsp);

        count = jTabbedPane1.getTabCount();

        jTabbedPane1.addTab("File " + count + " ", jsp);

        index = jTabbedPane1.getTabCount() - 1;
        jTabbedPane1.setSelectedIndex(index);
    }
}
