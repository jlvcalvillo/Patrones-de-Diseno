package Inventario;

/**
 *
 * @author JLuis
 */
public class Main {
    public static void main(String args[]){
        System.out.println("Control de un inventario\n");
        Caja c1 = new Caja("Arroz", "01"); 
        Caja c2 = new Caja("Azucar", "01");
        Caja c3 = new Caja("Atun", "02");
        c1.start();
        c2.start();
        c3.start();
    }
}
