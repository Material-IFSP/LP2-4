import java.awt.*;
import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Calculadora extends Frame implements ActionListener {

    private static double calculo1 = 0;
    private static double calculo2 = 0;
    private String operacao = "";

    // #region Instanciando Objetos

    JFrame f = new JFrame("TP3 - CALCULADORA");
    JPanel p1 = new JPanel(null);
    JPanel p2 = new JPanel(null);
    JPanel p3 = new JPanel(null);
    JPanel p4 = new JPanel(null);
    JPanel p5 = new JPanel(null);
    JPanel p6 = new JPanel(null);

    TextField txtFieldNome = new TextField(5);
    Button btn1 = new Button("1");
    Button btn2 = new Button("2");
    Button btn3 = new Button("3");
    Button btn4 = new Button("4");
    Button btn5 = new Button("5");
    Button btn6 = new Button("6");
    Button btn7 = new Button("7");
    Button btn8 = new Button("8");
    Button btn9 = new Button("9");
    Button btn0 = new Button("0");
    Button btnDot = new Button(".");

    Button mais = new Button("+");
    Button menos = new Button("-");
    Button dividir = new Button("/");
    Button multi = new Button("x");
    Button clear = new Button("C");
    Button igual = new Button("=");

    // #endregion

    //#region Paineis
    public Calculadora() {
        super();

        // NÃO retirar a linha abaixo
        txtFieldNome.disable();
        txtFieldNome.setText("");

        p1.setLayout(new GridLayout(0, 1, 0, 5));
        p1.setSize(200, 300);
        p1.add(txtFieldNome);

        p2.setLayout(new GridLayout(0, 4, 0, 10));
        p2.setSize(200, 300);
        p2.add(btn1);
        p2.add(btn2);
        p2.add(btn3);
        p2.add(dividir);

        p3.setLayout(new GridLayout(0, 4, 0, 10));
        p3.setSize(200, 300);
        p3.add(btn4);
        p3.add(btn5);
        p3.add(btn6);
        p3.add(multi);

        p4.setLayout(new GridLayout(0, 4, 0, 10));
        p4.setSize(200, 300);
        p4.add(btn7);
        p4.add(btn8);
        p4.add(btn9);
        p4.add(menos);

        p5.setLayout(new GridLayout(0, 4, 0, 10));
        p5.setSize(200, 300);
        p5.add(btn0);
        p5.add(igual);
        p5.add(mais);
        p5.add(clear);

        //#endregion

    //#region ActionListener
    btn0.addActionListener(this);
    btn1.addActionListener(this);
    btn2.addActionListener(this);
    btn3.addActionListener(this);
    btn4.addActionListener(this);
    btn5.addActionListener(this);
    btn6.addActionListener(this);
    btn7.addActionListener(this);
    btn8.addActionListener(this);
    btn9.addActionListener(this);

    menos.addActionListener(this);
    mais.addActionListener(this);
    multi.addActionListener(this);
    dividir.addActionListener(this);
    clear.addActionListener(this);
    igual.addActionListener(this);

    //#endregion

    //#region Frame
    f.add(p1);
    f.add(p2);
    f.add(p3);
    f.add(p4);
    f.add(p5);

    // f.setLayout(new FlowLayout(FlowLayout.LEFT));
    f.setLayout(new GridLayout(5, 1, 0, 5));
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setVisible(true);
    f.setSize(400, 600);
    //#endregion
}

    public static void main(String[] args) throws Exception {
        new Calculadora();
    }

    // Classe que pega os eventos
    @Override
    public void actionPerformed(ActionEvent e) {

        //#region Eventos Botoes Numericos
        if (e.getSource() == btn0) {
            txtFieldNome.setText(txtFieldNome.getText().toString() + "0");
        }
        if (e.getSource() == btn1) {
            txtFieldNome.setText(txtFieldNome.getText().toString() + "1");
        }
        if (e.getSource() == btn2) {
            txtFieldNome.setText(txtFieldNome.getText().toString() + "2");
        }
        if (e.getSource() == btn3) {
            txtFieldNome.setText(txtFieldNome.getText().toString() + "3");
        }
        if (e.getSource() == btn4) {
            txtFieldNome.setText(txtFieldNome.getText().toString() + "4");
        }
        if (e.getSource() == btn5) {
            txtFieldNome.setText(txtFieldNome.getText().toString() + "5");
        }
        if (e.getSource() == btn6) {
            txtFieldNome.setText(txtFieldNome.getText().toString() + "6");
        }
        if (e.getSource() == btn7) {
            txtFieldNome.setText(txtFieldNome.getText().toString() + "7");
        }
        if (e.getSource() == btn8) {
            txtFieldNome.setText(txtFieldNome.getText().toString() + "8");
        }
        if (e.getSource() == btn9) {
            txtFieldNome.setText(txtFieldNome.getText().toString() + "9");
        }
        //#endregion


        //#region Eventos Operacoes Aritmeticas
        if (e.getSource() == menos) {
            operacao = "-";
            calculo1 = Double.parseDouble(txtFieldNome.getText());
            txtFieldNome.setText("");
        }
        if (e.getSource() == mais) {
            operacao = "+";
            calculo1 = Double.parseDouble(txtFieldNome.getText());
            txtFieldNome.setText("");
        }
        if (e.getSource() == multi) {
            operacao = "*";
            calculo1 = Double.parseDouble(txtFieldNome.getText());
            txtFieldNome.setText("");
        }
        if (e.getSource() == dividir) {
            operacao = "/";
            calculo1 = Double.parseDouble(txtFieldNome.getText());
            txtFieldNome.setText("");
        }
        if (e.getSource() == clear) {
            calculo1 = 0;
            calculo2 = 0;
            txtFieldNome.setText("");
            menos.enable(); mais.enable(); dividir.enable(); multi.enable();
        }
        //#endregion

        //#region Resultado
        if (e.getSource() == igual) {
            switch (operacao) {
                case "-":
                    calculo2 = Double.parseDouble(txtFieldNome.getText());
                    txtFieldNome.setText(Double.toString(calculo1 - calculo2));
                    menos.disable(); mais.disable(); dividir.disable(); multi.disable();
                    break;

                case "+":
                    calculo2 = Double.parseDouble(txtFieldNome.getText());
                    txtFieldNome.setText(Double.toString(calculo1 + calculo2));
                    menos.disable(); mais.disable(); dividir.disable(); multi.disable();
                    break;
                case "*":
                    calculo2 = Double.parseDouble(txtFieldNome.getText());
                    txtFieldNome.setText(Double.toString(calculo1 * calculo2));
                    menos.disable(); mais.disable(); dividir.disable(); multi.disable();
                    break;
                case "/":
                    calculo2 = Double.parseDouble(txtFieldNome.getText());
                    txtFieldNome.setText(Double.toString(calculo1 / calculo2));
                    menos.disable(); mais.disable(); dividir.disable(); multi.disable();
                    break;
            }
        }
        //#endregion
    }

}