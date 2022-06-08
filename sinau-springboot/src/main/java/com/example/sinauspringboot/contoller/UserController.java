package com.example.sinauspringboot.contoller;

import com.example.sinauspringboot.Response;
import com.example.sinauspringboot.entity.Anggota;
import com.example.sinauspringboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    UserService userService;

//    ambil semua data
    @GetMapping("getdata")
    public Response findAll() {
        return new Response(userService.findAllData(),"Data berhasil ditampilkan",HttpStatus.OK);
    }

//    ambil data berdasarkan id
    @GetMapping("getdata/{id}")
    public Anggota findById(@PathVariable int id) {
        return userService.findById(id);
    }

    @PostMapping("savedata")
    public Anggota saveUser(@RequestBody Anggota anggota){
        return userService.save(anggota);
    }
}
