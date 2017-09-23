package Inventario;

/**
 *
 * @author JLuis
 */
public class Caja extends Thread{
    private Inventario inventario;
    private String retiro;
    
    public Caja(String retiro, String inventario){
        this.inventario = Inventario.getInventario(inventario);
        this.retiro = retiro;
        
    }
    
    @Override
    public void run(){
        System.out.println("inventario: " + inventario.getNombInv());
        System.out.println("Se retiro :" + retiro);
    }
    
}
