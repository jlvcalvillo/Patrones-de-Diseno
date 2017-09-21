public abstract class Pato{
    protected FormaDeVuelo fdv;
    protected FormaDeGraznar fdg;

    public String nadar(){
        return "Todos los patos nadan";
    }

    public abstract String mostrar();

    public String getFormaDeGraznar(){
        return fdg.graznar();
    }

    public String getFormaDeVolar(){
        return fdv.vuelo();
    }

    public void setFormaDeGraznar(FormaDeGraznar fdg){
        this.fdg = fdg;
    }

    public void setFormaDeVolar(FormaDeVuelo fdv){
        this.fdv = fdv;
    }
}

