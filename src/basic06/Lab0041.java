package src.basic06;

public class Lab0041 {
    public static void main(String[] args) {

        int [] marks={89,78,55,66,77};
        System.out.println(marks.length);
        System.out.println("At first index :"+marks[0]);
        System.out.println(marks[2]);
        System.out.println(marks[4]);

        int [] a =new int[4];
        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);
        System.out.println(a[3]);

       a[0]=78;
        System.out.println(a[0]);

        final int[] b=new int[4];
        b[0]=78;
        System.out.println(b[0]);
    }
}
