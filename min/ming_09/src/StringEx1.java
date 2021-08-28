public class StringEx1 {
    public static void main(String[] args) {
        String str1 = "Abc";
        String str2 = "Abc";
        System.out.println("str1 = \"Abc\"");
        System.out.println("str2 = \"Abc\"");
        System.out.println("str1 == str2 ? "+(str1 ==str2));
        System.out.println("str1.equals(str2) ? "+(str1.equals(str2)));

        String str3 = new String("Abc");
        String str4 = new String("Abc");
        System.out.println("str3 = new String(\"Abc\")");
        System.out.println("str4 = new String(\"Abc\")");
        System.out.println("str3 == str4 ? "+(str3 ==str4));
        System.out.println("str3.equals(str4) ? "+(str3.equals(str4)));
    }
}
