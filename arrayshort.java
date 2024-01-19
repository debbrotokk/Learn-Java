import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

public class arrayshort {
    public static void main(String[] args) {
        int a[]={10,344,6,7,8,40,2,5,2,3,4,5,6,6};
      //  int b[]=a; // por a  jodi ( a )kicu change kri seta b teo change hbe




        Arrays.sort(a); // full array short hbe
      //  Arrays.sort(a,1,5);  // 1 theke suru hbe and 1 shoho (5-1) 4 ta change hbe

      //  Arrays.sort(a, Collections.reverseOrder());  // ai somoy array ta    Integer a[]={10,344,6,7,8,40,2,5,2,3,4,5,6,6}; aivabe declear korte hbe

//        System.out.println("Modified arr[] : "
//                + Arrays.toString(a));

        for(int i=0;i<a.length;i++)
            System.out.println(a[i]);





    }

}
