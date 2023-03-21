public class jugador {
    private int dorsal;
    private String posicion;
    private persona p;

    public jugador(){

    }

    public jugador(int dorsal, String posicion,String nombre,String apellido){
        setDorsal(dorsal);
        this.posicion="";
        p = new persona(nombre, apellido);
    }
@Override
    public String toString(){
        return "jugador (dorsal: " + this.dorsal + " posicion: " + this.posicion + " " + p + ")";
    }

    public void setDorsal(int n){
        if(n<0){
            System.err.println("el dorsal puesto es menor que 0, su numero sera 0");
            this.dorsal=0;
        }
        if(n>99){
            System.err.println("el dorsal puesto es mayor que 99, su numero sera 99");
            this.dorsal=99;
        }
        if (n<0 && n>99);
        else{
            this.dorsal=n;
        }

    }
    public int getDorsal() {
        return this.dorsal;
    }
    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public String getPosicion() {
        return this.posicion;
    }



}