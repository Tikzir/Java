public class main {
    public static void main(String [] args){

        carro nuevoCarro=new carro("tiosFC", "w2w5we1er5","tinoco");
        nuevoCarro.agregarRuedas(new ruedas(-3));

        nuevoCarro.agregarRuedas(new ruedas(25));
        nuevoCarro.agregarRuedas(new ruedas(8));

        //nuevoCarro.reemplazarRuedas(new ruedas(4),2);
        System.out.println(nuevoCarro);

    }

}