package artists.controller;

import artists.daoImpl.ArtistImpl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * extends the ArtistImpl class in order to get acces to the 2 methods
 * that create the sql syntax for the given operations
 * it contains two methods, here the statement is created, and the syntax is formed using the superclass methods
 * also here are caught the exceptions for the query/update
 */

public class ArtistController extends ArtistImpl {
    public void create(Connection con, String name, String country){
        System.out.println("No news is good news!");
        try{
            Statement stmt=con.createStatement();
            stmt.executeUpdate(this.createImpl(name,country));
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
