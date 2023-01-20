package com.bilgeadam.maratonsoru2.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Musteri {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String isim;
    private String soyisim;

    @OneToMany(mappedBy = "musteri", cascade = CascadeType.ALL)
    private List<Siparis> siparislst;

    public Musteri(String isim, String soyisim) {
        this.isim = isim;
        this.soyisim = soyisim;
    }

}
