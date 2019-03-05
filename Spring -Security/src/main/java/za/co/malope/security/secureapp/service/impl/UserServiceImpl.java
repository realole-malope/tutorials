package za.co.malope.security.secureapp.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.co.malope.security.secureapp.entity.User;
import za.co.malope.security.secureapp.exception.UserNotFoundException;
import za.co.malope.security.secureapp.repository.UserRepository;
import za.co.malope.security.secureapp.service.UserService;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepo;

    @Override
    public User findUserByReferenceId(String referenceId) {
        return userRepo.findUserByReferenceId(referenceId)
                .orElseThrow( ()-> new UserNotFoundException(String.format("User with ref_id:%s was not found!", referenceId)));
    }
}
