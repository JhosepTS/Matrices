
package ejercicios.de.matriz;
//EJERCICIO: MATRIZ DE 10X1O INGRESADO POR TECLADO QUE SUME TODAS LA COMUNAS DE LA MATRIZ
import java.util.Arrays;

public class Ejercicio04 {

    public static void main(String[] args) {
     int[][]matriz = new int[10][10];
int f=0;
int j=0;
int suma=0;
int resta =0;
int b =1;
for (f=0 ; f < matriz.length ; f++){
for (j=0 ; j < matriz.length ; j++){

matriz[f][j]=(int)(Math.random()*100+1);

}
}
for (f=0 ; f < matriz.length ; f++){
System.out.println(Arrays.toString (matriz [f]));

}
for (int i = 0; i < 10; i++) {
        
    
resta=0;
for (j=0 ; j < matriz.length ; j++){
    
resta = resta + matriz[i][j];
    
}
System.out.println("La suma de la columna "+i+" es:"+resta);

}
    }
    
}
