package Animales;
public abstract class Animal {
   protected String sonido;
   protected String alimentos;
   protected String habitat;
   protected String nombreCientifico;
    public abstract String getNombreCientifico();
   public abstract String getSonido();
   public abstract String getAlimentos();
   public abstract String getHabitat();
}

package Animales;
public abstract class Canido extends Animal {
}

package Animales;
public class Perro extends Canido {
   public String getSonido() {
       return "Ladrido";
   }
   public String getAlimentos() {
       return "Carnivoro";
   }
   public String getHabitat() {
       return "Domestico";
   }
   public String getNombreCientifico() {
       return "Canis lupus familiaris";
   }
}

package Animales;
public class Lobo extends Canido {
   public String getSonido() {
       return "Aullido";
   }
   public String getAlimentos() {
       return "Carnivoro";
   }
   public String getHabitat() {
       return "Bosque";
   }
   public String getNombreCientifico() {
       return "Canis lupus";
   }
}

package Animales;
public abstract class Felino extends Animal {
}

package Animales;
public class Leon extends Felino {
   public String getSonido() {
       return "Rugido";
   }
   public String getAlimentos() {
       return "Carnivoro";
   }
   public String getHabitat() {
       return "Praderas";
   }
   public String getNombreCientifico() {
       return "Panthera leo";
   }
}

package Animales;
public class Gato extends Felino {
   public String getSonido() {
       return "Maullido";
   }
   public String getAlimentos() {
       return "Ratones";
   }
   public String getHabitat() {
       return "Domestico";
   }
   public String getNombreCientifico() {
       return "Felis silvestris catus";
   }
}

package Animales;
public class Prueba {
   public static void main(String[] args) {
       Animal[] animales = new Animal[4];
       animales[0] = new Gato();
       animales[1] = new Perro();
       animales[2] = new Lobo();
       animales[3] = new Leon();
       for (int i = 0; i < animales.length; i++) {
           System.out.println(animales[i].getNombreCientifico());
           System.out.println("Sonido: " + animales[i].getSonido());
           System.out.println("Alimentos: " + animales[i].getAlimentos());
           System.out.println("Habitat: " + animales[i].getHabitat());
           System.out.println();
       }
   }
}
