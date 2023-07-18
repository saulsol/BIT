package 객체지향.exceptionExample;

import 객체지향.ObjectEx;

public class ExceptionEx1 {

    public void ArrayIndexOutOfBoundsException(){
        int [] m = new int[5];
        for(int i=0; i<= m.length; i++){
            try {
                m[i] = 10;
            }catch (ArrayIndexOutOfBoundsException exception){
                exception.printStackTrace();
            }finally {
                System.out.println("finally");
            }
        }
    }

    public void arithmeticException(int data){
        int rs=10/data;
        System.out.println("rs : "+rs);
    }

    public void numberFormatException(String data){ // 서식에 안 맞는 경우
        if(data.startsWith("[DROP]")){
            System.out.println("DROP RETURN");

        }
        if(data.startsWith("[STONE]")){
            int x = Integer.parseInt(data.substring(data.indexOf("]") + 1).split(",")[0].split("=")[1]);
            int y = Integer.parseInt(data.substring(data.indexOf("]") + 1).split(",")[1].split("=")[1]);
            System.out.println(x+y);
        }

        if(data.startsWith("[MSG]")){
            System.out.println(data.substring(data.indexOf("]") + 1));
        }
    }

    public void classCastingException(){
        String s = (String)new Object();
    }

    public Object getData(int data){
        if(data>=0 && data<=10){
            return 99.0;
        }else if(data>= 11 && data<=20){
            return "hello";
        }
        return null;
    }

    // 미지정인 상태로 무엇인가를 만드는 작업
    public void nullPointerException(){ // 참조하고 있지 않는 참조변수를 사용할 때
        String [] sArray = new String[5];
        for (String s : sArray) {
           s.length();
        }
    }


    public void nullPointerException2(){
        Object o = getData(21);
        if(o instanceof  Double){
            System.out.println(((Double)o).doubleValue());
        } else if (o instanceof String) {
            System.out.println(((String)o).charAt(0));
        }
        System.out.println(o.toString());
    }




    public void stringIndexOutOfBoundsException(String data){
        System.out.println(data.charAt(-1));
    }




    public static void main(String[] args) {

        ExceptionEx1 exceptionEx1 = new ExceptionEx1();
        // exceptionEx1.ArrayIndexOutOfBoundsException();
        //exceptionEx1.arithmeticException(0);
//        exceptionEx1.numberFormatException("[STONE]X=100,Y=79");
//        exceptionEx1.numberFormatException("[MSG]안녕하세요");


        exceptionEx1.nullPointerException2();



    }

}
