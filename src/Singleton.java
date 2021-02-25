public class Singleton {
    // static variable single_instance of type Singleton
    private static Calculadora single_instance = null;

    // private constructor restricted to this class itself
    private Singleton(StackClase e) {
        single_instance = new Calculadora(e);
    }

    // static method to create instance of Singleton class
    public static Calculadora getInstance(StackClase e) {
        if (single_instance == null)
            single_instance = new Calculadora(e);

        return single_instance;
    }
}
