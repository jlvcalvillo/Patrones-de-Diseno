package EvaluadorExpMat;

/**
 *
 * @author JLuis
 */
public class Complejo extends ExpresionMatComp{
    
    public Complejo(int valor1, int valor2){
        super(valor1, valor2);
        fsr = new SumaRestaxTer();
        fe = new SinEvaluacion();
    }

    @Override
    public void mostrar() {
        String im = (valor2 >= 0)? "+":"";
        System.out.println(valor1 + " " + im + " " + valor2 + "i");
    }

    @Override
    public ExpresionMatComp producto(ExpresionMatComp emc) {
        int a = ((valor1 * emc.valor1) - (valor2 * emc.valor2));
        int b = ((valor1 * emc.valor2) - (valor2 * emc.valor1));
        return new Complejo(a,b);
    }
    
}
