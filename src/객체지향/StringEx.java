package 객체지향;

public class StringEx extends Object {

    private char [] value;

    public StringEx(char [] value){ // 이 메소드를 콜한 객체 => this
        this.value = value;
    }

    public char charAt(StringEx this, int index){
        if(index<0 || index>value.length -1)
            throw new StringIndexOutOfBoundsException();
        return value[index];
    }

    public boolean equals(StringEx this, Object obj){ // this -> 이 메소드를 선언한 본인 자신
        if(this == obj) return true;

        char [] imsi;
        if(obj instanceof String){
            imsi=((String)obj).toCharArray();
            if(value.length!=imsi.length) return false;

            for(int i=0; i<imsi.length; i++){
                if(value[i]!=imsi[i]) return false;
            }

            return true;
        }

        return false;
    }
    public static void main(String[] args) {

        StringEx s1 = new StringEx("abc".toCharArray()); // value[a][b][c]
        StringEx s2 = new StringEx("def".toCharArray()); // value[d][e][f]
        System.out.println(s1.equals(s2)); // 같은 객체니깐

        System.out.println(s1.equals(s2));


        String s3 = new String("abc");
        System.out.println(s3.equals("abc")); // 같은 객체니깐


        String str1 = new String("abc");


    }

}
