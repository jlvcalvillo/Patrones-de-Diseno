public class PatoGoma extends Pato{
    public PatoGoma(){
        fdv = new NoVuela();
        fdg = new GraznarFalso();
    }
    public String mostrar(){
        return "Soy un pato de goma";
    }
}