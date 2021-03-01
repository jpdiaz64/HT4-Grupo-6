/***************************************************************
* SingletonTest.java
* Autor: Sebastián Aristondo & José Pablo Díaz
* Universidad del Valle de Guatemala
* Ultima modificacion: 2/28/2021
***************************************************************/

/**
 * Metodos de Vista
 * @Sebastián Aristondo & José Pablo Díaz
 * */
import javax.print.attribute.standard.PrinterURI;

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
