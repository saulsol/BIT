package 객체지향.example7.action;

import 객체지향.example7.ActionForward;
import 객체지향.example7.action.Action;

public class DeleteAction implements Action {

    private String path;

    private boolean redirect;

    public DeleteAction(String path, boolean redirect) {
        this.path = path;
        this.redirect = redirect;
    }
    @Override
    public ActionForward execute() {
        System.out.println("DeleteAction execute");
        return new ActionForward(path, redirect);
    }
}
