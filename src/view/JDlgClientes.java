/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package view;

import bean.Clientes;
import dao.ClientesDAO;
import java.text.ParseException;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;
import tools.Util;

/**
 *
 * @author isado
 */
public class JDlgClientes extends javax.swing.JDialog {

    boolean pesquisa = false;
    private boolean incluir;

    /**
     * Creates new form JDlgClientes
     */
    public JDlgClientes(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

        setTitle("Clientes");
        setLocationRelativeTo(null);
        habilitar(false);
        try {
            MaskFormatter mascara = new MaskFormatter("###.###.###-##");
            jFmtCpf.setFormatterFactory(new DefaultFormatterFactory(mascara));
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
        try {
            MaskFormatter mascara = new MaskFormatter("##/##/####");
            jFmtDataNasc.setFormatterFactory(new DefaultFormatterFactory(mascara));
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
        try {
            MaskFormatter mascara = new MaskFormatter("##/##/####");
            jFmtDataCadastro.setFormatterFactory(new DefaultFormatterFactory(mascara));
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
        try {
            MaskFormatter mascara = new MaskFormatter("(##) #####-####");
            jFmtTelefone.setFormatterFactory(new DefaultFormatterFactory(mascara));
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
    }

    public Clientes viewBean() {
        Clientes clientes = new Clientes();
        clientes.setIaaIdCliente(Util.strToInt(jTxtIdCliente.getText()));
        clientes.setIaaNome(jTxtNome.getText());
        clientes.setIaaApelido(jTxtApelido.getText());
        clientes.setIaaCpf(jFmtCpf.getText());
        clientes.setIaaDataNascimento(Util.strToDate(jFmtDataNasc.getText()));
        clientes.setIaaDataCadastro(Util.strToDate(jFmtDataCadastro.getText()));
        clientes.setIaaCep(jTxtCep.getText());
        clientes.setIaaCidade(jTxtCidade.getText());
        clientes.setIaaTelefone(jFmtTelefone.getText());
        clientes.setIaaEndereco(jTxtEndereco.getText());
        clientes.setIaaSenha(jTxtSenha.getText());
        clientes.setIaaEmail(jTxtEmail.getText());
        clientes.setIaaPais(jTxtPais.getText());

        if (jChbAtivo.isSelected()) {
            clientes.setIaaAtivo("S");
        } else {
            clientes.setIaaAtivo("N");
        }
        if (jCbxSexo.getSelectedItem().equals("Feminino")) {
            clientes.setIaaSexo("F");
        } else {
            clientes.setIaaSexo("M");
        }
        return clientes;

    }

    public void beanView(Clientes clientes) {
        jTxtIdCliente.setText(Util.intToStr(clientes.getIaaIdCliente()));
        jTxtNome.setText(clientes.getIaaNome());
        jTxtApelido.setText(clientes.getIaaApelido());
        jFmtCpf.setText(clientes.getIaaCpf());
        jFmtDataNasc.setText(Util.dateToStr(clientes.getIaaDataNascimento()));
        jFmtDataCadastro.setText(Util.dateToStr(clientes.getIaaDataCadastro()));
        jTxtCep.setText(clientes.getIaaCep());
        jTxtCidade.setText(clientes.getIaaCidade());
        jFmtTelefone.setText(clientes.getIaaTelefone());
        jTxtEndereco.setText(clientes.getIaaEndereco());
        jTxtSenha.setText(clientes.getIaaSenha());
        jTxtEmail.setText(clientes.getIaaEmail());
        jTxtPais.setText(clientes.getIaaPais());

        if (clientes.getIaaAtivo().equals("S")) {
            jChbAtivo.setSelected(true);
        } else {
            jChbAtivo.setSelected(false);
        }

        if ("F".equals(clientes.getIaaSexo())) {
            jCbxSexo.setSelectedItem("Feminino");
        } else {
            jCbxSexo.setSelectedItem("Masculino");
        }

    }

    public void habilitar(boolean status) {
        if (status) {
            Util.habilitar(true, jTxtIdCliente, jTxtApelido, jTxtNome, jTxtEndereco, jTxtCep, jCbxSexo, jTxtCidade, jFmtDataCadastro, jFmtCpf, jTxtEmail, jTxtPais, jTxtSenha, jFmtTelefone, jFmtDataNasc, jChbAtivo, jBtnConfirmar, jBtnCancelar);
            Util.habilitar(false, jBtnIncluir, jBtnAlterar, jBtnExcluir, jBtnPesquisar);
        } else {
            Util.habilitar(false, jTxtIdCliente, jTxtApelido, jTxtNome, jTxtEndereco, jTxtCep, jCbxSexo, jTxtCidade, jFmtDataCadastro, jFmtCpf, jTxtEmail, jTxtPais, jTxtSenha, jFmtTelefone, jFmtDataNasc, jChbAtivo, jBtnConfirmar, jBtnCancelar);
            Util.habilitar(true, jBtnIncluir, jBtnAlterar, jBtnExcluir, jBtnPesquisar);
        }
    }

    public void limparCampos() {
        Util.limpar(jTxtIdCliente, jTxtApelido, jTxtNome, jTxtEndereco, jTxtCep, jCbxSexo, jTxtCidade, jFmtDataCadastro, jFmtCpf, jTxtEmail, jTxtPais, jTxtSenha, jFmtTelefone, jFmtDataNasc, jChbAtivo, jBtnConfirmar, jBtnCancelar);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTxtPais = new javax.swing.JTextField();
        jLblNome = new javax.swing.JLabel();
        jLblDataDaUltimaCompra = new javax.swing.JLabel();
        jTxtNome = new javax.swing.JTextField();
        jTxtApelido = new javax.swing.JTextField();
        jTxtSenha = new javax.swing.JTextField();
        jLblSexo = new javax.swing.JLabel();
        jLblBairro = new javax.swing.JLabel();
        jLblEndereco = new javax.swing.JLabel();
        jTxtEmail = new javax.swing.JTextField();
        jLblTelefone = new javax.swing.JLabel();
        jTxtEndereco = new javax.swing.JTextField();
        JLblRg = new javax.swing.JLabel();
        jLblTipodecliente = new javax.swing.JLabel();
        jLblDatadenascimento = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jChbAtivo = new javax.swing.JCheckBox();
        jLblCep = new javax.swing.JLabel();
        jTxtCep = new javax.swing.JTextField();
        jLblCodigo = new javax.swing.JLabel();
        jLblEstado = new javax.swing.JLabel();
        jLblCidade = new javax.swing.JLabel();
        jTxtIdCliente = new javax.swing.JTextField();
        jTxtCidade = new javax.swing.JTextField();
        jLblEmail = new javax.swing.JLabel();
        jBtnIncluir = new javax.swing.JButton();
        jBtnAlterar = new javax.swing.JButton();
        jBtnExcluir = new javax.swing.JButton();
        jBtnConfirmar = new javax.swing.JButton();
        jBtnCancelar = new javax.swing.JButton();
        jBtnPesquisar = new javax.swing.JButton();
        jCbxSexo = new javax.swing.JComboBox<String>();
        jFmtCpf = new javax.swing.JFormattedTextField();
        jFmtDataNasc = new javax.swing.JFormattedTextField();
        jFmtDataCadastro = new javax.swing.JFormattedTextField();
        jFmtTelefone = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTxtPais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtPaisActionPerformed(evt);
            }
        });

        jLblNome.setText("Nome:");

        jLblDataDaUltimaCompra.setText("Senha");

        jTxtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtNomeActionPerformed(evt);
            }
        });

        jTxtApelido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtApelidoActionPerformed(evt);
            }
        });

        jTxtSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtSenhaActionPerformed(evt);
            }
        });

        jLblSexo.setText("Sexo:");

        jLblBairro.setText("Apelido");

        jLblEndereco.setText("Endereco");

        jTxtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtEmailActionPerformed(evt);
            }
        });

        jLblTelefone.setText("Telefone:");

        jTxtEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtEnderecoActionPerformed(evt);
            }
        });

        JLblRg.setText("Cpf");

        jLblTipodecliente.setText("Data Cadastro");

        jLblDatadenascimento.setText("Data de Nascimento");

        jLabel1.setText("Ativo");

        jChbAtivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jChbAtivoActionPerformed(evt);
            }
        });

        jLblCep.setText("Cep");

        jLblCodigo.setText("Codigo");

        jLblEstado.setText("País");

        jLblCidade.setText("Cidade");

        jTxtIdCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtIdClienteActionPerformed(evt);
            }
        });

        jTxtCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtCidadeActionPerformed(evt);
            }
        });

        jLblEmail.setText("Email:");

        jBtnIncluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/incluir.png"))); // NOI18N
        jBtnIncluir.setText("Incluir");
        jBtnIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnIncluirActionPerformed(evt);
            }
        });

        jBtnAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/alterar.png"))); // NOI18N
        jBtnAlterar.setText("Alterar");
        jBtnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAlterarActionPerformed(evt);
            }
        });

        jBtnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Excluir.png"))); // NOI18N
        jBtnExcluir.setText("Excluir");
        jBtnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnExcluirActionPerformed(evt);
            }
        });

        jBtnConfirmar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/gravar.png"))); // NOI18N
        jBtnConfirmar.setText("Confirmar");
        jBtnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnConfirmarActionPerformed(evt);
            }
        });

        jBtnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cancela.png"))); // NOI18N
        jBtnCancelar.setText("Cancelar");
        jBtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCancelarActionPerformed(evt);
            }
        });

        jBtnPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/pesquisar.png"))); // NOI18N
        jBtnPesquisar.setText("Pesquisar");
        jBtnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnPesquisarActionPerformed(evt);
            }
        });

        jCbxSexo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Feminino", "Masculino", " " }));
        jCbxSexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCbxSexoActionPerformed(evt);
            }
        });

        jFmtCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFmtCpfActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jBtnIncluir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBtnAlterar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBtnExcluir)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTxtIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTxtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTxtApelido, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLblTelefone)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLblCodigo)
                                            .addGap(69, 69, 69)
                                            .addComponent(jLblNome))
                                        .addComponent(jFmtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jTxtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jTxtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jTxtPais, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(74, 74, 74)
                                            .addComponent(jLblBairro)
                                            .addGap(95, 95, 95)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jCbxSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLblSexo)))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLblEndereco)
                                            .addGap(66, 66, 66)
                                            .addComponent(jLblCidade)
                                            .addGap(57, 57, 57)
                                            .addComponent(jLblEstado))))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jTxtCep, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jTxtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLblCep)
                                            .addGap(80, 80, 80)
                                            .addComponent(jLblDataDaUltimaCompra)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLblTipodecliente)
                                        .addComponent(jFmtDataCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1)
                                        .addComponent(jChbAtivo))
                                    .addGap(34, 34, 34)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jBtnConfirmar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBtnCancelar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBtnPesquisar))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLblDatadenascimento))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jFmtDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JLblRg)
                            .addComponent(jFmtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTxtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLblEmail))))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLblNome, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLblCodigo)
                            .addComponent(jLblBairro)))
                    .addComponent(jLblSexo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTxtIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtApelido, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCbxSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLblDatadenascimento)
                    .addComponent(JLblRg)
                    .addComponent(jLblEmail))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTxtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFmtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFmtDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLblTelefone)
                    .addComponent(jLblEndereco)
                    .addComponent(jLblCidade)
                    .addComponent(jLblEstado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTxtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFmtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLblCep)
                    .addComponent(jLblDataDaUltimaCompra)
                    .addComponent(jLblTipodecliente)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTxtCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTxtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jFmtDataCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jChbAtivo))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnIncluir)
                    .addComponent(jBtnAlterar)
                    .addComponent(jBtnExcluir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnConfirmar)
                    .addComponent(jBtnPesquisar)
                    .addComponent(jBtnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTxtPaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtPaisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtPaisActionPerformed

    private void jTxtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtNomeActionPerformed

    private void jTxtApelidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtApelidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtApelidoActionPerformed

    private void jTxtSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtSenhaActionPerformed

    private void jTxtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtEmailActionPerformed

    private void jTxtEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtEnderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtEnderecoActionPerformed

    private void jChbAtivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jChbAtivoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jChbAtivoActionPerformed

    private void jTxtIdClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtIdClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtIdClienteActionPerformed

    private void jTxtCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtCidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtCidadeActionPerformed

    private void jBtnIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnIncluirActionPerformed
        // TODO add your handling code here:
        habilitar(true);
        limparCampos();
        jTxtIdCliente.grabFocus();
        incluir = true;
    }//GEN-LAST:event_jBtnIncluirActionPerformed

    private void jBtnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAlterarActionPerformed
        // TODO add your handling code here:
        habilitar(true);
        Util.habilitar(false, jTxtIdCliente);
        incluir = false;
        jTxtNome.grabFocus();
    }//GEN-LAST:event_jBtnAlterarActionPerformed

    private void jBtnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnExcluirActionPerformed
        // TODO add your handling code here:
        if (pesquisa) {
            if (Util.perguntar("Deseja Excluir?") == true) {
                ClientesDAO clientesDAO = new ClientesDAO();
                clientesDAO.delete(viewBean());
                limparCampos();
            }
        } else {
            Util.mensagem("Precisa Pesquisar antes!!");
        }
    }//GEN-LAST:event_jBtnExcluirActionPerformed

    private void jBtnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnConfirmarActionPerformed
        // TODO add your handling code here:
        habilitar(false);
        ClientesDAO clientesDAO = new ClientesDAO();
        if (incluir == true) {
            clientesDAO.insert(viewBean());
        } else {
            clientesDAO.update(viewBean());
        }
        limparCampos();
    }//GEN-LAST:event_jBtnConfirmarActionPerformed

    private void jBtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCancelarActionPerformed
        // TODO add your handling code here:
        habilitar(false);
        limparCampos();
    }//GEN-LAST:event_jBtnCancelarActionPerformed

    private void jBtnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnPesquisarActionPerformed
        // TODO add your handling code here:
        JDlgClientesPesquisar JDlgClientesPesquisar = new JDlgClientesPesquisar(null, true);
        JDlgClientesPesquisar.setTelaPai(this);
        JDlgClientesPesquisar.setVisible(true);
    }//GEN-LAST:event_jBtnPesquisarActionPerformed

    private void jCbxSexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCbxSexoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCbxSexoActionPerformed

    private void jFmtCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFmtCpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFmtCpfActionPerformed

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
            java.util.logging.Logger.getLogger(JDlgClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDlgClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDlgClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDlgClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDlgClientes dialog = new JDlgClientes(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLblRg;
    private javax.swing.JButton jBtnAlterar;
    private javax.swing.JButton jBtnCancelar;
    private javax.swing.JButton jBtnConfirmar;
    private javax.swing.JButton jBtnExcluir;
    private javax.swing.JButton jBtnIncluir;
    private javax.swing.JButton jBtnPesquisar;
    private javax.swing.JComboBox<String> jCbxSexo;
    private javax.swing.JCheckBox jChbAtivo;
    private javax.swing.JFormattedTextField jFmtCpf;
    private javax.swing.JFormattedTextField jFmtDataCadastro;
    private javax.swing.JFormattedTextField jFmtDataNasc;
    private javax.swing.JFormattedTextField jFmtTelefone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLblBairro;
    private javax.swing.JLabel jLblCep;
    private javax.swing.JLabel jLblCidade;
    private javax.swing.JLabel jLblCodigo;
    private javax.swing.JLabel jLblDataDaUltimaCompra;
    private javax.swing.JLabel jLblDatadenascimento;
    private javax.swing.JLabel jLblEmail;
    private javax.swing.JLabel jLblEndereco;
    private javax.swing.JLabel jLblEstado;
    private javax.swing.JLabel jLblNome;
    private javax.swing.JLabel jLblSexo;
    private javax.swing.JLabel jLblTelefone;
    private javax.swing.JLabel jLblTipodecliente;
    private javax.swing.JTextField jTxtApelido;
    private javax.swing.JTextField jTxtCep;
    private javax.swing.JTextField jTxtCidade;
    private javax.swing.JTextField jTxtEmail;
    private javax.swing.JTextField jTxtEndereco;
    private javax.swing.JTextField jTxtIdCliente;
    private javax.swing.JTextField jTxtNome;
    private javax.swing.JTextField jTxtPais;
    private javax.swing.JTextField jTxtSenha;
    // End of variables declaration//GEN-END:variables
}
