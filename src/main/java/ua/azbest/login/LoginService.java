package ua.azbest.login;

public class LoginService {

    public boolean isUserValid(String user, String password) {
        if (user.equals("azbest") && password.equals("pass"))
            return true;

        return false;
    }

}
