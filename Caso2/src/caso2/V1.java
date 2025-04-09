package caso2;

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
import java.awt.event.ActionEvent;

public class V1 extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JTextField txtNumero;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JScrollPane scrollPane;
	private JTextArea txtS;
	private JButton btnAMillas;

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
			lblNewLabel = new JLabel("Ingrese un número");
			lblNewLabel.setBounds(10, 11, 131, 14);
			contentPane.add(lblNewLabel);
		}
		{
			txtNumero = new JTextField();
			txtNumero.setBounds(151, 8, 86, 20);
			contentPane.add(txtNumero);
			txtNumero.setColumns(10);
		}
		{
			btnNewButton = new JButton("Celsius a Farenheit");
			btnNewButton.addActionListener(this);
			btnNewButton.setBounds(116, 36, 149, 18);
			contentPane.add(btnNewButton);
		}
		{
			btnNewButton_1 = new JButton("segundos a minutos y segundos");
			btnNewButton_1.addActionListener(this);
			btnNewButton_1.setBounds(116, 95, 149, 17);
			contentPane.add(btnNewButton_1);
		}
		{
			scrollPane = new JScrollPane();
			scrollPane.setBounds(10, 123, 414, 112);
			contentPane.add(scrollPane);
			{
				txtS = new JTextArea();
				scrollPane.setViewportView(txtS);
			}
		}
		{
			btnAMillas = new JButton("kilómetros a millas");
			btnAMillas.addActionListener(this);
			btnAMillas.setBounds(116, 65, 149, 18);
			contentPane.add(btnAMillas);
		}
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnNewButton_1) {
			do_btnNewButton_1_actionPerformed(e);
		}
		if (e.getSource() == btnAMillas) {
			do_btnAMillas_actionPerformed(e);
		}
		if (e.getSource() == btnNewButton) {
			do_btnNewButton_actionPerformed(e);
		}
	}
	protected void do_btnNewButton_actionPerformed(ActionEvent e) 
	{
		double celsius=Double.parseDouble(txtNumero.getText());
		Conversor c=new Conversor(celsius);
		txtS.append("De Celsius a Farenheit es: "+c.Convertir(celsius));
	}
	protected void do_btnAMillas_actionPerformed(ActionEvent e) 
	{
		float km=Float.parseFloat(txtNumero.getText());
		Conversor c=new Conversor(km);
		txtS.append("De kilómetros a millas es: "+c.Convertir(km));		
	}			
	protected void do_btnNewButton_1_actionPerformed(ActionEvent e) 
	{
		int s=Integer.parseInt(txtNumero.getText());
		Conversor c=new Conversor(s);
		txtS.append("De segundos a minutos y segundos es: "+c.Convertir(s)+" minutos y "+s%60+" segundos");
	}
		
	
	private void MostrarError() 
	{
		JOptionPane.showMessageDialog(this,"Ingrese número(s) válido(s)");
	}
}
