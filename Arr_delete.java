public class Arr_delete {
    public static void main(String[] args){
        int a[]=new  int []{1,2,3,4,5,6,7};
        int deleteindex=3-1;
        for (int i=0;i<a.length-1;i++){
            if (i>=deleteindex)
                a[i]=a[i+1];
            }

        for (int i=0;i<a.length-2;i++)
            System.out.println(a[i]);





    }

}
