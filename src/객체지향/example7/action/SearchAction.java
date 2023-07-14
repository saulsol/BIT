package 객체지향.example7.action;

import 객체지향.example7.ActionForward;

public class SearchAction implements Action{
    private String path;

    private boolean redirect;

    public SearchAction(String path, boolean redirect) {
        this.path = path;
        this.redirect = redirect;
    }
    @Override
    public ActionForward execute() {
        System.out.println("SearchAction execute");
        return new ActionForward(path, redirect);
    }
}
