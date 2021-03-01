/***************************************************************
* ListaSimple.java
* Autor: Sebastián Aristondo & José Pablo Díaz
* Universidad del Valle de Guatemala
* Ultima modificacion: 2/28/2021
***************************************************************/

/**
 * Metodos de Vista
 * @Sebastián Aristondo & José Pablo Díaz
 * */
public class ListaSimple<E>
{
    E data;
    ListaSimple siguiente;

    public ListaSimple(E dato,ListaSimple asignar)
    {
        data = dato;
        siguiente = asignar;
    }
}
