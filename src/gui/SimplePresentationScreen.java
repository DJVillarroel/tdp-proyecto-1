package gui;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import entities.Student;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@SuppressWarnings("serial")
public class SimplePresentationScreen extends JFrame {

	private JPanel contentPane;
	private JPanel tabInformation;
	private JTabbedPane tabbedPane;
	private Student studentData;
	private JLabel lblID;
	private JTextField tfID;
	private JTextField tfApellido;
	private JTextField tfGithubURL;
	private JTextField tfNombre;
	private JTextField tfEmail;

	public SimplePresentationScreen(Student studentData) {
		setIconImage(Toolkit.getDefaultToolkit().getImage("G:\\DJV\\Tecnolog\u00EDa de Programaci\u00F3n\\git\\proyecto-1\\src\\images\\tdp.png"));
		this.studentData = studentData;
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		setTitle("TdP-DCIC-UNS 2021 :: Pantalla de presentación");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(new Dimension(615, 260));
		setResizable(false);
		setContentPane(contentPane);
		
		init();
	}
	
	private void init() {
		// Tabbed Pane to student personal data
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(5, 5, 430, 196);
		tabInformation = new JPanel();
		tabbedPane.addTab("Información del alumno", null, tabInformation, "Muestra la información declarada por el alumno");
		
		DateTimeFormatter formater = DateTimeFormatter.ofPattern("HH:mm:ss"); //Time format
		String time = formater.format(LocalDateTime.now());
		String day = String.valueOf(LocalDate.now().getDayOfMonth());
		String month = String.valueOf(LocalDate.now().getMonthValue());
		String year = Integer.toString(LocalDate.now().getYear());
		
		lblID = new JLabel("LU");
		lblID.setFont(new Font("Calibri", Font.BOLD, 19));
		
		JLabel lblApellido = new JLabel("Apellido");
		lblApellido.setFont(new Font("Calibri", Font.BOLD, 19));
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Calibri", Font.BOLD, 19));
		
		JLabel lblEmail = new JLabel("E-Mail");
		lblEmail.setFont(new Font("Calibri", Font.BOLD, 19));
		
		JLabel lblGithubURL = new JLabel("GitHub URL");
		lblGithubURL.setFont(new Font("Calibri", Font.BOLD, 19));
		
		tfID = new JTextField();
		tfID.setEditable(false);
		tfID.setText(String.valueOf(studentData.getId()));
		tfID.setColumns(10);
		
		tfApellido = new JTextField();
		tfApellido.setEditable(false);
		tfApellido.setText(studentData.getLastName());
		tfApellido.setColumns(10);
		
		tfGithubURL = new JTextField();
		tfGithubURL.setEditable(false);
		tfGithubURL.setText(studentData.getGithubURL());
		tfGithubURL.setColumns(10);
		
		tfNombre = new JTextField();
		tfNombre.setEditable(false);
		tfNombre.setText(studentData.getFirstName());
		tfNombre.setColumns(10);
		
		tfEmail = new JTextField();
		tfEmail.setEditable(false);
		tfEmail.setText((studentData.getMail()));
		tfEmail.setColumns(10);
		GroupLayout gl_tabInformation = new GroupLayout(tabInformation);
		gl_tabInformation.setHorizontalGroup(
			gl_tabInformation.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_tabInformation.createSequentialGroup()
					.addGap(33)
					.addGroup(gl_tabInformation.createParallelGroup(Alignment.LEADING)
						.addComponent(lblGithubURL, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblEmail, GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
						.addComponent(lblNombre, GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
						.addComponent(lblApellido, GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
						.addComponent(lblID))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_tabInformation.createParallelGroup(Alignment.LEADING)
						.addComponent(tfGithubURL, GroupLayout.PREFERRED_SIZE, 236, GroupLayout.PREFERRED_SIZE)
						.addComponent(tfNombre, GroupLayout.PREFERRED_SIZE, 236, GroupLayout.PREFERRED_SIZE)
						.addComponent(tfEmail, GroupLayout.PREFERRED_SIZE, 236, GroupLayout.PREFERRED_SIZE)
						.addComponent(tfID, GroupLayout.PREFERRED_SIZE, 236, GroupLayout.PREFERRED_SIZE)
						.addComponent(tfApellido, GroupLayout.PREFERRED_SIZE, 236, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(44, Short.MAX_VALUE))
		);
		gl_tabInformation.setVerticalGroup(
			gl_tabInformation.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_tabInformation.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_tabInformation.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblID, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(tfID, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_tabInformation.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblApellido, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(tfApellido, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_tabInformation.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNombre, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(tfNombre, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_tabInformation.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblEmail, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(tfEmail, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_tabInformation.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblGithubURL, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(tfGithubURL, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(35, Short.MAX_VALUE))
		);
		tabInformation.setLayout(gl_tabInformation);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(445, 28, 151, 158);
		lblNewLabel.setIcon(new ImageIcon("G:\\DJV\\Tecnolog\u00EDa de Programaci\u00F3n\\git\\proyecto-1\\src\\images\\DJV.png"));
		contentPane.setLayout(null);
		
		JLabel lblWindowTime = new JLabel("Esta ventana fue generada el "+day+"/"+month+"/"+year +" a las: "+time);
		lblWindowTime.setBounds(15, 203, 347, 19);
		lblWindowTime.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblWindowTime.setHorizontalAlignment(SwingConstants.LEFT);
		contentPane.add(lblWindowTime);
		contentPane.add(tabbedPane);
		contentPane.add(lblNewLabel);
	}
}
