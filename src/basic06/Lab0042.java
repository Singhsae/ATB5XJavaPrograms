package src.basic06;

public class Lab0042 {
    public static void main(String[] args) {
        int [] arr1={1,2,3,4,5};
        int [] arr2={1,2,3,4,5};
        String a="sanjeev";
        String b="sanjeev";
        System.out.println(a==b);
        System.out.println(a.equals(b));
        System.out.println(arr1==arr2);
        int [] arr3 =arr1;
        System.out.println(arr1==arr3);
        System.out.println(arr3==arr2);
        System.out.println(arr1.equals(arr2));
        //incase of string answer is true---we are comparing values
        //Incase of arrays we dont compare values
    }

}
