package artists.dao;

/**
 * an interface that retains two methods that updates/gets data from the table artists
 */

public interface ArtistsDao {
    public String createImpl(String name, String country);
    public String findByNameImpl(String name);
}
