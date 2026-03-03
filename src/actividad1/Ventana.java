package actividad1;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;

public class Ventana extends JFrame{

	public Ventana() {
				
				this.setVisible(true);
				this.setSize(850,500);
				this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				this.setLocationRelativeTo(null);
				this.setMinimumSize(new Dimension(500,500));
				this.setMaximumSize(new Dimension(850,500));
				this.setTitle("Inicio Sesion");
				this.setLayout(null);
				
			
				JPanel contenedor = new JPanel();
				contenedor.setOpaque(true);
				contenedor.setBackground(Color.decode("#0FBFFA"));
				contenedor.setSize(350,600);
				contenedor.setLayout(null);
				this.add(contenedor);
				
				
				JLabel title_login = new JLabel();
				title_login.setText("¡Bienvenido!");
				title_login.setSize(300,85);
				title_login.setOpaque(true);
				title_login.setLocation(30,120);
				title_login.setBackground(Color.decode("#0FBFFA"));
				title_login.setForeground(Color.white);
				title_login.setFont(new Font("Arial",Font.BOLD,37));
				title_login.setHorizontalAlignment(JLabel.CENTER);
				contenedor.add(title_login);
				
				JLabel crearTexto = new JLabel();

				crearTexto.setText(
				    "<html><div style='text-align:center;'>"
				    + "Ingresa tus datos para comenzar<br>"
				    + " y emprender tu nuevo<br>"
				    + "viaje con nosotros"
				    + "</div></html>"
				);

				crearTexto.setBounds(60,170,300,125);
				crearTexto.setOpaque(true);
				crearTexto.setBackground(Color.decode("#0FBFFA"));
				crearTexto.setForeground(Color.white);
				crearTexto.setFont(new Font("Calibri",Font.BOLD,18));
				contenedor.add(crearTexto);
				
				JButton crearCuenta = new JButton();
				crearCuenta.setText("Crear Cuenta");
				crearCuenta.setSize(150,50);
				crearCuenta.setLocation(100,300);
				crearCuenta.setBackground(Color.decode("#0F4AFA"));
				crearCuenta.setForeground(Color.white);
				crearCuenta.setFont(new Font("Arial",Font.BOLD,18));
				crearCuenta.setHorizontalAlignment(JLabel.LEFT);
				contenedor.add(crearCuenta);
				
				ImageIcon iconoPlane = new ImageIcon("D:/Santiago/ACT1P3/planeLogo.png");
				Image img3 = iconoPlane.getImage();
				Image imgEscalada3 = img3.getScaledInstance(120,120,Image.SCALE_SMOOTH);
				ImageIcon iconoFinal3 = new ImageIcon(imgEscalada3);

				JLabel etiquetaImagen3 = new JLabel(iconoFinal3);
				etiquetaImagen3.setBounds(120,10,120,120); 
				contenedor.add(etiquetaImagen3);
				
				JLabel tm = new JLabel();
				tm.setText("© 2026 VIALaPaz. Todos los derechos reservados.");
				tm.setBounds(35,400,500,40)	;			
				tm.setBackground(Color.decode("#0FBFFA"));
				tm.setForeground(Color.decode("#D8E2E8"));
				contenedor.add(tm);
				
				JLabel term = new JLabel();
				term.setText("Terminos y Condiciones  |   Políticas de privacidad");
				term.setBounds(35,420,500,40)	;			
				term.setBackground(Color.decode("#0FBFFA"));
				term.setForeground(Color.decode("#D8E2E8"));
				contenedor.add(term);
				
				contenedor.repaint();
				contenedor.revalidate();
				
				
				JPanel register_conteiner = new JPanel();
				register_conteiner.setOpaque(true);
				register_conteiner.setSize(600,500);
				register_conteiner.setLocation(350,0); 
				register_conteiner.setBackground(Color.white);
				register_conteiner.setLayout(null);
				this.add(register_conteiner);
				
				
				JLabel title_register = new JLabel();
				title_register.setText("INICIAR SESIÓN");
				title_register.setSize(330,75);
				title_register.setOpaque(true);
				title_register.setLocation(75,40);
				title_register.setBackground(Color.white);
				title_register.setForeground(Color.decode("#0FBFFA"));
				title_register.setFont(new Font("Arial",Font.BOLD,40));
				title_register.setHorizontalAlignment(JLabel.CENTER);
				register_conteiner.add(title_register);
				
				JLabel user_login = new JLabel();
				user_login.setText("Usuario o correo");
				user_login.setSize(200,30);
				user_login.setOpaque(true);
				user_login.setLocation(110,150);
				user_login.setBackground(Color.white);
				user_login.setForeground(Color.decode("#898F8D"));
				user_login.setFont(new Font("Calibri",Font.BOLD,18));
				user_login.setHorizontalAlignment(JLabel.LEFT);
				register_conteiner.add(user_login);
			
				ImageIcon iconoUser = new ImageIcon("D:/Santiago/ACT1P3/logousername.jpg");
				Image img = iconoUser.getImage();
				Image imgEscalada = img.getScaledInstance(30,30,Image.SCALE_SMOOTH);
				ImageIcon iconoFinal = new ImageIcon(imgEscalada);

				JLabel etiquetaImagen = new JLabel(iconoFinal);
				etiquetaImagen.setBounds(70,180,30,30); 
				register_conteiner.add(etiquetaImagen);
				
				JTextField username = new JTextField();
				username.setSize(300,35);
				username.setLocation(110,180);
				username.setFont(new Font("Courier New",Font.BOLD,20));
				username.setForeground(Color.decode("#858C8F"));   
				username.setBackground(Color.decode("#D8E2E8"));
				register_conteiner.add(username);
				
				JLabel contra_login = new JLabel();
				contra_login.setText("Contraseña");
				contra_login.setSize(200,30);
				contra_login.setOpaque(true);
				contra_login.setLocation(110,230);
				contra_login.setBackground(Color.white);
				contra_login.setForeground(Color.decode("#898F8D"));
				contra_login.setFont(new Font("Calibri",Font.BOLD,18));
				contra_login.setHorizontalAlignment(JLabel.LEFT);
				register_conteiner.add(contra_login);
				
				
				ImageIcon iconoPass = new ImageIcon("D:/Santiago/ACT1P3/passwordlogo.png");
				Image img2 = iconoPass.getImage();
				Image imgEscalada2 = img2.getScaledInstance(40,40,Image.SCALE_SMOOTH);
				ImageIcon iconoFinal2 = new ImageIcon(imgEscalada2);

				JLabel etiquetaImagen2 = new JLabel(iconoFinal2);
				etiquetaImagen2.setBounds(65,260,40,40); 
				register_conteiner.add(etiquetaImagen2);
				
				JPasswordField contraseña = new JPasswordField();
				contraseña.setSize(300,35);
				contraseña.setLocation(110,260);
				contraseña.setForeground(Color.decode("#858C8F"));   
				contraseña.setBackground(Color.decode("#D8E2E8"));
				contraseña.setFont(new Font("Calibri",Font.BOLD,18));
				register_conteiner.add(contraseña);
				
				JCheckBox recordar = new JCheckBox();
				recordar.setText("Recordarme");
				recordar.setSize(120,30);
				recordar.setLocation(110,300);
				recordar.setBackground(Color.white);
				recordar.setForeground(Color.decode("#898F8D"));
				recordar.setFont(new Font("Calibri", Font.BOLD, 18));
				register_conteiner.add(recordar);
				
				JLabel olvidar = new JLabel();
				olvidar.setText("¿Olvido su contraseña?");
				olvidar.setSize(230,30);
				olvidar.setLocation(250,300);
				olvidar.setBackground(Color.white);
				olvidar.setForeground(Color.decode("#0F4AFA"));
				olvidar.setFont(new Font("Calibri",Font.BOLD,18));
				register_conteiner.add(olvidar);
				
				JButton acceder = new JButton();
				acceder.setText("Iniciar sesión");
				acceder.setSize(150,50);
				acceder.setLocation(175,360);
				acceder.setBackground(Color.decode("#0FBFFA"));
				acceder.setForeground(Color.white);
				acceder.setFont(new Font("Arial",Font.BOLD,18));
				acceder.setHorizontalAlignment(JLabel.LEFT);
				register_conteiner.add(acceder);
				
				

				register_conteiner.repaint();
				register_conteiner.revalidate();
				
				
	}
}
	 

