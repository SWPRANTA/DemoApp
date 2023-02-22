
package demoapp;
public class musicPlayerForm extends javax.swing.JFrame {

    /**
     * Creates new form musicPlayerForm
     */
    public musicPlayerForm() {
        initComponents();
        
        musicPlayer.loadMusic(filepath);
    }
    
    static String filepath = "the-rhythm-of-the-africa-wav-8837.wav";
    static long clipTimePosition;
    
    static boolean isPlaying = false;
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fileInputTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        loadButton = new javax.swing.JButton();
        playButton = new javax.swing.JButton();
        pauseButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fileInputTextField.setText("jTextField1");
        fileInputTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fileInputTextFieldActionPerformed(evt);
            }
        });

        jLabel1.setText("FilePath");

        loadButton.setText("Load");
        loadButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadButtonActionPerformed(evt);
            }
        });

        playButton.setText("Play");
        playButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playButtonActionPerformed(evt);
            }
        });

        pauseButton.setText("Pause");
        pauseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pauseButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(fileInputTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(loadButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(playButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pauseButton)))
                .addContainerGap(67, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fileInputTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(loadButton))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(playButton)
                    .addComponent(pauseButton))
                .addContainerGap(135, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loadButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadButtonActionPerformed
        filepath = fileInputTextField.getText();
        musicPlayer.clip.stop();
        musicPlayer.clip.setMicrosecondPosition(0);
        clipTimePosition = 0;
        musicPlayer.loadMusic(filepath);
    }//GEN-LAST:event_loadButtonActionPerformed

    private void playButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playButtonActionPerformed
        musicPlayer.clip.setMicrosecondPosition(0);
        clipTimePosition = 0;
        musicPlayer.clip.start();
    }//GEN-LAST:event_playButtonActionPerformed

    private void pauseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pauseButtonActionPerformed
        if(isPlaying){
            clipTimePosition = musicPlayer.clip.getMicrosecondPosition();
            musicPlayer.clip.stop();
            pauseButton.setText("Resume");
        }
        else{
            musicPlayer.clip.setMicrosecondPosition(clipTimePosition);
            musicPlayer.clip.start();
            pauseButton.setText("Pause");
        }
        isPlaying = !isPlaying;
    }//GEN-LAST:event_pauseButtonActionPerformed

    private void fileInputTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fileInputTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fileInputTextFieldActionPerformed

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
            java.util.logging.Logger.getLogger(musicPlayerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(musicPlayerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(musicPlayerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(musicPlayerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new musicPlayerForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField fileInputTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton loadButton;
    private javax.swing.JButton pauseButton;
    private javax.swing.JButton playButton;
    // End of variables declaration//GEN-END:variables
}