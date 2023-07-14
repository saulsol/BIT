package 객체지향.example7.action;

import 객체지향.example7.ActionForward;

public class ModifyAction implements Action {
    private String path;

    private boolean redirect;

    public ModifyAction(String path, boolean redirect) {
        this.path = path;
        this.redirect = redirect;
    }
    @Override
    public ActionForward execute() {
        System.out.println("ModifyAction execute");
        return new ActionForward(path, redirect);
    }
}
