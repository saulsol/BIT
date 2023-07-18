package 객체지향.exceptionExample;

public class Member implements Cloneable {

    private String id;
    private int age;

    public Member() {
    }

    public Member(String id, int age) {
        this.id = id;
        this.age = age;
    }


    public String getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
