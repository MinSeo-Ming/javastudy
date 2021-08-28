import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateFormatterEx1 {
    public static void main(String[] args) {
        ZonedDateTime zdatetiem = ZonedDateTime.now();
        String[] patternArr={
                "yyyy-MM-dd HH:mm:ss",
                "'' yy년 MMM dd일 E요일",
                "yyyy-MM-dd HH:mm:ss.SSS Z VV",
                "yyyy-MM-dd hh:mm:ss a",
                "오늘은 올해의 D번째 날입니다.",
                "오늘은 이달의 d번째 날입니다.",
                "오늘은 올해의 w번째 주입니다.",
                "오늘은 이달의 W번째 주입니다.",
                "오늘은 이달의 W번째 E요일입니다."
        };
        for(String p : patternArr){
            DateTimeFormatter f = DateTimeFormatter.ofPattern(p);
            System.out.println(zdatetiem.format(f));
        }
    }
}
