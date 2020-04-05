package artists.controller;

import artists.daoImpl.ArtistImpl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class ArtistController extends ArtistImpl {
    public void create(Connection con, String name, String country){
        try{
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery(this.createImpl(name,country));
            while(rs.next())
                System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));
        }catch (Exception e){ System.out.println(e);}
    }

    public void findByName(Connection con, String name){
        try{
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery(this.findByNameImpl(name));
            while(rs.next())
                System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));
        }catch (Exception e){ System.out.println(e);}
    }
}
