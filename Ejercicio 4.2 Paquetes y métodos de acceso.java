
package Inmuebles;
public class Inmueble {
   protected int identificadorInmobiliario;
   protected int area;
   protected String direccion;
   protected double precioVenta;
   Inmueble(int identificadorInmobiliario, int area, String direccion) {
       this.identificadorInmobiliario = identificadorInmobiliario;
       this.area = area;
       this.direccion = direccion;
   }
   void calcularPrecioVenta(double valorArea) {
       precioVenta = area * valorArea;
   }
   void imprimir() {
       System.out.println("Identificador inmobiliario = " + identificadorInmobiliario);
       System.out.println("Area = " + area);
       System.out.println("Direccion = " + direccion);
       System.out.println("Precio de venta = $" + precioVenta);
   }
}

package Inmuebles;
public class InmuebleVivienda extends Inmueble {
   protected int numeroHabitaciones;
   protected int numeroBanos;
   public InmuebleVivienda(int identificadorInmobiliario, int area, String direccion, int numeroHabitaciones, int numeroBanos) {
       super(identificadorInmobiliario, area, direccion);
       this.numeroHabitaciones = numeroHabitaciones;
       this.numeroBanos = numeroBanos;
   }


   void imprimir() {
       super.imprimir();
       System.out.println("Numero de habitaciones = " + numeroHabitaciones);
       System.out.println("Numero de baños = " + numeroBanos);
   }
}

package Inmuebles;
public class Local extends Inmueble {
   enum tipo {INTERNO,CALLE};
   protected tipo tipoLocal;
   public Local(int identificadorInmobiliario, int area, String direccion, tipo tipoLocal) {
       super(identificadorInmobiliario, area, direccion);
       this.tipoLocal = tipoLocal;
   }
   void imprimir() {
       super.imprimir();
       System.out.println("Tipo de local = " + tipoLocal);
   }
}

package Inmuebles;
public class Casa extends InmuebleVivienda {
   protected int numeroPisos;
   public Casa(int identificadorInmobiliario, int area, String direccion, int numeroHabitaciones, int numeroBanos, int numeroPisos) {
       super(identificadorInmobiliario, area, direccion, numeroHabitaciones, numeroBanos);
       this.numeroPisos = numeroPisos;
   }
   void imprimir() {
       super.imprimir();
       System.out.println("Numero de pisos = " + numeroPisos);
   }
}

package Inmuebles;
public class Apartamento extends InmuebleVivienda {
   public Apartamento(int identificadorInmobiliario, int area, String direccion, int numeroHabitaciones, int numeroBanos) {
       super(identificadorInmobiliario, area, direccion, numeroHabitaciones, numeroBanos);
   }
   void imprimir() {
       super.imprimir();
   }
}

package Inmuebles;
public class LocalComercial extends Local {
   protected static double valorArea = 3000000;
   protected String centroComercial;
   public LocalComercial(int identificadorInmobiliario, int area, String direccion, tipo tipoLocal, String centroComercial) {
       super(identificadorInmobiliario, area, direccion, tipoLocal);
       this.centroComercial = centroComercial;
   }
   void imprimir() {
       super.imprimir();
       System.out.println("Centro comercial = " + centroComercial);
       System.out.println();
   }
}


package Inmuebles;
public class Oficina extends Local {
   protected static double valorArea = 3500000;
   protected boolean esGobierno;
   public Oficina(int identificadorInmobiliario, int area, String direccion, tipo tipoLocal, boolean esGobierno) {
       super(identificadorInmobiliario, area, direccion, tipoLocal);
       this.esGobierno = esGobierno;
   }
   void imprimir() {
       super.imprimir();
       System.out.println("Es oficina gubernamental = " + esGobierno);
       System.out.println();
   }
}

package Inmuebles;
public class CasaRural extends Casa {
   protected static double valorArea = 1500000;
   protected int distanciaCabera;
   protected int altitud;
   public CasaRural(int identificadorInmobiliario, int area, String direccion, int numeroHabitaciones, int numeroBanos, int numeroPisos, int distanciaCabera, int altitud) {
       super(identificadorInmobiliario, area, direccion, numeroHabitaciones, numeroBanos, numeroPisos);
       this.distanciaCabera = distanciaCabera;
       this.altitud = altitud;
   }
   void imprimir() {
       super.imprimir();
       System.out.println("Distancia la cabecera municipal = " + numeroHabitaciones + " km.");
       System.out.println("Altitud sobre el nivel del mar = " + altitud + " metros.");
       System.out.println();
   }
}

package Inmuebles;
public class CasaUrbana extends Casa {
   public CasaUrbana(int identificadorInmobiliario, int area, String direccion, int numeroHabitaciones, int numeroBanos, int numeroPisos) {
       super(identificadorInmobiliario, area, direccion, numeroHabitaciones, numeroBanos, numeroPisos);
   }
   void imprimir() {
       super.imprimir();
   }
}

package Inmuebles;
public class ApartamentoFamiliar extends Apartamento {
   protected static double valorArea = 2000000;
   protected int valorAdministracion;
   public ApartamentoFamiliar(int identificadorInmobiliario, int area, String direccion, int numeroHabitaciones, int numeroBanos, int valorAdministracion) {
       super(identificadorInmobiliario, area, direccion, numeroHabitaciones, numeroBanos);
       this.valorAdministracion = valorAdministracion;
   }
   void imprimir() {
       super.imprimir();
       System.out.println("Valor de la administracion = $" + valorAdministracion);
       System.out.println();
   }
}

package Inmuebles;
public class Apartaestudio extends Apartamento {
   protected static double valorArea = 1500000;
   public Apartaestudio(int identificadorInmobiliario, int area, String direccion, int numeroHabitaciones, int numeroBanos) {
       super(identificadorInmobiliario, area, direccion, 1, 1);
   }
   void imprimir() {
       super.imprimir();
       System.out.println();
   }
}

package Inmuebles;
public class CasaConjuntoCerrado extends CasaUrbana {
   protected static double valorArea = 2500000;
   protected int valorAdministracion;
   protected boolean tienePiscina;
   protected boolean tieneCamposDeportivos;
   public CasaConjuntoCerrado(int identificadorInmobiliario, int area, String direccion, int numeroHabitaciones, int numeroBanos,
                              int numeroPisos, int valorAdministracion, boolean tienePiscina, boolean tieneCamposDeportivos) {
       super(identificadorInmobiliario, area, direccion,
               numeroHabitaciones, numeroBanos, numeroPisos);
       this.valorAdministracion = valorAdministracion;
       this.tienePiscina = tienePiscina;
       this.tieneCamposDeportivos = tieneCamposDeportivos;
   }
   void imprimir() {
       super.imprimir();
       System.out.println("Valor de la administracion = " + valorAdministracion);
       System.out.println("Tiene piscina? = " + tienePiscina);
       System.out.println("Tiene campos deportivos? = " + tieneCamposDeportivos);
       System.out.println();
   }
}

package Inmuebles;
public class CasaIndependiente extends CasaUrbana {
   protected static double valorArea = 3000000;
   public CasaIndependiente(int identificadorInmobiliario, int area, String direccion, int numeroHabitaciones, int numeroBanos, int numeroPisos) {
       super(identificadorInmobiliario, area, direccion, numeroHabitaciones, numeroBanos, numeroPisos);
   }
   void imprimir() {
       super.imprimir();
       System.out.println();
   }
}

package Inmuebles;
public class Prueba {
   public static void main(String[] args) {
       ApartamentoFamiliar apto1 = new ApartamentoFamiliar(103067,120,"Avenida Santander 45-45",3, 2,200000);
       System.out.println("Datos apartamento");
       apto1.calcularPrecioVenta(apto1.valorArea);
       apto1.imprimir();
       System.out.println("Datos apartamento");
       Apartaestudio aptestudio1 = new Apartaestudio(12354,50,"Avenida Caracas 30-15",1,1);
       aptestudio1.calcularPrecioVenta(aptestudio1.valorArea);
       aptestudio1.imprimir();
   }
}
