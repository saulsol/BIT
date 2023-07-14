package 객체지향.example7.action;

import 객체지향.example7.ActionForward;
import 객체지향.example7.action.Action;

public class ListAction implements Action {

    private String path;

    private boolean redirect;

    public ListAction(String path, boolean redirect) {
        this.path = path;
        this.redirect = redirect;
    }

    @Override
    public ActionForward execute() {
        // execute
        System.out.println("ListAction execute");

        return new ActionForward(path, redirect);
    }
}
