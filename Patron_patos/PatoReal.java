public class PatoReal extends Pato{
    public PatoReal(){
        fdv = new VolarConAlas();
        fdg = new GraznarNatural();
    }
    public String mostrar(){
        return "Soy un pato real";
    }
}
