import java.awt.*;
import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JOptionPane;

public class CadastroUsuario extends Frame implements ActionListener {
    Pessoa pessoas = new Pessoa();

    JFrame f = new JFrame("TP3 - CADASTRO V1");
    JPanel p1 = new JPanel(null);
    JPanel p2 = new JPanel(null);
    JPanel p3 = new JPanel(null);
    JPanel p4 = new JPanel(null);
    JPanel p5 = new JPanel(null);

    Label lblNumero = new Label("Numero:");
    TextField txtFieldNumero = new TextField(20);
    Label lblNome = new Label("Nome:");
    TextField txtFieldNome = new TextField(30);
    Label lblSexo = new Label("Sexo:");
    TextField txtFieldSexo = new TextField(10);
    Label lblIdade = new Label("Ïdade:");
    TextField txtFieldIdade = new TextField(3);

    Button btnOk = new Button("Ok");
    Button btnLimpar = new Button("Limpar");
    Button btnMostrar = new Button("Mostrar");
    Button btnSair = new Button("Sair");
    boolean isTrue = true;

    public CadastroUsuario() {
        super();
        txtFieldNumero.disable();
        btnLimpar.addActionListener(this);
        btnMostrar.addActionListener(this);
        btnOk.addActionListener(this);
        btnSair.addActionListener(this);

        p1.setLayout(new GridLayout(0, 2, 0, 5));
        p1.setSize(100, 100);
        p1.add(lblNumero);
        p1.add(txtFieldNumero);

        p2.setLayout(new GridLayout(0, 2, 0, 5));
        p2.setSize(200, 300);
        p2.add(lblNome);
        p2.add(txtFieldNome);

        p3.setLayout(new GridLayout(0, 2, 0, 5));
        p3.setSize(200, 300);
        p3.add(lblSexo);
        p3.add(txtFieldSexo);

        p4.setLayout(new GridLayout(0, 2, 0, 5));
        p4.setSize(200, 300);
        p4.add(lblIdade);
        p4.add(txtFieldIdade);

        p5.setLayout(new GridLayout(0, 4, 0, 5));
        p5.setSize(200, 300);
        p5.add(btnOk);
        p5.add(btnLimpar);
        p5.add(btnMostrar);
        p5.add(btnSair);

        // #region Frame
        f.add(p1);
        f.add(p2);
        f.add(p3);
        f.add(p4);
        f.add(p5);

        // f.setLayout(new FlowLayout(FlowLayout.LEFT));
        f.setLayout(new GridLayout(5, 1, 0, 5));
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        f.setSize(400, 200);
    }

    public static void main(String[] args) throws Exception {
        new CadastroUsuario();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == btnOk) {
            var name = txtFieldNome.getText();
            if (name.length() < 3) {
                JOptionPane.showMessageDialog(null, "O nome não pode ser vazio, ou menor que 3 caracter");
                isTrue = false;
            }

            var idade = txtFieldIdade.getText();
            if (idade.length() <= 0 || idade.length() > 2) {
                JOptionPane.showMessageDialog(null, "Idade deve ter no maximo 2 caracter e no minimo 1");
                isTrue = false;
            }
            char sexo = txtFieldSexo.getText().charAt(0);
            if ((sexo != 'M' && sexo != 'F') || txtFieldSexo.getText().length() >1) {
                JOptionPane.showMessageDialog(null, "Preencha corretamente M (Masculino) ou F(Feminino)");
                isTrue = false;
            }
            if (isTrue) {
                pessoas.setNome(name);
                pessoas.setIdade(Integer.parseInt(idade));
                pessoas.setSexo(sexo);
                pessoas.setKp();
                JOptionPane.showMessageDialog(null, "ok");
            }
            txtFieldIdade.setText("");
            txtFieldNome.setText("");
            txtFieldSexo.setText("");
            
            
        }

        if (e.getSource() == btnLimpar) {
            txtFieldIdade.setText("");
            txtFieldNome.setText("");
            txtFieldSexo.setText("");
            txtFieldNumero.setText("");

        }

        if (e.getSource() == btnMostrar) {
            txtFieldIdade.setText(""+ pessoas.getIdade());
            txtFieldNome.setText(pessoas.getNome());
            txtFieldSexo.setText(""+ pessoas.getSexo());
            txtFieldNumero.setText(""+ pessoas.getKp());
        }

        if (e.getSource() == btnSair) {
            System.exit(0);
        }

    }

}
