package cuborubik;

import aima.core.agent.Action;
import aima.core.search.framework.StepCostFunction;

public class RubikStepCostFunction implements StepCostFunction {
    public double c(Object stateFrom, Action action, Object stateTo) {
        return 1;
    }
}