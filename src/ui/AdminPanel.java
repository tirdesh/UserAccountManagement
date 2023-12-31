/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import model.PersonsList;
import model.UsersList;

/**
 *
 * @author Gautam16
 */
public class AdminPanel extends javax.swing.JPanel {
    private PersonsList plist;
    private UsersList ulist;
    private MainJFrame mainFrame;
    /**
     * Creates new form LoginPanel
     */
    public AdminPanel(MainJFrame mainFrame, PersonsList plist, UsersList ulist) {
        initComponents();
        this.mainFrame = mainFrame;
        this.plist = plist;
        this.ulist = ulist;
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        splitPane4 = new javax.swing.JSplitPane();
        consolePanel4 = new javax.swing.JPanel();
        btnAddPerson = new javax.swing.JButton();
        btnListPersons = new javax.swing.JButton();
        btnSearchPerson = new javax.swing.JButton();
        btnCreateUser = new javax.swing.JButton();
        btnManageUsers = new javax.swing.JButton();
        btnLogOut = new javax.swing.JButton();
        workArea1 = new javax.swing.JPanel();

        splitPane4.setPreferredSize(new java.awt.Dimension(400, 300));

        btnAddPerson.setText("Add Person");
        btnAddPerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddPersonActionPerformed(evt);
            }
        });

        btnListPersons.setText("List Persons");
        btnListPersons.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListPersonsActionPerformed(evt);
            }
        });

        btnSearchPerson.setText("Search Person");
        btnSearchPerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchPersonActionPerformed(evt);
            }
        });

        btnCreateUser.setText("Create User");
        btnCreateUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateUserActionPerformed(evt);
            }
        });

        btnManageUsers.setText("Manage Users");
        btnManageUsers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageUsersActionPerformed(evt);
            }
        });

        btnLogOut.setText("Log Out");
        btnLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogOutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout consolePanel4Layout = new javax.swing.GroupLayout(consolePanel4);
        consolePanel4.setLayout(consolePanel4Layout);
        consolePanel4Layout.setHorizontalGroup(
            consolePanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, consolePanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(consolePanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btnListPersons, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearchPerson)
                    .addComponent(btnCreateUser, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnManageUsers)
                    .addComponent(btnAddPerson, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLogOut))
                .addGap(21, 21, 21))
        );
        consolePanel4Layout.setVerticalGroup(
            consolePanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(consolePanel4Layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addComponent(btnAddPerson)
                .addGap(18, 18, 18)
                .addComponent(btnListPersons)
                .addGap(18, 18, 18)
                .addComponent(btnSearchPerson)
                .addGap(18, 18, 18)
                .addComponent(btnCreateUser)
                .addGap(18, 18, 18)
                .addComponent(btnManageUsers)
                .addGap(18, 18, 18)
                .addComponent(btnLogOut)
                .addContainerGap(67, Short.MAX_VALUE))
        );

        splitPane4.setLeftComponent(consolePanel4);

        javax.swing.GroupLayout workArea1Layout = new javax.swing.GroupLayout(workArea1);
        workArea1.setLayout(workArea1Layout);
        workArea1Layout.setHorizontalGroup(
            workArea1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 550, Short.MAX_VALUE)
        );
        workArea1Layout.setVerticalGroup(
            workArea1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );

        splitPane4.setRightComponent(workArea1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(splitPane4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(splitPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddPersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddPersonActionPerformed
        // TODO add your handling code here:
        AddPersonJPanel addPersonPanel = new AddPersonJPanel(plist);
        splitPane4.setRightComponent(addPersonPanel);
    }//GEN-LAST:event_btnAddPersonActionPerformed

    private void btnListPersonsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListPersonsActionPerformed
        // TODO add your handling code here:
        ListPersonsJPanel listPersonsPanel = new ListPersonsJPanel(plist);
        splitPane4.setRightComponent(listPersonsPanel);
    }//GEN-LAST:event_btnListPersonsActionPerformed

    private void btnSearchPersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchPersonActionPerformed
        // TODO add your handling code here:
        SearchPersonJPanel searchPersonPanel = new SearchPersonJPanel(plist);
        splitPane4.setRightComponent(searchPersonPanel);
    }//GEN-LAST:event_btnSearchPersonActionPerformed

    private void btnCreateUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateUserActionPerformed
        // TODO add your handling code here:
        AddUserJPanel addUserPanel = new AddUserJPanel(plist, ulist);
        splitPane4.setRightComponent(addUserPanel);
    }//GEN-LAST:event_btnCreateUserActionPerformed

    private void btnManageUsersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageUsersActionPerformed
        // TODO add your handling code here:
        ManageUserJPanel manageUserPanel = new ManageUserJPanel(plist, ulist);
        splitPane4.setRightComponent(manageUserPanel);
    }//GEN-LAST:event_btnManageUsersActionPerformed

    private void btnLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogOutActionPerformed
        // TODO add your handling code here:
        mainFrame.switchToLoginPanel();
    }//GEN-LAST:event_btnLogOutActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddPerson;
    private javax.swing.JButton btnCreateUser;
    private javax.swing.JButton btnListPersons;
    private javax.swing.JButton btnLogOut;
    private javax.swing.JButton btnManageUsers;
    private javax.swing.JButton btnSearchPerson;
    private javax.swing.JPanel consolePanel4;
    private javax.swing.JSplitPane splitPane4;
    private javax.swing.JPanel workArea1;
    // End of variables declaration//GEN-END:variables
}
