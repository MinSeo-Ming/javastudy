import java.util.StringTokenizer;

public class StringTokenizerEx1 {
    public static void main(String[] args) {
        String source = "100,200,300,400";
        StringTokenizer st = new StringTokenizer(source,",");
        while (st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
        String express= "x=100*(200+300)/2";
        StringTokenizer st2 = new StringTokenizer(express,"+-*/=()",true);
        while (st2.hasMoreTokens()){
            System.out.println(st2.nextToken());
        }
    }
}
