/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import dao.Conexao;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.text.DateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.*;
import java.util.Calendar;
import javax.swing.Timer;
import javax.swing.UIManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Carvalho
 */
public class viewPrincipal extends javax.swing.JFrame {

    Connection connection = null;

    public viewPrincipal() {
        initComponents();
        connection = Conexao.conector();
        viewPedido pedido = new viewPedido();
        pedido.setVisible(true);
        desktop.add(pedido);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktop = new javax.swing.JDesktopPane();
        lbusuario = new javax.swing.JLabel();
        lbdata = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lbrelogio = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menCad = new javax.swing.JMenu();
        menCadCli = new javax.swing.JMenuItem();
        menCadPedido = new javax.swing.JMenuItem();
        menCadFunc = new javax.swing.JMenuItem();
        menCadGas = new javax.swing.JMenuItem();
        menRel = new javax.swing.JMenu();
        menRelPedidos = new javax.swing.JMenuItem();
        menRelClientes = new javax.swing.JMenuItem();
        menRelGastos = new javax.swing.JMenuItem();
        menAjuda = new javax.swing.JMenu();
        menAjudaSobre = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        menOp = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        menOPLogin = new javax.swing.JMenuItem();
        menOpSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("SystemCadastro - PrimePizza");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        javax.swing.GroupLayout desktopLayout = new javax.swing.GroupLayout(desktop);
        desktop.setLayout(desktopLayout);
        desktopLayout.setHorizontalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 678, Short.MAX_VALUE)
        );
        desktopLayout.setVerticalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        lbusuario.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        lbusuario.setText("Usuario");

        lbdata.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        lbdata.setText("Data");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/viewImagens/icon2.png"))); // NOI18N

        lbrelogio.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lbrelogio.setText("hora");

        menCad.setText("Cadastrar");

        menCadCli.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        menCadCli.setText("Clientes");
        menCadCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menCadCliActionPerformed(evt);
            }
        });
        menCad.add(menCadCli);

        menCadPedido.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        menCadPedido.setText(" Pedido");
        menCadPedido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menCadPedidoMouseClicked(evt);
            }
        });
        menCadPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menCadPedidoActionPerformed(evt);
            }
        });
        menCad.add(menCadPedido);

        menCadFunc.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_MASK));
        menCadFunc.setText(" Funcionário");
        menCadFunc.setEnabled(false);
        menCadFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menCadFuncActionPerformed(evt);
            }
        });
        menCad.add(menCadFunc);

        menCadGas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_MASK));
        menCadGas.setText(" Gastos");
        menCadGas.setEnabled(false);
        menCadGas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menCadGasActionPerformed(evt);
            }
        });
        menCad.add(menCadGas);

        jMenuBar1.add(menCad);

        menRel.setText("Relatórios");
        menRel.setEnabled(false);

        menRelPedidos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_MASK));
        menRelPedidos.setText("Pedidos");
        menRelPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menRelPedidosActionPerformed(evt);
            }
        });
        menRel.add(menRelPedidos);

        menRelClientes.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK));
        menRelClientes.setText("Clientes");
        menRelClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menRelClientesActionPerformed(evt);
            }
        });
        menRel.add(menRelClientes);

        menRelGastos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.ALT_MASK));
        menRelGastos.setText("Gastos");
        menRelGastos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menRelGastosActionPerformed(evt);
            }
        });
        menRel.add(menRelGastos);

        jMenuBar1.add(menRel);

        menAjuda.setText("Ajuda");

        menAjudaSobre.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        menAjudaSobre.setText("Sobre");
        menAjudaSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menAjudaSobreActionPerformed(evt);
            }
        });
        menAjuda.add(menAjudaSobre);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, 0));
        jMenuItem1.setText("Suporte Técnico");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        menAjuda.add(jMenuItem1);

        jMenuBar1.add(menAjuda);

        menOp.setText("Opções");

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setText("Brinde");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        menOp.add(jMenuItem2);

        menOPLogin.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_W, java.awt.event.InputEvent.CTRL_MASK));
        menOPLogin.setText("Login");
        menOPLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menOPLoginActionPerformed(evt);
            }
        });
        menOp.add(menOPLogin);

        menOpSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        menOpSair.setText("Sair");
        menOpSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menOpSairActionPerformed(evt);
            }
        });
        menOp.add(menOpSair);

        jMenuBar1.add(menOp);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(desktop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbdata)
                            .addComponent(lbusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(71, 71, 71))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lbrelogio, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(desktop)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbdata)
                        .addGap(135, 135, 135)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                        .addComponent(lbrelogio, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        setSize(new java.awt.Dimension(1035, 647));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        Date data = new Date();
        DateFormat formatador = DateFormat.getDateInstance(DateFormat.SHORT);
        lbdata.setText(formatador.format(data));
        
        
        Timer timer = new Timer(1000, new hora());
        timer.start();
    }//GEN-LAST:event_formWindowActivated

    private void menOpSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menOpSairActionPerformed
        int sair = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja sair?", "Atenção", JOptionPane.YES_NO_OPTION);
        if (sair == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_menOpSairActionPerformed

    private void menAjudaSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menAjudaSobreActionPerformed
        viewSobre sobre = new viewSobre();
        sobre.setVisible(true);
    }//GEN-LAST:event_menAjudaSobreActionPerformed

    private void menCadFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menCadFuncActionPerformed
        viewFuncionario funcionario = new viewFuncionario();
        funcionario.setVisible(true);
        desktop.add(funcionario);
    }//GEN-LAST:event_menCadFuncActionPerformed

    private void menOPLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menOPLoginActionPerformed
        int login = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja voltar para o LOGIN?", "Atenção", JOptionPane.YES_NO_OPTION);
        if (login == JOptionPane.YES_OPTION) {
            try {
                viewLogin log = new viewLogin();
                log.setVisible(true);
                this.dispose();
            } catch (SQLException ex) {
                Logger.getLogger(viewPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_menOPLoginActionPerformed

    private void menCadPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menCadPedidoActionPerformed
        viewPedido pedido = new viewPedido();
        pedido.setVisible(true);
        desktop.add(pedido);
    }//GEN-LAST:event_menCadPedidoActionPerformed

    private void menCadPedidoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menCadPedidoMouseClicked

    }//GEN-LAST:event_menCadPedidoMouseClicked

    private void menCadCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menCadCliActionPerformed
        viewCliente cliente = new viewCliente();
        cliente.setVisible(true);
        desktop.add(cliente);
    }//GEN-LAST:event_menCadCliActionPerformed

    private void menRelPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menRelPedidosActionPerformed
        int confirma = JOptionPane.showConfirmDialog(null, "Confirma a amissão do Relatório dos Pedidos?", "ATENÇÃO", JOptionPane.YES_NO_OPTION);
        if (confirma == JOptionPane.YES_OPTION) {
            try {
                JasperPrint print = JasperFillManager.fillReport("src/reports/pedidos.jasper", null, connection);
                JasperViewer.viewReport(print, false);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }

        }
    }//GEN-LAST:event_menRelPedidosActionPerformed

    private void menCadGasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menCadGasActionPerformed
        viewGastos gastos = new viewGastos();
        gastos.setVisible(true);
        desktop.add(gastos);
    }//GEN-LAST:event_menCadGasActionPerformed

    private void menRelClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menRelClientesActionPerformed
        int confirma = JOptionPane.showConfirmDialog(null, "Confirma a amissão do Relatório de Clientes?", "ATENÇÃO", JOptionPane.YES_NO_OPTION);
        if (confirma == JOptionPane.YES_OPTION) {
            try {
                JasperPrint print = JasperFillManager.fillReport("src/reports/clientes2.jasper", null, connection);
                JasperViewer.viewReport(print, false);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }

        }
    }//GEN-LAST:event_menRelClientesActionPerformed

    private void menRelGastosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menRelGastosActionPerformed
        int confirma = JOptionPane.showConfirmDialog(null, "Confirma a amissão do Relatório de Gastos?", "ATENÇÃO", JOptionPane.YES_NO_OPTION);
        if (confirma == JOptionPane.YES_OPTION) {
            try {
                JasperPrint print = JasperFillManager.fillReport("src/reports/gastos.jasper", null, connection);
                JasperViewer.viewReport(print, false);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }

        }
    }//GEN-LAST:event_menRelGastosActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
       viewSuporteTecnico suporte = new viewSuporteTecnico();
       suporte.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
       viewBrinde brinde = new viewBrinde();
        brinde.setVisible(true);
        desktop.add(brinde);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel("com.jtattoo.plaf.acryl.AcrylLookAndFeel");
        } catch (Exception e) {
        }
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(viewPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(viewPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(viewPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(viewPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new viewPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktop;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JLabel lbdata;
    private javax.swing.JLabel lbrelogio;
    public static javax.swing.JLabel lbusuario;
    private javax.swing.JMenu menAjuda;
    private javax.swing.JMenuItem menAjudaSobre;
    private javax.swing.JMenu menCad;
    private javax.swing.JMenuItem menCadCli;
    public static javax.swing.JMenuItem menCadFunc;
    public static javax.swing.JMenuItem menCadGas;
    private javax.swing.JMenuItem menCadPedido;
    private javax.swing.JMenuItem menOPLogin;
    private javax.swing.JMenu menOp;
    private javax.swing.JMenuItem menOpSair;
    public static javax.swing.JMenu menRel;
    private javax.swing.JMenuItem menRelClientes;
    private javax.swing.JMenuItem menRelGastos;
    private javax.swing.JMenuItem menRelPedidos;
    // End of variables declaration//GEN-END:variables

    class hora implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            Calendar now = Calendar.getInstance();
            lbrelogio.setText(String.format("%1$tH:%1$tM:%1$tS", now));
        }
    }
}
