
import java.util.*;
import java.sql.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.ImageIcon;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Shatha Suliman
 */
public class addManuallyform extends javax.swing.JFrame {

    /**
     * Creates new form addManuallyform
     */
    
    private Connection con; 
    private Statement stmt;
    private ResultSet rs;
    String Query; 
    
    public addManuallyform() {

        
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/Icons/logo.png")).getImage());
        DatabaseConnect();
        // Hiding the Extra Fields. 
               extraInfo1Label.setVisible(true);
               extraInfo1TextField.setVisible(true);
               extraInfo2Label.setVisible(false);
               extraInfo2TextField.setVisible(false);
                      
    }
    
     private void DatabaseConnect (){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            
            String host = "jdbc:mysql://localhost:3306/marjieidb";
            String username = "root";
            String password = ""; 
            String unicode= "?useUnicode=yes&characterEncoding=UTF-8";
            con = DriverManager.getConnection( host+unicode, username, password );
            stmt = con.createStatement();
            
        } catch ( Exception err ) {
          System.out.println( err.getMessage( ) ); }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        typeCombobox = new javax.swing.JComboBox<>();
        titleLabel = new javax.swing.JLabel();
        titleTextField = new javax.swing.JTextField();
        authorLabel = new javax.swing.JLabel();
        authorTextField = new javax.swing.JTextField();
        publisherLabel = new javax.swing.JLabel();
        publisherTextField = new javax.swing.JTextField();
        yearLabel = new javax.swing.JLabel();
        pagesLabel = new javax.swing.JLabel();
        yearTextField = new javax.swing.JTextField();
        pagesTextField = new javax.swing.JTextField();
        extraInfo1Label = new javax.swing.JLabel();
        extraInfo1TextField = new javax.swing.JTextField();
        cancelButton = new javax.swing.JButton();
        addButton = new javax.swing.JButton();
        extraInfo2Label = new javax.swing.JLabel();
        extraInfo2TextField = new javax.swing.JTextField();

        setTitle("إدخال يدوي");

        typeCombobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "كتاب", "مقال صحفي", "مقال مجلة ", "صفحة ويب ", "ورقة مؤتمر", "أخرى" }));
        typeCombobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typeComboboxActionPerformed(evt);
            }
        });

        titleLabel.setText("العنوان");

        titleTextField.setColumns(10);

        authorLabel.setText("المؤلف");

        authorTextField.setColumns(10);
        authorTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                authorTextFieldActionPerformed(evt);
            }
        });

        publisherLabel.setText("الناشر");

        publisherTextField.setColumns(10);

        yearLabel.setText("سنة النشر");

        pagesLabel.setText("الصفحات");

        yearTextField.setColumns(10);

        pagesTextField.setColumns(10);

        extraInfo1Label.setText("الطبعة");

        extraInfo1TextField.setColumns(10);

        cancelButton.setText("إلغاء");
        cancelButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelButtonMouseClicked(evt);
            }
        });
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        addButton.setText("إضافة");
        addButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addButtonMouseClicked(evt);
            }
        });
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        extraInfo2Label.setText("jLabel1");

        extraInfo2TextField.setColumns(10);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(48, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(extraInfo1TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(authorTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(authorLabel)
                                    .addComponent(extraInfo1Label)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(yearTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(yearLabel)))
                        .addGap(14, 14, 14))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(cancelButton)
                        .addGap(26, 26, 26)
                        .addComponent(addButton)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(typeCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(titleTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(publisherTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(43, 43, 43)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(publisherLabel)
                                    .addComponent(titleLabel)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(extraInfo2TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pagesTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(extraInfo2Label)
                                    .addComponent(pagesLabel))))))
                .addGap(31, 31, 31))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(typeCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(titleLabel)
                        .addComponent(titleTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(authorTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(authorLabel))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(publisherLabel)
                            .addComponent(publisherTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(yearLabel)
                            .addComponent(yearTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pagesTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pagesLabel)
                            .addComponent(extraInfo1Label)
                            .addComponent(extraInfo1TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cancelButton)
                        .addComponent(addButton))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(extraInfo2Label)
                        .addComponent(extraInfo2TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        // TODO add your handling code here:
        
            // document information insertion
         int index = typeCombobox.getSelectedIndex();
        switch ( index )
        {
            case 0: 
            // Code to insert book information here.
             try 
              {
                 DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                 LocalDate localDate = LocalDate.now();
                 stmt = con.createStatement();
                 stmt.executeUpdate("INSERT INTO referencedocument (title, author, pages, publisher, publishYear, DateAdded)"+" VALUES ('"+titleTextField.getText()+"', '"+authorTextField.getText()+"', '"+pagesTextField.getText()+"', '"+publisherTextField.getText()+"', '"+yearTextField.getText()+"', '"+localDate+"')"); 
                 rs = stmt.executeQuery("SELECT documentID FROM referencedocument WHERE title = '"+ titleTextField.getText() +"' AND author = '"+ authorTextField.getText() +"'");
                 rs.next();
                 int id = rs.getInt("documentID");
                 stmt.executeUpdate("INSERT INTO book (documentID, edition) VALUES ( '"+ id +"', '"+extraInfo1TextField.getText()+"')");
              } catch (Exception ex)
                  {
                    System.out.println(ex.getMessage());
                  }
                break;
            case 1: 
                // Code to insert journal article information here.
                 try 
              {
                 DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                 LocalDate localDate = LocalDate.now();
                 stmt = con.createStatement();
                 stmt.executeUpdate("INSERT INTO referencedocument (title, author, pages, publisher, publishYear, DateAdded)"+" VALUES ('"+titleTextField.getText()+"', '"+authorTextField.getText()+"', '"+pagesTextField.getText()+"', '"+publisherTextField.getText()+"', '"+yearTextField.getText()+"', '"+localDate+"')"); 
                 rs = stmt.executeQuery("SELECT documentID FROM referencedocument WHERE title = '"+ titleTextField.getText() +"' AND author = '"+ authorTextField.getText() +"'");
                 rs.next();
                 int id = rs.getInt("documentID");
                 stmt.executeUpdate("INSERT INTO journalarticle (documentID, journalName, volume) VALUES ( '"+ id +"', '"+extraInfo1TextField.getText()+"', '"+extraInfo2TextField.getText()+"')");
              } catch (Exception ex)
                  {
                    System.out.println(ex.getMessage());
                  }
                break;
                
            case 2:
                // Code to insert magazine article information here.
                try 
              {
                 DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                 LocalDate localDate = LocalDate.now();
                 stmt = con.createStatement();
                 stmt.executeUpdate("INSERT INTO referencedocument (title, author, pages, publisher, publishYear, DateAdded)"+" VALUES ('"+titleTextField.getText()+"', '"+authorTextField.getText()+"', '"+pagesTextField.getText()+"', '"+publisherTextField.getText()+"', '"+yearTextField.getText()+"', '"+localDate+"')"); 
                 rs = stmt.executeQuery("SELECT documentID FROM referencedocument WHERE title = '"+ titleTextField.getText() +"' AND author = '"+ authorTextField.getText() +"'");
                 rs.next();
                 int id = rs.getInt("documentID");
                 stmt.executeUpdate("INSERT INTO magazinearticle (documentID, magazineName, month) VALUES ( '"+ id +"', '"+extraInfo1TextField.getText()+"', '"+extraInfo2TextField.getText()+"')");
              } catch (Exception ex)
                  {
                    System.out.println(ex.getMessage());
                  }
                
                break;
                
            case 3:
                // Code to insert web page information here.
                try 
              {
                DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                 LocalDate localDate = LocalDate.now();
                 stmt = con.createStatement();
                 stmt.executeUpdate("INSERT INTO referencedocument (title, author, pages, publisher, publishYear, DateAdded)"+" VALUES ('"+titleTextField.getText()+"', '"+authorTextField.getText()+"', '"+pagesTextField.getText()+"', '"+publisherTextField.getText()+"', '"+yearTextField.getText()+"', '"+localDate+"')"); 
                 rs = stmt.executeQuery("SELECT documentID FROM referencedocument WHERE title = '"+ titleTextField.getText() +"' AND author = '"+ authorTextField.getText() +"'");
                 rs.next();
                 int id = rs.getInt("documentID");
                 stmt.executeUpdate("INSERT INTO webpage (documentID, url, AccessDate) VALUES ( '"+ id +"', '"+extraInfo1TextField.getText()+"', '"+extraInfo2TextField.getText()+"')");
              } catch (Exception ex)
                  {
                    System.out.println(ex.getMessage());
                  }
                
                break;
                
            case 4:
                // Code to insert conference proceeding information here.
                try 
              {
                 DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                 LocalDate localDate = LocalDate.now();
                 stmt = con.createStatement();
                 stmt.executeUpdate("INSERT INTO referencedocument (title, author, pages, publisher, publishYear, DateAdded)"+" VALUES ('"+titleTextField.getText()+"', '"+authorTextField.getText()+"', '"+pagesTextField.getText()+"', '"+publisherTextField.getText()+"', '"+yearTextField.getText()+"', '"+localDate+"')"); 
                 rs = stmt.executeQuery("SELECT documentID FROM referencedocument WHERE title = '"+ titleTextField.getText() +"' AND author = '"+ authorTextField.getText() +"'");
                 rs.next();
                 int id = rs.getInt("documentID");
                 stmt.executeUpdate("INSERT INTO conferenceproceeding (documentID, conferenceName, place) VALUES ( '"+ id +"', '"+extraInfo1TextField.getText()+"', '"+extraInfo2TextField.getText()+"')");
              } catch (Exception ex)
                  {
                    System.out.println(ex.getMessage());
                  }
                
                break;
                
            case 5:
                // Code to insert other document information here.
                try 
              {
                DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                 LocalDate localDate = LocalDate.now();
                 stmt = con.createStatement();
                 stmt.executeUpdate("INSERT INTO referencedocument (title, author, pages, publisher, publishYear, DateAdded)"+" VALUES ('"+titleTextField.getText()+"', '"+authorTextField.getText()+"', '"+pagesTextField.getText()+"', '"+publisherTextField.getText()+"', '"+yearTextField.getText()+"', '"+localDate+"')"); 
              } catch (Exception ex)
                  {
                    System.out.println(ex.getMessage());
                  }
                
                break; 
        }
        
        this.setVisible(false);
        Library lib;
        lib = new Library();
        lib.setVisible(true);
    }//GEN-LAST:event_addButtonActionPerformed

    private void authorTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_authorTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_authorTextFieldActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        Library lib;
        lib = new Library();
        lib.setVisible(true);
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void addButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addButtonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_addButtonMouseClicked

    private void cancelButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelButtonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_cancelButtonMouseClicked


    private void typeComboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typeComboboxActionPerformed
        // TODO add your handling code here:
        
         // 'Type' Combobox Selection
        int index = typeCombobox.getSelectedIndex();
        switch ( index )
        {
            case 0:
            // Code for show Book form
               extraInfo1Label.setText("الطبعة");
               extraInfo1Label.setVisible(true);
               extraInfo1TextField.setVisible(true);
               extraInfo2Label.setVisible(false);
               extraInfo2TextField.setVisible(false);
                
            break;
            case 1:
            // Code for show Journal Article form
               extraInfo1Label.setText("الصحيفة");
               extraInfo1Label.setVisible(true);
               extraInfo1TextField.setVisible(true);
               extraInfo2Label.setText("الحجم");
               extraInfo2Label.setVisible(true);
               extraInfo2TextField.setVisible(true);

            break;
            case 2:
            // Code for show Magazine Article form
               extraInfo1Label.setText("المجلة");
               extraInfo1Label.setVisible(true);
               extraInfo1TextField.setVisible(true);
               extraInfo2Label.setText("الشهر");
               extraInfo2Label.setVisible(true);
               extraInfo2TextField.setVisible(true);
                
            break;
            case 3:
            // Code for show Web Page form
               extraInfo1Label.setText("الرابط");
               extraInfo1Label.setVisible(true);
               extraInfo1TextField.setVisible(true);
               extraInfo2Label.setText("تاريخ الوصول");
               extraInfo2Label.setVisible(true);
               extraInfo2TextField.setVisible(true);
                
            break;
            case 4:
            // Code for show Conference Proceeding form
               extraInfo1Label.setText("المؤتمر");
               extraInfo1Label.setVisible(true);
               extraInfo1TextField.setVisible(true);
               extraInfo2Label.setText("المكان");
               extraInfo2Label.setVisible(true);
               extraInfo2TextField.setVisible(true);
                
            break;
            case 5:
            // Code for show Other Document form
               extraInfo1Label.setVisible(false);
               extraInfo1TextField.setVisible(false);
               extraInfo2Label.setVisible(false);
               extraInfo2TextField.setVisible(false);
                
        } // End Switch Statment.
        
    }//GEN-LAST:event_typeComboboxActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(addManuallyform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addManuallyform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addManuallyform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addManuallyform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addManuallyform().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JLabel authorLabel;
    private javax.swing.JTextField authorTextField;
    private javax.swing.JButton cancelButton;
    private javax.swing.JLabel extraInfo1Label;
    private javax.swing.JTextField extraInfo1TextField;
    private javax.swing.JLabel extraInfo2Label;
    private javax.swing.JTextField extraInfo2TextField;
    private javax.swing.JLabel pagesLabel;
    private javax.swing.JTextField pagesTextField;
    private javax.swing.JLabel publisherLabel;
    private javax.swing.JTextField publisherTextField;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JTextField titleTextField;
    private javax.swing.JComboBox<String> typeCombobox;
    private javax.swing.JLabel yearLabel;
    private javax.swing.JTextField yearTextField;
    // End of variables declaration//GEN-END:variables
}
