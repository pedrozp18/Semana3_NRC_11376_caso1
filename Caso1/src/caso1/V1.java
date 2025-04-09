package caso1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.geom.Arc2D.Double;
import java.awt.event.ActionEvent;

public class V1 extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblSegundoNmero;
	private JLabel lblTercerNmero;
	private JTextField txtN1;
	private JTextField txtN2;
	private JTextField txtN3;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JScrollPane scrollPane;
	private JTextArea txtS;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					V1 frame = new V1();
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
	public V1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		{
			lblNewLabel = new JLabel("Primer Número");
			lblNewLabel.setBounds(10, 11, 96, 14);
			contentPane.add(lblNewLabel);
		}
		{
			lblSegundoNmero = new JLabel("Segundo Número");
			lblSegundoNmero.setBounds(10, 40, 105, 14);
			contentPane.add(lblSegundoNmero);
		}
		{
			lblTercerNmero = new JLabel("Tercer Número");
			lblTercerNmero.setBounds(10, 65, 96, 14);
			contentPane.add(lblTercerNmero);
		}
		{
			txtN1 = new JTextField();
			txtN1.setBounds(116, 8, 86, 20);
			contentPane.add(txtN1);
			txtN1.setColumns(10);
		}
		{
			txtN2 = new JTextField();
			txtN2.setColumns(10);
			txtN2.setBounds(116, 37, 86, 20);
			contentPane.add(txtN2);
		}
		{
			txtN3 = new JTextField();
			txtN3.setColumns(10);
			txtN3.setBounds(116, 62, 86, 20);
			contentPane.add(txtN3);
		}
		{
			btnNewButton = new JButton("Sumar 2 enteros");
			btnNewButton.addActionListener(this);
			btnNewButton.setBounds(269, 7, 143, 21);
			contentPane.add(btnNewButton);
		}
		{
			btnNewButton_1 = new JButton("Sumar 3 enteros");
			btnNewButton_1.addActionListener(this);
			btnNewButton_1.setBounds(269, 36, 143, 18);
			contentPane.add(btnNewButton_1);
		}
		{
			btnNewButton_2 = new JButton("Sumar 2 reales");
			btnNewButton_2.addActionListener(this);
			btnNewButton_2.setBounds(269, 61, 143, 21);
			contentPane.add(btnNewButton_2);
		}
		{
			scrollPane = new JScrollPane();
			scrollPane.setBounds(10, 106, 401, 128);
			contentPane.add(scrollPane);
			{
				txtS = new JTextArea();
				scrollPane.setViewportView(txtS);
			}
		}
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnNewButton_2) {
			do_btnNewButton_2_actionPerformed(e);
		}
		if (e.getSource() == btnNewButton_1) {
			do_btnNewButton_1_actionPerformed(e);
		}
		if (e.getSource() == btnNewButton) {
			do_btnNewButton_actionPerformed(e);
		}
	}
	protected void do_btnNewButton_actionPerformed(ActionEvent e) 
	{
	try {
			int n1=Integer.parseInt(txtN1.getText());
			int n2=Integer.parseInt(txtN2.getText());
			Calculadora c=new Calculadora(n1, n2);
			txtS.append("\nLa suma es: "+c.Sumar(n1, n2));
		} 
		catch (Exception e2) 
		{
			MostrarError();
		}		
	}
	private void MostrarError() {
		JOptionPane.showMessageDialog(this,"Ingrese número(s) válido(s)");
	}
	protected void do_btnNewButton_1_actionPerformed(ActionEvent e) 
	{
		try {
			int n1=Integer.parseInt(txtN1.getText());
			int n2=Integer.parseInt(txtN2.getText());
			int n3=Integer.parseInt(txtN3.getText());
			Calculadora c=new Calculadora(n1, n2, n3);
			txtS.append("\nLa suma es: "+c.Sumar(n1, n2, n3));
		} 
		catch (Exception e2) 
		{
			MostrarError();
		}		
	}
	
	protected void do_btnNewButton_2_actionPerformed(ActionEvent e)
	{
		try {
			double num1= java.lang.Double.parseDouble(txtN1.getText());
			double num2=java.lang.Double.parseDouble(txtN2.getText());
			Calculadora c=new Calculadora(num1, num2);
			txtS.append("\nLa suma es: "+c.Sumar(num1, num2));	
		} 
		catch (Exception e2) 
		{
			MostrarError();
		}
	}
}
