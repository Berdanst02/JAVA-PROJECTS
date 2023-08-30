/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package arraylists;

import java.awt.image.BufferedImage;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 *
 * @author berd1810
 */
public class Hungergames extends javax.swing.JFrame {

    /**
     * Creates new form Hungergames
     */
    
    static ArrayList<String> names = new ArrayList<>(); 
    
    public Hungergames() {
        initComponents();
        getTributeList();
        LoadImage();
        updateTributeNamesTextArea();
    }

   
    public void getTributeList(){
    
    try{
    
        String fileName = "hungergames.txt";
        String filePath = new File("").getAbsolutePath(); //find the directory of the project
        File file = new File(filePath+"\\"+fileName);
        System.out.println(filePath+fileName);
        Scanner s = new Scanner(file);
        
        
        
        while(s.hasNextLine()){
        
            names.add(s.nextLine());
        
        }
        
        
    }
    
    catch(Exception e2){ System.out.println(e2);}
    
    
    }
    
    
    public void updateTributeNamesTextArea(){
        tributeNamesTextArea.setText(null);
        
        for(String n: names){
        
            tributeNamesTextArea.append(n+"\n");
        }
    }
    
    public void LoadImage(){
    
    try{
        
        String filePath = new File("").getAbsolutePath();
         String imagePath = filePath + "\\hglogo.jpg";
        System.out.println(imagePath);
        BufferedImage myPicture = ImageIO.read(new File(imagePath));
        LogoLabel.setIcon(new ImageIcon(myPicture));
        
        
    }
    
    catch(Exception e2){System.out.println(e2);}
    
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        closeBtn = new javax.swing.JButton();
        removeRandomBtn = new javax.swing.JButton();
        addTributeBtn = new javax.swing.JButton();
        removeSearchBtn = new javax.swing.JButton();
        removeLastBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tributeNamesTextArea = new javax.swing.JTextArea();
        LogoLabel = new javax.swing.JLabel();
        searchTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        closeBtn.setText("Close");

        removeRandomBtn.setText("Remove random");
        removeRandomBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeRandomBtnActionPerformed(evt);
            }
        });

        addTributeBtn.setText("Add Tribute");

        removeSearchBtn.setText("Search and Destroy");
        removeSearchBtn.setToolTipText("");

        removeLastBtn.setText("Remove Last");
        removeLastBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeLastBtnActionPerformed(evt);
            }
        });

        tributeNamesTextArea.setEditable(false);
        tributeNamesTextArea.setColumns(20);
        tributeNamesTextArea.setRows(5);
        jScrollPane1.setViewportView(tributeNamesTextArea);

        LogoLabel.setPreferredSize(new java.awt.Dimension(125, 125));

        searchTextField.setText("jTextField1");
        searchTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchTextFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(108, 108, 108)
                                .addComponent(closeBtn)
                                .addGap(15, 15, 15))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(36, 36, 36)
                                        .addComponent(removeRandomBtn))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(40, 40, 40)
                                        .addComponent(LogoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(49, 49, 49)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(removeLastBtn)
                                            .addComponent(addTributeBtn))))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(removeSearchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(searchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(removeRandomBtn)
                        .addGap(18, 18, 18)
                        .addComponent(addTributeBtn)
                        .addGap(18, 18, 18)
                        .addComponent(removeLastBtn)
                        .addGap(71, 71, 71)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(removeSearchBtn)
                            .addComponent(searchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(84, 84, 84)
                        .addComponent(LogoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(closeBtn)
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void removeRandomBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeRandomBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_removeRandomBtnActionPerformed

    private void removeLastBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeLastBtnActionPerformed
        
        if(names.size()>0){
            names.remove(names.size()-1);
        }
        
        updateTributeNamesTextArea();
        
    }//GEN-LAST:event_removeLastBtnActionPerformed

    private void searchTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchTextFieldActionPerformed
        names.remove(searchTextField.getText());
        updateTributeNamesTextArea();
    }//GEN-LAST:event_searchTextFieldActionPerformed

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
            java.util.logging.Logger.getLogger(Hungergames.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Hungergames.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Hungergames.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Hungergames.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Hungergames().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LogoLabel;
    private javax.swing.JButton addTributeBtn;
    private javax.swing.JButton closeBtn;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton removeLastBtn;
    private javax.swing.JButton removeRandomBtn;
    private javax.swing.JButton removeSearchBtn;
    private javax.swing.JTextField searchTextField;
    private javax.swing.JTextArea tributeNamesTextArea;
    // End of variables declaration//GEN-END:variables
}
