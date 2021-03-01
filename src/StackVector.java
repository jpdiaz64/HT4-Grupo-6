/***************************************************************
* StackVector.java
* Autor: Sebastián Aristondo & José Pablo Díaz
* Universidad del Valle de Guatemala
* Ultima modificacion: 2/28/2021
***************************************************************/

/**
 * Metodos de Vista
 * @Sebastián Aristondo & José Pablo Díaz
 * */
import java.util.Vector;

public class StackVector<E> extends StackClase<E>
{
    Vector<E> Almacen;
    public StackVector()
    {
         Almacen= new Vector<E>();
    }

    @Override
    public void push(E ingreso) {
        Almacen.add(ingreso);

    }

    @Override
    public E pop() {
        E temp =Almacen.get(0);
        Almacen.remove(0);
        return temp;
    }

    @Override
    public E peek() {
        return Almacen.get(0);
    }

    @Override
    public int size() {
        return Almacen.size();
    }
}
