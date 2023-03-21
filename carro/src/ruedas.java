public class ruedas {
    private int compuesto;

    public ruedas(int compuesto){
        setCompuesto(compuesto);
    }
    @Override
    public String toString(){
        return "el compuesto de la rueda es: " + getCompuesto();
    }

    public void setCompuesto(int comp){
        if (comp<0){
            System.err.println("el compuesto no puede ser menos que cero");
            this.compuesto=0;
        }
        if(comp>6){
            System.err.println("el compuesto no puede ser mayor que seis");
            this.compuesto=6;
        }
        if(comp>=0&&comp<=6){
            this.compuesto = comp;
        }
    }

    public int getCompuesto() {
        return compuesto;
    }

}
