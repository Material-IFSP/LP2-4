    import java.awt.*;
    import java.awt.event.*;
    import javax.swing.*;

public class App extends Frame implements WindowListener, ActionListener {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        //Frame frameTela = new Frame();

        // #region INICIALIZAÇÃO FORMULÁRIO E OBJETO DA CLASSE PARA SER LIDA PELO
        // LISTENER
        // Inicializando um Gridview passando os parametros na seguinte ordem :
        // 0 linhas, 2 colunas, 0 hgap e 10 vgap (espaçamento explicito no pdf do tp)
        GridLayout gridlayout1 = new GridLayout(0, 2, 0, 10);
        GridLayout gridlayout2 = new GridLayout(0, 4, 2, 10);
        // abaixo usando dois paineis para separar os botoes inferiores do restante da aplicação
        JPanel painel1 = new JPanel(gridlayout1);
        JPanel painel2 = new JPanel(gridlayout2);
        //instanciando a classe app e jogando-a no listener para fechar a janela.
        App app1 = new App();
        app1.addWindowListener(app1);
        // #endregion

        // #region DECLARACAO VALORES E INICIALIZAÇÃO
        // Declarando os valores
        Label labelNome, labelIdade, labelEndereco;
        TextField txtFieldNome, txtFieldIdade, txtEndereco;
        Button btnOK, btnLimpar, btnMostrar, btnSair;

        // Inicializando as labels
        labelNome = new Label("Nome:     ", Label.LEFT);
        labelIdade = new Label("Idade:    ", Label.LEFT);
        labelEndereco = new Label("Endereço: ", Label.LEFT);

        // Inicializando os Textbox
        txtFieldNome = new TextField(10);
        txtFieldIdade = new TextField();
        txtEndereco = new TextField();

        // inicializando os Button
        btnOK = new Button("OK");
        btnLimpar = new Button("Limpar");
        btnMostrar = new Button("Mostrar");
        btnSair = new Button("Sair");
        // #endregion

        // #region CONFIGURAÇÃOES FRAME
        // Configurações Frame
        app1.setBackground(Color.lightGray);
        app1.setTitle("TP02  - L22|4");
        app1.setSize(400, 180);
        app1.setLocation(200, 200);
        app1.add(painel1);
        app1.setLayout(new BoxLayout(app1, BoxLayout.PAGE_AXIS));
        app1.setVisible(true);

        // Configurações Painel1
        painel1.setSize(380, 120);
        painel1.setLayout(gridlayout1);
        painel1.add(labelNome);
        painel1.add(txtFieldNome);
        painel1.add(labelIdade);
        painel1.add(txtFieldIdade);
        painel1.add(labelEndereco);
        painel1.add(txtEndereco);
        painel1.setVisible(true);

        // Configurações Painel2
        app1.add(painel2);
        painel2.setLayout(gridlayout2);
        painel2.add(btnOK);
        painel2.add(btnLimpar);
        painel2.add(btnMostrar);
        painel2.add(btnSair);
        painel2.setVisible(true);
        // #endregion
    }

    // #region LISTENER FECHAMENTO DA APLICAÇÃO
    // funções Listener para fechar a aplicação

    public void actionPerformed(ActionEvent e) {
       
    }
    public void windowClosing(WindowEvent e) {
        System.exit(0);
    }


    public void windowOpened(WindowEvent e) {
    }

    public void windowIconified(WindowEvent e) {
    }

    public void windowDeiconified(WindowEvent e) {
    }

    public void windowDeactivated(WindowEvent e) {
    }

    public void windowActivated(WindowEvent e) {
    }

    public void windowClosed(WindowEvent e) {
    }
    // #endregion
}
