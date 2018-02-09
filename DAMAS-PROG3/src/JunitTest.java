import static org.junit.Assert.*;

import java.awt.Color;

import org.junit.Test;

public class JunitTest {

	@Test
	public void test() {
		Tablero tab = new Tablero(' ');
		assertTrue(ResetTableroTest(tab.getTablero()));
	}
	
	
	private boolean ResetTableroTest(char tablero[][]) {
		int posX = 0;
      	int posY = 0;	
      	int cont1 = 0;
      	int cont2 = 0;
      	for (posX = 0; posX < 8; posX++)
      	{
      		for (posY = 0; posY < 8; posY++)
      		{
      			if (tablero[posX][posY] == 'A')
      			{
      				cont1++;
				}
      			if (tablero[posX][posY] == 'B')
      			{
      				cont2++;
      			}
      		}
      	}
      	if(cont1 == cont2) {
      		return true;
      	}
      	else {
      	return false;
      	}
	}

}
