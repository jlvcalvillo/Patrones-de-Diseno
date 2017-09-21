package EvaluadorExpMat;

/**
 *
 * @author JLuis
 */
public class EvaluaPotencia implements FormaEvaluar{

    @Override
    public double evaluacion(ExpresionMatComp emc) {
        return (Double)Math.pow(emc.valor1, emc.valor2);
    }
    
}
