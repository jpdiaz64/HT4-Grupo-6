/***************************************************************
* ListaDoble.java
* Autor: Sebastián Aristondo & José Pablo Díaz
* Universidad del Valle de Guatemala
* Ultima modificacion: 2/28/2021
***************************************************************/

/**
 * Metodos de Vista
 * @Sebastián Aristondo & José Pablo Díaz
 * */
public class ListaDoble<E>
{
    E data;
    ListaDoble siguiente;
    ListaDoble anterior;

    public ListaDoble(E dato,ListaDoble despues,ListaDoble antes)
    {
        data=dato;
        siguiente=despues;
        anterior=antes;
    }
}
