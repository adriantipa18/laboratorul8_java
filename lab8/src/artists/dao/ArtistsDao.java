package artists.dao;

public interface ArtistsDao {
    public String createImpl(String name, String country);
    public String findByNameImpl(String name);
}
