package com.example.sinauspringboot.repository;

import com.example.sinauspringboot.entity.Anggota;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<Anggota, Integer> {
}
