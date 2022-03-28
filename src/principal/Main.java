package principal;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	char [] n1= new char[]{'a','b','c','d','e','f','g','i','j'};
    char [] n2;

        n2=Arrays.copyOf(n1, n1.length+10);
        Arrays.sort(n2);
        int posicion = Arrays.binarySearch(n2,'a');
        Arrays.fill(n2, 0,posicion,'~');
        Arrays.sort(n2);
        System.out.println(Arrays.toString(n2));

        //poner h
        int posicion2 = Arrays.binarySearch(n2,'i');
        char insertar='h';
        for (int i =posicion2; i<n2.length;i++){
            char guardado=n2[i];
             n2[i]=insertar;
             insertar=guardado;
        }
        System.out.println(Arrays.toString(n2));


        //borrar a

        posicion2 = Arrays.binarySearch(n2,'j');
        insertar='~';
        for (int i =posicion2; i>=0;i--){
            char guardado=n2[i];
            n2[i]=insertar;
            insertar=guardado;
        }
        System.out.println(Arrays.toString(n2));
    }
}
