/***************************************************************
* Singleton.java
* Autor: Sebastián Aristondo & José Pablo Díaz
* Universidad del Valle de Guatemala
* Ultima modificacion: 2/28/2021
***************************************************************/

/**
 * Metodos de Vista
 * @Sebastián Aristondo & José Pablo Díaz
 * */
public class Singleton {
    // static variable single_instance of type Singleton
    private static Calculadora single_instance = null;


    // static method to create instance of Singleton class
    public static Calculadora getInstance(StackClase e) {
        if (single_instance == null)
            single_instance = new Calculadora(e);

        return single_instance;
    }
}
