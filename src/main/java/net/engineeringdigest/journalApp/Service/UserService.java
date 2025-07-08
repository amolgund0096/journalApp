package net.engineeringdigest.journalApp.Service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.engineeringdigest.journalApp.Entity.Users;
import net.engineeringdigest.journalApp.Repository.UserRepository;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<Users> getAllUsers() {
        return (List<Users>) userRepository.findAll();
    }

    public Users getUserById(Long id) {
        return (Users) userRepository.findById(id).orElse(null);
    }

    public Users createUser(Users users) {
        return (Users) userRepository.save(users);
    }

    public Users updateUser(Long id, Users updatedUser) {
        return (Users) userRepository.findById(id).map(user -> {
            ((Users) user).setName(updatedUser.getName());
            ((Users) user).setEmail(updatedUser.getEmail());
            ((Users) user).setContact(updatedUser.getContact());
            return userRepository.save(user);
        }).orElse(null);
    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}
