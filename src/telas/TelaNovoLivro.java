package telas;

import classes.Livro;
import javax.swing.Action;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.KeyStroke;
import javax.swing.text.DefaultEditorKit;
import repositorio.RepositorioLivros;

/**
 * @author manoel.neto
 */
public class TelaNovoLivro extends javax.swing.JFrame {

    private Livro livro = null;
    
    public TelaNovoLivro() {
        initComponents();
        initFeatures();
    }
    
    public TelaNovoLivro(Livro livro) {
        initComponents();
        initFeatures();
        
        this.livro = livro;
        
        if(livro != null){
            carregaLivro();
        }
    }
    
    private boolean isNewBook(){
        return this.livro == null;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btgTem = new javax.swing.ButtonGroup();
        btnVoltar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        txtTela = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtTitulo = new javax.swing.JTextField();
        txtAutor = new javax.swing.JTextField();
        txtEditora = new javax.swing.JTextField();
        txtAno = new javax.swing.JTextField();
        txtEdicao = new javax.swing.JTextField();
        rbtColecao = new javax.swing.JRadioButton();
        rbtListaDeDesejos = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtSerie = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtImagem = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        btnVoltar.setText("Voltar");
        btnVoltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVoltarMouseClicked(evt);
            }
        });

        btnSalvar.setText("Salvar");
        btnSalvar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalvarMouseClicked(evt);
            }
        });

        txtTela.setFont(new java.awt.Font(".SF NS Text", 0, 23)); // NOI18N
        txtTela.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtTela.setText("Novo livro");

        jLabel2.setText("Título:");

        btgTem.add(rbtColecao);
        rbtColecao.setSelected(true);
        rbtColecao.setText("Adicionar à coleção");

        btgTem.add(rbtListaDeDesejos);
        rbtListaDeDesejos.setText("Adicionar à lista de desejos");

        jLabel3.setText("Autor:");

        jLabel4.setText("Editora:");

        jLabel5.setText("Ano:");

        jLabel6.setText("Edição:");

        jLabel7.setText("Série:");

        jLabel8.setText("Url da Imagem: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTela, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addGap(63, 63, 63)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtEdicao, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtAno, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtSerie)
                                    .addComponent(txtEditora, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel8))
                                        .addGap(12, 12, 12))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(70, 70, 70)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtTitulo)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(rbtColecao)
                                            .addGap(18, 18, 18)
                                            .addComponent(rbtListaDeDesejos))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(btnSalvar)
                                            .addGap(18, 18, 18)
                                            .addComponent(btnVoltar)))
                                    .addComponent(txtImagem, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtAutor, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addGap(10, 10, 10)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(txtTela)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtImagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEditora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEdicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSerie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtColecao)
                    .addComponent(rbtListaDeDesejos))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar)
                    .addComponent(btnVoltar))
                .addGap(16, 16, 16))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void initFeatures(){
        JPopupMenu menu = new JPopupMenu();
        
        Action cut = new DefaultEditorKit.CutAction();
        cut.putValue(Action.NAME, "Recortar");
        cut.putValue(Action.ACCELERATOR_KEY, KeyStroke.getKeyStroke("control X"));
        menu.add(cut);

        Action copy = new DefaultEditorKit.CopyAction();
        copy.putValue(Action.NAME, "Copiar");
        copy.putValue(Action.ACCELERATOR_KEY, KeyStroke.getKeyStroke("control C"));
        menu.add(copy);

        Action paste = new DefaultEditorKit.PasteAction();
        paste.putValue(Action.NAME, "Colar");
        paste.putValue(Action.ACCELERATOR_KEY, KeyStroke.getKeyStroke("control V"));
        menu.add(paste);

        txtTitulo.setComponentPopupMenu(menu);
        txtAno.setComponentPopupMenu(menu);
        txtAutor.setComponentPopupMenu(menu);
        txtEditora.setComponentPopupMenu(menu);
        txtEdicao.setComponentPopupMenu(menu);
        txtSerie.setComponentPopupMenu(menu);
        txtImagem.setComponentPopupMenu(menu);
    }
    
    private void btnVoltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVoltarMouseClicked
        if(this.livro != null){
            voltarParaODetalhe(this.livro);
        }else{
            voltarParaOMenu();
        }
    }//GEN-LAST:event_btnVoltarMouseClicked

    private void btnSalvarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalvarMouseClicked
        Livro livro = montaLivro();
        
        boolean sucesso = false;
        
        if(isNewBook()){
            sucesso = RepositorioLivros.adicoinar(livro);
        }else{
            sucesso = RepositorioLivros.atualizar(livro);
        }
        
        if(sucesso){
            if(isNewBook()){
                int resp = JOptionPane.showInternalConfirmDialog(null, "Livro salvo com sucesso!\nGostaria de cadastrar um novo livro na mesma série?", "Salvo com sucesso", 0);
                if(resp == 0){
                    limpaTela();
                }else{
                    voltarParaOMenu();
                }
            }else{
                JOptionPane.showMessageDialog(rootPane, "Livro salvo com sucesso!");
                voltarParaODetalhe(livro);
            }
        }else{
            JOptionPane.showMessageDialog(rootPane, "Erro ao salvar livro...");
        }
    }//GEN-LAST:event_btnSalvarMouseClicked

    private void limpaTela(){
        if(txtSerie.getText().isBlank()) txtSerie.setText(txtTitulo.getText());
        txtTitulo.setText(txtSerie.getText());
        txtAno.setText("");
        txtImagem.setText("");
    }
    
    private Livro montaLivro(){
        String serie = txtSerie.getText();
        if(serie.isBlank()) serie = txtTitulo.getText();
        
        Livro novoLivro = new Livro(
                txtTitulo.getText(),
                Integer.parseInt(txtAno.getText()),
                txtAutor.getText(),
                txtEditora.getText(),
                serie,
                txtEdicao.getText(),
                rbtColecao.isSelected(),
                txtImagem.getText()
        );
        
        if(!isNewBook()){
            novoLivro.setId(this.livro.getId());
        }
        
        return novoLivro;
    }
    
    private void carregaLivro(){
        txtTela.setText("Editar livro");
        
        txtTitulo.setText(this.livro.getTitulo());
        txtAno.setText(this.livro.getAno() + "");
        txtAutor.setText(this.livro.getAutor());
        txtEditora.setText(this.livro.getEditora());
        txtSerie.setText(this.livro.getSerie());
        txtEdicao.setText(this.livro.getEdicao());
        txtImagem.setText(this.livro.getImagem());
        
        if(this.livro.isTem()){
            rbtColecao.setSelected(true);
        }else{
            rbtListaDeDesejos.setSelected(true);
        }
    }
    
    private void voltarParaODetalhe(Livro livro){
        TelaDetalhes tela = new TelaDetalhes(livro);
        tela.setVisible(true);
        this.setVisible(false);
    }
    
    private void voltarParaOMenu(){
        TelaPrincipal tela = new TelaPrincipal();
        tela.setVisible(true);
        this.setVisible(false);
    }
    
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
            java.util.logging.Logger.getLogger(TelaNovoLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaNovoLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaNovoLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaNovoLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaNovoLivro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btgTem;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JRadioButton rbtColecao;
    private javax.swing.JRadioButton rbtListaDeDesejos;
    private javax.swing.JTextField txtAno;
    private javax.swing.JTextField txtAutor;
    private javax.swing.JTextField txtEdicao;
    private javax.swing.JTextField txtEditora;
    private javax.swing.JTextField txtImagem;
    private javax.swing.JTextField txtSerie;
    private javax.swing.JLabel txtTela;
    private javax.swing.JTextField txtTitulo;
    // End of variables declaration//GEN-END:variables
}
