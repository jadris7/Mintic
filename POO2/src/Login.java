public class Login {
    String usuario;
    String clave;

    //Constructor
    public Login(String usuario, String clave){
        this.usuario = usuario;
        this.clave = clave;
    }

    public Login(){
        this.usuario = "";
        this.clave = "";
    }

    public Login(String usuario){
        this.usuario = usuario;
        this.clave = String.valueOf((int)Math.floor(Math.random()*1000));//número aleatorio de 3 cifras
   }

   //Método
   public void mostrarDatos(){
       System.out.println("Su nombre de usaurio es "+this.usuario+" y su contraseña es "+this.clave);
   }
}
