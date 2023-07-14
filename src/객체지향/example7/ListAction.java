package 객체지향.example7;

public class ListAction implements Action {

    private String path;

    private boolean redirect;

    public ListAction(String path, boolean redirect) {
        this.path = path;
        this.redirect = redirect;
    }

    @Override
    public ActionForward execute() {
        return null;
    }
}
