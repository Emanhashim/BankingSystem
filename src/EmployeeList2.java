
import bb.classes.connection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cs
 */
public class EmployeeList2 extends javax.swing.JInternalFrame {

    /**
     * Creates new form EmployeeList2
     */
    public EmployeeList2() {
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

        pop1 = new javax.swing.JPopupMenu();
        menuDelet = new javax.swing.JMenuItem();
        menuUpdate = new javax.swing.JMenuItem();
        menuInsert = new javax.swing.JMenuItem();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        popup = new javax.swing.JPopupMenu();
        menuItemDelete = new javax.swing.JMenuItem();
        menuItemInsert = new javax.swing.JMenuItem();
        menuItemUpdate = new javax.swing.JMenuItem();
        jPopupMenu2 = new javax.swing.JPopupMenu();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtEmpid = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblemplist = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();

        menuDelet.setText("Delete");
        pop1.add(menuDelet);

        menuUpdate.setText("Update");
        pop1.add(menuUpdate);

        menuInsert.setText("Insert");
        pop1.add(menuInsert);

        menuItemDelete.setText("Delete");
        menuItemDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemDeleteActionPerformed(evt);
            }
        });
        popup.add(menuItemDelete);

        menuItemInsert.setText("Insert");
        popup.add(menuItemInsert);

        menuItemUpdate.setText("Update");
        popup.add(menuItemUpdate);

        setBackground(java.awt.Color.magenta);
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        jPanel1.setBackground(java.awt.Color.pink);
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Seaching Employee", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 18), java.awt.Color.red)); // NOI18N

        jLabel1.setBackground(java.awt.Color.pink);
        jLabel1.setText("EmployeeID");

        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEmpid, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtEmpid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addContainerGap(58, Short.MAX_VALUE))
        );

        tblemplist.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Employee_ID", "First_Name", "Last_Name", "Sex", "Address", "PHone_Number"
            }
        ));
        tblemplist.setComponentPopupMenu(popup);
        tblemplist.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tblemplistFocusGained(evt);
            }
        });
        jScrollPane1.setViewportView(tblemplist);

        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 781, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(211, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(382, 382, 382))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
 if (!"".equals(this.txtEmpid.getText())) {
           
        } else {
            JOptionPane.showMessageDialog(this, "Please enter Employee_ID to search", "Banking_System", JOptionPane.INFORMATION_MESSAGE);
        }
        
        
        searchByEmpID();
        
// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tblemplistFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tblemplistFocusGained

       int row = this.tblemplist.getSelectedRow();
        Object str = this.tblemplist.getValueAt(row, 0);
        searchItem((String) str); 


// TODO add your handling code here:
    }//GEN-LAST:event_tblemplistFocusGained

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
loadEmployee();
        
// TODO add your handling code here:
    }//GEN-LAST:event_formInternalFrameOpened

    private void menuItemDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemDeleteActionPerformed

       Delete();




// TODO add your handling code here:
    }//GEN-LAST:event_menuItemDeleteActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem menuDelet;
    private javax.swing.JMenuItem menuInsert;
    private javax.swing.JMenuItem menuItemDelete;
    private javax.swing.JMenuItem menuItemInsert;
    private javax.swing.JMenuItem menuItemUpdate;
    private javax.swing.JMenuItem menuUpdate;
    private javax.swing.JPopupMenu pop1;
    private javax.swing.JPopupMenu popup;
    private javax.swing.JTable tblemplist;
    private javax.swing.JTextField txtEmpid;
    // End of variables declaration//GEN-END:variables
        Connection conn = null;
        PreparedStatement pst = null;
        ResultSet rst = null;
 private void searchByEmpID() {
       
        DefaultTableModel model = (DefaultTableModel) tblemplist.getModel();
        model.setRowCount(0);
        
        try {
            String sql = "Select * from Employee where Employee_ID = ?";
            conn = connection.getConn();
            pst = conn.prepareStatement(sql);
            pst.setString(1, (txtEmpid.getText()));
            rst = pst.executeQuery();
            while(rst.next()){
                model.addRow(new Object[]{rst.getString("Employee_ID"),rst.getString("First_Name"),rst.getString("Last_Name"),rst.getString("Sex"),rst.getString
        ("Address"), rst.getString("Phone_Number")});
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Database server error" + e.getMessage());
        }

 }

 private void loadEmployee(){
  Connection conn = null;
        PreparedStatement pst = null;
        DefaultTableModel model = (DefaultTableModel) tblemplist.getModel();
        model.setRowCount(0);
        ResultSet rst = null;
        try {
            String sql = "Select * from Employee";
            conn = connection.getConn();
            pst = conn.prepareStatement(sql);
            rst = pst.executeQuery();
            while(rst.next()){
                model.addRow(new Object[]{rst.getString("Employee_ID"),rst.getString("First_Name"),rst.getString("Last_Name"),rst.getString("Sex"),rst.getString("Address"), rst.getString("Phone_Number")});
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Database server error" + e.getMessage());
        }

    }
    private void advanceSearch(String title, String author) {
    }

    private void searchItem(String string) {   
 }

private void Delete(){

try {
            int resp = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete the selected record?");
            if (resp == JOptionPane.YES_OPTION) {
                int row = tblemplist.getSelectedRow() + 1;
                rst.absolute(row);
                rst.deleteRow();
                JOptionPane.showMessageDialog(this, "Record deleted successfully.");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Database server error" + e.getMessage());
        }
    


}}