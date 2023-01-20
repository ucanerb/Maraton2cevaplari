package com.bilgeadam.maratonsoru1.Service;

import com.bilgeadam.maratonsoru1.Entity.DB;
import com.bilgeadam.maratonsoru1.Entity.Sirket;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SirketService implements ICrud<Sirket>{

    DB db =new DB();




    @Override
    public void read() {

    }

    @Override
    public void save(Sirket sirket) { String sql ="insert into sirket(isim,sahibi,unvani,faaliyetAlani,kurulusYili)\n" +
            "values (?,?,?,?,?)";
        try{
            PreparedStatement preparedStatement = db.connection.prepareStatement(sql);
            preparedStatement.setString(1, sirket.getIsim());
            preparedStatement.setString(2,sirket.getSahibi());
            preparedStatement.setString(3, sirket.getUnvani());
            preparedStatement.setString(4, sirket.getFaaliyetAlani());
            preparedStatement.setInt(5, sirket.getKurulusYili());
            preparedStatement.executeUpdate();
            System.out.println(sirket.getIsim()+" şirketi veri tabanına eklendi.");
            preparedStatement.close();

        }catch (SQLException e)
        {
            e.printStackTrace();
        }

    }

    @Override
    public void update(Sirket sirket) {

    }

    @Override
    public void delete(int id) {

    }
}
