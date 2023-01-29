package com.bilgeadam.maratonsoru2.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
    public class SiparisKalemi {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer id;


@OneToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private Urun urun;

    private int siparisAdedi;

    public SiparisKalemi(Urun urun, int siparisAdedi) {
        this.urun = urun;
        this.siparisAdedi = siparisAdedi;
    }



}
