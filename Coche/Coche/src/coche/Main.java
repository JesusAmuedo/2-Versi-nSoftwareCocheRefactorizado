
package coche;

/**
 *
 * @author Fran
 */
public class Main {
    
      public static void main(String[] args) {
        Coche MiCoche;
        int stockActual;
        
        MiCoche = new Coche("Opel",12000,500);
        operatoria_coches(MiCoche); 
        stockActual = MiCoche.obtenerStock();
        System.out.println("El stock actual es"+ stockActual );
    }

    public static void operatoria_coches(Coche Coche1) {
        operatoria_coches2(Coche1);
    }

    public static void operatoria_coches2(Coche Coche1) {
        try
        {
            System.out.println("Venta de Coches");
            Coche1.vender(300);
        } catch (Exception e)
        {
            System.out.print("Fallo al vender");
        }
        
        try
        {
            System.out.println("Compra de Coches");
            Coche1.comprar(500);
        } catch (Exception e)
        {
            System.out.print("Fallo al ingresar");
        }
    }

}
    
