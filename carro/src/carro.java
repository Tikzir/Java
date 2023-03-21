import java.util.ArrayList;

public class carro {

    private String escuderia;
    private Motor motor;
    private ArrayList<ruedas> Rueda;

    public carro(String escuderia, String serialMotor, String fabricanteMotor){
        this.escuderia=escuderia;
        this.motor= new Motor(serialMotor,fabricanteMotor);
        this.Rueda = new ArrayList<ruedas>();
    }

    public void agregarRuedas(ruedas nueva){
        if(Rueda.size() <6){
            Rueda.add(nueva);
        }
        else{
            System.err.println("se ha sobrepasado la cantidad maxima de ruedas");
        }
    }

    public void reemplazarRuedas(ruedas reemplazar,int index){
         Rueda.set(index, reemplazar);
    }

    @Override
    public String toString(){
        String Salida = "escuderia de carro: " + this.escuderia + "\n";
            Salida += motor.toString() + "\n";
            Salida += "ruedas \n";
                for(ruedas ruedas: Rueda){
                    Salida += ruedas + "\n";
                }
                return Salida;
    }

public void mostrar(){
    System.out.println(this.toString());
}


}