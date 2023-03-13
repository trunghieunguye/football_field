package login;

import java.util.ArrayList;
import java.util.List;
public class LoginManagement {
    private List<User> users = new ArrayList<>();

    public void register(String username, String password) {
        users.add(new User(username, password));
    }

    public boolean login(String username, String password) {
        for (User user : users) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }

}
