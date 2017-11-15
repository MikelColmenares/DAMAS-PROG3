import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JTable;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JLabel;
import java.awt.GridLayout;
import java.awt.Color;

public class ventana extends JFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ventana frame = new ventana();
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
	public ventana() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 500);
		getContentPane().setLayout(null);
		
		
		/*
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(ventana.class.getResource("/com/sun/javafx/scene/control/skin/caspian/dialog-information.png")));
		lblNewLabel.setBounds(189, 77, 46, 14);
		getContentPane().add(lblNewLabel);
		*/
		
		JLabel[][] label = new JLabel[15][8];
		
		
		Imagen Imagen = new Imagen();
		
		//ImageIcon icon = new ImageIcon("negro.png");
		JPanel[][] Panel = new JPanel[8][8];
		int x=0,y=0,p=0,b=0;
		for(int i=0;i<8;i++) {
			for(int j=0;j<8;j++) {
				Panel[i][j] = new JPanel();
				
				//Panel[i][j].add(Imagen);
				//Panel[i][j].repaint();
				if(p==0) {
					Panel[i][j].setBackground(Color.BLACK);
				}else {
					Panel[i][j].setBackground(Color.LIGHT_GRAY);
				}
				Panel[i][j].setBounds(60+x, 11+y, 40, 40);
				getContentPane().add(Panel[i][j]);
				
				x=x+41;
				if(p==0) {p=1;
					label[i][j] = new JLabel("New label");b++;
					label[i][j].setIcon(new ImageIcon(ventana.class.getResource("ficha negra.PNG")));
					label[i][j].setBounds(60+x, 11+y, 40, 40);
					getContentPane().add(label[i][j]);
				}else {p=0;}
			}
			if(p==0) {p=1;}else {p=0;}
			x=0;
			y=y+41;
		}
		//horizontal,vertical,tamh,tamv
		
	}
}
