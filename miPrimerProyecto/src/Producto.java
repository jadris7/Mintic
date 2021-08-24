import jdk.javadoc.internal.doclets.formats.html.SourceToHTMLConverter;

public class Producto {
    private String nombre = " ";
    private float precio = 0.0f;
    
    public void mostrar(){
        System.out.println("El nombre es: "+nombre+", el precio:"+ precio);
        System.out.println("Fin")
    }
}
