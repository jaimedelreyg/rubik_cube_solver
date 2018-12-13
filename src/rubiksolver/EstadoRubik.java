package cuborubik;


import aima.core.agent.Action;
import aima.core.agent.impl.DynamicAction;
public class EstadoRubik {

    private Cubo cubo;

	public static Action F = new DynamicAction("F");
	public static Action F1 = new DynamicAction("F1");
	public static Action R = new DynamicAction("R");
	public static Action R1 = new DynamicAction("R1");
	public static Action U = new DynamicAction("U");
	public static Action U1 = new DynamicAction("U1");
	public static Action B = new DynamicAction("B");
	public static Action B1 = new DynamicAction("B1");
	public static Action L = new DynamicAction("L");
	public static Action L1 = new DynamicAction("L1");
	public static Action D = new DynamicAction("D");
	public static Action D1 = new DynamicAction("D1");

    public EstadoRubik(int op){
    	
    	cubo = new Cubo();

    	switch(op){
    	
    	case 0:
    		break;
    	
    	case 1:
    		moveB(true);
    	
    		break;
    	case 2:
        	
    		moveB(true);
    		moveU(true); 
    		
    		break;
    	case 3:
        	
    		moveB(true);
    		moveU(true);
    		moveL(true);
    		
    		break;
    	case 4:
        	
    		moveB(true);
    		moveU(true);
    		moveL(true);
    		moveF(true);
    		
    		break;
    	case 5:
        	
    		moveB(true);
    		moveU(true);
    		moveL(true);
    		moveF(true);
    		moveR(true);
    		
    		break;
    	case 6:
        	
    		moveB(true);
    		moveU(true);
    		moveL(true);
    		moveF(true);
    		moveR(true);
    		moveU(true);


    		break;

    	}

    }
    
    public void moveL(boolean clockwise) {
    	
    	cubo.rotateFace(0, clockwise);	
    }
    public void moveF(boolean clockwise) {
    	
    	cubo.rotateFace(1, clockwise);	
    }
    public void moveR(boolean clockwise) {
    	
    	cubo.rotateFace(2, clockwise);	
    }
    public void moveU(boolean clockwise) {
    	
    	cubo.rotateFace(4, clockwise);	
    }
    public void moveB(boolean clockwise) {
    	
    	cubo.rotateFace(3, clockwise);	
    }
    public void moveD(boolean clockwise) {
    	
    	cubo.rotateFace(5, clockwise);	
    }
    

    public EstadoRubik(EstadoRubik mc){
        this.cubo = new Cubo();
        for (int i = 0; i < 6; i++) {
			
			for(int j = 0; j < 9; j++) {
				this.cubo.getCaras()[i][j] = mc.getCubo().getCaras()[i][j];
			}
			
		}

    }

    public Cubo getCubo() {
        return cubo;
    }
    
    public boolean equals(Object o){
  		if(this==o) return true;
  		if((o==null)||(this.getClass()!=o.getClass())) return false;
  		EstadoRubik otroEstado = (EstadoRubik) o;
  		return this.cubo.equals(otroEstado.cubo);
      }
      
      public int hashCode(){
  		return this.cubo.hashCode();
      }
}
