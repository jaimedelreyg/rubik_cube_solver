package cuborubik;



	import aima.core.search.framework.HeuristicFunction;

public class Heuristica2 implements HeuristicFunction {
	
		//Distancia en caras.
	    @Override
	    public double h(Object o) {
	        EstadoRubik estado = (EstadoRubik) o;
	        double ret = 0;
	        
	        for(int i = 0; i < 6; i++)
	        	for(int j = 0; j <9 ; j++)
	        		switch (estado.getCubo().getCaras()[i][j]) {
	        		
	        		case Naranja:
	        			if(i == 2) ret += 2; else if (i != 0) ret += 1;
	        			break;
	        		case Azul:
	        			if(i == 0) ret += 2; else if (i != 3) ret += 1;
	        			break;
	        		case Verde:
	        			if(i == 3) ret += 2; else if (i != 1) ret += 1;
	        			break;
	        		case Amarillo:
	        			if(i == 4) ret += 2; else if (i != 5) ret += 1;
	        			break;
	        		case Rojo:
	        			if(i == 0) ret += 2; else if (i != 2) ret += 1;
	        			break;
	        		case Blanco:
	        			if(i == 5) ret += 2; else if (i != 4) ret += 1;
	        			break;
	        		}
	     return ret;   
	    }
}
