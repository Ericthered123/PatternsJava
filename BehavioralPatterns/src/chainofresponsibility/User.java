package chainofresponsibility;

public class User {
    private String name;
    private boolean login;
    private boolean permission;
    private boolean captcha;

    public User(String name, boolean login, boolean permission, boolean captcha) {
        this.name = name;
        this.login = login;
        this.permission = permission;
        this.captcha = captcha;

    }

    public String getName() {
        return name;
    }

    public boolean isLogin() {
        return login;
    }

    public boolean isPermission() {
        return permission;
    }

    public boolean isCaptcha() {
        return captcha;
    }
}
