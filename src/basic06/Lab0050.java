package src.basic06;

public class Lab0050 {
    public static void main(String[] args) {
        int a[]={1,2,3};
        int arr[][]=new int[3][3];
        int arr2[][]=new int [3][3];
        arr[0][0]=12;
        arr[0][1]=34;
        arr[0][2]=34;
        //initializing 2 array

        arr[1][0]=21;
        arr[1][1]=22;
        arr[1][2]=23;

        //initializing 3 array

        arr[2][0]=31;
        arr[2][1]=32;
        arr[2][2]=33;

        for(int i=0;i<a.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println("\t");
        }

    }
}
