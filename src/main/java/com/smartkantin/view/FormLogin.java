/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smartkantin.view;

import com.smartkantin.controller.DaftarSiswaController;
import com.smartkantin.controller.LoginController;
import com.smartkantin.controller.TableTransferController;
import com.smartkantin.controller.dashboard.PendapatanController;
import com.smartkantin.dto.dashboard.pendapatan.PendapatanKantin;
import com.smartkantin.dto.login.Data;
import com.smartkantin.dto.menu.DaftarSiswa;
import com.smartkantin.dto.menu.DaftarSiswaModel;
import com.smartkantin.dto.menu.TableTransfer;
import com.smartkantin.dto.menu.TableTransferModel;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

/**
 *
 * @author artix
 */
@SpringBootApplication
public class FormLogin extends javax.swing.JFrame {
    
    public FormLogin() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rootPanel = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tfUsername = new javax.swing.JTextField();
        tfPassword = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));
        jPanel2.setLayout(null);

        jLabel2.setFont(new java.awt.Font("sansserif", 0, 48)); // NOI18N
        jLabel2.setText("Selamat Datang");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(50, 20, 386, 57);

        jLabel1.setFont(new java.awt.Font("sansserif", 0, 36)); // NOI18N
        jLabel1.setText("di Smart Kantin");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(90, 90, 280, 43);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/smartkantin-login.png"))); // NOI18N
        jPanel2.add(jLabel7);
        jLabel7.setBounds(0, 150, 490, 340);

        jLabel4.setFont(new java.awt.Font("sansserif", 0, 36)); // NOI18N
        jLabel4.setText("Login");

        jLabel5.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLabel5.setText("Username");

        jLabel6.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLabel6.setText("Passowrd");

        tfUsername.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        tfUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfUsernameActionPerformed(evt);
            }
        });

        tfPassword.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N

        btnLogin.setBackground(new java.awt.Color(153, 153, 255));
        btnLogin.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setText("Login");
        btnLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        btnExit.setBackground(new java.awt.Color(153, 153, 255));
        btnExit.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        btnExit.setForeground(new java.awt.Color(255, 255, 255));
        btnExit.setText("Exit");
        btnExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5))
                .addGap(29, 29, 29)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnExit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                        .addComponent(btnLogin)
                        .addGap(71, 71, 71))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4)
                            .addComponent(tfUsername)
                            .addComponent(tfPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(jLabel4)
                .addGap(65, 65, 65)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tfUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(tfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLogin)
                    .addComponent(btnExit))
                .addContainerGap(98, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout rootPanelLayout = new javax.swing.GroupLayout(rootPanel);
        rootPanel.setLayout(rootPanelLayout);
        rootPanelLayout.setHorizontalGroup(
            rootPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rootPanelLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 496, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        rootPanelLayout.setVerticalGroup(
            rootPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rootPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rootPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tfUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfUsernameActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnExitActionPerformed

    public static void main(String args[]) {

//        === enable spring GUI ===
        ConfigurableApplicationContext context = new SpringApplicationBuilder(FormLogin.class)
                .headless(false).run(args);
        EventQueue.invokeLater(() -> {
            
            FormLogin form = new FormLogin();
            
//            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()){
//                try {
//                    if (info.getName().equalsIgnoreCase("nimbus")){
//                        UIManager.setLookAndFeel(info.getClassName());
//                    }
//                } catch (Exception e){
//                    System.out.print(e.getStackTrace());
//                }
//            }
            
//             ===== LOGIN ====
//            exit button
            form.btnExit.addActionListener(action -> {
                int yesAndNoOption = JOptionPane.YES_NO_OPTION;
                int exitConfirm = JOptionPane.showConfirmDialog(form, "Yakin ingin keluar?",
                        "Peringatan", yesAndNoOption);
                
                if (exitConfirm == JOptionPane.YES_OPTION){
                    form.dispose();
                    System.exit(0);
                }
            });
            
//            login button
            form.btnLogin.addActionListener(action -> {
                
                try {
                    LoginController controller = new LoginController();
                    String username = form.tfUsername.getText();
                    String password = String.valueOf(form.tfPassword.getPassword());
                    
                    Data data = new Data();
                    data.setUsername(username);
                    data.setPassword(password);
                    
                    Data responseData = controller.postDataToApi(data);
                
                    if (!responseData.getStatus().equals("kosong")){
                        espek("berhasil");
                        real(responseData.getStatus());
                        
                        if (!responseData.getStatus().equals("pw_salah")){
                            espek("berhasil");
                            real(responseData.getStatus());
                            
                            
                            form.setVisible(false);
//                            form.dispose();
                         
                            Dashboard dashboard = new Dashboard("Halaman Admin");
                            
                            dashboard.setTfProfileUsername(username);
                            dashboard.setTfProfilePassword(password);
                            
                            dashboard.getPnlContent().removeAll();
                            dashboard.getPnlContent().add(dashboard.getPnlDashboard());
                            dashboard.getPnlContent().revalidate();
                            dashboard.getPnlContent().repaint();
                            
                            dashboard.repaint();
                            dashboard.revalidate();
                            
                            
                            PendapatanController control = new PendapatanController();
                            PendapatanKantin kantin = control.getListKantin();
                            System.out.println("\n\nBefor get kantin");
                            System.out.println(kantin.getKantin1());
                            System.out.println(kantin.getKantin2());
                            System.out.println(kantin.getKantin3());
                            System.out.println("After get kantin");
                            

                            dashboard.getKantin1().setText("<html> Kantin 1 <br> Rp " + dashboard.getPendapatan().getKantin1() + "</html>");
                            dashboard.getKantin2().setText("<html> Kantin 2 <br> Rp " + dashboard.getPendapatan().getKantin2() + "</html>");
                            dashboard.getKantin3().setText("<html> Kantin 3 <br> Rp " + dashboard.getPendapatan().getKantin3() + "</html>");

                            dashboard.getBtnDashboard().setForeground(Color.WHITE);

//                            TABLE TRANSFER
                            TableTransferController transferControl = new TableTransferController();
                            List<TableTransfer> tableTransfer = transferControl.getListTransfer();
//                            tableTransfer.add(new TableTransfer(1, "bnu", 2, 50000, "/wkwkwkwk"));
//                            tableTransfer.add(new TableTransfer(2, "anu", 1, 50000, "/wkwkwkwk"));
                            
                            TableTransferModel model = new TableTransferModel(tableTransfer);
                            model.fireTableDataChanged();
                            
                            dashboard.getTblTransfer().setAutoCreateRowSorter(true);
                            
                            dashboard.getTblTransfer().setModel(model);
                            dashboard.getTblTransfer().getTableHeader().setFont(new Font(
                                    "sansserif", Font.BOLD, 20
                            ));
                            dashboard.getTblDaftarSiswa().getTableHeader().setFont(new Font(
                                    "sansserif", Font.BOLD, 20
                            ));
                            
//                            DAFTAR SISWA
                            DaftarSiswaController controlDaftarSiswa = new DaftarSiswaController();
                            List<DaftarSiswa> dftrSiswa = controlDaftarSiswa.getListSiswa();
                            
                            DaftarSiswaModel modelDaftarSiswa = new DaftarSiswaModel(dftrSiswa);
                            modelDaftarSiswa.fireTableDataChanged();
                            dashboard.getTblTransfer().setAutoCreateRowSorter(true);
                            dashboard.getTblDaftarSiswa().setModel(modelDaftarSiswa);
                            
                            
                            dashboard.setVisible(true);
                        } else {
                            JOptionPane.showMessageDialog(
                                    form, "Maaf password yang anda masukan salah!");
                            form.tfUsername.setText("");
                            form.tfPassword.setText("");
                        }
                    } else {
                        JOptionPane.showMessageDialog(
                                form, "Maaf username yang anda masukan salah!",
                                "Information", JOptionPane.INFORMATION_MESSAGE
                        );
                        form.tfUsername.setText("");
                        form.tfPassword.setText("");
                    }
                            
                } catch (Exception e){
//                        System.err.println(e.getCause());
                }
            });
            
            
            form.setContentPane(form.rootPanel);
            form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            form.pack();
            form.setLocationRelativeTo(null);
            form.setResizable(false);
            form.setExtendedState(JFrame.MAXIMIZED_HORIZ);
            form.setVisible(true);            
        });
    
    }
    
    private static void show(String string){
        System.out.println(string);
    }
    private static void espek(String string){
        show("Eskpektasi: " + string);
    }
    private static void real(String string){
        show("Realita : " + string);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel rootPanel;
    private javax.swing.JPasswordField tfPassword;
    private javax.swing.JTextField tfUsername;
    // End of variables declaration//GEN-END:variables
    
//    @Bean
//    public RestTemplate restTemplate(RestTemplateBuilder builder){
//        return builder
//                .setConnectTimeout(Duration.ofSeconds(3))
//                .setReadTimeout(Duration.ofSeconds(3))
//                .build();
//    }
}
