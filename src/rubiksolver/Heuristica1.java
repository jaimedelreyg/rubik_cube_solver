package cuborubik;

import aima.core.search.framework.HeuristicFunction;

public class Heuristica1 implements HeuristicFunction {
	
	//Fichas descolocadas
    @Override
    public double h(Object o) {
        EstadoRubik estado = (EstadoRubik) o;
        double ret = 0;

        for(int i = 0; i < 6; i++)
        	for(int j = 0; j <9 ; j++)
        				if(estado.getCubo().getCaras()[i][j] != estado.getCubo().getCaras()[i][4]) ret += 1;

        return ret;
    }
}
