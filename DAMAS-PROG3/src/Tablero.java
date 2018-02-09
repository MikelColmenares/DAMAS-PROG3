import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.net.*;
import java.io.*;

public class Tablero extends JInternalFrame implements MouseListener, MouseMotionListener { 
   	private Container container;
   	private GridBagLayout gbLayout;
   	private GridBagConstraints gbConstraints; 
   	private Casilla casilla[][] = new Casilla[8][8];
   	char tablero[][] = new char[8][8];
    private int selx = -1;
    private int sely = -1;
    private Color color1 = new Color(26,189,79);
    private Color color2 = new Color(34,87,225);
    private byte pcA = 0;
    private byte pcB = 0;
    private char vez = 'A';
    private char eu = ' ';
    public boolean bloq = false;
    private String jugadorA = "";
    private String jugadorB = "";
    private ObjectOutputStream output;
    private boolean rede = false;
    private usaBD bd;
    private int fichasA=12, fichasB=12;
   	//IA ia = new IA();
    
    public char[][] getTablero() {
		return tablero;
	}

	public void setTablero(char[][] tablero) {
		this.tablero = tablero;
	}

	public Tablero(char me){

		super("Test",true, true);
		
		eu = me;
		
		int lin;
		int col;

		setTitle( "El juego de las damas" );

		addMouseListener( this );
		addMouseMotionListener( this );
		
		container = getContentPane();
		gbLayout = new GridBagLayout();
		container.setLayout(gbLayout);   
		gbConstraints = new GridBagConstraints();
		gbConstraints.fill = GridBagConstraints.BOTH;
		gbConstraints.weightx = 1;
		gbConstraints.weighty = 1;
      	for (lin = 0; lin < 8; lin++)
      	{
			for (col = 0; col < 8; col++)      	
      		{
				//inicializa casilla
      			casilla[lin][col] = new Casilla();      			
      			addComponent(casilla[lin][col],lin,col,1,1);
      		}
        }

      	reseteaTablero();
      	
      	posicionaJugador('A',0);
      	posicionaJugador('B',40);
      		
      	setSize(400,400);
     	
    }

	public void setOutput(ObjectOutputStream oos){
		output = oos;
		try {
			output.flush();
	    }
	    catch ( IOException io ) {
	        io.printStackTrace();
	    }

	}

	public void modoRede(boolean r)
	{
		rede = r;
	}

    public void reseteaTablero()
    {
		int posX = 0;
      	int posY = 0;
	
	  	//Define las posiciones posibles de las damas
      	for (posX = 0; posX < 8; posX++)
      	{
      		for (posY = 0; posY < 8; posY++)
      		{
      			
      			if (posX % 2 == 0)
      			{
      				if (posY % 2 == 0)
      					tablero[posX][posY] = ' ';
      				else
      					tablero[posX][posY] = '*';
      			}
      			else
      			{
      				if (posY % 2 != 0)
      					tablero[posX][posY] = ' ';
      				else
      					tablero[posX][posY] = '*';
      			}
      			
      			if (tablero[posX][posY] == '*')
      			{
					casilla[posX][posY].setBackground(Color.black);
					casilla[posX][posY].setForeground(Color.black);
	  			}
      			else
      			{
      				casilla[posX][posY].setBackground(Color.white);
      				casilla[posX][posY].setForeground(Color.white);
      			}
      		}
      	}
	}

	public void posicionaJugador(char Jugador, int posInicial)
	{
		int cont;
		int pos = 0;
		
		if (Jugador=='A'||Jugador=='B'){
			for (cont=0; cont<12; cont++){
				while(pos < 32){
					if (tablero[(pos+posInicial)/8][(int)((pos+posInicial)%8)]==' '){
						tablero[(pos+posInicial)/8][(int)((pos+posInicial)%8)]=Jugador;
						if (Jugador=='A'){
							casilla[(pos+posInicial)/8][(int)((pos+posInicial)%8)].setForeground(color1);
							pcA++;
						}
						else if (Jugador=='B'){
							casilla[(pos+posInicial)/8][(int)((pos+posInicial)%8)].setForeground(color2);
							pcB++;
						}
						break;
					}
					pos++;
				}
			}
		}
	}

	public void muestra(JDesktopPane main)
	{
		main.add(this);
        setOpaque(true);
        show();
	}

	private void desPosibilita()
	{
		
		int posX = 0;
      	int posY = 0;
	
	  	//para definir las posiciones validas del tablero
      	for (posX = 0; posX < 8; posX++)
      	{
      		for (posY = 0; posY < 8; posY++)
      		{
      			casilla[posY][posX].setposible(false, Color.cyan);
      		}
      	}
	}
	
	private void desSelecciona()
	{
		
		int posX = 0;
      	int posY = 0;
	
	  	//para definir las posiciones validas del tablero
      	for (posX = 0; posX < 8; posX++)
      	{
      		for (posY = 0; posY < 8; posY++)
      		{
      			casilla[posY][posX].seleciona(false, Color.red);
      			selx = sely = -1;
      		}
      	}
	}
	
	private void movimientosPosibles(int x, int y)
	{
		int posX = 0;
      	int posY = 0;
	
		if (tablero[x][y] == 'A' && vez == 'A') {
			if (x<7) {
				if (y<7) {
					if (tablero[x+1][y+1] == 'B' && y<6 && x<6){
						if (tablero[x+2][y+2] == ' '){
							casilla[x+2][y+2].setposible(true,Color.cyan);
						}
					}
					if (tablero[x+1][y+1] == ' '){
						casilla[x+1][y+1].setposible(true,Color.cyan);
					}
					
				}
				if (y>0){
					if (tablero[x+1][y-1] == 'B' && x<6 && y>1){
						if (tablero[x+2][y-2] == ' '){
							casilla[x+2][y-2].setposible(true,Color.cyan);
						}
					}
					if (tablero[x+1][y-1] == ' '){
						casilla[x+1][y-1].setposible(true,Color.cyan);
					}
				}
			}
			if (x>0  && casilla[x][y].isDama()){
				if (y<7){
					if (tablero[x-1][y+1] == 'B' && y<6 && x>1){
						if (tablero[x-2][y+2] == ' '){
							casilla[x-2][y+2].setposible(true,Color.cyan);
						}
					}
					if (tablero[x-1][y+1] == ' '){
						casilla[x-1][y+1].setposible(true,Color.cyan);
					}
				}
				if (y>0){
					if (tablero[x-1][y-1] == 'B' && x>1 && y>1){
						if (tablero[x-2][y-2] == ' '){
							casilla[x-2][y-2].setposible(true,Color.cyan);
						}
					}
					if (tablero[x-1][y-1] == ' ')
					{
						casilla[x-1][y-1].setposible(true,Color.cyan);
					}
				}
			}
			
		}
	
	
		if (tablero[x][y] == 'B' && vez == 'B'){
			if (x>0){
				if (y<7){
					if (tablero[x-1][y+1] == 'A' && y<6 && x>1){
						if (tablero[x-2][y+2] == ' '){
							casilla[x-2][y+2].setposible(true,Color.cyan);
						}
					}
					if (tablero[x-1][y+1] == ' '){
						casilla[x-1][y+1].setposible(true,Color.cyan);
					}
				}
				if (y>0){
					if (tablero[x-1][y-1] == 'A' && x>1 && y>1){
						if (tablero[x-2][y-2] == ' '){
							casilla[x-2][y-2].setposible(true,Color.cyan);
						}
					}
					if (tablero[x-1][y-1] == ' ')
					{
						casilla[x-1][y-1].setposible(true,Color.cyan);
					}
				}
			}
			if (x<7 && casilla[x][y].isDama()) {
				if (y<7) {
					if (tablero[x+1][y+1] == 'A' && y<6 && x<6){
						if (tablero[x+2][y+2] == ' '){
							casilla[x+2][y+2].setposible(true,Color.cyan);
						}
					}
					if (tablero[x+1][y+1] == ' '){
						casilla[x+1][y+1].setposible(true,Color.cyan);
					}
					
				}
				if (y>0){
					if (tablero[x+1][y-1] == 'A' && x<6 && y>1){
						if (tablero[x+2][y-2] == ' '){
							casilla[x+2][y-2].setposible(true,Color.cyan);
						}
					}
					if (tablero[x+1][y-1] == ' '){
						casilla[x+1][y-1].setposible(true,Color.cyan);
					}
				}
			}
		}
	}

	

	public void moverpieza(int xo, int yo, int xd, int yd)
	{
		moverpieza(xo, yo, xd, yd, true);
	}

	public void moverpieza(int xo, int yo, int xd, int yd, boolean local)
	{
		if (tablero[yo][xo] != ' '){
			Casilla origen = casilla[yo][xo];
			Casilla destino = casilla[yd][xd];
			tablero[yd][xd] = tablero[yo][xo];
			tablero[yo][xo] = ' ';
			destino.setForeground(origen.getForeground()); 
			origen.setForeground(origen.getBackground());
			if ((yd == 7 && tablero[yd][xd] == 'A') || (yd == 0 && tablero[yd][xd] == 'B') || (origen.isDama())){
				destino.setDama(true);
			}
			casilla[yo][xo].setDama(false);
			if (local && rede) {
				try {
					output.writeObject((String) "MOVIMIENTO");
					output.flush();
					output.writeObject((String) Integer.toString(xo) + "," +
												Integer.toString(yo) + "," + 
												Integer.toString(xd) + "," + 
												Integer.toString(yd) );
					output.flush();
			    }
			    catch ( IOException io ) {
			        io.printStackTrace();
			    }
			}
		}
	}

	public void comepieza(int x, int y)
	{
		comepieza(x, y, false);
	}

	public void comepieza(int x, int y, boolean local)
	{
		if (tablero[y][x] == 'A')
			{pcA--; fichasA--;}
		else if (tablero[y][x] == 'B')
			{pcB--; fichasB--;}
		tablero[y][x] = ' ';
		casilla[y][x].setDama(false);
		casilla[y][x].setForeground(casilla[y][x].getBackground());
		if (local && rede){
			try{
				output.writeObject((String) "COME FICHA");
				output.flush();
				output.writeObject((String) Integer.toString(x) + "," + Integer.toString(y));
				output.flush();
	        }
			    catch ( IOException io ) {
			        io.printStackTrace();
	        }
		}
	}

	public void addComponent(Component c, int linha, int coluna, int width, int height)	{
		gbConstraints.gridx = coluna;
		gbConstraints.gridy = linha;
		
		gbConstraints.gridwidth = width;
		gbConstraints.gridheight = height;
		
		gbLayout.setConstraints(c,gbConstraints);
		container.add(c);
	}

   public void mouseClicked( MouseEvent e ){
     
   }


   public void mouseReleased( MouseEvent e ){
		int x = 0;
		int y = 0;
		if (!bloq && vez == eu || !rede){
			if (pcA > 0 && pcB > 0) {		
				x = (e.getX()) / (super.getWidth() / 8 );
				y = (e.getY() - 13) / (super.getHeight() / 8 );
				if (casilla[y][x].isposible()){
					if (Math.abs(selx - x) == 2){
						System.out.println("come ficha");
						comepieza((selx + x) / 2,(sely + y) / 2,true);
					}
					
					moverpieza(selx,sely,x,y);
		
					if (pcA == 0) {
						bd = new usaBD();
						bd.inserta("B", fichasA, fichasB);
						JOptionPane.showMessageDialog( this,
		                	"A ganado el jugador B!",
		                    "Fin del juego", JOptionPane.PLAIN_MESSAGE );}			
		
					if (pcB == 0) {
						bd = new usaBD();
						bd.inserta("A", fichasA, fichasB);
						JOptionPane.showMessageDialog( this,
		                	"A ganado el jugador A!",
		                    "Fin del juego", JOptionPane.PLAIN_MESSAGE );}			
		
					if (vez == 'A')	{
						vez = 'B';
					}
					else{
						vez = 'A';
					}
				}
				
				desSelecciona();
				desPosibilita();
				
				if (tablero[y][x] != ' ' && tablero[y][x] != '*'){
					casilla[y][x].seleciona(true,Color.red);
					selx = x;
					sely = y;
					movimientosPosibles(y,x);
				}
			}
		}
    }

@Override
public void mouseDragged(MouseEvent arg0) {
	// TODO Auto-generated method stub
	
}

@Override
public void mouseMoved(MouseEvent arg0) {
	// TODO Auto-generated method stub
	
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
}
