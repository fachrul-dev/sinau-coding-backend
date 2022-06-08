package com.example.sinauspringboot.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@AllArgsConstructor
@Setter
@Getter
@Table(name = "buku")
public class Buku {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String judul;
    private String penulis;
    private String penerbit;
    private Date tahun_terbit;
    private String jenis_buku;

}
