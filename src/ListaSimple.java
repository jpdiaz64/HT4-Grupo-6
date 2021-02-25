public class ListaSimple<E>
{
    E data;
    ListaSimple siguiente;

    public ListaSimple(E dato,ListaSimple asignar)
    {
        data=dato;
        siguiente=asignar;
    }
}
