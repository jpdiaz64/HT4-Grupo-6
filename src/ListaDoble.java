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
