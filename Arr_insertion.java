public class Arr_insertion {
    public static void main(String[] args) {
        int n=5;
        int a[];
        int b[]=new  int[n+1];
      //   a= new int[] {1,2,3,4,5,6,7,8}; aitao kra jabe
         a=new  int[]{1,2,3,4,5};

        int insertindex=3-1;
        int insertvalue=10;
        for(int i=0;i<n+1;i++){
           if(i<insertindex)
             b[i]=a[i];
           else if (i==insertindex)
               b[i]=insertvalue;
               else
               b[i]=a[i-1];

           }

        for(int i=0;i<n+1;i++){

            System.out.println(b[i]);
        }


        }


    }



