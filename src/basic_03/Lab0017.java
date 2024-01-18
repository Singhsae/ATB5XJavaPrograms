package src.basic_03;

public class Lab0017 {
    public static void main(String[] args) {
        String name ="The Testing Academy";
        String name1="The Testing Academy";
        String name2 =new String("The Testing academy");

        System.out.println(name==name1);
        System.out.println(name==name2);
        System.out.println(name.equals(name2));
        System.out.println(name.equalsIgnoreCase(name2));
        System.out.println(name.length());
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
    }
}
