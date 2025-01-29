public class persona {
   private String nombre;
   private String apellidos;
   private String telefono;
   private String direccion;


   public persona(String nombre, String apellido, String telefono, String direccion) {
       this.nombre=nombre;
       this.apellidos = apellido;
       this.telefono = telefono;
       this.direccion = direccion;
   }
}

public class Principal {


   public static void main(String[] args){


       VentanaPrincipal ventana= new VentanaPrincipal();
       ventana.setVisible(true);
   }
}


import java.util.*;


public class ListaPersonas {


   public static ArrayList<persona> personas;


   public ListaPersonas(){
       personas = new ArrayList();
   }
   public void añadirPersona(persona p) {
       personas.add(p);
   }
   public void eliminarPersona(int i) {
       personas.remove(i);
   }
   public void borrarLista() {
       personas.removeAll(personas);
   }
}
