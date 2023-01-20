package com.bilgeadam.maratonsoru1.Entity;

public class Calisan {
    private Integer id;
    private String isim;
    private int yas;
    private int maas;
    private String departman;
    private Sirket sirket;


    public Calisan(Sirket sirket, String isim, int yas, int maas, String departman) {
        this.isim = isim;
        this.yas = yas;
        this.maas = maas;
        this.departman = departman;
        this.sirket = sirket;
    }
    public Calisan(Sirket sirket, String isim, int yas, int maas, String departman, Integer id) {
        this.isim = isim;
        this.yas = yas;
        this.maas = maas;
        this.departman = departman;
        this.sirket = sirket;
    }

    public Calisan(String isim, int yas, int maas, String departman, Sirket sirket) {
        this.isim = isim;
        this.yas = yas;
        this.maas = maas;
        this.departman = departman;
        this.sirket = sirket;
    }

    public Calisan(Integer id, String isim, int yas, int maas, String departman, Sirket sirket) {
        this.id = id;
        this.isim = isim;
        this.yas = yas;
        this.maas = maas;
        this.departman = departman;
        this.sirket = sirket;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public int getMaas() {
        return maas;
    }

    public void setMaas(int maas) {
        this.maas = maas;
    }

    public String getDepartman() {
        return departman;
    }

    public void setDepartman(String departman) {
        this.departman = departman;
    }

    public Sirket getSirket() {
        return sirket;
    }

    public void setSirket(Sirket sirket) {
        this.sirket = sirket;
    }

    @Override
    public String toString() {
        return "Calisan{" +
                "id=" + id +
                ", isim='" + isim + '\'' +
                ", yas=" + yas +
                ", maas=" + maas +
                ", departman='" + departman + '\'' +
                ", sirket=" + sirket +
                '}';
    }
}
