package EvaluadorExpMat;

/**
 *
 * @author JLuis
 */
public class SinSumaResta implements FormaSumaResta{

    @Override
    public ExpresionMatComp suma(ExpresionMatComp val1, ExpresionMatComp va2) {
        return new Potencia(0,0);
    }

    @Override
    public ExpresionMatComp resta(ExpresionMatComp val1, ExpresionMatComp va2) {
        return new Potencia(0,0);
    }

    
}
