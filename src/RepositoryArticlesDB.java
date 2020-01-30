import java.util.List;

public class RepositoryArticlesDB implements RepositoryArticles{

    //implementiert eine Klasse ein Interface, so verpflichtet sie
    // sich dazu, dass sei alle Methoden ausprogrammiert
    //WICHTIG:
    //Es können beliebig viele weitere Members a( Felder und Methoden)
    // vorhanden sein

    @Override
    public boolean Save() {
        return false;
    }

    @Override
    public boolean insert(Article article) {
        return false;
    }

    @Override
    public boolean remove(int primaryKey) {
        return false;
    }

    @Override
    public boolean update(int primaryKey, Article newArticleData) {
        return false;
    }

    @Override
    public List<Article> SearchByName(String name) {
        return null;
    }

    @Override
    public List<Article> SearchByCategory(String category) {
        return null;
    }

    @Override
    public Article SearchById(int primaryKey) {
        return null;
    }
}
