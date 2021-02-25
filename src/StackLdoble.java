public class StackLdoble<E> extends  StackClase<E>
{
    ListaDoble head;
    ListaDoble cola;
    int size;

    public StackLdoble()
    {
        head=null;
        cola=null;
        size=0;
    }


    @Override
    public void push(E ingreso) {
        cola=head;

        ListaDoble<E> temp = new ListaDoble<E>(ingreso,head,cola);
        head=temp;
        if (cola!=null)
        {
            cola.anterior=head;
        }
        size++;

    }

    @Override
    public E peek() {
        return (E) head.data;
    }

    @Override
    public boolean empty() {
        return size==0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public E pop() {
        E temp= (E)head.data;
        head=head.siguiente;
        size--;
        return temp;
    }

}
