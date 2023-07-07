package 만들기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;


// 년도가 주어지면 태어난 요일, 띠, 윤달의 개수
public class Test1 {
    private static void aboutTail(String [] tail, int year){ // 띠 구하는 공식
        int rest = year%12;
        System.out.println("당신의 띠는 " + tail[rest-1] + "띠 입니다.");
    }

    private static void whatDayOfTheWeek(String [] week, int day){
        int rest = day%7;
        System.out.println("당신이 태어난 요일은 " + week[rest] +" 입니다.");
    }

    private static void lifeDate(String [] token){
        int year = Integer.parseInt(token[0]);
        int month = Integer.parseInt(token[1]);
        int date = Integer.parseInt(token[2]);

        Calendar bDate = Calendar.getInstance();
        Calendar eDate = Calendar.getInstance();

        long count = 0;
        bDate.set(year, month, date);

        count = (eDate.getTimeInMillis() - bDate.getTimeInMillis()) / (24*60*60*1000);

        System.out.println("지금까지 살아온 날은 총 " + count + "입니다");

    }


    private static void getCalender(String [] token){
        int year = Integer.parseInt(token[0]);
        int month = Integer.parseInt(token[1]);
        int START_DAY_OF_WEEK = 0;
        int END_DAY = 0;

        Calendar sDay = Calendar.getInstance(); // 시작일
        Calendar eDay = Calendar.getInstance(); // 끝일

        sDay.set(year, month-1, 1);
        eDay.set(year, month, 1);

        eDay.add(Calendar.DATE, -1);

        START_DAY_OF_WEEK = sDay.get(Calendar.DAY_OF_WEEK);

        END_DAY = eDay.get(Calendar.DATE);

        System.out.println("      " +year +"년 " + month + "월");
        System.out.println("   일 월 화 수 목 금 토");

        for(int i=1; i<START_DAY_OF_WEEK; i++){
            System.out.print("   ");
        }

        for(int i=1, n=START_DAY_OF_WEEK; i<=END_DAY; i++, n++){
            System.out.printf((i<10)? "  "+ i : " " + i);
            if(n%7 ==0 )System.out.println();
        }
    }


    public static void main(String[] args) throws IOException {

        String [] tail = {"닭", "개", "돼지", "쥐", "소", "호랑이", "토끼", "용", "뱀", "말", "양", "원숭이"};

        String [] week = {"월요일", "화요일", "수요일", "목요일", "금요일", "토요일", "일요일"};

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String [] token = input.split("/");

        aboutTail(tail, Integer.parseInt(token[0]));
        whatDayOfTheWeek(week, Integer.parseInt(token[1]));
        lifeDate(token);
        getCalender(token);

        


    }
}
