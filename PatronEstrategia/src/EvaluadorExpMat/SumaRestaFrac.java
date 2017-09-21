package EvaluadorExpMat;

/**
 *
 * @author JLuis
 */
public class SumaRestaFrac implements FormaSumaResta{

    @Override
    public ExpresionMatComp suma(ExpresionMatComp val1, ExpresionMatComp val2) {
        ExpresionMatComp aux = new Fraccion(0,0);
        aux.valor1 = (val1.valor1 * val2.valor2) + (val2.valor1 * val1.valor2);
        aux.valor2 = (val1.valor2 * val2.valor2);
        return aux;
    }

    @Override
    public ExpresionMatComp resta(ExpresionMatComp val1, ExpresionMatComp val2) {
        ExpresionMatComp aux = new Fraccion(0,0);
        aux.valor1 = (val1.valor1 * val2.valor2) - (val2.valor1 * val1.valor2);
        aux.valor2 = (val1.valor2 * val2.valor2);
        return aux;
    }
    
}
