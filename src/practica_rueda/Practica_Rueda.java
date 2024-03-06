
package practica_rueda;


public class Practica_Rueda {

    
    public static void main(String[] args) {
    
       
        RuedaGarciaPerezJose2324 rueda = new RuedaGarciaPerezJose2324(40,2,50);
        
        viaje1_GarciaPerezJose(rueda);
        
        viaje2_GarciaPerezJose(rueda);
        
        viaje3_GarciaPerezJose(rueda);
        
        
        rellenar1_GarciaPerezJose(rueda);
        
        rellenar2_GarciaPerezJose(rueda);
         
    }

    private static void rellenar2_GarciaPerezJose(RuedaGarciaPerezJose2324 rueda) {
        //Vamos a rellenar el depósito con muchos litros y un dinero
        try{
            System.out.println("Vamos a intentar rellenar el depósito con muchos litros y un dinero.");
            rueda.rellenar(100,40);
            System.out.println("PRINCIPAL. Quedan: " + rueda.getcombustible() + " litros de combustible.");
        }catch(Exception e){
            System.out.println("No se ha podido rellenar el deposito" + e);
        }
    }

    private static void rellenar1_GarciaPerezJose(RuedaGarciaPerezJose2324 rueda) {
        //Vamos a rellenar el depósito con unos cuantos litros y un dinero
        try{
            System.out.println("Vamos a intentar rellenar el depósito con unos litros y un dinero.");
            rueda.rellenar(10,40);
            System.out.println("PRINCIPAL. Quedan: " + rueda.getcombustible() + " litros de combustible.");
        }catch(Exception e){
            System.out.println("No se ha podido rellenar el deposito" + e);
        }
    }

    private static void viaje3_GarciaPerezJose(RuedaGarciaPerezJose2324 rueda) {
        //Vamos a intentar realizar un viaje y recorrer muchos kilómetros
        try{
            System.out.println("Vamos a intentar hacer un viaje y recorrer unos kilometros.");
            rueda.viaje(800);
            System.out.println("PRINCIPAL. Quedan: " + rueda.getcombustible() + " litros de combustible.");
        }catch(Exception e){
            System.out.println("Error al hacer el viaje" + e);
        }
    }

    private static void viaje2_GarciaPerezJose(RuedaGarciaPerezJose2324 rueda) {
        //Vamos a intentar realizar un viaje, con un kilometros en negativo
        
        try{
            System.out.println("Vamos a intentar hacer un viaje y recorrer unos kilometros.");
            rueda.viaje(-80);
            System.out.println("PRINCIPAL. Quedan: " + rueda.getcombustible() + " litros de combustible.");
        }catch(Exception e){
            System.out.println("Error al hacer el viaje" + e);
        }
    }

    private static void viaje1_GarciaPerezJose(RuedaGarciaPerezJose2324 rueda) {
        //Vamos a intentar realizar un viaje y recorreremos unos kilomentros
        
        try{
            System.out.println("Vamos a intentar hacer un viaje y recorrer unos kilometros.");
            rueda.viaje(80);
            System.out.println("PRINCIPAL. Quedan: " + rueda.getcombustible() + " litros de combustible.");
        }catch(Exception e){
            System.out.println("Error al hacer el viaje" + e);
        }
    }
    
}
