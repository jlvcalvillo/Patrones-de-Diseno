package EvaluadorExpMat;

/**
 *
 * @author JLuis
 */
public class Potencia extends ExpresionMatComp{
    
    public Potencia(int valor1, int valor2){
        super(valor1, valor2);
        fsr = new SinSumaResta();
        fe = new EvaluaPotencia();
    }

    @Override
    public void mostrar() {
        System.out.println(valor1 + "^" + valor2);
    }

    @Override
    public ExpresionMatComp producto(ExpresionMatComp emc) {
        int a,b;
        a = b = 0;
        if (valor1 == emc.valor1){
            a = valor1;
            b = valor2 + emc.valor2;
        }
        else if (valor2 == emc.valor2){
            a = valor1 * emc.valor1;
            b = valor2;
        }
        return new Potencia(a,b);
    }
    
}
