package TPF;


import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.nio.DoubleBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class TPFView extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtIdade;
	private JTextField txtPeso;
	private JTextField txtAltura;
	private JTextField txtObjetivo;

	Gson gson = new GsonBuilder().setPrettyPrinting().create();
	UsuarioController userController = new UsuarioController();
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TPFView frame = new TPFView();
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
	public TPFView() {
		setTitle("Cadatro de Usu\u00E1rio");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 343, 211);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtAltura.setText("");
				txtIdade.setText("");
				txtNome.setText("");
				txtPeso.setText("");
				txtObjetivo.setText("");
			}
		});
		btnLimpar.setHorizontalAlignment(SwingConstants.LEFT);
		btnLimpar.setBounds(10, 135, 78, 23);
		contentPane.add(btnLimpar);
		
		JButton btnSair = new JButton("Sair");
		btnSair.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		btnSair.setBounds(257, 135, 59, 22);
		contentPane.add(btnSair);
		
		txtNome = new JTextField();
		txtNome.setBounds(63, 23, 253, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(10, 26, 46, 14);
		contentPane.add(lblNome);
		
		txtIdade = new JTextField();
		txtIdade.setBounds(273, 54, 43, 20);
		contentPane.add(txtIdade);
		txtIdade.setColumns(10);
		
		JLabel lblIdade = new JLabel("Idade");
		lblIdade.setBounds(238, 57, 35, 14);
		contentPane.add(lblIdade);
		
		JLabel lblPeso = new JLabel("Peso");
		lblPeso.setBounds(11, 57, 45, 14);
		contentPane.add(lblPeso);
		
		txtPeso = new JTextField();
		txtPeso.setColumns(10);
		txtPeso.setBounds(63, 54, 48, 20);
		contentPane.add(txtPeso);
		
		JLabel lblAltura = new JLabel("Altura");
		lblAltura.setBounds(121, 57, 35, 14);
		contentPane.add(lblAltura);
		
		txtAltura = new JTextField();
		txtAltura.setColumns(10);
		txtAltura.setBounds(164, 54, 64, 20);
		contentPane.add(txtAltura);
		
		JLabel lblObjetivo = new JLabel("Objetivo");
		lblObjetivo.setBounds(11, 85, 52, 14);
		contentPane.add(lblObjetivo);
		
		txtObjetivo = new JTextField();
		txtObjetivo.setColumns(10);
		txtObjetivo.setBounds(63, 85, 167, 20);
		contentPane.add(txtObjetivo);
		
		JButton btnIncluir = new JButton("Incluir");
		btnIncluir.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					float peso = Float.parseFloat(txtPeso.getText());
					int idade = Integer.parseInt(txtIdade.getText());
					float altura = Float.parseFloat(txtAltura.getText());
					
					userController.AddUser(txtNome.getText(), idade, peso, altura, txtObjetivo.getText());
					txtAltura.setText("");
					txtIdade.setText("");
					txtNome.setText("");
					txtPeso.setText("");
					txtObjetivo.setText("");
					JOptionPane.showMessageDialog(null, "Salvo!");
				}catch(Exception exception) {
					JOptionPane.showMessageDialog(null, "Erro ao salvar. verifique se preencheu corretamente os dados");
				}
			}
		});
		btnIncluir.setBounds(238, 85, 78, 22);
		contentPane.add(btnIncluir);
		
		JButton btnMostrar = new JButton("Apresentar Dados");
		btnMostrar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
			ArrayList<UsuarioDTO> listUser = new ArrayList<UsuarioDTO>();
			listUser = (ArrayList<UsuarioDTO>) userController.getAllUser();	
			var x = gson.toJson(listUser)+"\n";		
			JOptionPane.showMessageDialog(null, x);
			}
		});
		btnMostrar.setBounds(98, 135, 149, 23);
		contentPane.add(btnMostrar);
	}
}
