/***************************************************************
* Vista.java
* Autor: Sebastián Aristondo & José Pablo Díaz
* Universidad del Valle de Guatemala
* Ultima modificacion: 2/28/2021
***************************************************************/

/**
 * Metodos de Vista
 * @Sebastián Aristondo & José Pablo Díaz
 * */

public class Vista
 {


    public void decidir1(){
        {
            System.out.println("Que implementación desea utilizar");
            System.out.println("1. StackArrayList\n2. StacVector\n3. Listas");
            new Vista();
        }

    }

    public void decidir2()
    {
        boolean verificación =true;
        while (verificación)
        {
            System.out.println("Que implementación desea utilizar");
            System.out.println("1. StackSimple (Lista Simple)\n2. StackDoble (Lista Doble)");
            verificación = false;
        }

    }

    public void preguntaInfix(){

        System.out.println("Ingresa en infix la operacion matematica que deseas realizar");
    }

}
