public class PatoCabezaRoja extends Pato{
    public PatoCabezaRoja(){
        fdv = new VolarConAlas();
        fdg = new GraznarNatural();
    }
    public String mostrar(){
        return "Soy un pato de cabeza roja";
    }
}