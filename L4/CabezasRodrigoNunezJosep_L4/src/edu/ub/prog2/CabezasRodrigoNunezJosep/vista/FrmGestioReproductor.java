package edu.ub.prog2.CabezasRodrigoNunezJosep.vista;

import edu.ub.prog2.CabezasRodrigoNunezJosep.controlador.Controlador;
import edu.ub.prog2.utils.AplicacioException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Rodrigo Cabezas Quirós
 */
public class FrmGestioReproductor extends javax.swing.JFrame {
    
    private Controlador controlador;

    /**
     * Creates new form FrmGestioReproductor
     */
    public FrmGestioReproductor(Controlador controlador) {
        this.controlador = controlador;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton2 = new javax.swing.JToggleButton();
        btPlay = new javax.swing.JButton();
        btPause = new javax.swing.JButton();
        btSkip = new javax.swing.JButton();
        btStop = new javax.swing.JButton();
        btRandom = new javax.swing.JToggleButton();
        btLoop = new javax.swing.JToggleButton();

        jToggleButton2.setText("jToggleButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Reproductor - Gestió curs");

        btPlay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ub/prog2/CabezasRodrigoNunezJosep/vista/media controls/play.gif"))); // NOI18N
        btPlay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPlay(evt);
            }
        });

        btPause.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ub/prog2/CabezasRodrigoNunezJosep/vista/media controls/Pause.png"))); // NOI18N
        btPause.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPauseActionPerformed(evt);
            }
        });

        btSkip.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ub/prog2/CabezasRodrigoNunezJosep/vista/media controls/Skip.png"))); // NOI18N
        btSkip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSkipActionPerformed(evt);
            }
        });

        btStop.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ub/prog2/CabezasRodrigoNunezJosep/vista/media controls/Stop.png"))); // NOI18N
        btStop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btStopActionPerformed(evt);
            }
        });

        btRandom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ub/prog2/CabezasRodrigoNunezJosep/vista/media controls/UI_Glyph_07-07-48.png"))); // NOI18N
        btRandom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRandomActionPerformed(evt);
            }
        });

        btLoop.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ub/prog2/CabezasRodrigoNunezJosep/vista/media controls/Loop.png"))); // NOI18N
        btLoop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLoopActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btPlay, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btPause, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(btSkip, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btStop, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btRandom, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btLoop, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btLoop, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btStop, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btPause, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btPlay, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                        .addComponent(btSkip, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE))
                    .addComponent(btRandom, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btPlay(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPlay
        try {
            this.controlador.reemprenReproduccio();
        } catch (AplicacioException ex) {
            Logger.getLogger(FrmGestioReproductor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btPlay

    private void btPauseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPauseActionPerformed
        try {
            this.controlador.pausaReproduccio();
        } catch (AplicacioException ex) {
            Logger.getLogger(FrmGestioReproductor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btPauseActionPerformed

    private void btSkipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSkipActionPerformed
        try {
            this.controlador.saltaReproduccio();
        } catch (AplicacioException ex) {
            Logger.getLogger(FrmGestioReproductor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btSkipActionPerformed

    private void btStopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btStopActionPerformed
        try {
            this.controlador.aturaReproduccio();
        } catch (AplicacioException ex) {
            Logger.getLogger(FrmGestioReproductor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btStopActionPerformed

    private void btRandomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRandomActionPerformed
        boolean estat = controlador.getAleatoria();
        this.controlador.setAleatori(!estat);
    }//GEN-LAST:event_btRandomActionPerformed

    private void btLoopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLoopActionPerformed
        boolean estat = controlador.getCiclica();
        this.controlador.setContinu(!estat);
    }//GEN-LAST:event_btLoopActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btLoop;
    private javax.swing.JButton btPause;
    private javax.swing.JButton btPlay;
    private javax.swing.JToggleButton btRandom;
    private javax.swing.JButton btSkip;
    private javax.swing.JButton btStop;
    private javax.swing.JToggleButton jToggleButton2;
    // End of variables declaration//GEN-END:variables
}