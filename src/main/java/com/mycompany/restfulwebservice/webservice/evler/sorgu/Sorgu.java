/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.restfulwebservice.webservice.evler.sorgu;

import com.mycompany.restfulwebservice.webservice.evler.Evler;
import com.mycompany.restfulwebservice.webservice.evler.Resimler;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author mrgg
 */
@Path("/sorgu")

public class Sorgu {

    String baglanti;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/listeleEV")

    public ArrayList listeleEV() throws ClassNotFoundException, SQLException {
        Connection connection = null;
        ResultSet rs = null;
        Statement statement = null;
        Class.forName("org.sqlite.JDBC");
        ArrayList<Evler> liste = new ArrayList<Evler>();
        try {
            connection = DriverManager.getConnection("jdbc:sqlite:/home/mrgg/proje/dbEV.sqlite");
            statement = connection.createStatement();
            rs = statement.executeQuery("Select * from tblEV ,tblRESIM");
            while (rs.next()) {

                Evler ev = new Evler();
               
                ev.setId(rs.getInt("evID"));
                ev.setYer(rs.getString("evIL"));
                ev.setAlan(rs.getInt("evAlan"));
                ev.setByas(rs.getInt("evBinaYasi"));
                ev.setFiyat(rs.getInt("evFiyat"));
                ev.setKat(rs.getInt("evBulKat"));
                ev.setAciklama(rs.getString("evAciklama"));
                ev.setTip(rs.getString("evEmlakTip"));
                ev.setOdas(rs.getInt("evOdaSayisi"));
                liste.add(ev);
            }
            return liste;

        } catch (SQLException e) {
            // if the error message is "out of memory", 
            // it probably means no database file is found
            System.err.println(e.getMessage());
        }

        return null;

    }
  @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/listeleRESIM")
    public ArrayList listeleRESIM() throws ClassNotFoundException, SQLException {
        Connection connection = null;
        ResultSet rs = null;
        Statement statement = null;
        Class.forName("org.sqlite.JDBC");
        ArrayList<Resimler> liste = new ArrayList<Resimler>();
        try {
            connection = DriverManager.getConnection("jdbc:sqlite:/home/mrgg/proje/dbEV.sqlite");
            statement = connection.createStatement();
            rs = statement.executeQuery("Select * from  tblRESIM");
            while (rs.next()) {

                Resimler resim=new  Resimler();
               
              resim.setResimyol(rs.getString("resimYOL"));
              resim.setResimID(rs.getInt("resimID"));
              resim.setResimEvID(rs.getInt("resimEvID"));
                liste.add(resim);
            }
            return liste;

        } catch (SQLException e) {
            // if the error message is "out of memory", 
            // it probably means no database file is found
            System.err.println(e.getMessage());
        }

        return null;

    }
}
