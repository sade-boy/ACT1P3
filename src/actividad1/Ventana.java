package actividad1;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.ButtonGroup;
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
				this.setSize(1100,500);
				this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				this.setLocationRelativeTo(null);
				this.setMinimumSize(new Dimension(500,500));
				this.setMaximumSize(new Dimension(1100,500));
				this.setTitle("Inicio Sesion");
				this.setLayout(null);
			
				JPanel contenedor = new JPanel();
				contenedor.setOpaque(true);
				contenedor.setBackground(Color.BLUE);
				contenedor.setSize(500,600);
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
				recordar.setSize(120,30);
				recordar.setLocation(30,330);
				recordar.setBackground(Color.BLUE);
				recordar.setForeground(Color.WHITE);
				recordar.setFont(new Font("Arial", Font.BOLD, 16));
				contenedor.add(recordar);
				
				JButton olvidar = new JButton();
				olvidar.setText("¿Olvido su contraseña?");
				olvidar.setSize(210,30);
				olvidar.setLocation(150,330);
				olvidar.setBackground(Color.blue);
				olvidar.setForeground(Color.white);
				olvidar.setFont(new Font("Arial",Font.BOLD,16));
				contenedor.add(olvidar);
				
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
				
				JPanel register_conteiner = new JPanel();
				register_conteiner.setOpaque(true);
				register_conteiner.setSize(600,500);
				register_conteiner.setLocation(550,0); 
				register_conteiner.setBackground(Color.orange);
				register_conteiner.setLayout(null);

				this.add(register_conteiner);

				JLabel bio_tag = new JLabel();
				bio_tag.setText("REGISTRO");
				bio_tag.setBounds(123,10,250,40); 
				bio_tag.setBackground(Color.orange);
				bio_tag.setHorizontalAlignment(JLabel.CENTER);
				bio_tag.setForeground(Color.WHITE);
				bio_tag.setOpaque(true);
				bio_tag.setFont(new Font("Arial",Font.BOLD,22));
				register_conteiner.add(bio_tag);

				JLabel nombre_us = new JLabel();
				nombre_us.setText("Nombre de usuario:");
				nombre_us.setSize(200,30);
				nombre_us.setOpaque(true);
				nombre_us.setLocation(100,48); 
				nombre_us.setBackground(Color.orange);
				nombre_us.setForeground(Color.white);
				nombre_us.setFont(new Font("Arial",Font.BOLD,18));
				nombre_us.setHorizontalAlignment(JLabel.LEFT);
				register_conteiner.add(nombre_us);

				JTextField nametag = new JTextField();
				nametag.setSize(300,27);
				nametag.setLocation(100,80); 
				nametag.setFont(new Font("Arial",Font.BOLD,18));
				register_conteiner.add(nametag);

				JLabel user_bio= new JLabel();
				user_bio.setText("Biografia:");
				user_bio.setSize(100,30);
				user_bio.setOpaque(true);
				user_bio.setLocation(100,110); 
				user_bio.setBackground(Color.orange);
				user_bio.setForeground(Color.white);
				user_bio.setFont(new Font("Arial",Font.BOLD,18));
				user_bio.setHorizontalAlignment(JLabel.LEFT);
				register_conteiner.add(user_bio);

				JTextArea bio_text = new JTextArea();
				bio_text.setBounds(100, 140,300, 80); 
				bio_text.setFont(new Font("Arial",Font.BOLD,22));
				bio_text.setBackground(Color.white);
				register_conteiner.add(bio_text);

				JLabel prefer= new JLabel();
				prefer.setText("Preferencias:");
				prefer.setSize(140,30);
				prefer.setOpaque(true);
				prefer.setLocation(100,230);
				prefer.setBackground(Color.orange);
				prefer.setForeground(Color.white);
				prefer.setFont(new Font("Arial",Font.BOLD,18));
				prefer.setHorizontalAlignment(JLabel.LEFT);
				register_conteiner.add(prefer);

				JCheckBox sweet = new JCheckBox();
				sweet.setText("Dulce");
				sweet.setSize(70,30);
				sweet.setLocation(100,260); 
				sweet.setBackground(Color.orange);
				sweet.setForeground(Color.WHITE);
				sweet.setFont(new Font("Arial", Font.BOLD, 16));
				register_conteiner.add(sweet);

				JCheckBox salty = new JCheckBox();
				salty.setText("Salado");
				salty.setSize(80,30);
				salty.setLocation(210,260); 
				salty.setBackground(Color.orange);
				salty.setForeground(Color.WHITE);
				salty.setFont(new Font("Arial", Font.BOLD, 16));
				register_conteiner.add(salty);

				JCheckBox otro = new JCheckBox();
				otro.setText("Otro");
				otro.setSize(80,30);
				otro.setLocation(330,260);
				otro.setBackground(Color.orange);
				otro.setForeground(Color.WHITE);
				otro.setFont(new Font("Arial", Font.BOLD, 16));
				register_conteiner.add(otro);
				
				JLabel terminos= new JLabel();
				terminos.setText("Terminos");
				terminos.setSize(200,30);
				terminos.setOpaque(true);
				terminos.setLocation(150,290); 
				terminos.setBackground(Color.red);
				terminos.setForeground(Color.white);
				terminos.setFont(new Font("Arial",Font.BOLD,22));
				terminos.setHorizontalAlignment(JLabel.CENTER);
				register_conteiner.add(terminos);

				JRadioButton accept_terms = new JRadioButton("Aceptar");
				accept_terms.setBounds(100,320,100,30);
				accept_terms.setBackground(Color.orange);
				accept_terms.setForeground(Color.WHITE);
				accept_terms.setFont(new Font("Arial",Font.BOLD,16));
				register_conteiner.add(accept_terms);

				JRadioButton reject_terms = new JRadioButton("Rechazar");
				reject_terms.setBounds(280,320,100,30); 
				reject_terms.setBackground(Color.orange);
				reject_terms.setForeground(Color.WHITE);
				reject_terms.setFont(new Font("Arial",Font.BOLD,16));
				register_conteiner.add(reject_terms);

				ButtonGroup terms = new ButtonGroup();
				terms.add(reject_terms);
				terms.add(accept_terms);
				
				String colonia[] = {"esterito","camino real","loma linda"};
				
				JLabel resi = new JLabel("Residencia");
				resi.setBounds(400,77,300,100);
				resi.setForeground(Color.white);
				resi.setFont(new Font("Arial", Font.BOLD,18));
				register_conteiner.add(resi);
				
				JComboBox list = new JComboBox(colonia);
				list.setBounds(400,140,100,20);
				register_conteiner.add(list);
				
				JButton crear_cuenta = new JButton();
				crear_cuenta.setText("Crear cuenta");
				crear_cuenta.setSize(180,50);
				crear_cuenta.setLocation(160,400);
				crear_cuenta.setBackground(Color.green);
				crear_cuenta.setForeground(Color.white);
				crear_cuenta.setFont(new Font("Arial",Font.BOLD,18));
				register_conteiner.add(crear_cuenta);

				register_conteiner.repaint();
				register_conteiner.revalidate();
				
				
	}
}
	 

