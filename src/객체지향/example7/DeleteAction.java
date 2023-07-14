package 객체지향.example7;

public class DeleteAction implements Action {

    private String path;

    private boolean redirect;

    public DeleteAction(String path, boolean redirect) {
        this.path = path;
        this.redirect = redirect;
    }
    @Override
    public ActionForward execute() {
        return null;
    }
}
