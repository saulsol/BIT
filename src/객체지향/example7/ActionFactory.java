package 객체지향.example7;

public class ActionFactory { // action을 생성하는 공장 클래스

    static ActionFactory actionFactory;

    public static ActionFactory getInstance(){
        if(actionFactory == null){
            actionFactory = new ActionFactory();
        }
        return actionFactory;
    }


    public Action getAction(String command){
        if(command.equalsIgnoreCase("List")){
            return new ListAction("listView.txt", false);
        }
        if(command.equalsIgnoreCase("Delete")){
            return new DeleteAction("deleteView.txt", true);
        }
        return null;
    }


}
