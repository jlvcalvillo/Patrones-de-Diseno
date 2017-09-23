package Inventario;

/**
 *
 * @author JLuis
 */
public class Inventario {
    static Inventario instancia;
    private String nombInv;
    
    private Inventario(String nombInv){
        this.nombInv = nombInv;
    }
    
    public static Inventario getInventario(String nombre){
        synchronized (Inventario.class){
            if(instancia == null){
                instancia = new Inventario(nombre);
            } 
        }
        return instancia;
    }

    public String getNombInv() {
        return nombInv;
    }
}
