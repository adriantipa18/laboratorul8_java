package artists.daoImpl;

import artists.dao.ArtistsDao;

/**
 * implements the ArtistDao interface, implements it's methods,
 * and only makes up the query/update syntax for the current table from the current database
 */

public class ArtistImpl implements ArtistsDao {

    /**
     * because in oracle 11g auto_increment does not exist, i'll make it by hand
     * @param idNumber the number of the current inserted set of data
     */

    int idNumber=0;
    @Override
    public String createImpl(String name, String country) {
        System.out.println("Verificare syntaxa sql --> " + "INSERT INTO artists (id, name, country) VALUES ('" + ++idNumber + "', '"+ name + "', '" + country + "') ");
        return "INSERT INTO artists (id, name, country) VALUES ('" + ++idNumber + "', '"+ name + "', '" + country + "') ";
    }

    @Override
    public String findByNameImpl(String name) {
        System.out.println("Verificare syntaxa sql --> "+"SELECT * FROM artists WHERE name= '" + name +"'");
        return "SELECT * FROM artists WHERE name= '" + name +"'" ;
    }
}
