/***************************************************************
* StackSimple.java
* Autor: Sebastián Aristondo & José Pablo Díaz
* Universidad del Valle de Guatemala
* Ultima modificacion: 2/28/2021
***************************************************************/

/**
 * Metodos de Vista
 * @Sebastián Aristondo & José Pablo Díaz
 * */
public class StackLSimple<E> extends StackClase<E>{

    ListaSimple<E> head;
    int size;

    public StackLSimple()
    {
        head=null;
        size=0;
    }

    @Override
    public E pop() {
        if (head==null)
        {
            System.out.println("Error nada en el Stack");

        }
        E temp= (E)head.data;
        head=head.siguiente;
        size--;
        return temp;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public E peek() {
        return head.data;
    }

    @Override
    public void push(E ingreso) {
        ListaSimple<E> temp= new ListaSimple<E>(ingreso,head);
        head=temp;
        size++;
    }

    @Override
    public boolean empty() {
        return size==0;
    }

}
