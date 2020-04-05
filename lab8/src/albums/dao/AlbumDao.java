package albums.dao;

public interface AlbumDao {
    public String createImpl(String name, int artistId, int releaseYear);
    public String findByArtistImpl(int artistId);
}
