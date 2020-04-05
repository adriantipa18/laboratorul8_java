package artists.daoImpl;

import artists.dao.ArtistsDao;

public class ArtistImpl implements ArtistsDao {
    int idNumber=1;
    @Override
    public String createImpl(String name, String country) {
        System.out.println("INSERT INTO artists VALUES ('" + ++idNumber + "', '"+ name + "', '" + country + "') ;");
        return "INSERT INTO albums VALUES ( '" + ++idNumber + "','" + name + "','" + country + "') ;";
    }

    @Override
    public String findByNameImpl(String name) {
        return "SELECT * FROM albums WHERE name=" + name + ";";
    }
}
