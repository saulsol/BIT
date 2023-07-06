package 배열;

public class P_62 {
    public static void main(String[] args) {

        String org = "SS";
        char [] chars = new char[org.length()];

        for(int i=0; i<chars.length; i++){
            chars[i] = org.charAt(i);
        }

        for(int i=0; i<chars.length; i++ ){
            System.out.print(chars[i]);;
        }

        System.out.println();

        chars = org.toCharArray();
        for(int i=0; i<chars.length; i++){
            System.out.print(chars[i]);
        }


    }
}
