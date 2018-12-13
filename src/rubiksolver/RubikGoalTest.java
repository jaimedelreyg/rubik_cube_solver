package cuborubik;

import aima.core.search.framework.GoalTest;

public class RubikGoalTest  implements GoalTest {
    EstadoRubik goal = new EstadoRubik (0);
    public boolean isGoalState(Object state){
        EstadoRubik estado = (EstadoRubik) state;
        return estado.equals(goal);
    }
}