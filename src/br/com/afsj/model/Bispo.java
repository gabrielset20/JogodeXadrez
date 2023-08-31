package br.com.afsj.model;

import br.com.afsj.control.Xadrez;

public class Bispo extends Peca {
	int x, y;

	@Override
	public boolean movimentoOK(int x, int y) {
		if (posX == -1 && posY == -1) {
			return true;
		}
		
		if ((cor == Xadrez.corBRANCA)) {
			for(int i = 0; i <=7; i++) {
				if(( (x == posX+i || x == posX-i) && (y == posY-i || y == posY+i) ) ||
					 ( (x == posX+i || x == posX-i) && (y == posY-i || y == posY+i))) 
					return true;
			}
		}

		if ((cor == Xadrez.corPRETA)) {
			for(int i = 0; i <=7; i++) {
				if(( (x == posX+i || x == posX-i) && (y == posY-i || y == posY+i) ) ||
					 ( (x == posX+i || x == posX-i) && (y == posY-i || y == posY+i))) 
					return true;
			}
		}
		return false;
	}
}