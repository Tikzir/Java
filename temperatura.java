import java.util.Scanner;

class Temperaturas {
    public static void main(String[] args) {
        double[] medidas = new double[7];
        Scanner teclado = new Scanner(System.in);
        for (int idx = 0; idx < 7; idx++) {
            System.out.printf("escriba la temperatura a las %d:00 horas \n", idx + 8);
            medidas[idx] = teclado.nextDouble();
        }
        teclado.close();
       /* System.out.println("Las temperaturas medidas son: ");
        for (double medida : medidas) {
            System.out.println(medida);
        }*/

        double maxTemp=0f;
        double minTemp=1000;
        double avgTemp=0;
        double counter=0;

        for(int i=0; i<7;++i){
            if(medidas[i]>maxTemp) {
                maxTemp = medidas[i];
            }
        }

        for(int i = 0; i < 7; ++i){

            if(medidas[i] < minTemp){

                minTemp = medidas[i];
            }
        }

        for(int i = 0; i < 7 ; ++i){
            counter+=medidas[i];
        }
        avgTemp=counter/(medidas.length);

        System.out.println("La temperatura máxima es: " + maxTemp);
        System.out.println("La temperatura mínima es: " + minTemp);
        System.out.println("El promedio de temperatura es: " + avgTemp);
    }
}
