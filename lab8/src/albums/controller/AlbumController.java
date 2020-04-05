package albums.controller;

import albums.daoImpl.AlbumImpl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class AlbumController extends AlbumImpl {
    public void create(Connection con, String name, int artistId, int releaseYear){
        try{
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery(this.createImpl(name,artistId,releaseYear));
            while(rs.next())
                System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3+"  "+rs.getString(4)));
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
