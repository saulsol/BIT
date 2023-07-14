package 객체지향.example7;

public class ActionForward {
    private String path;
    private boolean redirect;

    public ActionForward(String path, boolean redirect) {
        this.path = path;
        this.redirect = redirect;
    }

    public String getPath() {
        return path;
    }

    public boolean isRedirect() {
        return redirect;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public void setRedirect(boolean redirect) {
        this.redirect = redirect;
    }
}
