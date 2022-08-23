//2d array in java taking input auto....


public class array {
    public static void main(String[] args) {
        int arr[][]=new int [4][4];
        int i,j,k=1;
        for(i=0;i<4;i++)
        {
            for(j=0;j<i;j++)
            {
                arr[i][j]=k;
                k=k++;
            }
        }
        for(i=0;i<4;i++)
        {
            for(j=0;j<4;j++)
            {
                System.out.println(arr[i][j]+"");
            }
            System.out.println();
        }


    }
    
}
