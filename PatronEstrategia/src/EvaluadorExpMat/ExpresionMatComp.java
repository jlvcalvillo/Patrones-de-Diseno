package EvaluadorExpMat;

/**
 *
 * @author JLuis
 */
public abstract class ExpresionMatComp {
    protected int valor1;
    protected int valor2;
    
    protected FormaSumaResta fsr;
    protected FormaEvaluar fe;

    public ExpresionMatComp(int valor1, int valor2) {
        this.valor1 = valor1;
        this.valor2 = valor2;
    }
    
    public abstract void mostrar();
    
    public abstract ExpresionMatComp producto(ExpresionMatComp emc);
    
    public ExpresionMatComp sumar(ExpresionMatComp emc){
        return fsr.suma(this, emc);
    }
    
    public ExpresionMatComp restar(ExpresionMatComp emc){
        return fsr.resta(this, emc);
    }  
    
    public double evaluar(){
        return fe.evaluacion(this);
    }
}
