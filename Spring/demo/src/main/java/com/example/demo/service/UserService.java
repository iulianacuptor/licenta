package com.example.demo.service;

import com.example.demo.dtos.CreateUserDTO;
import com.example.demo.dtos.GetUserDTO;
import com.example.demo.models.Roles;
import com.example.demo.models.User;
import com.example.demo.repository.RoleRepository;
import com.example.demo.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UsersRepository usersRepository;

    @Autowired
    private RoleRepository roleRepository;

    public GetUserDTO getUserResponse(User user){
        GetUserDTO getUser=new GetUserDTO();
        getUser.setFirstName(user.getFirstName());
        getUser.setLastName(user.getLastName());
        getUser.setEmail(user.getEmail());

        return getUser;
    }

    public GetUserDTO createNewUser(CreateUserDTO userDTO){
        User user=new User();
        user.setFirstName(userDTO.getFirstName());
        user.setLastName(userDTO.getLastName());
        user.setEmail(userDTO.getEmail());
        user.setPass(userDTO.getPass());

        if(userDTO.getIdRole()!=null)
        {
            Roles role=roleRepository.findById(userDTO.getIdRole()).orElse(null);
            if(role!=null){
                user.setRole(role);
            }
        }

        usersRepository.save(user);
        return getUserResponse(user);
    }
}
