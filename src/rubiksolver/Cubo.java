package cuborubik;

public class Cubo {
	
	private Colores[][] caras;
	private int[][] cambios;
	private int[] patron;
	
	public Cubo(){
		
		caras = new Colores[6][9];
		patron = new int[] {2,5,8,1,4,7,0,3,6};
		int j=0;

		for(Colores c:Colores.values()) {
			
			for(int i = 0; i<9; i++) {
				caras[j][i] = c;	
				
			}
			j++;
		}
		

		cambios = new int[][] {
			                 {4,0,4,3,4,6,1,0,1,3,1,6,5,0,5,3,5,6,3,8,3,5,3,2},
			                 {4,6,4,7,4,8,2,0,2,3,2,6,5,2,5,1,5,0,0,8,0,5,0,2},
			                 {4,8,4,5,4,2,3,0,3,3,3,6,5,8,5,5,5,2,1,8,1,5,1,2},
			                 {4,2,4,1,4,0,0,0,0,3,0,6,5,6,5,7,5,8,2,8,2,5,2,2},
			                 {2,0,2,1,2,2,1,0,1,1,1,2,0,0,0,1,0,2,3,0,3,1,3,2},
			                 {0,6,0,7,0,8,1,6,1,7,1,8,2,6,2,7,2,8,3,6,3,7,3,8}};

	}
		
	public Colores[][] getCaras() {
		return caras;
	}
	
	public void rotateFace(int face, boolean clockwise) {
		
		Colores [] aux = new Colores [12];
		int j = 0;
		
		rotateBase(face, clockwise);
		
		for(int i = 0; i < 24 ;i=i+2) {
		aux[j]= caras[cambios[face][i]][cambios[face][i+1]];
		j++;
		}
		
		if(clockwise) {
			int x = 6;
			for(int i = 0; i < 12; i++) {
				
				caras[cambios[face][x]][cambios[face][x+1]] = aux[i];
				if(x == 22) x = 0;
				else x = x+2;
			}

		}
		else {
			
			int y = 18;
			for(int i = 0; i < 12; i++) {
				
				caras[cambios[face][y]][cambios[face][y+1]] = aux[i];
				if(y == 22) y = 0;
				else y = y+2;
			}
			
		}
		
	}
	
	public void rotateBase(int face, boolean clockwise) {

		Colores [] aux = new Colores [9];

			for(int i = 0 ; i<9 ; i++) {
			aux[i] = caras[face][i];
			}
		
		if(clockwise) {	
			

			
			for(int i = 0; i < patron.length; i++) {
				caras[face][patron[i]] = aux[i];
			}

		
		}else {
			
			
			for(int i = 0; i < patron.length; i++) {
				caras[face][patron[(patron.length-1) - i]] = aux[i];
			}
		
		}
	
	}
	
	public Colores getColor(int i, int j){
		return caras[i][j];
	}
	
	public boolean equals(Object o) {
		if(this==o) return true;
		if((o==null)||(this.getClass()!=o.getClass())) return false;
		Cubo otroCubo = (Cubo) o;
		
		for (int i = 0; i < 6; i++) {
			
			for(int j = 0; j < 9; j++) {
				if(!(this.getColor(i, j)==otroCubo.getColor(i, j))) return false;
			}
			
		}
		
		return true;
	}
	

	public int hashCode() {
		
		int res = 0;
		for (int i = 0; i < 6; i++) {
			
			for(int j = 0; j < 9; j++) {
				switch(caras[i][j]) {
				case Naranja:
					res+=((1000*i+j*30)+200)/1;
					break;
				case Amarillo:
					res+=((1000*i+j*30)+200)/3;
					break;
				case Blanco:
					res+=((1000*i+j*30)+200)/5;
					break;
				case Verde:
					res+=((1000*i+j*30)+200)/72;
					break;
				case Azul:
					res+=((1000*i+j*30)+200)/111;
					break;
				case Rojo:
					res+=((1000*i+j*30)+200)/131;
					break;
				}
			}
			
		}
		
		return res;
		
	}
	
}
