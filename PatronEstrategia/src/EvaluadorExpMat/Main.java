package EvaluadorExpMat;

/**
 *
 * @author JLuis
 */
public class Main {
    
    public static void main(String [] Args){
        System.out.println("------------------------------------------------------------------------");
        testFraccion();
        System.out.println("------------------------------------------------------------------------");
        testComplejo();
        System.out.println("------------------------------------------------------------------------");
        testPotencia();
        System.out.println("------------------------------------------------------------------------");
        testCoordenada();
        System.out.println("------------------------------------------------------------------------");
    }
    
    private static void testFraccion(){
        ExpresionMatComp f1 = new Fraccion(2,5);
        ExpresionMatComp f2 = new Fraccion(3,7);

        System.out.println("Fraccion 1:");
        f1.mostrar();
        
        System.out.println("Evaluacion de fraccion 1:");
        System.out.println(f1.evaluar());
        
        System.out.println("Fraccion 2:");
        f2.mostrar();
        
        System.out.println("Evaluacion de fraccion 2:");
        System.out.println(f2.evaluar());
        
        System.out.println("Suma:");
        new Fraccion(f1.sumar(f2).valor1, f1.sumar(f2).valor2).mostrar();
        
        System.out.println("Resta:");
        new Fraccion(f1.restar(f2).valor1, f1.restar(f2).valor2).mostrar();
        
        System.out.println("Producto:");
        f1.producto(f2).mostrar();
    }
    
    private static void testComplejo(){
        ExpresionMatComp c1 = new Complejo(4,9);
        ExpresionMatComp c2 = new Complejo(3,7);

        System.out.println("Complejo 1:");
        c1.mostrar();
        
        System.out.println("Evaluacion de complejo 1:");
        System.out.println(c1.evaluar());
        
        System.out.println("Complejo 2:");
        c2.mostrar();
        
        System.out.println("Evaluacion de complejo 2:");
        System.out.println(c2.evaluar());
        
        System.out.println("Suma:");
        new Complejo(c1.sumar(c2).valor1, c1.sumar(c2).valor2).mostrar();
        
        System.out.println("Resta:");
        new Complejo(c1.restar(c2).valor1, c1.restar(c2).valor2).mostrar();
        
        System.out.println("Producto:");
        c1.producto(c2).mostrar();
    }
    
    private static void testPotencia(){
        ExpresionMatComp p1 = new Potencia(4,9);
        ExpresionMatComp p2 = new Potencia(4,7);

        System.out.println("Potencia 1:");
        p1.mostrar();
        
        System.out.println("Evaluacion de potencia 1:");
        System.out.println(p1.evaluar());
        
        System.out.println("Potencia 2:");
        p2.mostrar();
        
        System.out.println("Evaluacion de potencia 2:");
        System.out.println(p2.evaluar());
        
        System.out.println("Suma:");
        new Potencia(p1.sumar(p2).valor1, p1.sumar(p2).valor2).mostrar();
        
        System.out.println("Resta:");
        new Potencia(p1.restar(p2).valor1, p1.restar(p2).valor2).mostrar();
        
        System.out.println("Producto:");
        p1.producto(p2).mostrar();
    }
    
    private static void testCoordenada(){
        ExpresionMatComp c1 = new Coordenada(4,9);
        ExpresionMatComp c2 = new Coordenada(3,7);

        System.out.println("Coordenada 1:");
        c1.mostrar();
        
        System.out.println("Evaluacion de coordenada 1:");
        System.out.println(c1.evaluar());
        
        System.out.println("Coordenada 2:");
        c2.mostrar();
        
        System.out.println("Evaluacion de coordenada 2:");
        System.out.println(c2.evaluar());
        
        System.out.println("Suma:");
        new Coordenada(c1.sumar(c2).valor1, c1.sumar(c2).valor2).mostrar();
        
        System.out.println("Resta:");
        new Coordenada(c1.restar(c2).valor1, c1.restar(c2).valor2).mostrar();
        
        System.out.println("Producto:");
        c1.producto(c2).mostrar();
    }
}
