package kg.charginov.usertdd.service.impl;

import kg.charginov.usertdd.model.User;
import kg.charginov.usertdd.service.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {

    private List<User> users;

    public UserServiceImpl() {
        this.users = List.of(
                new User("hankie228","200212","ADMIN"),
                new User("mars200202","marsel2","USER"),
                new User("faster0","nurro2","USER"),
                new User("erlan2002","erik900","USER"),
                new User("vinisius","junior2002","USER")
        );
    }

    @Override
    public User getUserByUsername(String username) throws Exception {
        return users.stream().filter(us->us.getUsername().equals(username)).findAny()
                .orElse(null);
    }

    @Override
    public boolean isUserExists(User user) throws Exception {
        return getUserByUsername(user.getUsername())!=null;
    }

}
