
package Telas;

import Controles.AgendaControle;
import Modelos.DAO.Banco;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class Agenda extends javax.swing.JFrame {

    private final AgendaControle controle;

    /**
     * Creates new form Agenda
     */
    public Agenda() {
        initComponents();
        controle = new AgendaControle(this);
        iniciar();
  
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblAgenda = new javax.swing.JLabel();
        lblId = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        lblCliente = new javax.swing.JLabel();
        txtCliente = new javax.swing.JComboBox<>();
        lblPedido = new javax.swing.JLabel();
        txtPedido = new javax.swing.JComboBox<>();
        lblValor = new javax.swing.JLabel();
        txtValor = new javax.swing.JTextField();
        lblData = new javax.swing.JLabel();
        txtData = new javax.swing.JTextField();
        lblDescricaoPedido = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescricao = new javax.swing.JTextArea();
        btnConfirmar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbTabela = new javax.swing.JTable();
        lblPainelGradiente = new javax.swing.JLabel();
        fundoAgenda = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblAgenda.setFont(new java.awt.Font("Segoe UI", 1, 32)); // NOI18N
        lblAgenda.setForeground(new java.awt.Color(255, 255, 255));
        lblAgenda.setText("Agenda");
        getContentPane().add(lblAgenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 60, 140, 50));

        lblId.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblId.setForeground(new java.awt.Color(255, 255, 255));
        lblId.setText("Id:");
        getContentPane().add(lblId, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 30, 30));

        txtId.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        getContentPane().add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 280, 40));

        lblCliente.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblCliente.setForeground(new java.awt.Color(255, 255, 255));
        lblCliente.setText("Cliente:");
        getContentPane().add(lblCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, -1, -1));

        txtCliente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        getContentPane().add(txtCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, 280, 40));

        lblPedido.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblPedido.setForeground(new java.awt.Color(255, 255, 255));
        lblPedido.setText("Pedido:");
        getContentPane().add(lblPedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 320, -1, -1));

        txtPedido.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtPedido.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                txtPedidoItemStateChanged(evt);
            }
        });
        txtPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPedidoActionPerformed(evt);
            }
        });
        getContentPane().add(txtPedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 310, 280, 40));

        lblValor.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblValor.setForeground(new java.awt.Color(255, 255, 255));
        lblValor.setText("Valor:");
        getContentPane().add(lblValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 390, 50, 30));

        txtValor.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtValor.setText("R$ 00,00");
        getContentPane().add(txtValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 380, 280, 40));

        lblData.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblData.setForeground(new java.awt.Color(255, 255, 255));
        lblData.setText("Data de Entrega:");
        getContentPane().add(lblData, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 450, 140, 40));

        txtData.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtData.setToolTipText("Ex: 23/08/2022");
        getContentPane().add(txtData, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 450, 280, 40));

        lblDescricaoPedido.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblDescricaoPedido.setForeground(new java.awt.Color(255, 255, 255));
        lblDescricaoPedido.setText("Descrição do pedido:");
        getContentPane().add(lblDescricaoPedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 140, -1, -1));

        txtDescricao.setColumns(20);
        txtDescricao.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtDescricao.setRows(5);
        jScrollPane1.setViewportView(txtDescricao);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 170, 400, 270));

        btnConfirmar.setBackground(new java.awt.Color(51, 255, 51));
        btnConfirmar.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        btnConfirmar.setForeground(new java.awt.Color(255, 255, 255));
        btnConfirmar.setText("Confirmar");
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });
        getContentPane().add(btnConfirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 452, 400, 50));

        tbTabela.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tbTabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Cliente", "Pedido", "Valor", "Data", "Descrição"
            }
        ));
        tbTabela.setShowGrid(true);
        jScrollPane2.setViewportView(tbTabela);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 520, 920, 180));

        lblPainelGradiente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Telas/Imagens/Telas/Agenda-PainelFundo3.png"))); // NOI18N
        lblPainelGradiente.setText("Data de ");
        getContentPane().add(lblPainelGradiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 950, -1));

        fundoAgenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Telas/Imagens/Telas/fundoGeral.jpg"))); // NOI18N
        getContentPane().add(fundoAgenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 730));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPedidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPedidoActionPerformed

    private void txtPedidoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_txtPedidoItemStateChanged
        this.controle.AtualizarValor();
    }//GEN-LAST:event_txtPedidoItemStateChanged

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
        this.controle.agendar();
    }//GEN-LAST:event_btnConfirmarActionPerformed

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
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Agenda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JLabel fundoAgenda;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblAgenda;
    private javax.swing.JLabel lblCliente;
    private javax.swing.JLabel lblData;
    private javax.swing.JLabel lblDescricaoPedido;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblPainelGradiente;
    private javax.swing.JLabel lblPedido;
    private javax.swing.JLabel lblValor;
    private javax.swing.JTable tbTabela;
    private javax.swing.JComboBox<String> txtCliente;
    private javax.swing.JTextField txtData;
    private javax.swing.JTextArea txtDescricao;
    private javax.swing.JTextField txtId;
    private javax.swing.JComboBox<String> txtPedido;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables

    private void iniciar() {
        
        this.controle.atualizarTabela();
        this.controle.atualizarCliente();
        this.controle.atualizarPedido();
        this.controle.AtualizarValor();
    }

    public JTable getTbTabela() {
        return tbTabela;
    }

    public void setTbTabela(JTable tbTabela) {
        this.tbTabela = tbTabela;
    }

    public JComboBox<String> getTxtCliente() {
        return txtCliente;
    }

    public void setTxtCliente(JComboBox<String> txtCliente) {
        this.txtCliente = txtCliente;
    }

    public JComboBox<String> getTxtPedido() {
        return txtPedido;
    }

    public void setTxtPedido(JComboBox<String> txtPedido) {
        this.txtPedido = txtPedido;
    }

    public JTextField getTxtValor() {
        return txtValor;
    }

    public void setTxtValor(JTextField txtValor) {
        this.txtValor = txtValor;
    }

    public JTextField getTxtId() {
        return txtId;
    }

    public void setTxtId(JTextField txtId) {
        this.txtId = txtId;
    }

    public JTextField getTxtData() {
        return txtData;
    }

    public void setTxtData(JTextField txtData) {
        this.txtData = txtData;
    }

    public JTextArea getTxtDescricao() {
        return txtDescricao;
    }

    public void setTxtDescricao(JTextArea txtDescricao) {
        this.txtDescricao = txtDescricao;
    }

    
    
    
    
}
