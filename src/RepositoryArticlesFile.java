import java.util.List;

public class RepositoryArticlesFile implements RepositoryArticles{
    @Override
    public boolean insert(Article article) {
        System.out.println("Artikel hinzugefügt - FILE");
        return false;
    }

    @Override
    public boolean remove(int primaryKey) {
        System.out.println("Artikel gelöscht - FILE");
        return false;
    }

    @Override
    public boolean update(int primaryKey, Article newArticleData) {
        System.out.println("Artikel geändert - FILE");
        return false;
    }

    @Override
    public List<Article> SearchByName(String name) {
        System.out.println("Artikelliste - NAME - FILE");
        return null;
    }

    @Override
    public List<Article> SearchByCategory(String category) {
        System.out.println("Artikelliste Kategore - FILE");
        return null;
    }

    @Override
    public Article SearchById(int primaryKey) {
        System.out.println("Artikel ID - FILE");
        return null;
    }
}
