package kg.charginov.usertdd.service;

import junit.framework.TestCase;
import kg.charginov.usertdd.model.User;
import kg.charginov.usertdd.service.impl.UserServiceImpl;

import static org.assertj.core.api.Assertions.assertThat;

public class UserServiceTest extends TestCase {

    private UserService service;

    @Override
    public void setUp() throws Exception {
        super.setUp();
        this.service = new UserServiceImpl();
    }

    public void testGetUserByUsername_return_true_if_exists() throws Exception {
        User user = service.getUserByUsername("hankie228");
        assertThat(user).isNotNull();
        assertThat(user.getUsername()).isEqualTo("hankie228");
    }

    public void testGetUserByUsername_should_return_true_if_null() throws Exception {
        User user = service.getUserByUsername("notexists");
        assertThat(user).isNull();
    }
}