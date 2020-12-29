import java.awt.*;
import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Calculadora extends Frame implements ActionListener {

    private static double calculo1 = 0;
    private static double calculo2 = 0;
    private static String tela1 = "0";
    private static String tela2 = "0";

    private boolean isValue2 = false;

    private String operacao = "";

    JFrame f = new JFrame("TP3 - CALCULADORA");
    JPanel p1 = new JPanel(null);

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

    Button mais = new Button("+");
    Button menos = new Button("-");
    Button dividir = new Button("/");
    Button multi = new Button("x");
    Button clear = new Button("c");
    Button igual = new Button("=");

    public Calculadora() {
        super();

        // NÃO retirar a linha abaixo
        txtFieldNome.disable();
        txtFieldNome.setText("0");

        p1.setLayout(new FlowLayout(FlowLayout.LEFT));
        p1.setSize(200, 300);
        p1.add(txtFieldNome);

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

        p1.add(btn1);
        p1.add(btn2);
        p1.add(btn3);
        p1.add(btn4);
        p1.add(btn5);
        p1.add(btn6);
        p1.add(btn7);
        p1.add(btn8);
        p1.add(btn9);
        p1.add(btn0);
        p1.add(menos);
        p1.add(mais);
        p1.add(multi);
        p1.add(dividir);
        p1.add(clear);
        p1.add(igual);

        f.add(p1);

        f.setLayout(new FlowLayout(FlowLayout.LEFT));
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        f.setSize(550, 100);
    }

    public static void main(String[] args) throws Exception {
        new Calculadora();
    }

    // Classe que pega os eventos
    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == btn0) {
            if (isValue2) {
                calculo1 += 0;
                tela1 += "0";
                txtFieldNome.setText(tela1);
            } else {
                calculo2 += 0;
                txtFieldNome.setText(Double.toString(calculo2));
            }
        }
        if (e.getSource() == btn1) {
            if (isValue2) {
                calculo1 += 1;
                tela1 = (tela1 + "1");
                txtFieldNome.setText(tela1);
                
            } else {
                calculo2 += 1;
                txtFieldNome.setText(Double.toString(calculo2));
            }
        }
        if (e.getSource() == btn2) {
            if (isValue2) {
                calculo1 += 2;
                txtFieldNome.setText(Double.toString(calculo1));
            } else {
                calculo2 += 2;
                txtFieldNome.setText(Double.toString(calculo2));
            }
        }
        if (e.getSource() == btn3) {
            if (isValue2) {
                calculo1 += 3;
                txtFieldNome.setText(Double.toString(calculo1));
            } else {
                calculo2 += 3;
                txtFieldNome.setText(Double.toString(calculo2));
            }
        }
        if (e.getSource() == btn4) {
            if (isValue2) {
                calculo1 += 4;
                txtFieldNome.setText(Double.toString(calculo1));
            } else {
                calculo2 += 4;
                txtFieldNome.setText(Double.toString(calculo2));
            }
        }
        if (e.getSource() == btn5) {
            if (isValue2) {
                calculo1 += 5;
                txtFieldNome.setText(Double.toString(calculo1));
            } else {
                calculo2 += 5;
                txtFieldNome.setText(Double.toString(calculo2));
            }
        }
        if (e.getSource() == btn6) {
            if (isValue2) {
                calculo1 += 6;
                txtFieldNome.setText(Double.toString(calculo1));
            } else {
                calculo2 += 6;
                txtFieldNome.setText(Double.toString(calculo2));
            }
        }
        if (e.getSource() == btn7) {
            if (isValue2) {
                calculo1 += 7;
            } else {
                calculo2 += 7;
            }
        }
        if (e.getSource() == btn8) {
            if (isValue2) {
                calculo1 += 8;
                txtFieldNome.setText(Double.toString(calculo1));
            } else {
                calculo2 += 8;
                txtFieldNome.setText(Double.toString(calculo2));
            }
        }
        if (e.getSource() == btn9) {
            if (isValue2) {
                calculo1 += 9;
                txtFieldNome.setText(Double.toString(calculo1));
            } else {
                calculo2 += 9;
                txtFieldNome.setText(Double.toString(calculo2));
            }

        }
       
        if(e.getSource() == menos){
            operacao = "/";
            isValue2 = true;
        }
        if(e.getSource() == mais){
            operacao = "/";
            isValue2 = true;
        }
        if(e.getSource() == multi){
            operacao = "/";
            isValue2 = true;
        }
        if(e.getSource() == dividir){
            operacao = "/";
            isValue2 = true;
        }
        if(e.getSource() == clear){
            calculo1 = 0;
            calculo1 = 0;
            txtFieldNome.setText("");
            isValue2 = false;
        }

        if (e.getSource() == igual) {

            switch (operacao) {
                case "-":
                    txtFieldNome.setText(Double.toString(calculo1 - calculo2));
                    calculo1 = calculo1 - calculo2;
                    calculo2 = 0;
                    isValue2 = true;
                    break;

                case "+":
                    txtFieldNome.setText(Double.toString(calculo1 + calculo2));
                    calculo1 = calculo1 + calculo2;
                    calculo2 = 0;
                    isValue2 = true;
                    break;
                case "x":
                    txtFieldNome.setText(Double.toString(calculo1 * calculo2));
                    calculo1 = calculo1 * calculo2;
                    calculo2 = 0;
                    isValue2 = true;
                    break;
                case "/":
                    txtFieldNome.setText(Double.toString(calculo1 / calculo2));
                    calculo1 = calculo1 / calculo2;
                    calculo2 = 0;
                    isValue2 = true;
                    break;
            }
        }

    }

}