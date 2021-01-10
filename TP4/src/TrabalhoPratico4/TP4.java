package TrabalhoPratico4;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;

public class TP4 extends JFrame {

	private JPanel contentPane;
	private JTextField txtPesquisa;
	private JTextField txtNome;
	private JTextField txtSalario;
	private JTextField txtCargo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TP4 frame = new TP4();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TP4() {
		setTitle("TRABALHO PRATICO 4");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 334, 232);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtPesquisa = new JTextField();
		txtPesquisa.setBounds(86, 11, 207, 20);
		contentPane.add(txtPesquisa);
		txtPesquisa.setColumns(10);
		
		JButton btnPesquisar = new JButton("Pesquisar");
		btnPesquisar.setBounds(140, 42, 104, 23);
		contentPane.add(btnPesquisar);
		
		JLabel lblNewLabel = new JLabel("Nome");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setBounds(30, 14, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("NOME");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(10, 92, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("SAL\u00C1RIO");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setBounds(10, 117, 66, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("CARGO");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_3.setBounds(10, 142, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		JButton btnAnterior = new JButton("Anterior");
		btnAnterior.setBounds(0, 167, 159, 26);
		contentPane.add(btnAnterior);
		
		JButton btnProximo = new JButton("Pr\u00F3ximo");
		btnProximo.setBounds(159, 167, 159, 26);
		contentPane.add(btnProximo);
		
		txtNome = new JTextField();
		txtNome.setBounds(175, 89, 133, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		txtSalario = new JTextField();
		txtSalario.setBounds(175, 114, 133, 20);
		contentPane.add(txtSalario);
		txtSalario.setColumns(10);
		
		txtCargo = new JTextField();
		txtCargo.setBounds(175, 139, 133, 20);
		contentPane.add(txtCargo);
		txtCargo.setColumns(10);
	}
}
