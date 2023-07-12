package 객체지향;

public class ObjectEx3 {
    public void stringProcess(){

        String [] str = {"유하영#581210-1010345#051)345-1234",
                        "김성은#980115-2010345#02)145-1234",
                        "송재근#990910-1010345#031)245-1234"

        };
        Student [] students = new Student[str.length];

        for(int i=0; i<str.length; i++){
            Student student = new Student();
            student.setValue(str[i]);
            students[i] = student;
        }

        for (Student student : students) {
            System.out.println(student);
        }

    }


    public static void main(String[] args) {
        ObjectEx3 objectEx3 = new ObjectEx3();
        objectEx3.stringProcess();
    }

}
