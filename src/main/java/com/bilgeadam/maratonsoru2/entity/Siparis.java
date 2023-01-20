package com.bilgeadam.maratonsoru2.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
    public class Siparis {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer id;

        @ManyToOne(cascade = CascadeType.ALL)
        private Musteri musteri;

        @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<SiparisKalemi> lstsiparisKalemi;


    public Siparis(Musteri musteri, List<SiparisKalemi> lstsiparisKalemi) {
        this.musteri = musteri;
        this.lstsiparisKalemi = lstsiparisKalemi;
    }
}
