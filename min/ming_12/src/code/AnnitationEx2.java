package code;

class NewClass{
    int newField;

    int getNewField()   {   return newField;    }

    @Deprecated
    int oldField;

    @Deprecated
    int getOldField()   {   return oldField;    }
}

public class AnnitationEx2 {
    public static void main(String[] args) {
        NewClass nc = new NewClass();

        //원래라면 -Xlint:deprecation 이라는 옵션을 붙여서 컴파일을 하여야하는데 자동지원인가???
        nc.oldField=10;
        System.out.println(nc.getOldField());
    }
}
