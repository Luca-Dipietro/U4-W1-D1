import java.util.Arrays;

public class Es1 {
    public static void main(String[] args) {

    int resultMultiply = multiply(2,6 );
    System.out.println("Result multiply: " + resultMultiply);

    String resultConcat = concat("My favourite number: ", 16);
    System.out.println(resultConcat);

    String[] startArray={"A","B","D","E","F"};
    String inStr="C";
    String[] endArray=inArray(startArray,inStr);
    System.out.println(Arrays.toString(endArray));
}

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static String concat(String str, int num) {
        return str + num;
    }

    public static String[] inArray(String[] array,String str ){
        String[] newArray = new String[6];
        System.arraycopy(array, 0, newArray, 0, 2);
        newArray[2]=str;
        System.arraycopy(array,2,newArray,3,3);
        return newArray;
    }

}
