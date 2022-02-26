package co.com.prueba.metrocuadrado.prueba.ejemplos;

public class PruebaExepciones {
    public void lanzarExcepcion() throws  Exception{
        throw (new Exception("ERROR"));
    }
    public void recibirExcepcion() throws Exception{
        try{
            System.out.println("No hay errores");
        }catch (Exception e){
            System.out.println("Si hay errores");
            e.printStackTrace();
        }
    }
}
