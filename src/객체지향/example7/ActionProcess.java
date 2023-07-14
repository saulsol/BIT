package 객체지향.example7;

import 객체지향.example7.action.Action;

import java.util.Scanner;

public class ActionProcess {

    private Scanner scanner = new Scanner(System.in);

    public void menu(){
        while (true) {
            String commend = null;
            System.out.println("1.List 2.Delete 3.Search 4.Modify 5.Exit");
            switch (scanner.nextInt()){
                case 1:
                    commend = "List";
                    break;
                case 2:
                    commend = "Delete";
                    break;
                case 3:
                    commend = "Search";
                    break;
                case 4:
                    commend = "Modify";
                    break;
                case 5:
                    commend = "Exit";
                    break;

                default:
                    return;
            }
            // 공장은 하나만 만들고 -> 공장은 싱글톤 패턴
            // ListAction이 들어오면 업 캐스팅
            Action action = ActionFactory.getInstance().getAction(commend);
            ActionForward af = action.execute();
            if(af.isRedirect()){
                System.out.println(af.getPath()+"로 직접이동");
            }else{
                System.out.println(af.getPath()+"로 간접이동");
            }
        }
    }
    public static void main(String[] args) {

        new ActionProcess().menu();


    }

}
