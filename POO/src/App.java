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
    
    }
}

//Clase inician con mayúscula
class Perro{
    String nombre;
    String raza;
    int edad;

    //void no hay que instanciar, crear métodos, inician en minúscula

    void establecerAtributos(String nombrePerro, String razaPerro, int edadPerro){
        nombre = nombrePerro;
        raza = razaPerro;
        edad = edadPerro;
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