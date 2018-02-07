import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Canvas;

public class NuevaVentana extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NuevaVentana frame = new NuevaVentana();
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
	public NuevaVentana() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(8, 8, 0, 0));
		
		tablero();
		
		
			
	}
	
	public void tablero(){
		JPanel panel_63 = new JPanel();
		panel_63.setBackground(Color.BLACK);
		panel_63.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				panel_63.setBorder(BorderFactory.createMatteBorder( 1, 1, 1, 1, Color.blue));
				
			}
		});
		contentPane.add(panel_63);
		
		Canvas canvas = new Canvas();
		panel_63.add(canvas);
		
		JPanel panel_62 = new JPanel();
		panel_62.setBackground(Color.white);
		panel_62.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				panel_62.setBorder(BorderFactory.createMatteBorder( 1, 1, 1, 1, Color.blue));
				panel_62.setBorder(BorderFactory.createMatteBorder( 1, 1, 1, 1, Color.blue));
			}
		});
		contentPane.add(panel_62);
		
		JPanel panel_61 = new JPanel();
		panel_61.setBackground(Color.BLACK);
		panel_61.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				panel_61.setBorder(BorderFactory.createMatteBorder( 1, 1, 1, 1, Color.blue));
				panel_61.setBorder(BorderFactory.createMatteBorder( 1, 1, 1, 1, Color.blue));
			}
		});
		contentPane.add(panel_61);
		
		JPanel panel_60 = new JPanel();
		panel_60.setBackground(Color.white);
		panel_60.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				panel_60.setBorder(BorderFactory.createMatteBorder( 1, 1, 1, 1, Color.blue));
				panel_60.setBorder(BorderFactory.createMatteBorder( 1, 1, 1, 1, Color.blue));
			}
		});
		contentPane.add(panel_60);
		
		JPanel panel_59 = new JPanel();
		panel_59.setBackground(Color.BLACK);
		panel_59.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				panel_59.setBorder(BorderFactory.createMatteBorder( 1, 1, 1, 1, Color.blue));
				panel_59.setBorder(BorderFactory.createMatteBorder( 1, 1, 1, 1, Color.blue));
			}
		});
		contentPane.add(panel_59);
		
		JPanel panel_58 = new JPanel();
		panel_58.setBackground(Color.white);
		panel_58.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				panel_58.setBorder(BorderFactory.createMatteBorder( 1, 1, 1, 1, Color.blue));
				panel_58.setBorder(BorderFactory.createMatteBorder( 1, 1, 1, 1, Color.blue));
			}
		});
		contentPane.add(panel_58);
		
		JPanel panel_57 = new JPanel();
		panel_57.setBackground(Color.BLACK);
		panel_57.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				panel_57.setBorder(BorderFactory.createMatteBorder( 1, 1, 1, 1, Color.blue));
				panel_57.setBorder(BorderFactory.createMatteBorder( 1, 1, 1, 1, Color.blue));
			}
		});
		contentPane.add(panel_57);
		
		JPanel panel_56 = new JPanel();
		panel_56.setBackground(Color.white);
		panel_56.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				panel_56.setBorder(BorderFactory.createMatteBorder( 1, 1, 1, 1, Color.blue));
				panel_56.setBorder(BorderFactory.createMatteBorder( 1, 1, 1, 1, Color.blue));
			}
		});
		contentPane.add(panel_56);
		
		JPanel panel_55 = new JPanel();
		panel_55.setBackground(Color.white);
		panel_55.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				panel_55.setBorder(BorderFactory.createMatteBorder( 1, 1, 1, 1, Color.blue));
				panel_55.setBorder(BorderFactory.createMatteBorder( 1, 1, 1, 1, Color.blue));
			}
		});
		contentPane.add(panel_55);
		
		JPanel panel_54 = new JPanel();
		panel_54.setBackground(Color.BLACK);
		panel_54.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				panel_54.setBorder(BorderFactory.createMatteBorder( 1, 1, 1, 1, Color.blue));
				panel_54.setBorder(BorderFactory.createMatteBorder( 1, 1, 1, 1, Color.blue));
			}
		});
		contentPane.add(panel_54);
		
		JPanel panel_53 = new JPanel();
		panel_53.setBackground(Color.white);
		panel_53.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				panel_53.setBorder(BorderFactory.createMatteBorder( 1, 1, 1, 1, Color.blue));
				panel_53.setBorder(BorderFactory.createMatteBorder( 1, 1, 1, 1, Color.blue));
			}
		});
		contentPane.add(panel_53);
		
		JPanel panel_52 = new JPanel();
		panel_52.setBackground(Color.BLACK);
		panel_52.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				panel_52.setBorder(BorderFactory.createMatteBorder( 1, 1, 1, 1, Color.blue));
				panel_52.setBorder(BorderFactory.createMatteBorder( 1, 1, 1, 1, Color.blue));
			}
		});
		contentPane.add(panel_52);
		
		JPanel panel_51 = new JPanel();
		panel_51.setBackground(Color.white);
		panel_51.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				panel_51.setBorder(BorderFactory.createMatteBorder( 1, 1, 1, 1, Color.blue));
				panel_51.setBorder(BorderFactory.createMatteBorder( 1, 1, 1, 1, Color.blue));
			}
		});
		contentPane.add(panel_51);
		
		JPanel panel_50 = new JPanel();
		panel_50.setBackground(Color.BLACK);
		panel_50.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				panel_50.setBorder(BorderFactory.createMatteBorder( 1, 1, 1, 1, Color.blue));
				panel_50.setBorder(BorderFactory.createMatteBorder( 1, 1, 1, 1, Color.blue));
			}
		});
		contentPane.add(panel_50);
		
		JPanel panel_49 = new JPanel();
		panel_49.setBackground(Color.white);
		panel_49.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				panel_49.setBorder(BorderFactory.createMatteBorder( 1, 1, 1, 1, Color.blue));
				panel_49.setBorder(BorderFactory.createMatteBorder( 1, 1, 1, 1, Color.blue));
			}
		});
		contentPane.add(panel_49);
		
		JPanel panel_48 = new JPanel();
		panel_48.setBackground(Color.BLACK);
		panel_48.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				panel_48.setBorder(BorderFactory.createMatteBorder( 1, 1, 1, 1, Color.blue));
				panel_48.setBorder(BorderFactory.createMatteBorder( 1, 1, 1, 1, Color.blue));
			}
		});
		contentPane.add(panel_48);
		
		JPanel panel_47 = new JPanel();
		panel_47.setBackground(Color.BLACK);
		panel_47.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				panel_47.setBorder(BorderFactory.createMatteBorder( 1, 1, 1, 1, Color.blue));
				panel_47.setBorder(BorderFactory.createMatteBorder( 1, 1, 1, 1, Color.blue));
			}
		});
		contentPane.add(panel_47);
		
		JPanel panel_46 = new JPanel();
		panel_46.setBackground(Color.white);
		panel_46.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				panel_46.setBorder(BorderFactory.createMatteBorder( 1, 1, 1, 1, Color.blue));
				panel_46.setBorder(BorderFactory.createMatteBorder( 1, 1, 1, 1, Color.blue));
			}
		});
		contentPane.add(panel_46);
		
		JPanel panel_45 = new JPanel();
		panel_45.setBackground(Color.BLACK);
		panel_45.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				panel_45.setBorder(BorderFactory.createMatteBorder( 1, 1, 1, 1, Color.blue));
				panel_45.setBorder(BorderFactory.createMatteBorder( 1, 1, 1, 1, Color.blue));
			}
		});
		contentPane.add(panel_45);
		
		JPanel panel_44 = new JPanel();
		panel_44.setBackground(Color.white);
		panel_44.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				panel_44.setBorder(BorderFactory.createMatteBorder( 1, 1, 1, 1, Color.blue));
				panel_44.setBorder(BorderFactory.createMatteBorder( 1, 1, 1, 1, Color.blue));
			}
		});
		contentPane.add(panel_44);
		
		JPanel panel_43 = new JPanel();
		panel_43.setBackground(Color.BLACK);
		panel_43.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				panel_43.setBorder(BorderFactory.createMatteBorder( 1, 1, 1, 1, Color.blue));
				panel_43.setBorder(BorderFactory.createMatteBorder( 1, 1, 1, 1, Color.blue));
			}
		});
		contentPane.add(panel_43);
		
		JPanel panel_42 = new JPanel();
		panel_42.setBackground(Color.white);
		panel_42.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				panel_42.setBorder(BorderFactory.createMatteBorder( 1, 1, 1, 1, Color.blue));
				panel_42.setBorder(BorderFactory.createMatteBorder( 1, 1, 1, 1, Color.blue));
			}
		});
		contentPane.add(panel_42);
		
		JPanel panel_41 = new JPanel();
		panel_41.setBackground(Color.BLACK);
		panel_41.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				panel_41.setBorder(BorderFactory.createMatteBorder( 1, 1, 1, 1, Color.blue));
				panel_41.setBorder(BorderFactory.createMatteBorder( 1, 1, 1, 1, Color.blue));
			}
		});
		contentPane.add(panel_41);
		
		JPanel panel_40 = new JPanel();
		panel_40.setBackground(Color.white);
		panel_40.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				panel_40.setBorder(BorderFactory.createMatteBorder( 1, 1, 1, 1, Color.blue));
				panel_40.setBorder(BorderFactory.createMatteBorder( 1, 1, 1, 1, Color.blue));
			}
		});
		contentPane.add(panel_40);
		
		JPanel panel_39 = new JPanel();
		panel_39.setBackground(Color.white);
		panel_39.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				panel_39.setBorder(BorderFactory.createMatteBorder( 1, 1, 1, 1, Color.blue));
				panel_39.setBorder(BorderFactory.createMatteBorder( 1, 1, 1, 1, Color.blue));
			}
		});
		contentPane.add(panel_39);
		
		JPanel panel_38 = new JPanel();
		panel_38.setBackground(Color.BLACK);
		panel_38.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				panel_38.setBorder(BorderFactory.createMatteBorder( 1, 1, 1, 1, Color.blue));
				panel_38.setBorder(BorderFactory.createMatteBorder( 1, 1, 1, 1, Color.blue));
			}
		});
		contentPane.add(panel_38);
		
		JPanel panel_37 = new JPanel();
		panel_37.setBackground(Color.white);
		panel_37.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				panel_37.setBorder(BorderFactory.createMatteBorder( 1, 1, 1, 1, Color.blue));
				panel_37.setBorder(BorderFactory.createMatteBorder( 1, 1, 1, 1, Color.blue));
			}
		});
		contentPane.add(panel_37);
		
		JPanel panel_36 = new JPanel();
		panel_36.setBackground(Color.BLACK);
		panel_36.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				panel_36.setBorder(BorderFactory.createMatteBorder( 1, 1, 1, 1, Color.blue));
				panel_36.setBorder(BorderFactory.createMatteBorder( 1, 1, 1, 1, Color.blue));
			}
		});
		contentPane.add(panel_36);
		
		JPanel panel_35 = new JPanel();
		panel_35.setBackground(Color.white);
		panel_35.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				panel_35.setBorder(BorderFactory.createMatteBorder( 1, 1, 1, 1, Color.blue));
				panel_35.setBorder(BorderFactory.createMatteBorder( 1, 1, 1, 1, Color.blue));
			}
		});
		contentPane.add(panel_35);
		
		JPanel panel_34 = new JPanel();
		panel_34.setBackground(Color.BLACK);
		panel_34.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				panel_34.setBorder(BorderFactory.createMatteBorder( 1, 1, 1, 1, Color.blue));
				panel_34.setBorder(BorderFactory.createMatteBorder( 1, 1, 1, 1, Color.blue));
			}
		});
		contentPane.add(panel_34);
		
		JPanel panel_33 = new JPanel();
		panel_33.setBackground(Color.white);
		panel_33.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				panel_33.setBorder(BorderFactory.createMatteBorder( 1, 1, 1, 1, Color.blue));
				panel_33.setBorder(BorderFactory.createMatteBorder( 1, 1, 1, 1, Color.blue));
			}
		});
		contentPane.add(panel_33);
		
		JPanel panel_32 = new JPanel();
		panel_32.setBackground(Color.BLACK);
		panel_32.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				panel_32.setBorder(BorderFactory.createMatteBorder( 1, 1, 1, 1, Color.blue));
				panel_32.setBorder(BorderFactory.createMatteBorder( 1, 1, 1, 1, Color.blue));
			}
		});
		contentPane.add(panel_32);
		
		JPanel panel_31 = new JPanel();
		panel_31.setBackground(Color.BLACK);
		panel_31.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				panel_31.setBorder(BorderFactory.createMatteBorder( 1, 1, 1, 1, Color.blue));
				panel_31.setBorder(BorderFactory.createMatteBorder( 1, 1, 1, 1, Color.blue));
			}
		});
		contentPane.add(panel_31);
		
		JPanel panel_30 = new JPanel();
		panel_30.setBackground(Color.white);
		panel_30.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				panel_30.setBorder(BorderFactory.createMatteBorder( 1, 1, 1, 1, Color.blue));
				panel_30.setBorder(BorderFactory.createMatteBorder( 1, 1, 1, 1, Color.blue));
			}
		});
		contentPane.add(panel_30);
		
		JPanel panel_29 = new JPanel();
		panel_29.setBackground(Color.BLACK);
		panel_29.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				panel_29.setBorder(BorderFactory.createMatteBorder( 1, 1, 1, 1, Color.blue));
				panel_29.setBorder(BorderFactory.createMatteBorder( 1, 1, 1, 1, Color.blue));
			}
		});
		contentPane.add(panel_29);
		
		JPanel panel_28 = new JPanel();
		panel_28.setBackground(Color.white);
		panel_28.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				panel_28.setBorder(BorderFactory.createMatteBorder( 1, 1, 1, 1, Color.blue));
				panel_28.setBorder(BorderFactory.createMatteBorder( 1, 1, 1, 1, Color.blue));
			}
		});
		contentPane.add(panel_28);
		
		JPanel panel_27 = new JPanel();
		panel_27.setBackground(Color.BLACK);
		panel_27.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				panel_27.setBorder(BorderFactory.createMatteBorder( 1, 1, 1, 1, Color.blue));
				panel_27.setBorder(BorderFactory.createMatteBorder( 1, 1, 1, 1, Color.blue));
			}
		});
		contentPane.add(panel_27);
		
		JPanel panel_26 = new JPanel();
		panel_26.setBackground(Color.white);
		panel_26.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				panel_26.setBorder(BorderFactory.createMatteBorder( 1, 1, 1, 1, Color.blue));
				panel_26.setBorder(BorderFactory.createMatteBorder( 1, 1, 1, 1, Color.blue));
			}
		});
		contentPane.add(panel_26);
		
		JPanel panel_25 = new JPanel();
		panel_25.setBackground(Color.BLACK);
		panel_25.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				panel_25.setBorder(BorderFactory.createMatteBorder( 1, 1, 1, 1, Color.blue));
				panel_25.setBorder(BorderFactory.createMatteBorder( 1, 1, 1, 1, Color.blue));
			}
		});
		contentPane.add(panel_25);
		
		JPanel panel_24 = new JPanel();
		panel_24.setBackground(Color.white);
		panel_24.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				panel_24.setBorder(BorderFactory.createMatteBorder( 1, 1, 1, 1, Color.blue));
				panel_24.setBorder(BorderFactory.createMatteBorder( 1, 1, 1, 1, Color.blue));
			}
		});
		contentPane.add(panel_24);
		
		JPanel panel_23 = new JPanel();
		panel_23.setBackground(Color.white);
		panel_23.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				panel_23.setBorder(BorderFactory.createMatteBorder( 1, 1, 1, 1, Color.blue));
				panel_23.setBorder(BorderFactory.createMatteBorder( 1, 1, 1, 1, Color.blue));
			}
		});
		contentPane.add(panel_23);
		
		JPanel panel_22 = new JPanel();
		panel_22.setBackground(Color.BLACK);
		panel_22.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				panel_22.setBorder(BorderFactory.createMatteBorder( 1, 1, 1, 1, Color.blue));
				panel_22.setBorder(BorderFactory.createMatteBorder( 1, 1, 1, 1, Color.blue));
			}
		});
		contentPane.add(panel_22);
		
		JPanel panel_21 = new JPanel();
		panel_21.setBackground(Color.white);
		panel_21.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				panel_21.setBorder(BorderFactory.createMatteBorder( 1, 1, 1, 1, Color.blue));
				panel_21.setBorder(BorderFactory.createMatteBorder( 1, 1, 1, 1, Color.blue));
			}
		});
		contentPane.add(panel_21);
		
		JPanel panel_20 = new JPanel();
		panel_20.setBackground(Color.BLACK);
		panel_20.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				panel_20.setBorder(BorderFactory.createMatteBorder( 1, 1, 1, 1, Color.blue));
				panel_20.setBorder(BorderFactory.createMatteBorder( 1, 1, 1, 1, Color.blue));
			}
		});
		contentPane.add(panel_20);
		
		JPanel panel_19 = new JPanel();
		panel_19.setBackground(Color.white);
		panel_19.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				panel_19.setBorder(BorderFactory.createMatteBorder( 1, 1, 1, 1, Color.blue));
				panel_19.setBorder(BorderFactory.createMatteBorder( 1, 1, 1, 1, Color.blue));
			}
		});
		contentPane.add(panel_19);
		
		JPanel panel_18 = new JPanel();
		panel_18.setBackground(Color.BLACK);
		panel_18.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				panel_18.setBorder(BorderFactory.createMatteBorder( 1, 1, 1, 1, Color.blue));
				panel_18.setBorder(BorderFactory.createMatteBorder( 1, 1, 1, 1, Color.blue));
			}
		});
		contentPane.add(panel_18);
		
		JPanel panel_17 = new JPanel();
		panel_17.setBackground(Color.white);
		panel_17.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				panel_17.setBorder(BorderFactory.createMatteBorder( 1, 1, 1, 1, Color.blue));
				panel_17.setBorder(BorderFactory.createMatteBorder( 1, 1, 1, 1, Color.blue));
			}
		});
		contentPane.add(panel_17);
		
		JPanel panel_16 = new JPanel();
		panel_16.setBackground(Color.BLACK);
		panel_16.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				panel_16.setBorder(BorderFactory.createMatteBorder( 1, 1, 1, 1, Color.blue));
				panel_16.setBorder(BorderFactory.createMatteBorder( 1, 1, 1, 1, Color.blue));
			}
		});
		contentPane.add(panel_16);
		
		JPanel panel_15 = new JPanel();
		panel_15.setBackground(Color.BLACK);
		panel_15.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				panel_15.setBorder(BorderFactory.createMatteBorder( 1, 1, 1, 1, Color.blue));
				panel_15.setBorder(BorderFactory.createMatteBorder( 1, 1, 1, 1, Color.blue));
			}
		});
		contentPane.add(panel_15);
		
		JPanel panel_14 = new JPanel();
		panel_14.setBackground(Color.white);
		panel_14.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				panel_14.setBorder(BorderFactory.createMatteBorder( 1, 1, 1, 1, Color.blue));
				panel_14.setBorder(BorderFactory.createMatteBorder( 1, 1, 1, 1, Color.blue));
			}
		});
		contentPane.add(panel_14);
		
		JPanel panel_13 = new JPanel();
		panel_13.setBackground(Color.BLACK);
		panel_13.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				panel_13.setBorder(BorderFactory.createMatteBorder( 1, 1, 1, 1, Color.blue));
				panel_13.setBorder(BorderFactory.createMatteBorder( 1, 1, 1, 1, Color.blue));
			}
		});
		contentPane.add(panel_13);
		
		JPanel panel_12 = new JPanel();
		panel_12.setBackground(Color.white);
		panel_12.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				panel_12.setBorder(BorderFactory.createMatteBorder( 1, 1, 1, 1, Color.blue));
				panel_12.setBorder(BorderFactory.createMatteBorder( 1, 1, 1, 1, Color.blue));
			}
		});
		contentPane.add(panel_12);
		
		JPanel panel_11 = new JPanel();
		panel_11.setBackground(Color.BLACK);
		panel_11.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				panel_11.setBorder(BorderFactory.createMatteBorder( 1, 1, 1, 1, Color.blue));
				panel_11.setBorder(BorderFactory.createMatteBorder( 1, 1, 1, 1, Color.blue));
			}
		});
		contentPane.add(panel_11);
		
		JPanel panel_10 = new JPanel();
		panel_10.setBackground(Color.white);
		panel_10.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				panel_10.setBorder(BorderFactory.createMatteBorder( 1, 1, 1, 1, Color.blue));
				panel_10.setBorder(BorderFactory.createMatteBorder( 1, 1, 1, 1, Color.blue));
			}
		});
		contentPane.add(panel_10);
		
		JPanel panel_9 = new JPanel();
		panel_9.setBackground(Color.BLACK);
		panel_9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				panel_9.setBorder(BorderFactory.createMatteBorder( 1, 1, 1, 1, Color.blue));
				panel_9.setBorder(BorderFactory.createMatteBorder( 1, 1, 1, 1, Color.blue));
			}
		});
		contentPane.add(panel_9);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBackground(Color.white);
		panel_8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				panel_8.setBorder(BorderFactory.createMatteBorder( 1, 1, 1, 1, Color.blue));
				panel_8.setBorder(BorderFactory.createMatteBorder( 1, 1, 1, 1, Color.blue));
			}
		});
		contentPane.add(panel_8);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBackground(Color.white);
		panel_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				panel_7.setBorder(BorderFactory.createMatteBorder( 1, 1, 1, 1, Color.blue));
				panel_7.setBorder(BorderFactory.createMatteBorder( 1, 1, 1, 1, Color.blue));
			}
		});
		contentPane.add(panel_7);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(Color.BLACK);
		panel_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				panel_6.setBorder(BorderFactory.createMatteBorder( 1, 1, 1, 1, Color.blue));
				panel_6.setBorder(BorderFactory.createMatteBorder( 1, 1, 1, 1, Color.blue));
			}
		});
		contentPane.add(panel_6);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(Color.white);
		panel_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				panel_5.setBorder(BorderFactory.createMatteBorder( 1, 1, 1, 1, Color.blue));
				panel_5.setBorder(BorderFactory.createMatteBorder( 1, 1, 1, 1, Color.blue));
			}
		});
		contentPane.add(panel_5);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(Color.BLACK);
		panel_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				panel_4.setBorder(BorderFactory.createMatteBorder( 1, 1, 1, 1, Color.blue));
				panel_4.setBorder(BorderFactory.createMatteBorder( 1, 1, 1, 1, Color.blue));
			}
		});
		contentPane.add(panel_4);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.white);
		panel_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				panel_3.setBorder(BorderFactory.createMatteBorder( 1, 1, 1, 1, Color.blue));
				panel_3.setBorder(BorderFactory.createMatteBorder( 1, 1, 1, 1, Color.blue));
			}
		});
		contentPane.add(panel_3);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.BLACK);
		panel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				panel_2.setBorder(BorderFactory.createMatteBorder( 1, 1, 1, 1, Color.blue));
				panel_2.setBorder(BorderFactory.createMatteBorder( 1, 1, 1, 1, Color.blue));
			}
		});
		contentPane.add(panel_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.white);
		panel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				panel_1.setBorder(BorderFactory.createMatteBorder( 1, 1, 1, 1, Color.blue));
				panel_1.setBorder(BorderFactory.createMatteBorder( 1, 1, 1, 1, Color.blue));
			}
		});
		contentPane.add(panel_1);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLACK);
		panel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				panel.setBorder(BorderFactory.createMatteBorder( 1, 1, 1, 1, Color.blue));
				panel.setBorder(BorderFactory.createMatteBorder( 1, 1, 1, 1, Color.blue));
			}
		});
		contentPane.add(panel);
	}
	
	public void paint(Graphics g){
		 super.paintComponents(g);
         g.setColor(Color.red);   
         g.drawOval(350, 70, 50, 70);

	}
}
