package kg.charginov.usertdd.service;

import kg.charginov.usertdd.model.User;

public interface UserService {

    User getUserByUsername(String username) throws Exception;

    boolean isUserExists(User user) throws Exception;

}
