package com.bilgeadam.maratonsoru2.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Urun {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer id;

    private String urunAdi;
    private int fiyat;

    public Urun(String urunAdi, int fiyat) {
        this.urunAdi = urunAdi;
        this.fiyat = fiyat;
    }
}
