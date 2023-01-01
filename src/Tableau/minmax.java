package Tableau;

import java.util.Scanner;

public class minmax {

    public static void main(String[] args) {
        int[] v={1,7,99,5,0,4,22,12};
        int min=v[0],max=v[0];
        for (int i=1;i<v.length;i++){
            if(min>v[i]){
                min=v[i];
            }
            if(max<v[i]){
                max=v[i];
            }
        }

        System.out.println("max = "+max);
        System.out.println("min = "+min);

    }

    }
