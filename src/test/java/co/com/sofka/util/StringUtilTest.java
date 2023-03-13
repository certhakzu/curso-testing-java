package co.com.sofka.util;



public class StringUtilTest {
    public static void main(String[] args) {

        String result = StringUtil.repeat("hola", 3);
        //System.out.println(result);

        if (result.equals("holaholahola")) {
            System.out.println("OK");
        }

        String result2 = StringUtil.repeat("hola", 2);
        //System.out.println(result2);

        if (result2.equals("holahola")) {
            System.out.println("OK");
        }
    }
}