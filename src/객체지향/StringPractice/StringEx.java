package 객체지향.StringPractice;
// String VS StringBuffer VS StringBuilder
// 셋의 차이점을 알아보자
public class StringEx {
    public static void main(String[] args) {

        String str = "hello";
        System.out.println(str.hashCode());
        String str2 = "hello";
        System.out.println(str2.hashCode());


        str = str + " world";
        System.out.println(str.hashCode());



        System.out.println(str);

        StringBuffer sb = new StringBuffer("hello");
        sb.append(" append");




    }


}
