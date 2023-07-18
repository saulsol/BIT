package 객체지향.finalExample;

class Person{
    private String name;
    private int age;

    private static final int MAX_AGE;
    static {
       MAX_AGE = 10;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public final void speech(){ // 오버라이딩 불가
        System.out.println("스피치하다");
    }

    public void talk(){
        System.out.println("말하다");
    }

    @Override
    public String toString() {
        return "Person{" +
                "MAX_AGE" + MAX_AGE + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}

class Student extends Person{
    public Student(String name, int age) {
        super(name, age);
    }

    @Override
    public void talk() {} // 오버라이딩 가능

    // public void speech(){} // 오버라이딩 불가능

}



public class Service {

    public static void main(String[] args) {

        final int value; // 무조건 선언시에 초기화해야 함
        {
            value = 10; // 초기화 블록으로 초기화할 수 있음
        }
        System.out.println(value);









        final Person person = new Person("임솔" , 27);
        // value = 10;  -> 컴파일 에러
        System.out.println(person);



        person.setAge(25); // 어려지고 싶은 임솔
        // 객체 자체의 주소를 바꾼 것이 아닌 객체 내부의 값은 변경 허용
        System.out.println(person);



        Person newPerson = new Person("아무개", 25);
        // person = newPerson;
        // -> person 참조변수가 final 로 선언되어 있어서 참조 주소 변경 불가능




    }
}

