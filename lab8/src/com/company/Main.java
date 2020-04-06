package com.company;

import albums.controller.AlbumController;
import artists.controller.ArtistController;
import database.Database;
import java.sql.*;

/**
 * Main class, just instantiate the classes nedded to connect and get the informations from the database
 * added classpath, just use the green button
 */
class Main{

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        /**
         * @param url a string that retains the url with the url to the database
         * @param user the user account
         * @param password the password for the user
         * @param con an opened connection to the database
         * @param artist an entity ArtistController that has power over the artists table
         * @param album an entity AlbumController that has power over the albums table
         */

        String url, user, password;
        url="jdbc:oracle:thin:@localhost:1521:xe";
        user="student";
        password="student";
        Connection con;
        con= Database.connect(url,user,password);

        //this is just to verify that in the albums table rows are added
        try{
            Statement stmt=con.createStatement();
            String aux="select * from albums";
            ResultSet rs=stmt.executeQuery(aux);
            while(rs.next())
                System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+"  "+rs.getString(4));

        }catch(Exception e){ System.out.println(e);}

        System.out.println("-----------------------------------------------------------------------------------------------------");

        ArtistController artist= new ArtistController();
        artist.create(con,"andreia","romania");
        artist.findByName(con,"andreia");

        System.out.println();

        AlbumController album= new AlbumController();
        album.create(con,"album1",2,1000);
        album.findById(con,2);
        Database.endConnection(con);

    }
}