package EvaluadorExpMat;

/**
 *
 * @author JLuis
 */
public class EvaluaFraccion implements FormaEvaluar{

    @Override
    public double evaluacion(ExpresionMatComp emc) {
        return (float)emc.valor1 / emc.valor2;
    }
    
}
