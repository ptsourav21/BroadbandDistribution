/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package broadband_distribution;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ishfaq
 */
public class emp_menu1 extends javax.swing.JInternalFrame {

    /**
     * Creates new form emp_menu1
     */
    public emp_menu1() {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0,0));
        BasicInternalFrameUI ui=(BasicInternalFrameUI)this.getUI();
        ui.setNorthPane(null);
        
        
        
        
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection connection = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;databaseName=Broadband;selectMethod=cursor", "sa", "123456");

            Statement statement = connection.createStatement();
            String sql = "SELECT * FROM employee";
            ResultSet resultSet = statement
                    .executeQuery(sql);

            while (resultSet.next()) {

                String id = resultSet.getString("employeeId");
                String fname = resultSet.getString("eFame");
                String lname = resultSet.getString("elastName");

  String email = resultSet.getString("eEmail");
                String fAd = resultSet.getString("eAdress");
                String fNo = resultSet.getString("ephoneNo");
 String wa = resultSet.getString("working_area");
                String tData[] = {id, fname,lname, email, fAd, fNo,wa};
                DefaultTableModel tbm1 = (DefaultTableModel) empTable.getModel();
                tbm1.addRow(tData);

            }

        } catch (Exception e) {
            e.printStackTrace();
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

        jLabel6 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        keyword = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        empTable = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(204, 204, 204));
        setBorder(null);
        setPreferredSize(new java.awt.Dimension(700, 540));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel6.setText("ENTER KEYWORDS :");

        jButton4.setBackground(new java.awt.Color(153, 153, 153));
        jButton4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButton4.setText("SREACH");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        keyword.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        keyword.setBorder(null);
        keyword.setOpaque(false);

        empTable.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        empTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "First NAME", "Last Name", "EMAIL", "ADDRESS", "PHONE NO", "WORKING AREA"
            }
        ));
        jScrollPane1.setViewportView(empTable);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel5.setText("SERACH BY :");

        jComboBox1.setBackground(new java.awt.Color(0, 153, 255));
        jComboBox1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NAME", "ID" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
                    .addComponent(keyword))
                .addGap(18, 18, 18)
                .addComponent(jButton4)
                .addGap(46, 46, 46))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(jButton4)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(keyword, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(37, 37, 37)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:

          DefaultTableModel tbm = (DefaultTableModel) empTable.getModel();
                tbm.setRowCount(0);
        
         String value= jComboBox1.getSelectedItem().toString();
        if(value.equals("ID")){
            try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection connection = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;databaseName=Broadband;selectMethod=cursor", "sa", "123456");

            String dead= keyword.getText();
           // String size= jTextField2.getText();
            
            Statement statement = connection.createStatement();
            
             //String Client_Name = null;
             //String Email = null;
               ResultSet resultSet = statement.executeQuery("SELECT * FROM employee WHERE employeeId = '"+ Integer.parseInt(dead) +"'" );
            
            if (resultSet.next()) {
               
               String id = resultSet.getString("employeeId");
                String fname = resultSet.getString("eFame");
                String lname = resultSet.getString("elastName");

  String email = resultSet.getString("eEmail");
                String fAd = resultSet.getString("eAdress");
                String fNo = resultSet.getString("ephoneNo");
 String wa = resultSet.getString("working_area");
                String tData[] = {id, fname,lname, email, fAd, fNo,wa};
                DefaultTableModel tbm1 = (DefaultTableModel) empTable.getModel();
                tbm1.addRow(tData);
       
            }
            else
            {
                JOptionPane.showMessageDialog(this, "Enter Keyword");
                   
            }
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        }
        
        else if(value.equals("NAME")){
             try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection connection = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;databaseName=Broadband;selectMethod=cursor", "sa", "123456");

            String dead= keyword.getText();
           // String size= jTextField2.getText();
            
            Statement statement = connection.createStatement();
            
             //String Client_Name = null;
             //String Email = null;
               ResultSet resultSet = statement.executeQuery("SELECT * FROM employee WHERE eFame like '"+ dead +"%' or elastName like '"+dead+"%'" );
            
            if (resultSet.next()) {
               String id = resultSet.getString("employeeId");
                String fname = resultSet.getString("eFame");
                String lname = resultSet.getString("elastName");

  String email = resultSet.getString("eEmail");
                String fAd = resultSet.getString("eAdress");
                String fNo = resultSet.getString("ephoneNo");
 String wa = resultSet.getString("working_area");
                String tData[] = {id, fname,lname, email, fAd, fNo,wa};
                DefaultTableModel tbm1 = (DefaultTableModel) empTable.getModel();
                tbm1.addRow(tData);
       
            }
            else
            {
                JOptionPane.showMessageDialog(this, "Enter Keyword");
                   
            }
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        }
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jComboBox1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable empTable;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField keyword;
    // End of variables declaration//GEN-END:variables
}
