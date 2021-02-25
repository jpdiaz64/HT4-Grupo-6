import org.junit.Test;

import static org.junit.Assert.*;

public class SingletonTest {

    @Test
    public void getInstance()
    {

        StackClase<String> MyStack = new StackLdoble<String>();
        String  expresion = "34+";
        Calculadora prueba = Singleton.getInstance(MyStack);
        System.out.println(prueba.Calculo(expresion));





    }
}