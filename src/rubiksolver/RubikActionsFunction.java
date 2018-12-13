package cuborubik;

import java.util.LinkedHashSet;
import java.util.Set;

import misioneroscanibales.EstadoMisioneros;
import aima.core.agent.Action;
import aima.core.search.framework.ActionsFunction;

public class RubikActionsFunction implements ActionsFunction {

	public Set<Action> actions(Object state){
		
		//EstadoRubik estado = (EstadoRubik) state;
		//lista de acciones posibles
		Set<Action> actions = new LinkedHashSet<Action>();
		//si se cumplen las precondiciones y no se va a un estado de peligro
		//entonces se a?ade la accion a la lista de acciones posibles
		//if(estado.aplicarMovimiento(EstadoRubik.F))
			actions.add(EstadoRubik.F);
		//if(estado.movimientoValido(EstadoRubik.F1))
			actions.add(EstadoRubik.F1);
		//if(estado.movimientoValido(EstadoRubik.R))
			actions.add(EstadoRubik.R);
		//if(estado.movimientoValido(EstadoRubik.R1))
			actions.add(EstadoRubik.R1);
		//if(estado.movimientoValido(EstadoRubik.U))
			actions.add(EstadoRubik.U);
		//if(estado.movimientoValido(EstadoRubik.U1))
			actions.add(EstadoRubik.U1);
		//if(estado.movimientoValido(EstadoRubik.B))
			actions.add(EstadoRubik.B);
		//if(estado.movimientoValido(EstadoRubik.B1))
			actions.add(EstadoRubik.B1);
		//if(estado.movimientoValido(EstadoRubik.L))
			actions.add(EstadoRubik.L);
		//if(estado.movimientoValido(EstadoRubik.L1))
			actions.add(EstadoRubik.L1);
		//if(estado.movimientoValido(EstadoRubik.D))
			actions.add(EstadoRubik.D);
		//if(estado.movimientoValido(EstadoRubik.D1))
			actions.add(EstadoRubik.D1);
		
		
		return actions;
	}
	
}