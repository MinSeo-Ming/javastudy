package code;

public class FinallyTest2_18 {
    public static void main(String args[]){
        try {
            startInstall();
            copyFile();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            deleteTempFiles();
        }
    }
    static void startInstall(){
        System.out.println("파일을 설치합니다");
    }
    static void copyFile(){
        System.out.println("파일을 복사합니다");
    }
    static void deleteTempFiles(){
        System.out.println("파일을 삭제합니다");
    }
}
