public class Figura{

    public float area(int lado){
        return lado * lado;
    }

    public float area(int ancho, int alto){
        return ancho * alto;
}

    public float area(float base, float altura){
        return(base * altura)/2;
    }

    //palabra static, metodo static no se crean objetos. no necesita instanciarse
    public static float perimetro(int lado){
        return lado*4;
    }
}