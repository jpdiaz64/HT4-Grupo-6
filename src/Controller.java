/***************************************************************
* Controlador.java
* Autor: Sebastián Aristondo & José Pablo Díaz
* Universidad del Valle de Guatemala
* Ultima modificacion: 2/28/2021
***************************************************************/

/**
 * Metodos de Vista
 * @Sebastián Aristondo & José Pablo Díaz
 * */

import java.util.Scanner;

public class Controller {

    Vista v = new Vista();

    Traductor t = new Traductor();

    public String Controlador()
    {

        v.decidir1();

        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();

        StackClase st = null;

        switch(num1){
            case 1:

                v.preguntaInfix();

                st = Factory("StackVector");

                break;

            case 2:

                v.preguntaInfix();
                st = Factory("StackArrayList");

                break;
            case 3:
                v.decidir2();
                int op2 = sc.nextInt();
                switch(op2){
                    case 1:

                        v.preguntaInfix();
                        st = Factory("StackSimple");

                        break;
                    case 2:

                        v.preguntaInfix();
                        st = Factory("StackDoble");

                        break;
                    default:
                        System.out.println("Opcion incorrecta");
                        break;
                }

                break;

            default:
                System.out.println("Opcion incorrecta");
                break;
        }
        Calculadora c = Singleton.getInstance(st);
        String inputUser = sc.next();
        String calculo = c.Calculo(t.Traductor(inputUser));
        return calculo;
    }

    public StackClase Factory(String tipo){

        StackClase almacen;
        switch(tipo){


            case "StackVector":
                almacen = new StackVector();
                break;

            case "StackArrayList":
                almacen = new StackArrayList();
                break;

            case "StackDoble":
                almacen = new StackLDoble();
                break;

            case "StackSimple":
                almacen = new StackLSimple();
                break;

            default:
                System.out.println("Opcion incorrecta");
                almacen = null;
                break;
        }
        return almacen;
    }
}
