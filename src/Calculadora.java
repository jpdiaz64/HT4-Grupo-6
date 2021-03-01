/***************************************************************
* Calculadora.java
* Autor: Sebastián Aristondo & José Pablo Díaz
* Universidad del Valle de Guatemala
* Ultima modificacion: 2/28/2021
***************************************************************/

/**
 * Metodos de Vista
 * @Sebastián Aristondo & José Pablo Díaz
 * */

public class Calculadora
{
    StackClase MyStack;
    public Calculadora(StackClase e)
    {
        MyStack = e;
        

    public String Calculo(String expresion)
    {
        //MyStack= new Stack();
        String respuesta="Opereación no valida";

        /**Separar números de digitos*/
        for (int i =0;i<expresion.length();i++)
        {
            char evaluar =expresion.charAt(i);
            if(Character.isDigit(evaluar))
            {
                MyStack.push((int) (evaluar-'0'));

            }
            /**Realizar operaciones utilizando el Stack*/
            else if(evaluar=='/' ||evaluar=='+'||evaluar=='-'||evaluar=='*')
            {
                int num1= (int) MyStack.pop();
                int num2= (int) MyStack.pop();

                switch (evaluar) {

                    case ('+'):
                        MyStack.push(num1 + num2);

                    break;
                    case ('-'):
                        MyStack.push(num2 - num1);

                    break;
                    case ('*'):
                        MyStack.push(num1 * num2);

                    break;
                    case ('/'):
                        MyStack.push(num2 / num1);

                    break;
                }
            }
        }
        if (MyStack.size()==1)
            respuesta=MyStack.peek()+"";

        return respuesta;
    }


}
