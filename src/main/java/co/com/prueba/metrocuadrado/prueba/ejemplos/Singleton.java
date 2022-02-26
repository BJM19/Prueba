package co.com.prueba.metrocuadrado.prueba.ejemplos;

public class Singleton {

    private String prueba;
    private static Singleton singleton;

    // Como el costructro es privado no permite que se genere un contructor por defecto.
    private Singleton(String prueba) {
        this.prueba = prueba;
        System.out.println("El nombre de la prueba es: " + this.prueba);
    }

    public static Singleton getSingletonInstance(String prueba) {
        if (singleton == null){
            singleton = new Singleton(prueba);
        }
        else{
            System.out.println("No se puede crear el objeto "+ prueba + " porque ya existe un objeto de la clase Singleton");
        }

        return singleton;
    }
}