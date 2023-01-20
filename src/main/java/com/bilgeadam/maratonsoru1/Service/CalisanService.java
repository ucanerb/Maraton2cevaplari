package com.bilgeadam.maratonsoru1.Service;

import com.bilgeadam.maratonsoru1.Entity.Calisan;
import com.bilgeadam.maratonsoru1.Entity.DB;
import com.bilgeadam.maratonsoru1.Entity.Sirket;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CalisanService implements ICrud<Calisan>{
DB db = new DB();
Calisan calisan;

    List<Object> list = new ArrayList<>();
    @Override
    public void read() {
        try{
            String sql = "select s.isim as sirket, c.isim,c.yas,c.maas,c.departman from calisan as c inner join sirket as s\n" +
                    "        on c.sirket_id=s.id;";
            PreparedStatement preparedStatement = db.connection.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()){
                String sirketisim = rs.getString("isim");
                String calisanisim = rs.getString("isim");
                int yas = rs.getInt("yas");
                int maas = rs.getInt("maas");
                String departman = rs.getString("departman");

                calisan = new Calisan(new Sirket(sirketisim),calisanisim,yas,maas,departman);
                list.add(calisan);
            }
            if (list.isEmpty()){
                System.out.println("Boş");
            }else {
                list.forEach(System.out::println);
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

    }

    @Override
    public void save(Calisan calisan) {String sql ="insert into calisan(sirket_id,isim,yas,maas,departman)\n" +
            "        values (?,?,?,?,?)";
        try{
            PreparedStatement preparedStatement = db.connection.prepareStatement(sql);
            preparedStatement.setInt(1, calisan.getSirket().getId());
            preparedStatement.setString(2,calisan.getIsim());
            preparedStatement.setInt(3, calisan.getYas());
            preparedStatement.setInt(4, calisan.getMaas());
            preparedStatement.setString(5, calisan.getDepartman());
            preparedStatement.executeUpdate();
            System.out.println(calisan.getIsim()+" isimli çalışan veri tabanına eklendi.");
            preparedStatement.close();

        }catch (SQLException e)
        {
            e.printStackTrace();
        }


    }

    @Override
    public void update(Calisan calisan) {
        try {
            PreparedStatement ls = db.connection.prepareStatement("select id from calisan");
            ResultSet rsList = ls.executeQuery();
            while (rsList.next()) {
                list.add(rsList.getInt("id"));
            }
            if (list.contains(calisan.getId())) {

                PreparedStatement updateStatement = db.connection.prepareStatement(
                        //"update products set \"categoryId\"=?, \"productName\"=?, \"price\"= ?, \"description\"= ?" +
                          //      "where \"productId\" = ?");
                        "update calisan set sirket_id=?, isim=? yas=?,maas=?, departman=? where id=?;");

                updateStatement.setInt(1, calisan.getSirket().getId());
                updateStatement.setString(2, calisan.getIsim());
                updateStatement.setInt(3, calisan.getYas());
                updateStatement.setInt(4, calisan.getMaas());
                updateStatement.setString(5, calisan.getDepartman());
                updateStatement.setInt(5, calisan.getId());
                updateStatement.executeUpdate();

                System.out.println("Calisan tablosu güncellendi");
                read();
                updateStatement.close();
            }else {
                System.out.println("Calisan bulunamadı");
            }
            db.connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);

        }

    }

    @Override
    public void delete(int calisanid) {
        try {
            PreparedStatement ls = db.connection.prepareStatement("select id from calisan");
            ResultSet rsList = ls.executeQuery();
            while (rsList.next()) {
                list.add(rsList.getInt("id"));
            }
            if (list.contains(calisanid)) {
                PreparedStatement deleteStatement = db.connection.prepareStatement("delete from calisan where id =?");
                deleteStatement.setInt(1, calisanid);
                deleteStatement.executeUpdate();
                System.out.println("Çalışan veri tabanından silinmiştir");
            }else{
                System.out.println("Bu veriye sahip bir çalışan bulunmamaktadır");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
