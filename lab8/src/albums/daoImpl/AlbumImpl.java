package albums.daoImpl;

import albums.dao.AlbumDao;

public class AlbumImpl implements AlbumDao {
    /**
     * because in oracle 11g auto_increment does not exist, i'll make it by hand
     */
    int idNumber;
    @Override
    public String createImpl(String name, int artistId, int releaseYear) {
        return "INSERT INTO albums VALUES (" + ++idNumber+ name + ", " + artistId + ", " + releaseYear + ") ;";
    }

    @Override
    public String findByArtistImpl(int artistId) {
        return "SELECT * FROM albums WHERE id=" + artistId + ";";
    }
}
