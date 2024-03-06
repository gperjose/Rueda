
package practica_rueda;


public class RuedaGarciaPerezJose2324 {

    /**
     * @return the combustible_queda
     */
    public int getCombustible_queda() {
        return combustible_queda;
    }

    /**
     * @param combustible_queda the combustible_queda to set
     */
    public void setCombustible_queda(int combustible_queda) {
        this.combustible_queda = combustible_queda;
    }

    /**
     * @return the centimos_litro
     */
    public double getCentimos_litro() {
        return centimos_litro;
    }

    /**
     * @param centimos_litro the centimos_litro to set
     */
    public void setCentimos_litro(double centimos_litro) {
        this.centimos_litro = centimos_litro;
    }

    /**
     * @return the capacidad
     */
    public int getCapacidad() {
        return capacidad;
    }

    /**
     * @param capacidad the capacidad to set
     */
    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    /**
     * @return the consumoGarciaPerezJose
     */
    public int getConsumoGarciaPerezJose() {
        return consumoGarciaPerezJose;
    }

    /**
     * @param consumoGarciaPerezJose the consumoGarciaPerezJose to set
     */
    public void setConsumoGarciaPerezJose(int consumoGarciaPerezJose) {
        this.consumoGarciaPerezJose = consumoGarciaPerezJose;
    }
    
    private int combustible_queda;  
    private double centimos_litro;
    private int capacidad;//capacidad depósito .Se supone que es litros.
    private int consumoGarciaPerezJose = 6;//litros a los cien
  

    
    public RuedaGarciaPerezJose2324() {
    }

       
    public RuedaGarciaPerezJose2324(int combustible_queda, int centimos_litro, int capacidad) {
        this.combustible_queda = combustible_queda;
        this.centimos_litro = centimos_litro;
        this.capacidad = capacidad;
        
    }

    public int getcombustible()
    {
        return(getCombustible_queda());
    }
 
    public void viaje(int km) throws Exception {
        
        if (km * this.getConsumoGarciaPerezJose()/100 > this.getCombustible_queda()) {
                throw new Exception("No hay suficiente combustible para esa distancia");
        }
        if (km <= 0) {
            throw new Exception("No tiene sentido recorrer una distancia que no sea positiva");
        }
        this.setCombustible_queda(this.getCombustible_queda() - (km * this.getConsumoGarciaPerezJose() / 100)); 
        
    }
     

    
      public void rellenar(int litros, double dinero) throws Exception {
            
        if ((dinero <= 0)  || (litros <= 0)){
            throw new Exception("No se puede rellenar el depósito.");
        }
       
        if (this.getCombustible_queda() + litros > getCapacidad()) {
            throw new Exception("No se puede rellenar, porque se supera la capacidad del depósito");
        }
        if (dinero < litros * getCentimos_litro()) {
            throw new Exception("No tiene dinero suficiente para rellenar el depósito.");
        }
        this.setCombustible_queda(this.getCombustible_queda() + litros);
        
    }

}


    
    
    

