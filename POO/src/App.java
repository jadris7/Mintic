public class App {
    public static void main(String[] args) throws Exception {
        //clases y objetos
        Perro perro1 = new Perro(); //instancia

        perro1.establecerAtributos("Tobi", "Pincher", 3);

        //perro1.edad =2;
        //perro1.nombre = "Milo";
        //perro1.raza = "YorkShire";

        System.out.println("El nombre es: "+perro1.nombre);    
        System.out.println("La raza es: "+perro1.raza);
        System.out.println("La edad es: "+perro1.edad);
    
        perro1.comer();
        perro1.dormir();
        perro1.ladrar();

        //instanciar la clase rectangulo
        Rectangulo rectangulo1 = new Rectangulo();
        rectangulo1.alto = 5;
        rectangulo1.ancho = 10;
        float resultado = rectangulo1.area();
        System.out.println("El área del rectángulo es: "+resultado);
    }
}

//Clase inician con mayúscula
class Perro{
    String nombre;
    String raza;
    int edad;

    //void no hay que retornar valores, crear métodos, inician en minúscula

    void establecerAtributos(String nombre, String raza, int edad){
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
    }

    void comer(){
        System.out.println("El perro está comiendo");
    }

    void dormir(){
        System.out.println("El perro está durmiendo");
    }

    void ladrar(){
        System.out.println("El perro está ladrando");
    }
}

class Rectangulo{
    float ancho;
    float alto;

    float area(){
        return(this.ancho * this.alto);
    }
}