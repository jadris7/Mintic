public class App {
    public static void main(String[] args) throws Exception {
        
        Login usuario1 = new Login("Adriana", "123");//instancia
        System.out.println("El nombre del usaurio es "+usuario1.usuario+" y la clave es "+usuario1.clave);

        //instancia class Figura sobrecarga de métodos
        Figura cuadrado = new Figura();
        Figura triangulo = new Figura();
        Figura rectangulo = new Figura();
        float areaCuadrado = cuadrado.area(5);
        float areaRectangulo = rectangulo.area(8,5);
        float areaTriangulo = triangulo.area(4.0f, 3.0f);
        System.out.println("Area del cuadrado: "+areaCuadrado);
        System.out.println("Area del rectángulo: "+areaRectangulo);
        System.out.println("Area del triángulo: "+areaTriangulo);
        
        //instancia de la clase login, sobrecarga de constructores
        Login user1 = new Login();
        Login user2 = new Login("María", "456");
        Login user3 = new Login("Laura");
        user1.mostrarDatos();
        user2.mostrarDatos();
        user3.mostrarDatos();
        System.out.println("----------------------------------");

        //imprimir metodo Perimetro 
        System.out.println("El perimetro es: "+Figura.perimetro(3));

        //instancia de la clase Estudiante
        Estudiante student1 = new Estudiante(1234567, "Jeferson", "Giraldo", "Ingeniería");

        System.out.println("Datos del estudiante");
        System.out.println("ID: "+student1.identificacion+", Nombre: "+student1.nombre+", Apellido: "+student1.apellido+", Facultad: "+student1.facultad);
    }
}
