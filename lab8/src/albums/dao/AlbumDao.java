package albums.dao;

/**
 * an interface that retains two methods that updates/gets data from the table Albums
 */
public interface AlbumDao {
    public String createImpl(String name, int artistId, int releaseYear);
    public String findByArtistImpl(int artistId);
}
