package ms_auth_db.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ms_auth_db.model.entities.User;
import ms_auth_db.model.repository.UserRepository;


@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public List<User> selectAllUser(){
        List<User> ListaUsers = userRepository.findAll();
        return ListaUsers;
    }


}
