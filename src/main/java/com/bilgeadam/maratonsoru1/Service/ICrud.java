package com.bilgeadam.maratonsoru1.Service;

public interface ICrud <T>{

    void read();
    void save(T t);
    void update(T t);
    void delete(int calisanid);
}

