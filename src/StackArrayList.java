import java.util.ArrayList;

public class StackArrayList<E> extends StackClase<E>
{
    ArrayList<E> Almacen;
    public StackArrayList()
    {
        Almacen = new ArrayList<E>();
    }
    @Override
    public void push(E ingreso)
    {
        Almacen.add(ingreso);
    }

    @Override
    public E pop() {
        E temp =Almacen.get(0);
        Almacen.remove(0);
        return  temp;

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
