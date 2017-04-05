package id.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;

/**
 * Created by WaroenglordZ on 19/03/2017.
 */

@RestController
public class greetingController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String greetings(){ return userService.printHello();}

    @RequestMapping(method = RequestMethod.GET)
    public Page<User> findAllUser(Pageable pageable){return userService.findAllUser(pageable);}

    @RequestMapping(method = RequestMethod.POST)
    public User newUser(@RequestBody User user){return userService.createUser(user);}

    @RequestMapping(value ="/{id}",method = RequestMethod.PUT)
    public User updateUser(@PathVariable Integer id,@RequestBody User user){return userService.updateUser(id,user);}

    @RequestMapping(value ="/{id}",method = RequestMethod.DELETE)
    public void deleteUser(@PathVariable Integer id){ userService.deleteUser(id);}
    @RequestMapping(value ="/{id}", method = RequestMethod.GET)
    public User getAnUser(@PathVariable Integer id){return userService.findUser(id);}



    /*//@Autowired
    private UserRepository userRepository;
    @RequestMapping(value = "/greeting", method = RequestMethod.GET)
    public String greeting(){
        return userService.printHello();
    }
    @RequestMapping(method = RequestMethod.GET)
    public Page<User> findAllUser(Pageable pageable){
        return userRepository.findAll(pageable);
    }

    @RequestMapping(value = "/users/{id}", method = RequestMethod.GET)
    public User findUser(@PathVariable Integer id){
        return  userRepository.findOne(id);
    }

    @RequestMapping(value = "/users", method = RequestMethod.POST)
    public User createUser(@Valid @RequestBody User user){
        return  userRepository.save(user);
    }

    @RequestMapping(value = "/users/{id}", method = RequestMethod.PUT)
    public User updateUser(@PathVariable Integer id,@RequestBody User user){
        User existingUser = userRepository.findOne(id);
        existingUser.setAge(user.getAge());
        existingUser.setAddress(user.getAddress());
        existingUser.setName(user.getName());
        return  userRepository.save(existingUser);
    }

    @RequestMapping(value = "/users/{id}", method = RequestMethod.DELETE)
    public void deleteUser(@PathVariable Integer id){
        userRepository.delete(id);
    }*/
}
