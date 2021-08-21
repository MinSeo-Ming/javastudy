package code;

//왠지 안들아감 언니랑 얘기 해봐야지
class TryWithResourceEx_20 {
    public static void main(String args[]){
//        try(CloseableResource cr = new CloseableResource()) {
//            cr.exceptionWork(false);
//        }catch (WorkException e){
//            e.printStackTrace();
//        }catch (CloseException e){
//            e.printStackTrace();
//        }
//        System.out.println();
//        try (CloseableResource cr = new CloseableResource()){
//            cr.exceptionWork(true);
//        }catch (WorkException e){
//            e.printStackTrace();
//        }catch (CloseException e){
//            e.printStackTrace();
//        }
    }
    class CloseableResource implements AutoCloseable{
        public void exceptionWork(boolean exception) throws WorkException{
            System.out.println("exceptionWork("+exception+")가 호출됩니다.");
            if(exception)
                throw new WorkException("WorkExceptiom발생 !!");
        }
        public void close()throws CloseException{
            System.out.println("close()가 호출됨");
            throw new CloseException("CloseException 발생!!");
        }
    }
    class WorkException extends Exception{
        WorkException(String msg){super(msg);}
    }
    class CloseException extends Exception{
        CloseException(String msg) {super(msg);}
    }
}
