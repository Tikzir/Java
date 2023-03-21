public class equipo{
    private String nameTeam;
    private jugador[] plantel;
    private int cantJugadores;
    private int capacity = 5;

    public equipo(String nom){
        this.nameTeam=nom;
        this.plantel= new jugador[5];
        this.cantJugadores=0;
    }

    public void agregarJugador(jugador pla){
        int contador = 0;

        if( plantel.length < capacity){
            plantel[contador] = pla;
            contador++;
        }
        else {
            System.err.println("¡el equipo ha sido contado!");
        }
    }

    public String toString(){
        String salida = "Equipo" + this.nameTeam + "\n";
        salida += "========PLAYER========";
        if(cantJugadores>0){
            for (jugador pla: plantel){
                salida += pla + "\n";
            }
        }
    return salida;
    }
}
