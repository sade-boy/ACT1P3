package actividad1;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;

public class Actividad1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame ventana = new JFrame();
		
		ventana.setVisible(true);
		ventana.setSize(500,500);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setLocationRelativeTo(null);
		ventana.setMinimumSize(new Dimension(200,200));
		ventana.setMaximumSize(new Dimension(600,600));
		ventana.setTitle("PRUEBA");
		ventana.setBackground(Color.BLACK);
	}

}
