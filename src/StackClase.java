/***************************************************************
* StackClase.java
* Autor: Sebastián Aristondo & José Pablo Díaz
* Universidad del Valle de Guatemala
* Ultima modificacion: 2/28/2021
***************************************************************/

/**
 * Metodos de Vista
 * @Sebastián Aristondo & José Pablo Díaz
 * */
public abstract class StackClase<E> implements  Stack<E>
{
    @Override
    public boolean empty() {
        return size()==0;
    }
}
