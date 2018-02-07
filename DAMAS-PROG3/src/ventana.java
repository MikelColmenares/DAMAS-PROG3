import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JTable;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JLabel;
import java.awt.GridLayout;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ventana extends JFrame implements MouseListener{
	JPanel[][] Panel = new JPanel[8][8];
	JLabel[][] label = new JLabel[15][8];
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
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
			}
		});
		lblNewLabel.setBounds(203, 192, 46, 14);
		getContentPane().add(lblNewLabel);
		
		
		/*
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(ventana.class.getResource("/com/sun/javafx/scene/control/skin/caspian/dialog-information.png")));
		lblNewLabel.setBounds(189, 77, 46, 14);
		getContentPane().add(lblNewLabel);
		*/
		
		
		
		
		Imagen Imagen = new Imagen();
		
		//ImageIcon icon = new ImageIcon("negro.png");
		
		int x=0,y=0,p=0,b=0,a=0,c=0;
		boolean cambio=false;
		//***TABLERO***
		for(int i=0;i<8;i++) {
			for(int j=0;j<8;j++) {
				Panel[i][j] = new JPanel();
				
				//Panel[i][j].add(Imagen);
				//Panel[i][j].repaint();
				if(p==0) {
					Panel[i][j].setBackground(Color.BLACK);
					Panel[i][j].setBounds(60+x, 11+y, 40, 40);
					getContentPane().add(Panel[i][j]);
				}else{
					Panel[i][j].setBackground(Color.white);
					Panel[i][j].setBounds(60+x, 11+y, 40, 40);
					getContentPane().add(Panel[i][j]);
				}
				
				
				x=x+41;

				/*if(p==0) {p=1;
					*
				}else {p=0;}*/
				if(p==0) {p=1;}else {p=0;} 
			}
			if(p==0) {p=1;}else {p=0;}
			x=0;
			y=y+41;
		}
		//horizontal,vertical,tamh,tamv
		
		
		
		//***FICHAS NEGRAS***
		int i=0,j=0;
		for( i=0;i<3;i++) {
			for( j=0;j<8;j++) {
				//Panel[i][j] = new JPanel();
				
				//Panel[i][j].add(Imagen);
				//Panel[i][j].repaint();
				if(p==1) {
					
					
					
					label[i][j] = new JLabel("New label");b++;
					label[i][j].setIcon(new ImageIcon(ventana.class.getResource("ficha negra.PNG")));
					
					/*Graphics g = null;
					g.create(350, 70, 50, 70);
					super.paint(g);
					g.setColor (Color.blue);
					g.drawOval (350, 70, 50, 70);
					Panel[i][j].
					label[i][j].addMouseListener(new MouseAdapter() {
						@Override
						public void mouseClicked(MouseEvent arg0) {
							Panel[i][j].setBorder(BorderFactory.createMatteBorder( 1, 1, 1, 1, Color.blue));
						}
					});*/
					
					
					label[i][j].setBounds(60+a, 11+c, 40, 40);
					getContentPane().add(label[i][j]);
					/*
					Panel[i][j].setBackground(Color.LIGHT_GRAY);
					Panel[i][j].setBounds(60+x, 11+y, 40, 40);
					getContentPane().add(Panel[i][j]);*/
				}
				a=a+41;
				/*if(p==0) {p=1;
					*
				}else {p=0;}*/
				if(p==0) {p=1;}else {p=0;}
			}
			if(p==0) {p=1;}else {p=0;}
			a=0;
			c=c+41;
		}
		
		
		//***FICHAS ROJAS***
		c=c+41*2;
		
		for( i=0;i<3;i++) {
			for( j=0;j<8;j++) {
				//Panel[i][j] = new JPanel();
				//Panel[i][j].add(Imagen);
				//Panel[i][j].repaint();
				if(p==1) {
					
					label[i][j] = new JLabel("New label");b++;
					label[i][j].setIcon(new ImageIcon(ventana.class.getResource("ficha roja.PNG")));
					label[i][j].addMouseListener(new MouseAdapter() {
						@Override
						public void mouseClicked(MouseEvent arg0) {
							
						}
					});
					label[i][j].setBounds(60+a, 11+c, 40, 40);
					getContentPane().add(label[i][j]);
					/*
					Panel[i][j].setBackground(Color.LIGHT_GRAY);
					Panel[i][j].setBounds(60+x, 11+y, 40, 40);
					getContentPane().add(Panel[i][j]);*/
				}
								
				a=a+41;

				/*if(p==0) {p=1;
					*
				}else {p=0;}*/
				if(p==0) {p=1;}else {p=0;}
			}
			if(p==0) {p=1;}else {p=0;}
			a=0;
			c=c+41;
		}
		
		
		
		
		
		
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		//Panel[i][j].setBorder(BorderFactory.createMatteBorder( 1, 1, 1, 1, Color.blue));
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
