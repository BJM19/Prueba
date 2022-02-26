package co.com.prueba.metrocuadrado.prueba.ejemplos;

public class Computador {
    private Integer ram;
    private Integer rom;
    public void aumentarRam(int ram){
        this.ram=this.ram+ram;
    }
    public void aumentarRom(int rom){
        this.rom=this.rom+rom;
    }
    public void disminuirRam(int ram){
        this.ram=this.ram-ram;
    }
    public void disminuirRom(int rom){
        this.rom=this.rom-rom;
    }

}
