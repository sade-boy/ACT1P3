package actividad1;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JPasswordField;

public class Ventana extends JFrame{

	public Ventana() {
				
				this.setVisible(true);
				this.setSize(500,500);
				this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				this.setLocationRelativeTo(null);
				this.setMinimumSize(new Dimension(400,400));
				this.setMaximumSize(new Dimension(800,800));
				this.setTitle("Inicio Sesion");
				this.setLayout(null);
			
				JPanel contenedor = new JPanel();
				contenedor.setOpaque(true);
				contenedor.setBackground(Color.BLUE);
				contenedor.setSize(800,600);
				contenedor.setLayout(null);
				
				this.add(contenedor);
				
				
				JLabel title_login = new JLabel();
				title_login.setText("¡BIENVENIDO!");
				title_login.setSize(300,85);
				title_login.setOpaque(true);
				title_login.setLocation(30,57);
				title_login.setBackground(Color.blue);
				title_login.setForeground(Color.white);
				title_login.setFont(new Font("Arial",Font.BOLD,37));
				title_login.setHorizontalAlignment(JLabel.LEFT);
				contenedor.add(title_login);
				
				JLabel user_login = new JLabel();
				user_login.setText("Usuario o correo");
				user_login.setSize(200,30);
				user_login.setOpaque(true);
				user_login.setLocation(30,160);
				user_login.setBackground(Color.blue);
				user_login.setForeground(Color.white);
				user_login.setFont(new Font("Arial",Font.BOLD,18));
				user_login.setHorizontalAlignment(JLabel.LEFT);
				contenedor.add(user_login);
				
				JTextField username = new JTextField();
				username.setSize(300,30);
				username.setLocation(30,200);
				username.setFont(new Font("Arial",Font.BOLD,18));
				contenedor.add(username);
				
				JLabel contra_login = new JLabel();
				contra_login.setText("Contraseña");
				contra_login.setSize(200,30);
				contra_login.setOpaque(true);
				contra_login.setLocation(30,250);
				contra_login.setBackground(Color.blue);
				contra_login.setForeground(Color.white);
				contra_login.setFont(new Font("Arial",Font.BOLD,18));
				contra_login.setHorizontalAlignment(JLabel.LEFT);
				contenedor.add(contra_login);
				
				
				JPasswordField contraseña = new JPasswordField();
				contraseña.setSize(300,34);
				contraseña.setLocation(30,290);
				contraseña.setFont(new Font("Arial",Font.BOLD,18));
				contenedor.add(contraseña);
				
				JCheckBox recordar = new JCheckBox();
				recordar.setText("Recordarme");
				recordar.setSize(200,30);
				recordar.setLocation(30,330);
				recordar.setBackground(Color.BLUE);
				recordar.setForeground(Color.WHITE);
				recordar.setFont(new Font("Arial", Font.BOLD, 16));
				contenedor.add(recordar);
				
				
				
				JButton acceder = new JButton();
				acceder.setText("Iniciar sesión");
				acceder.setSize(180,50);
				acceder.setLocation(30,380);
				acceder.setBackground(Color.magenta);
				acceder.setForeground(Color.white);
				acceder.setFont(new Font("Arial",Font.BOLD,18));
				contenedor.add(acceder);
				
				
				contenedor.repaint();
				contenedor.revalidate();
				
	}
}
	 

