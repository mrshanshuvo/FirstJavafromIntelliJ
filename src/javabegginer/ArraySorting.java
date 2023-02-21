package javabegginer;

import java.util.Arrays;

public class ArraySorting {
    public static void main(String[] args) {
        int [] arr_1d = {27,2,6,1,8,19,34,3556,234};

        Arrays.sort(arr_1d);

        for (int j : arr_1d) {
            System.out.println("Ascending: "+j);
        }
        for (int i=arr_1d.length-1; i>=0; i-- ){
            System.out.println("Descending: "+arr_1d[i]);
        }

    }
}
