package 객체지향.exceptionExample;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionEx3 {

    public void exceptionEx1() throws IOException, InterruptedException {
        System.in.read();
        Thread.sleep(2200);
    }

    public void exceptionEx2() throws Exception {
        exceptionEx1();
    }

    public void exceptionEx3() {
        File file = new File("c:\\Spring");


        FileInputStream fis = null;
        try{
            fis = new FileInputStream(file);
            int temp = 0;

            while ((temp = fis.read()) != -1){
                Thread.sleep(100);
                System.out.print((char) temp);
            }

        }catch (FileNotFoundException exception){
            exception.printStackTrace();
        }catch (IOException exception){
            exception.printStackTrace();
        }catch (InterruptedException exception){
            exception.printStackTrace();
        }finally {
            try {
                fis.close();
            } catch (IOException e) {
               e.printStackTrace();
            }
        }
    }

    public void exceptionEx4() {
        File file = new File("c:\\Spring");



        try(FileInputStream fis = new FileInputStream(file)){

            int temp = 0;

            while ((temp = fis.read()) != -1){
                Thread.sleep(100);
                System.out.print((char) temp);
            }

        }catch (FileNotFoundException exception){
            exception.printStackTrace();
        }catch (IOException exception){
            exception.printStackTrace();
        }catch (InterruptedException exception){
            exception.printStackTrace();
        }
    }






    public static void main(String[] args) throws Exception {

        ExceptionEx3 exceptionEx3 = new ExceptionEx3();
        exceptionEx3.exceptionEx3();


    }
}
