import java.sql.ResultSet;
import java.sql.*;
import javax.swing.JOptionPane;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ACER
 */
public class ChangeSuppliers extends javax.swing.JFrame {

    /**
     * Creates new form RemoveSuppliers
     */
    public ChangeSuppliers() {
        initComponents();
        
        try{
           Statement stmt = NewClass.getConnection().createStatement(); 
           String query = "SELECT sName FROM supplier;";
           ResultSet rs = stmt.executeQuery(query);
           while(rs.next())
            SupplierComboBox.addItem(rs.getString("sName"));
           }
        catch(Exception e){ 
            System.out.println(e);
           }  
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BackgroundPanel = new javax.swing.JPanel();
        HeaderPanel = new javax.swing.JPanel();
        HeadlineLabel = new javax.swing.JLabel();
        HomeButton = new javax.swing.JButton();
        BackButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        RemoveButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        itemComboBox = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        brandComboBox = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        SupplierComboBox = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Change Suppliers");

        BackgroundPanel.setBackground(new java.awt.Color(255, 255, 255));
        BackgroundPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        HeaderPanel.setBackground(new java.awt.Color(0, 255, 204));

        HeadlineLabel.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        HeadlineLabel.setForeground(new java.awt.Color(255, 255, 255));
        HeadlineLabel.setText("INVENTORY SYSTEM");

        javax.swing.GroupLayout HeaderPanelLayout = new javax.swing.GroupLayout(HeaderPanel);
        HeaderPanel.setLayout(HeaderPanelLayout);
        HeaderPanelLayout.setHorizontalGroup(
            HeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderPanelLayout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(HeadlineLabel)
                .addContainerGap(102, Short.MAX_VALUE))
        );
        HeaderPanelLayout.setVerticalGroup(
            HeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderPanelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(HeadlineLabel)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        BackgroundPanel.add(HeaderPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 110));

        HomeButton.setText("Home");
        HomeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeButtonActionPerformed(evt);
            }
        });
        BackgroundPanel.add(HomeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 360, -1, -1));

        BackButton.setText("Back");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });
        BackgroundPanel.add(BackButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 360, -1, -1));
        BackgroundPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 180, -1, -1));

        RemoveButton.setText("Change");
        RemoveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveButtonActionPerformed(evt);
            }
        });
        BackgroundPanel.add(RemoveButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 270, -1, -1));

        jLabel1.setText("Item");
        BackgroundPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, -1, -1));

        itemComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Text Books 40p", "Text Books 80p", "Text Books 120p", "Pens (blue)", "Pens (red)", "Pens (black)" }));
        itemComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemComboBoxActionPerformed(evt);
            }
        });
        BackgroundPanel.add(itemComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 140, -1, -1));

        jLabel3.setText("Brand");
        BackgroundPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 180, -1, -1));

        brandComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Atlas", "Richard" }));
        BackgroundPanel.add(brandComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 180, -1, -1));

        jLabel4.setText("Supplier");
        BackgroundPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, -1, -1));

        SupplierComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SupplierComboBoxActionPerformed(evt);
            }
        });
        BackgroundPanel.add(SupplierComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 220, 290, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackgroundPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackgroundPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void HomeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeButtonActionPerformed
        new Homepage().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_HomeButtonActionPerformed

    private void RemoveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveButtonActionPerformed
        String item = itemComboBox.getSelectedItem().toString();
        String brand = brandComboBox.getSelectedItem().toString();
        String supplier = SupplierComboBox.getSelectedItem().toString();
        
        try{
           Statement stmt = NewClass.getConnection().createStatement(); 
           String query1 ="SELECT sId FROM supplier WHERE sName='"+supplier+"';";
           ResultSet rs = stmt.executeQuery(query1);
           int n = 0;
           while(rs.next())
               n = rs.getInt("sId");
           
           String query = "UPDATE item SET sId = '"+n+"' WHERE iName='"+item+"' and iBrand='"+brand+"';";
           stmt.executeUpdate(query);
          
           JOptionPane.showMessageDialog(this, "Successfully Changed");
           
           }
        catch(Exception e){ 
            System.out.println(e);
           }  
        
        
    }//GEN-LAST:event_RemoveButtonActionPerformed

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        new Settings().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BackButtonActionPerformed

    private void itemComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemComboBoxActionPerformed

    private void SupplierComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SupplierComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SupplierComboBoxActionPerformed

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
            java.util.logging.Logger.getLogger(ChangeSuppliers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChangeSuppliers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChangeSuppliers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChangeSuppliers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChangeSuppliers().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JPanel BackgroundPanel;
    private javax.swing.JPanel HeaderPanel;
    private javax.swing.JLabel HeadlineLabel;
    private javax.swing.JButton HomeButton;
    private javax.swing.JButton RemoveButton;
    private javax.swing.JComboBox<String> SupplierComboBox;
    private javax.swing.JComboBox<String> brandComboBox;
    private javax.swing.JComboBox<String> itemComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
