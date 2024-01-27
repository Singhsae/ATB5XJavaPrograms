package src.basic06;

public class Lab0056 {
    public static void main(String[] args) {
        String name="Sanjeev";
        System.out.println(name.concat( " Singh"));
        System.out.println(name +" Kumar");
        System.out.println(name.contains("f"));
        System.out.println(name);
       // String name2 =new String("Singh");
        String expected_result ="pass@123";
        String actual_result ="Pass@123";
        if(expected_result.equalsIgnoreCase(actual_result)){
            System.out.println("Yes");
        }

    }
}
