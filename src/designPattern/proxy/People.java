package designPattern.proxy;

public class People {


    private String name;
    private Auth auth;

    public People(String name, Auth auth){
        this.name = name;
        this.auth = auth;
    }

    public String getName() {
        return name;
    }

    public Auth getAuth() {
        return auth;
    }
}
