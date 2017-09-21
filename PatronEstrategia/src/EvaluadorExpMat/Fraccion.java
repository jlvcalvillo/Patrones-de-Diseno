package EvaluadorExpMat;

/**
 *
 * @author JLuis
 */
public class Fraccion extends ExpresionMatComp{
    
    public Fraccion(int valor1, int valor2){
        super(valor1, valor2);
        fsr = new SumaRestaFrac();
        fe = new EvaluaFraccion();
    }

    @Override
    public void mostrar() {
        System.out.println(valor1 + "/" + valor2);
    }

    @Override
    public ExpresionMatComp producto(ExpresionMatComp emc) {
        return new Fraccion((valor1 * emc.valor1), (valor2 * emc.valor2));
    }
    
}
