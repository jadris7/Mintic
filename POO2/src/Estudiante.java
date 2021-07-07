//relación de herencia
public class Estudiante  extends Persona{
    //atributos de estudiantes
    String facultad;

    public Estudiante(int identificacion, String nombre, String apellido, String facultad){
        super(identificacion, nombre, apellido);
        this.facultad = facultad;
    }
}
