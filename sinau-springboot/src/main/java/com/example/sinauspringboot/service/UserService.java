package com.example.sinauspringboot.service;

import com.example.sinauspringboot.dto.DataResponse;
import com.example.sinauspringboot.entity.Anggota;
import com.example.sinauspringboot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public List<Anggota> findAllData(){
        return userRepository.findAll();
    }

    public Anggota save(Anggota param){
         Anggota anggota = userRepository.save(param);
         return anggota;
    }

    public Anggota findById(Integer id) {
        return userRepository.findById(id).get();
    }
}
