import java.sql.*;
import javax.swing.*;
public class JDBCGUI extends javax.swing.JFrame {
    private Connection con;
    Statement st;
    ResultSet res;
    PreparedStatement pstmt;
    public JDBCGUI() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        labelName = new javax.swing.JLabel();
        labelRollNo = new javax.swing.JLabel();
        labelCourse = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtCourse = new javax.swing.JTextField();
        txtRollNo = new javax.swing.JTextField();
        btnPrevious = new javax.swing.JButton();
        btnInsert = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        btnGet = new javax.swing.JButton();
        btnLoad = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Algerian", 0, 12)); // NOI18N
        jLabel1.setText("ID");

        labelName.setFont(new java.awt.Font("Algerian", 0, 12)); // NOI18N
        labelName.setText("Name");

        labelRollNo.setFont(new java.awt.Font("Algerian", 0, 12)); // NOI18N
        labelRollNo.setText("Roll No");

        labelCourse.setFont(new java.awt.Font("Algerian", 0, 12)); // NOI18N
        labelCourse.setText("Course");

        txtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActionPerformed(evt);
            }
        });

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        btnPrevious.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        btnPrevious.setText("Previous");
        btnPrevious.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreviousActionPerformed(evt);
            }
        });

        btnInsert.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        btnInsert.setText("Insert");
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });

        btnUpdate.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnNext.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        btnNext.setText("Next");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        btnGet.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        btnGet.setText("Get");
        btnGet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGetActionPerformed(evt);
            }
        });

        btnLoad.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        btnLoad.setText("Load All");
        btnLoad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelName, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelRollNo, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtRollNo, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLoad)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPrevious)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnInsert)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnUpdate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDelete)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnGet)
                .addGap(18, 18, 18)
                .addComponent(btnNext)
                .addGap(57, 57, 57))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelName, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelRollNo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRollNo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPrevious)
                    .addComponent(btnInsert)
                    .addComponent(btnUpdate)
                    .addComponent(btnDelete)
                    .addComponent(btnNext)
                    .addComponent(btnGet)
                    .addComponent(btnLoad))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        
    }//GEN-LAST:event_txtNameActionPerformed

    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed
        String id = txtID.getText().toString();
        String name = txtName.getText().toString();
        String rno = txtRollNo.getText().toString();
        String course = txtCourse.getText().toString();
        try{
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root", "");
            String query = "INSERT INTO `tblstudent` (`id`, `name`, `roll_no`, `course`) VALUES (?, ?, ?, ?)";
            pstmt = con.prepareStatement(query);
            pstmt.setInt(1, Integer.parseInt(id));
            pstmt.setString(2, name);
            pstmt.setInt(3, Integer.parseInt(rno));
            pstmt.setString(4, course);
            pstmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data Inserted For " + name);
        } 
        catch(SQLException e){
            System.err.println("Error Caught : " + e.getMessage());
        }
    }//GEN-LAST:event_btnInsertActionPerformed

    private void btnGetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGetActionPerformed
        String id = txtID.getText().toString();
        try{
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root", "");
            String query = "SELECT * FROM tblstudent WHERE id = ?";
            pstmt = con.prepareStatement(query);
            pstmt.setInt(1, Integer.parseInt(id));  
            res = pstmt.executeQuery();
            res.first();
            if(res.first() == false){
                JOptionPane.showMessageDialog(null, "No ID Found");
            }
            txtName.setText(res.getString(2));
            txtRollNo.setText(res.getString(3));
            txtCourse.setText(res.getString(4));
        }
        catch(SQLException e){
            System.err.println("Error Caught : " + e.getMessage());
        }
    }//GEN-LAST:event_btnGetActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        String id = txtID.getText().toString();
        String name = txtName.getText().toString();
        String rno = txtRollNo.getText().toString();
        String course = txtCourse.getText().toString();
        try{
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root", "");
            String query = "UPDATE tblstudent SET name = ?, roll_no = ?, course = ? WHERE id = ?";
            pstmt = con.prepareStatement(query);
            pstmt.setString(1, name);
            pstmt.setInt(2, Integer.parseInt(rno));
            pstmt.setString(3, course);
            pstmt.setInt(4, Integer.parseInt(id));
            pstmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data Updated For " + name);
        } 
        catch(SQLException e){
            System.err.println("Error Caught : " + e.getMessage());
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        String id = txtID.getText().toString();
        String name = txtName.getText().toString();
        String rno = txtRollNo.getText().toString();
        String course = txtCourse.getText().toString();
        try{
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root", "");
            String query = "DELETE FROM `school`.`tblstudent` WHERE `tblstudent`.`id` = ?";
            pstmt = con.prepareStatement(query);
            pstmt.setString(1, id);
            pstmt.executeUpdate();
            if(pstmt.executeUpdate() != 0)
                JOptionPane.showMessageDialog(null, "No ID Found For " + name);
            else
                JOptionPane.showMessageDialog(null, "Data Deleted For " + name);
        } 
        catch(SQLException e){
            System.err.println("Error Caught : " + e.getMessage());
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnPreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreviousActionPerformed
        try{
        if(res.previous()){
            txtID.setText(res.getString(1));
            txtName.setText(res.getString(2));
            txtRollNo.setText(res.getString(3));
            txtCourse.setText(res.getString(4));
        }
     }
        catch(SQLException e){
            System.err.println("Error Caught : " + e.getMessage());
        }
    }//GEN-LAST:event_btnPreviousActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        String id = txtID.getText().toString();
        try{
            if(res.next()){
                txtID.setText(res.getString(1));
                txtName.setText(res.getString(2));
                txtRollNo.setText(res.getString(3));
                txtCourse.setText(res.getString(4));
            }
        } 
        catch(SQLException e){
            System.err.println("Error Caught : " + e.getMessage());
        }
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnLoadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoadActionPerformed
        try{
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root", "");
            String query = "SELECT * FROM tblstudent";
            pstmt = con.prepareStatement(query); 
            res = pstmt.executeQuery();
            res.first();
            txtID.setText(res.getString(1));
            txtName.setText(res.getString(2));
            txtRollNo.setText(res.getString(3));
            txtCourse.setText(res.getString(4));
        }
        catch(SQLException e){
            System.err.println("Error Caught : " + e.getMessage());
        }
    }//GEN-LAST:event_btnLoadActionPerformed

    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDActionPerformed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JDBCGUI().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnGet;
    private javax.swing.JButton btnInsert;
    private javax.swing.JButton btnLoad;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnPrevious;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel labelCourse;
    private javax.swing.JLabel labelName;
    private javax.swing.JLabel labelRollNo;
    private javax.swing.JTextField txtCourse;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtRollNo;
    // End of variables declaration//GEN-END:variables
}
