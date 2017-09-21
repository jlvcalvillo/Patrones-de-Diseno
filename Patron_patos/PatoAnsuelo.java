public class PatoAnsuelo extends Pato{
    public PatoAnsuelo(){
        fdv = new NoVuela();
        fdg = new NoGrazna();
    }
    public String mostrar(){
        return "Soy un pato anzuelo";
    }
}