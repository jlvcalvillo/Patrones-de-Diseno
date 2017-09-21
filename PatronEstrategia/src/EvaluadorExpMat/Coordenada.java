package EvaluadorExpMat;

/**
 *
 * @author JLuis
 */
public class Coordenada extends ExpresionMatComp{
    
    public Coordenada(int valor1, int valor2){
        super(valor1, valor2);
        fsr = new SumaRestaxTer();
        fe = new SinEvaluacion();
    }

    @Override
    public void mostrar() {
        System.out.println("( " + valor1 + " , " + valor2 + " )");
    }

    @Override
    public ExpresionMatComp producto(ExpresionMatComp emc) {
        return new Coordenada(0,0);
    }
    
}
