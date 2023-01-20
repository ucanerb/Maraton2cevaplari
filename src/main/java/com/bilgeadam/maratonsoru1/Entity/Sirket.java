package com.bilgeadam.maratonsoru1.Entity;

public class Sirket {
    private Integer id;
    private String isim;
    private String sahibi;
    private String unvani;
    private String faaliyetAlani;
    private int kurulusYili;

    public Sirket(Integer id) {
        this.id = id;
    }

    public Sirket(String isim) {
        this.isim = isim;
    }

    public Sirket(String isim, String sahibi, String unvani, String faaliyetAlani, int kurulusYili) {
        this.isim = isim;
        this.sahibi = sahibi;
        this.unvani = unvani;
        this.faaliyetAlani = faaliyetAlani;
        this.kurulusYili = kurulusYili;
    }

    public Sirket(Integer id, String isim, String sahibi, String unvani, String faaliyetAlani, int kurulusYili) {
        this.id = id;
        this.isim = isim;
        this.sahibi = sahibi;
        this.unvani = unvani;
        this.faaliyetAlani = faaliyetAlani;
        this.kurulusYili = kurulusYili;
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

    public String getSahibi() {
        return sahibi;
    }

    public void setSahibi(String sahibi) {
        this.sahibi = sahibi;
    }

    public String getUnvani() {
        return unvani;
    }

    public void setUnvani(String unvani) {
        this.unvani = unvani;
    }

    public String getFaaliyetAlani() {
        return faaliyetAlani;
    }

    public void setFaaliyetAlani(String faaliyetAlani) {
        this.faaliyetAlani = faaliyetAlani;
    }

    public int getKurulusYili() {
        return kurulusYili;
    }

    public void setKurulusYili(int kurulusYili) {
        this.kurulusYili = kurulusYili;
    }

    @Override
    public String toString() {
        return "Sirket{" +
                "id=" + id +
                ", isim='" + isim + '\'' +
                ", sahibi='" + sahibi + '\'' +
                ", unvani='" + unvani + '\'' +
                ", faaliyetAlani='" + faaliyetAlani + '\'' +
                ", kurulusYili=" + kurulusYili +
                '}';
    }
}
