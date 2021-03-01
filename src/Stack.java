/***************************************************************
* Stack.java
* Autor: Sebastián Aristondo & José Pablo Díaz
* Universidad del Valle de Guatemala
* Ultima modificacion: 2/28/2021
***************************************************************/

/**
 * Metodos de Vista
 * @Sebastián Aristondo & José Pablo Díaz
 * */
public abstract interface Stack<E>
{
    /**Ingresar al vector*/
    public void push(E ingreso);
    /**Obtener y eliminar ultimo objeto*/
    public E pop();
    /**Obtiene ultimo elemento*/
    public E peek();
    /**Verifica si esta vacio*/
    public boolean empty();
    /**Tamaño del vector*/
    public int size();

}
