package albums.controller;

import albums.daoImpl.AlbumImpl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * extends the AlbumImpl class in order to get acces to the 2 methods
 * that create the sql syntax for the given operations
 * it contains two methods, here the statement is created, and the syntax is formed using the superclass methods
 * also here are caught the exceptions for the query/update
 */

public class AlbumController extends AlbumImpl {
    public void create(Connection con, String name, int artistId, int releaseYear){
        System.out.println("No news is good news!");
        try{
            Statement stmt=con.createStatement();
            stmt.executeUpdate(this.createImpl(name,artistId,releaseYear));
        }catch (Exception e){ System.out.println(e);}
    }

    public void findById(Connection con, int artistId){
        try{
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery(this.findByArtistImpl(artistId));
            while(rs.next())
                System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3+"  "+rs.getString(4)));
        }catch (Exception e){ System.out.println(e);}
    }
}
