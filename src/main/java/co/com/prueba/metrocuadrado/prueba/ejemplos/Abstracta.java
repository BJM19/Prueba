package co.com.prueba.metrocuadrado.prueba.ejemplos;

public abstract class Abstracta {
    private String nombre;
    public abstract void agregarNombre(String nombre);
    public void eliminarNombre(String nombre){
        this.nombre = "";
    }
}
