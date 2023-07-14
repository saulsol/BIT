package 객체지향.example7;

import 객체지향.example7.action.*;

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
        if(command.equalsIgnoreCase("Modify")){
            return new ModifyAction("ModifyView.txt", true);
        }
        if(command.equalsIgnoreCase("Search")){
            return new SearchAction("SearchView.txt", true);
        }
        if(command.equalsIgnoreCase("Exit")){
            return new ExitAction("ExitView.txt", true);
        }
        return null;
    }


}
