import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JOptionPane;
import java.awt.*;
import java.awt.event.*;

public class Teste extends Frame implements ActionListener {

    Label lblNome = new Label("Nome");
    Label lblIdade = new Label("Idade");
    Label lblEndereco = new Label("Endereco");
    TextField txtFieldNome = new TextField(10);
    TextField txtFieldIdade = new TextField();
    TextField txtEndereco = new TextField();
    Button btnMostrar = new Button("Mostrar");
    Button btnOk = new Button("Ok");
    Button btnSair = new Button("Sair");
    Button btnLimpar = new Button("Limpar");
    
    JFrame f = new JFrame("TP2 - Linguagem de Programação 2");
    JPanel p1 = new JPanel();
    JPanel p2 = new JPanel();

    public Teste() {

        super();
        btnLimpar.setSize(5, 5);
        btnOk.setSize(5, 5);
        btnSair.setSize(5, 5);
        btnMostrar.setSize(5, 5);
        f.setSize(400, 180);
        f.setLocation(200, 200);

        /*----------------------------------------*/
        p1.setLayout(new GridLayout(0, 2, 0, 10));
        p1.setSize(380, 120);

        p1.add(lblNome);
        p1.add(txtFieldNome);
        p1.add(lblIdade);
        p1.add(txtFieldIdade);
        p1.add(lblEndereco);
        p1.add(txtEndereco);
        /*----------------------------------------*/

        /*--------------------------------------- */

        p2.setLayout(new GridLayout(0, 4, 2, 10));   
        btnOk.addActionListener(this);
        p2.add(btnOk);
        btnLimpar.addActionListener(this);
        p2.add(btnLimpar);
        btnMostrar.addActionListener(this);
        p2.add(btnMostrar);
        btnSair.addActionListener(this);
        p2.add(btnSair);

        /*--------------------------------------- */

        f.add(p1);
        f.add(p2);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new Teste();
    }

    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == btnOk){
            lblNome.setText("Ok");
        }
        if(e.getSource() == btnLimpar){
            txtEndereco.setText("");
            txtFieldIdade.setText("");
            txtFieldNome.setText("");
        }
        if(e.getSource() == btnMostrar){
            JOptionPane.showMessageDialog(null, "Olá amigos");
        }
        if(e.getSource() == btnSair){
            System.exit(0);
        }
    }

}

/*
 * private int k = 0; private Button b1 = new Button("Clique Aqui"); private
 * Label l1 = new Label("O Botao ainda nao foi pressionado.");
 * 
 * public Teste(String titulo, int largura, int altura, int colinic, int
 * lininic) { super(titulo); setSize(largura, altura); setLocation(colinic,
 * lininic); setLayout(new FlowLayout()); b1.addActionListener(this); add(b1);
 * add(l1); }
 * 
 * public static void main(String[] args) throws Exception { /*Teste f = new
 * Teste("Event Listener", 300, 100, 50, 50); //f.addWindowListener(new
 * FechaJanela()); f.show(); }
 * 
 * public void actionPerformed(ActionEvent e) {
 * 
 * ++k; l1.setText("Pressionado " + k + " vezes!"); }
 */