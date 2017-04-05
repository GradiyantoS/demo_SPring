package id.test;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * Created by WaroenglordZ on 19/03/2017.
 */
public interface UserService {
    String printHello();
    Boolean validateUser(Integer age);
    User findUser(Integer id);
    Page<User> findAllUser(Pageable pageable);

    User createUser(User user);
    User updateUser(Integer id, User user);
    void deleteUser(Integer id);
}
