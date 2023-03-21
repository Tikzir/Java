package entradas;

import java.util.Scanner;

public class Temperaturas {
    public static void main(String[] args){
        double[] medidas = new double[7];
        Scanner teclado = new Scanner(System.in);
        double suma=0;
        double prom=0;
        for(int hora = 8;hora <= 14;hora++){
            System.out.printf("Escriba la temperatura a las %d:00 horas \n",hora);
            medidas[hora-8] = teclado.nextDouble();

        }
        for(int i=0; i<7;i++){
            double mayor=0;
            if(mayor<medidas[i]){
                mayor=medidas[i];
            }
            for(int i = 0; i < 7; ++i){
                double menor = 100;
                if(medidas[i] < menor){
                    menor = medidas[i];
                }
            }

            for(int i = 0; i < 7; ++i){
                suma += medidas[i];

            }

            prom = suma/(medidas.lenght());
            
            System.out.printf("la mayor temperatura es: %.2f \n la menor temperatura es: %.2f \n", mayor, menor);
            System.out.println("el promedio es: " + prom);
        }
        
             teclado.close();
        }
       

        
        }

    
