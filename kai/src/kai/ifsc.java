package kai;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ifsc extends JFrame {

	private JPanel contentPane;
	private JTextField txtNota1;
	private JTextField txtNota2;
	private JTextField txtNome;
	private JTextField txtNota3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ifsc frame = new ifsc();
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
	public ifsc() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtNota1 = new JTextField();
		txtNota1.setBounds(152, 42, 86, 20);
		contentPane.add(txtNota1);
		txtNota1.setColumns(10);
		
		txtNota2 = new JTextField();
		txtNota2.setBounds(152, 73, 86, 20);
		contentPane.add(txtNota2);
		txtNota2.setColumns(10);
		
		JButton btnCalc = new JButton("Calcular media");
		btnCalc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nome=txtNome.getText();
					String nota1=txtNota1.getText();
						String nota2=txtNota2.getText();
							String nota3=txtNota3.getText();
					
				
				
				if(!nota1.isEmpty() && !nota2.isEmpty() && !nota3.isEmpty()) {
					Double n1=Double.valueOf(nota1);
						Double n2=Double.valueOf(nota2);
							Double n3=Double.valueOf(nota3);
					
					
					
					
						JOptionPane.showMessageDialog(null,"sua média é"+(n1+n2+n3)/3);
				}
				
				
				
			}
		});
		btnCalc.setBounds(135, 157, 118, 23);
		contentPane.add(btnCalc);
		
		txtNome = new JTextField();
		txtNome.setBounds(152, 11, 86, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		txtNota3 = new JTextField();
		txtNota3.setBounds(152, 104, 86, 20);
		contentPane.add(txtNota3);
		txtNota3.setColumns(10);
	}
}
