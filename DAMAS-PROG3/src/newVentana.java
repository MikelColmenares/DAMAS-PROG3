import java.awt.*;
import java.awt.event.*;
import java.net.*;
import java.io.*;
import javax.swing.*;

public class newVentana extends JFrame {
	public newVentana() {
		
		super("Damas");
		
		JMenuBar menu = new JMenuBar();
		setJMenuBar(menu);
		
		
		final JDesktopPane mdiDamas = new JDesktopPane();
		getContentPane().add(mdiDamas);
		
		JMenu menuJuego = new JMenu("Juego");
		JMenuItem jugar = new JMenuItem("Jugar");
		jugar.addActionListener( 
			new ActionListener(){
				public void actionPerformed( ActionEvent e){
				Tablero Tablero = new Tablero(' ');
		      	//Tablero.reseteaTablero();
		      	//Tablero.posicionaJugador('A',0);
		      	//Tablero.posicionaJugador('B',40);
		      	Tablero.muestra(mdiDamas);
				}
			}
		);
		menuJuego.add(jugar);
		
		
		menuJuego.addSeparator();

		JMenuItem salir = new JMenuItem("Salir");
		salir.addActionListener( 
			new ActionListener(){
				public void actionPerformed( ActionEvent e){
					dispose();
					System.exit(0);
				}
			}
		);
		menuJuego.add(salir);
		menu.add(menuJuego);
		
		
		
		JMenu menuEstadisticas = new JMenu("Estadisticas");
		JMenuItem mItemServidor = new JMenuItem("Estadisticas");
		mItemServidor.addActionListener( 
			new ActionListener(){
				public void actionPerformed( ActionEvent e){
					Estadisticas est = new Estadisticas();
					est.main(null);
				}
			}
		); 
		menuEstadisticas.add(mItemServidor);
		menu.add(menuEstadisticas);
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				dispose();
				System.exit(0);
			}
		});
		show();
	}


	public static void main(String args[]) {
		System.out.println("Iniciando Damas");
		newVentana mainFrame = new newVentana();
		mainFrame.setSize(640, 480);
		mainFrame.setVisible(true);
	}
}
