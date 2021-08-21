package com.javastudy.chpater08.ex20;

public class CloseableResource implements AutoCloseable{
    public void exceptionWork(boolean exception) throws WorkException {
        System.out.println("+exception+가 호출됨");

        if(exception)
            throw new WorkException("WorkException 발생 !!!");
    }
    public void close()  throws CloseException {
        System.out.println("close() 호출됨");
        throw new CloseException("CloseException 발생 !!!");
    }
}
