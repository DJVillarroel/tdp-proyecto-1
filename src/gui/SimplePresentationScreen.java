package gui;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import entities.Student;
import javax.swing.JTabbedPane;
import java.awt.Toolkit;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

@SuppressWarnings("serial")
public class SimplePresentationScreen extends JFrame {

	private JPanel contentPane;
	private JPanel tabInformation;
	private JTabbedPane tabbedPane;
	private Student studentData;
	private JTextField tf_lu;
	private JTextField tf_apellido;
	private JTextField tf_nombre;
	private JTextField tf_email;
	private JTextField tf_url;

	public SimplePresentationScreen(Student studentData) {
		setIconImage(Toolkit.getDefaultToolkit().getImage(SimplePresentationScreen.class.getResource("/images/tdp.png")));
		this.studentData = studentData;
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		setTitle("TdP-DCIC-UNS 2021 :: Pantalla de presentación");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(new Dimension(615, 281));
		setResizable(false);
		setContentPane(contentPane);
		
		init();
	}
	
	private void init() {
		contentPane.setLayout(null);
		// Tabbed Pane to student personal data
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(5, 5, 430, 212);
		tabInformation = new JPanel();
		tabInformation.setPreferredSize(new Dimension(425, 275));
		tabbedPane.addTab("Información del alumno", null, tabInformation, "Muestra la información declarada por el alumno");
		
		JLabel l_LU = new JLabel("LU:");
		l_LU.setFont(new Font("Calibri", Font.BOLD, 19));
		
		JLabel l_apellido = new JLabel("Apellido:");
		l_apellido.setFont(new Font("Calibri", Font.BOLD, 19));
		
		JLabel l_nombre = new JLabel("Nombre:");
		l_nombre.setFont(new Font("Calibri", Font.BOLD, 19));
		
		JLabel l_email = new JLabel("E-Mail");
		l_email.setFont(new Font("Calibri", Font.BOLD, 19));
		
		JLabel l_url = new JLabel("Github URL:");
		l_url.setFont(new Font("Calibri", Font.BOLD, 19));
		
		tf_lu = new JTextField();
		tf_lu.setFont(new Font("Tahoma", Font.PLAIN, 18));
		tf_lu.setColumns(10);
		tf_lu.setText(String.valueOf(studentData.getId()));
		tf_lu.setEditable(false);
		
		tf_apellido = new JTextField();
		tf_apellido.setFont(new Font("Tahoma", Font.PLAIN, 18));
		tf_apellido.setColumns(10);
		tf_apellido.setText(studentData.getLastName());
		tf_apellido.setEditable(false);
		
		tf_nombre = new JTextField();
		tf_nombre.setFont(new Font("Tahoma", Font.PLAIN, 18));
		tf_nombre.setColumns(10);
		tf_nombre.setText(studentData.getFirstName());
		tf_nombre.setEditable(false);
		
		tf_email = new JTextField();
		tf_email.setFont(new Font("Tahoma", Font.PLAIN, 18));
		tf_email.setColumns(10);
		tf_email.setText(studentData.getMail());
		tf_email.setEditable(false);
		
		tf_url = new JTextField();
		tf_url.setFont(new Font("Tahoma", Font.PLAIN, 18));
		tf_url.setColumns(10);
		tf_url.setText(studentData.getGithubURL());
		tf_url.setEditable(false);
		GroupLayout gl_tabInformation = new GroupLayout(tabInformation);
		gl_tabInformation.setHorizontalGroup(
			gl_tabInformation.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_tabInformation.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_tabInformation.createParallelGroup(Alignment.LEADING, false)
						.addComponent(l_nombre, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(l_url, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(l_email, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(l_apellido, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(l_LU, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_tabInformation.createParallelGroup(Alignment.LEADING, false)
						.addComponent(tf_apellido)
						.addComponent(tf_nombre, GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE)
						.addComponent(tf_lu)
						.addComponent(tf_email)
						.addComponent(tf_url))
					.addContainerGap(22, Short.MAX_VALUE))
		);
		gl_tabInformation.setVerticalGroup(
			gl_tabInformation.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_tabInformation.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_tabInformation.createParallelGroup(Alignment.BASELINE)
						.addComponent(l_LU)
						.addComponent(tf_lu, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_tabInformation.createParallelGroup(Alignment.LEADING)
						.addComponent(l_apellido, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
						.addComponent(tf_apellido, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_tabInformation.createParallelGroup(Alignment.BASELINE)
						.addComponent(l_nombre, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
						.addComponent(tf_nombre, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_tabInformation.createParallelGroup(Alignment.BASELINE)
						.addComponent(l_email, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
						.addComponent(tf_email, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_tabInformation.createParallelGroup(Alignment.BASELINE)
						.addComponent(l_url, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
						.addComponent(tf_url, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(23, Short.MAX_VALUE))
		);
		tabInformation.setLayout(gl_tabInformation);
		contentPane.add(tabbedPane);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(445, 30, 156, 156);
		lblNewLabel.setIcon(new ImageIcon(SimplePresentationScreen.class.getResource("/images/djv.png")));
		contentPane.add(lblNewLabel);
		
		JLabel l_fecha = new JLabel("");
		l_fecha.setBounds(15, 227, 408, 13);
		contentPane.add(l_fecha);
		DateTimeFormatter df_fecha = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter df_hora = DateTimeFormatter.ofPattern("HH:mm:ss");
		l_fecha.setText("Esta ventana fue generada el " + df_fecha.format(LocalDateTime.now()) + " a las " + df_hora.format(LocalDateTime.now()));
	}
}
