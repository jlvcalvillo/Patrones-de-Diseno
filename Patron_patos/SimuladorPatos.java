public class SimuladorPatos{
    public static void main (String [] args){
        Pato real = new PatoReal();
        System.out.println(real.getFormaDeGraznar());
        System.out.println(real.getFormaDeVolar());
        real.setFormaDeGraznar(new GraznarFalso());
        System.out.println(real.getFormaDeGraznar());
    }
}