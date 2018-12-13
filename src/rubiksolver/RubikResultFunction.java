package cuborubik;

import aima.core.agent.Action;
import aima.core.search.framework.ResultFunction;

public class RubikResultFunction  implements ResultFunction {

	public Object result (Object s, Action a){

		EstadoRubik estado = (EstadoRubik) s;
		EstadoRubik nuevoEstado;

		if(EstadoRubik.F.equals(a)){
			nuevoEstado = new EstadoRubik(estado);
			nuevoEstado.moveF(true);
			return nuevoEstado;
		}else if(EstadoRubik.F1.equals(a)){
			nuevoEstado = new EstadoRubik(estado);
			nuevoEstado.moveF(false);
			return nuevoEstado;
		}else if(EstadoRubik.R.equals(a)){
			nuevoEstado = new EstadoRubik(estado);
			nuevoEstado.moveR(true);
			return nuevoEstado;
		}else if(EstadoRubik.R1.equals(a)){
			nuevoEstado = new EstadoRubik(estado);
			nuevoEstado.moveR(false);
			return nuevoEstado;
		}else if(EstadoRubik.U.equals(a)){
			nuevoEstado = new EstadoRubik(estado);
			nuevoEstado.moveU(true);
			return nuevoEstado;
		}else if(EstadoRubik.U1.equals(a)){
			nuevoEstado = new EstadoRubik(estado);
			nuevoEstado.moveU(false);
			return nuevoEstado;
		}else if(EstadoRubik.D.equals(a)){
			nuevoEstado = new EstadoRubik(estado);
			nuevoEstado.moveD(true);
			return nuevoEstado;
		}else if(EstadoRubik.D1.equals(a)){
			nuevoEstado = new EstadoRubik(estado);
			nuevoEstado.moveD(false);
			return nuevoEstado;
		}else if(EstadoRubik.L.equals(a)){
			nuevoEstado = new EstadoRubik(estado);
			nuevoEstado.moveL(true);
			return nuevoEstado;
		}else if(EstadoRubik.L1.equals(a)){
			nuevoEstado = new EstadoRubik(estado);
			nuevoEstado.moveL(false);
			return nuevoEstado;
		}
		else if(EstadoRubik.B.equals(a)){
			nuevoEstado = new EstadoRubik(estado);
			nuevoEstado.moveB(true);
			return nuevoEstado;
		}
		else if(EstadoRubik.B1.equals(a)){
			nuevoEstado = new EstadoRubik(estado);
			nuevoEstado.moveB(false);
			return nuevoEstado;
		}
		return estado;

	}




}