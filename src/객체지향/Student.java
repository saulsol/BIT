package 객체지향;

public class Student {


    private String value; //"유하영#581210-1010345#051)345-1234

    private String name; // O
    private int age; // 0
    private String birth; // 0
    private String gender; // 0
    private String tel; // 0
    private String jid; // 0 주민 번호
    private String ddi; // X 띠 계산

    public void setValue(String value) {
        this.value = value;
        String [] values = value.split("#");

        this.name = values[0]; // 이름저장
        this.jid = values[1]; // 주민번호 저장
        this.tel = values[2]; // 전화 번호 저장

        countAge(jid);
        setGender(jid);

    }

    //"유하영#581210-1010345#051)345-1234
    private void countAge(String jid){
        String [] values = jid.split("-");
        String stringAge = String.valueOf(values[0].charAt(0)) + String.valueOf(values[0].charAt(1));
        System.out.println("-----------"+stringAge);
        String stringOld = "";
        if(String.valueOf(values[0].charAt(0)).equals("0")){
            stringOld = "20" + stringAge;
        }else {
            stringOld = "19" + stringAge;
        }

        this.birth = stringOld;

        int old = Integer.parseInt(stringOld);

        this.age = 2023 - old;
    }

    private void setGender(String jid){
        String [] values = jid.split("-");
        if(Integer.parseInt(String.valueOf(values[1].charAt(0))) == 1){
            this.gender = "남자";
        }else {
            this.gender = "여자";
        }
    }


    @Override
    public String toString() {
        return "Student{" +
                "value='" + value + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", birth='" + birth + '\'' +
                ", gender='" + gender + '\'' +
                ", tel='" + tel + '\'' +
                ", jid='" + jid + '\'' +
                ", ddi='" + ddi + '\'' +
                '}';
    }
}
