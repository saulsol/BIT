package 객체지향.example;

public class Member {

    private String id;
    private String name;
    private String email;
    private String address;
    private int age;

    public Member(){
        this("");
    }

    public Member(String id){
        this(id, ""); // 인자가 2 개 인 생성자를 호출
    }

    public Member(String id, String name) {
       this(id, name, ""); // 인자가 3 개 인 생성자를 호출
    }

    public Member(String id, String name, String email) {
       this(id, name, email, ""); // 인자가 4 개 인 생성자를 호출
    }

    public Member(String id, String name, String email, String address) {
        this(id, name, email, address, 0); // 인자가 5 개 인 생성자 호출
    }

    public Member(String id, String name, String email, String address, int age) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.address = address;
        this.age = age;
    }

    // 복사 생성자
    public Member(Member obj) {
        this.id = obj.id;
        this.name = obj.name;
        this.email = obj.email;
        this.address = obj.address;
        this.age = obj.age;
    }


    @Override
    public String toString() {
        return "Member{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {

        Member m1 = new Member("BLUE");
        Member m2 = new Member("RED");
        Member m3 = new Member(m2);

        System.out.println(m2);
        System.out.println(m3);
    }


}
