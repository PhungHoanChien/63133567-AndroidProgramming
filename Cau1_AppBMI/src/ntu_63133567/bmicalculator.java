package ntu_63133567;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class bmicalculator extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bmicalculator frame = new bmicalculator();
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
	public bmicalculator() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 584, 536);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 128, 64));
		panel.setBounds(0, 10, 571, 86);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Body Mass Index");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(192, 23, 201, 28);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 128, 64));
		panel_1.setBounds(0, 99, 571, 195);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Height (m)");
		lblNewLabel_1.setFont(new Font("Calibri", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(10, 35, 96, 23);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Weight (kg)");
		lblNewLabel_1_1.setFont(new Font("Calibri", Font.PLAIN, 18));
		lblNewLabel_1_1.setBounds(10, 75, 96, 23);
		panel_1.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("BMI");
		lblNewLabel_1_2.setFont(new Font("Calibri", Font.BOLD, 18));
		lblNewLabel_1_2.setBounds(10, 125, 96, 23);
		panel_1.add(lblNewLabel_1_2);
		
		textField = new JTextField();
		textField.setBounds(140, 25, 210, 30);
		panel_1.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(140, 69, 210, 30);
		panel_1.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(140, 119, 210, 30);
		panel_1.add(textField_2);
		
		JButton btnNewButton = new JButton("Calculator");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double h = Double.parseDouble(textField.getText());
				double w = Double.parseDouble(textField_1.getText());
				
				double bmi = w / (h*h);
				
				String cal = String.format("%.2f",bmi);
				
				textField_2.setText(cal);
				
				if(bmi <= 18.5) {
					
				}
			}
		});
		btnNewButton.setBounds(85, 164, 85, 21);
		panel_1.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Clear");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
				textField_2.setOpaque(true);
				textField_2.setBackground(null);
			}
		});
		btnNewButton_1.setBounds(196, 164, 85, 21);
		panel_1.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Exit");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton_2.setBounds(310, 164, 85, 21);
		panel_1.add(btnNewButton_2);
		
		JLabel lblImg = new JLabel("");
		lblImg.setIcon(new ImageIcon(bmicalculator.class.getResource("/images/img1.jpg")));
		lblImg.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/images/img1.jpg")).getImage().getScaledInstance(570, 185, java.awt.Image.SCALE_SMOOTH)));
		lblImg.setBounds(0, 304, 570, 185);
		contentPane.add(lblImg);
	}
}
