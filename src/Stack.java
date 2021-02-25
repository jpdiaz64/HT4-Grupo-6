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
