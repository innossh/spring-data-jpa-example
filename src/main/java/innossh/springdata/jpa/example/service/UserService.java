package innossh.springdata.jpa.example.service;

import innossh.springdata.jpa.example.bean.UsersGetResponse;
import innossh.springdata.jpa.example.entity.User;
import innossh.springdata.jpa.example.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public User getUser(Long id) {
        return userRepository.findOne(id);
    }

    public UsersGetResponse getUsers() {
        List<User> users = userRepository.findAll();
        UsersGetResponse response = new UsersGetResponse();
        response.setTotal(users.size());
        response.setUsers(users);
        return response;
    }

}