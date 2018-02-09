
public class IA {

	Tablero tab = new Tablero(' ');
	
	
	public int[] escogeMover(int x,int y,int dist) {
		int[] a = new int[2];
		a[0]=x;
		a[1]=y;
		int posX = 0;
      	int posY = 0;
      	int distancia=0;
      	for (posX = 0; posX < 8; posX++)
      	{
      		for (posY = 0; posY < 8; posY++)
      		{
      			if(tab.tablero[posX][posY]=='A') {
      				distancia=((x-posX)+(y-posY))/2;
      			}
      		}
      	}		
		
		
		if(dist>distancia) {
			return escogeMover(x,y,distancia);
		}
		
		if(dist<distancia) {
			return escogeMover(x,y,dist);
		}
		if(dist==dist) {			
			return a;
		}
		
		
		return a;
	}
	
}
