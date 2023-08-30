/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pootify;

import java.awt.BorderLayout;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioInputStream;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.filechooser.FileNameExtensionFilter;

//http://www.java2s.com/Code/Jar/d/Downloaddjnativeswingswtjar.htm 
/**
 *
 * @author berd1810
 */
public class Pootify extends javax.swing.JFrame {

    static ArrayList<Music> songs = new ArrayList<>();
    int musicIndex;
    int counter = 0;
    boolean musicPlaying = false;
    boolean musicLoop = false;
    double progressVal;

    public Pootify() {

        try {
            //setting the theme of jframe
            UIManager.setLookAndFeel("com.jtattoo.plaf.noire.NoireLookAndFeel");

        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Pootify.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pootify.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pootify.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pootify.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        initComponents();
        pausemscBtn.setEnabled(false);
        resumemscBtn.setEnabled(false);
        stopmscBtn.setEnabled(false);
        removeBtn.setEnabled(false);
        ProgressBar.setValue(0);

        FileNameExtensionFilter wavfilter = new FileNameExtensionFilter("WAV FILES", "wav");
        jFileChooser1.setFileFilter(wavfilter);
        //filter wav files in jfilechooser

//              musicSlider.setMaximum(100);
        ImageIcon logo = new ImageIcon("logo.png");
        logolbl.setIcon(logo);

//
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        themesButtons = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jFileChooser1 = new javax.swing.JFileChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        musicTextArea = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        fileLocFld = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        playmscBtn = new javax.swing.JButton();
        stopmscBtn = new javax.swing.JButton();
        pausemscBtn = new javax.swing.JButton();
        removeBtn = new javax.swing.JButton();
        resumemscBtn = new javax.swing.JButton();
        shuffleMscBtn = new javax.swing.JButton();
        loopButtontoggle = new javax.swing.JToggleButton();
        ProgressBar = new javax.swing.JProgressBar();
        logolbl = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jFileChooser1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFileChooser1ActionPerformed(evt);
            }
        });

        musicTextArea.setColumns(20);
        musicTextArea.setRows(5);
        jScrollPane1.setViewportView(musicTextArea);

        jLabel1.setText("Songs");

        fileLocFld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fileLocFldActionPerformed(evt);
            }
        });

        jLabel2.setText("Music Index");

        playmscBtn.setText("Play Music");
        playmscBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playmscBtnActionPerformed(evt);
            }
        });

        stopmscBtn.setText("Stop Music");
        stopmscBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stopmscBtnActionPerformed(evt);
            }
        });

        pausemscBtn.setText("Pause Music");
        pausemscBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pausemscBtnActionPerformed(evt);
            }
        });

        removeBtn.setText("Remove Music");
        removeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeBtnActionPerformed(evt);
            }
        });

        resumemscBtn.setText("Resume Music");
        resumemscBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resumemscBtnActionPerformed(evt);
            }
        });

        shuffleMscBtn.setText("Shuffle Music");
        shuffleMscBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shuffleMscBtnActionPerformed(evt);
            }
        });

        loopButtontoggle.setText("Loop: Off");
        loopButtontoggle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loopButtontoggleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jFileChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(playmscBtn)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(stopmscBtn)
                                        .addGap(18, 18, 18)
                                        .addComponent(pausemscBtn)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(resumemscBtn))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(60, 60, 60)
                                        .addComponent(jLabel2)
                                        .addGap(18, 18, 18)
                                        .addComponent(fileLocFld, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(28, 28, 28)
                                .addComponent(removeBtn))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(shuffleMscBtn)
                                .addGap(28, 28, 28)
                                .addComponent(loopButtontoggle))
                            .addComponent(ProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(96, 96, 96))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(logolbl, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(fileLocFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addGap(24, 24, 24)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(playmscBtn)
                                    .addComponent(stopmscBtn)
                                    .addComponent(pausemscBtn)
                                    .addComponent(removeBtn)
                                    .addComponent(resumemscBtn))
                                .addGap(18, 18, 18)
                                .addComponent(jFileChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(logolbl, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(shuffleMscBtn)
                            .addComponent(loopButtontoggle))))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Music ", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fileLocFldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fileLocFldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fileLocFldActionPerformed

    private void playmscBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playmscBtnActionPerformed

        try {
            if (Integer.parseInt(fileLocFld.getText()) > -1 && Integer.parseInt(fileLocFld.getText()) < songs.size()) {
                musicIndex = Integer.parseInt(fileLocFld.getText());
                songs.get(musicIndex).playMusic();
                //checking to see if the index is valid in the try statement
            } else {
                JOptionPane.showMessageDialog(null, "Please Enter a valid Index!");
                return;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Please Enter a valid Index!");
            return;
            
        }

        musicPlaying = true;
        playmscBtn.setEnabled(false);
        stopmscBtn.setEnabled(true);

        pausemscBtn.setEnabled(true);
        resumemscBtn.setEnabled(true);

        Timer timer = new Timer();

        TimerTask task = new TimerTask() {

            //progress bar functionality. It will work for a whole list of songs.
            public void run() {

                ProgressBar.setValue(updateProgressBar());

//                musicSlider.setValue(updateProgressBar());
                System.out.println(updateProgressBar());
                if (songs.get(musicIndex).musicProgress() >= songs.get(musicIndex).getMaxMicroSecondPos()) {
                    if (musicIndex >= counter - 1 && musicLoop == false) {
                        try {
                            songs.get(musicIndex).stopMusic();
                        } catch (IOException ex) {
                            Logger.getLogger(Pootify.class.getName()).log(Level.SEVERE, null, ex);
                        }

                    } else if (musicIndex >= counter - 1 && musicLoop == true) {
                        musicIndex = 0;
                        songs.get(musicIndex).playMusic();
                    } else {
                        musicIndex++;
                        songs.get(musicIndex).playMusic();
                    }

                }

            }
        };

        timer.scheduleAtFixedRate(task, 0, 500);


    }//GEN-LAST:event_playmscBtnActionPerformed
    public int updateProgressBar() {
//converting microsecond to seconds and dividing it by the max amount of seconds the song has to see what percent its at to determine how far the progressbar should progress.
        double maxSeconds = (double) songs.get(musicIndex).getMaxMicroSecondPos() / 1000000;

        double currentSeconds = ((double) songs.get(musicIndex).musicProgress()) / 1000000;

        progressVal = (currentSeconds / maxSeconds) * 100;

        int progressValinInt = (int) progressVal;

        return progressValinInt;

    }
    private void jFileChooser1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFileChooser1ActionPerformed

        File f = jFileChooser1.getSelectedFile();
        String filepath = f.getAbsolutePath();

        //add music to the songs array and to the text field so that the user can select index of the song to be able to play.
        songs.add(new Music(filepath));
        System.out.println(songs.get(counter).getMusicName());
        musicTextArea.append(songs.get(counter).getMusicName() + ": Index " + (counter) + "\n");
        fileLocFld.setText("" + ((counter)));
        counter++;
        System.out.println("size:" + songs.size());
        System.out.println("counter:" + counter);
        removeBtn.setEnabled(true);


        
    }//GEN-LAST:event_jFileChooser1ActionPerformed

    private void stopmscBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stopmscBtnActionPerformed

        try {
            for (int i = 0; i < songs.size(); i++) {
                songs.get(i).stopMusic();
            }

            musicPlaying = false;
            stopmscBtn.setEnabled(false);
            playmscBtn.setEnabled(true);

            pausemscBtn.setEnabled(false);
            resumemscBtn.setEnabled(false);
        } catch (IOException ex) {
            Logger.getLogger(Pootify.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_stopmscBtnActionPerformed

    private void pausemscBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pausemscBtnActionPerformed

        songs.get(musicIndex).pauseMusic();

    }//GEN-LAST:event_pausemscBtnActionPerformed

    private void removeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeBtnActionPerformed

        //only be able to remove if theres no music playing. Otherwise, the program crashes.
        if (musicPlaying == false) {
            songs.remove(counter - 1);
            try {

                musicTextArea.select(musicTextArea.getLineStartOffset(counter - 1), musicTextArea.getLineEndOffset(counter - 1));
                musicTextArea.replaceSelection(null);
            } catch (Exception e) {

            }

            counter--;
            System.out.println("size:" + songs.size());
            System.out.println("counter:" + counter);

            try {
                if (counter <= 0) {
                    counter = 0;
                    removeBtn.setEnabled(false);
                }

    }//GEN-LAST:event_removeBtnActionPerformed

   
    catch (Exception e) {
                counter = 0;
            }

        } else {
            JOptionPane.showMessageDialog(null, "Can't remove music while it is playing or if it is Paused!");
        }
    }

     private void resumemscBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resumemscBtnActionPerformed

         
         songs.get(musicIndex).resumeMusic();

    }//GEN-LAST:event_resumemscBtnActionPerformed

    private void shuffleMscBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shuffleMscBtnActionPerformed

        musicList mscList = new musicList();
        songs = mscList.shuffleMusic(songs);

        System.out.println(songs.toString());
        musicTextArea.setText("");
        for (int i = 0; i < songs.size(); i++) {

            musicTextArea.append(songs.get(i).getMusicName() + " - Index: " + i + "\n");

        }

    }//GEN-LAST:event_shuffleMscBtnActionPerformed

    private void loopButtontoggleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loopButtontoggleActionPerformed

        if (loopButtontoggle.isSelected()) {
            musicLoop = true;
            loopButtontoggle.setText("Loop: On");
//loop turned on or off and the boolean variable is used in the play music button.
        } else {
            musicLoop = false;
            loopButtontoggle.setText("Loop: Off");
        }

    }//GEN-LAST:event_loopButtontoggleActionPerformed

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
            java.util.logging.Logger.getLogger(Pootify.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pootify.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pootify.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pootify.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                new Pootify().setVisible(true);

            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JProgressBar ProgressBar;
    private javax.swing.JTextField fileLocFld;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel logolbl;
    private javax.swing.JToggleButton loopButtontoggle;
    private javax.swing.JTextArea musicTextArea;
    private javax.swing.JButton pausemscBtn;
    private javax.swing.JButton playmscBtn;
    private javax.swing.JButton removeBtn;
    private javax.swing.JButton resumemscBtn;
    private javax.swing.JButton shuffleMscBtn;
    private javax.swing.JButton stopmscBtn;
    private javax.swing.ButtonGroup themesButtons;
    // End of variables declaration//GEN-END:variables
}
