package TrabalhoPratico4;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class TP4 extends JFrame {

	private JPanel contentPane;
	private JTextField txtPesquisa;
	private JTextField txtNome;
	private JTextField txtSalario;
	private JTextField txtCargo;

	TP4Controller tpc = new TP4Controller();
	static int count = 0;
	
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
		btnPesquisar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				var search = txtPesquisa.getText();
				var winF = tpc.getFuncByName(search);
				var winC = tpc.getCargobyId(winF.get(0).cargo);
				
				txtNome.setText(winF.get(0).nome);		
				txtSalario.setText(Double.toString(winF.get(0).salario));
				txtCargo.setText(winC);
				//JOptionPane.showMessageDialog(null, );
			}
		});
		btnPesquisar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnPesquisar.setBounds(140, 42, 104, 23);
		contentPane.add(btnPesquisar);
		
		JLabel lblNamePesquisa = new JLabel("Nome");
		lblNamePesquisa.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNamePesquisa.setBounds(30, 14, 46, 14);
		contentPane.add(lblNamePesquisa);
		
		JLabel lblNome = new JLabel("NOME");
		lblNome.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNome.setBounds(10, 92, 46, 14);
		contentPane.add(lblNome);
		
		JLabel lblSalario = new JLabel("SAL\u00C1RIO");
		lblSalario.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblSalario.setBounds(10, 117, 66, 14);
		contentPane.add(lblSalario);
		
		JLabel lblCargo = new JLabel("CARGO");
		lblCargo.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblCargo.setBounds(10, 142, 46, 14);
		contentPane.add(lblCargo);
		
		JButton btnAnterior = new JButton("Anterior");
		btnAnterior.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//Evento de Anterior
			}
		});
		btnAnterior.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAnterior.setBounds(0, 167, 159, 26);
		contentPane.add(btnAnterior);
		
		JButton btnProximo = new JButton("Pr\u00F3ximo");
		btnProximo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
			//Evento de Proximo
		});
		btnProximo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
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
