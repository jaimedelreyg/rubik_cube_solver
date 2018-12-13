package cuborubik;

import aima.core.agent.Action;
import aima.core.search.framework.*;
import aima.core.search.informed.AStarSearch;
import aima.core.search.informed.GreedyBestFirstSearch;
import aima.core.search.uninformed.BreadthFirstSearch;
import aima.core.search.uninformed.DepthFirstSearch;
import aima.core.search.uninformed.DepthLimitedSearch;
import aima.core.search.uninformed.UniformCostSearch;

import java.util.Iterator;
import java.util.List;
import java.util.Properties;


public class RubikDemo {
    static int op = 1;
    static EstadoRubik estadoInicial = new EstadoRubik(op);

    public static void main(String[] args) {
        for(op=1; op < 7 ; ++op) {
            estadoInicial = new EstadoRubik(op);
            RubikBFSDemo();
        }
    }

    private static void RubikBFSDemo() {
        System.out.println("\nRubik"+op+"BFSDemo-->");
        try {
            Problem problem = new Problem(estadoInicial,RubikFunctionFactory.getActionsFunction(), RubikFunctionFactory.getResultFunction(),
                    new RubikGoalTest(), new RubikStepCostFunction());
            Search search = new GreedyBestFirstSearch(new TreeSearch(),new Heuristica2());
            
            SearchAgent agent = new SearchAgent(problem, search);
            printActions(agent.getActions());
            printInstrumentation(agent.getInstrumentation());
        }catch (Exception e) {
            e.printStackTrace();
        }
    }


    private static void printInstrumentation(Properties properties) {
        Iterator<Object> keys = properties.keySet().iterator();
        while (keys.hasNext()) {
            String key = (String) keys.next();
            String property = properties.getProperty(key);
            System.out.println(key + " : " + property);
        }

    }

    private static void printActions(List<Action> actions) {
        for (int i = 0; i < actions.size(); i++) {
            String action = actions.get(i).toString();
            System.out.println(action);
        }
    }
}

