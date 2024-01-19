public class sparsematrix {
    public static void main (String [] deb ){
        int a[][]=new int [][]{
                {0,0,3,4},
                {5,0,0,0}

        };
     int  row,col,cout=0;
     row=a.length;
     col=a[1].length;
     int size=row*col;
     for(int i=0;i<row;i++)
         for(int j=0;j<col;j++)
             if(a[i][j]==0)
                 cout++;
     if(cout> size/2)
         System.out.println("searsematrix");
     else System.out.println("not searsematrix");



    }


}
