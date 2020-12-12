import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JOptionPane;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;
import java.util.InputMismatchException;


public class App extends Frame implements ActionListener {

    List<Aluno> alunos = new ArrayList<Aluno>();

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
    JPanel p1 = new JPanel(null);
    JPanel p2 = new JPanel(null);

    public App() {

        super();
        btnLimpar.setSize(5, 5);
        btnOk.setSize(5, 5);
        btnSair.setSize(5, 5);
        btnMostrar.setSize(5, 5);
        //f.setLayout(new BoxLayout(f,BoxLayout.PAGE_AXIS));
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
        f.add(p2, BorderLayout.PAGE_END);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

    public static void main(String[] args) throws Exception {
        new App();
    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == btnOk) {
            try {
                int idade = Integer.parseInt(txtFieldIdade.getText().toString());
                alunos.add(new Aluno(txtEndereco.getText().toString(), txtFieldNome.getText().toString(), idade));
                txtEndereco.setText("");
                txtFieldIdade.setText("");
                txtFieldNome.setText("");
                JOptionPane.showMessageDialog(null, "Salvo");
            } catch (Exception exception) {
                JOptionPane.showMessageDialog(null, "Preencha os dados corretamente!");
            }

        }
        if (e.getSource() == btnLimpar) {
            txtEndereco.setText("");
            txtFieldIdade.setText("");
            txtFieldNome.setText("");
        }
        if (e.getSource() == btnMostrar) {
            String nomes = "";
            for (Aluno aluno : alunos) {
                nomes += "ID: " + aluno.getUUID() + " NOME: " + aluno.getNome() + "\n";
            }
            JOptionPane.showMessageDialog(null, nomes);
        }
        if (e.getSource() == btnSair) {
            System.exit(0);
        }
    }

}
