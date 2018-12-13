package cuborubik;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public enum Colores {
    Naranja, //0
    Verde, //1
    Rojo, //2
    Azul, //3
    Blanco, //4
    Amarillo; //5

    private static final List<Colores> coloresList =
            Collections.unmodifiableList(Arrays.asList(values()));
    private static final int tam = coloresList.size();
    private static final Random RANDOM = new Random();

    public static Colores randomColor()  {
        return coloresList.get(RANDOM.nextInt(tam));
    }
}
