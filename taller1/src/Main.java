import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        equipo myTeam;
        equipo nuevoEquipo=new equipo("LPK's");

        jugador j1 = new jugador(19,"ala-pivot","karl", "sagan");
        jugador j2 = new jugador(330, "al", "patrick", "cooniggan");
        jugador p3=new jugador(-1, "ero", "scottie", "pippens");
        jugador p4=new jugador(30, "base", "stephen", "curry");
        jugador p5=new jugador(1, "GoealKeeper", "Stevens", "Michael");
    }
}

   /* public static void main(String[] args) {
        persona yo=new persona("pedro", "sanchez" );
        jugador player= new jugador(12, "pivot", "leonel", "garcia");

        Scanner keyboard= new Scanner(System.in);

        System.out.println("introduzca un nombre ");
        yo.setNombre(keyboard.nextLine());

        System.out.println("introduzca apellido");
        yo.setApellido(keyboard.nextLine());

        System.out.println("introduzca el dorsal del jugador");
        player.setDorsal(keyboard.nextInt());
        keyboard.nextLine();

        System.out.println("introduzca la posicion del jugador");
        player.setPosicion(keyboard.nextLine());


        keyboard.close();

        System.out.println(player);



    }
}*/