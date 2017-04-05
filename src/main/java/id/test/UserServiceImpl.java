package id.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by WaroenglordZ on 19/03/2017.
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;

    @Override
    public String printHello() {
        return "NAMASTEEHHH";

    }

    @Override
    public Boolean validateUser(Integer age) {
        if(age > 17) return  true;
        else return false;
    }

    @Override
    public User findUser(Integer id){
        return userRepository.findOne(id);
    }

    @Override
    public Page<User> findAllUser(Pageable pageable){
        return  userRepository.findAll(pageable);
    }

    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User updateUser(Integer id, User user) {
        User u = userRepository.findOne(id);
        u.setAge(user.getAge());
        u.setName(user.getName());
        u.setAddress(user.getAddress());
        return userRepository.save(u);
    }

    @Override
    public void deleteUser(Integer id) {
        userRepository.delete(id);
    }
}
