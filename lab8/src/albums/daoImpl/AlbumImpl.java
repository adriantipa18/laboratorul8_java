package albums.daoImpl;

import albums.dao.AlbumDao;

/**
 * implements the AlbumDao interface, implements it's methods,
 * and only makes up the query/update syntax for the current table from the current database
 */

public class AlbumImpl implements AlbumDao {
    /**
     * because in oracle 11g auto_increment does not exist, i'll make it by hand
     * @param idNumber the number of the current inserted set of data
     */
    int idNumber=0;
    @Override
    public String createImpl(String name, int artistId, int releaseYear) {
        System.out.println("Verificare syntaxa sql--> "+ "INSERT INTO albums VALUES (" + ++idNumber +",'"+ name + "', " + artistId + ", " + releaseYear + ") ");
        return "INSERT INTO albums VALUES (" + idNumber++ +",'"+ name + "', " + artistId + ", " + releaseYear + ") ";
    }

    @Override
    public String findByArtistImpl(int artistId) {

        System.out.println("Verificare syntaxa sql--> "+"select * from albums where artistId = " + artistId);
        return "select * from albums where artistId=" + artistId ;
    }
}
