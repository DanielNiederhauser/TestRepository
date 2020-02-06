import java.util.List;

public class RepositoryArticlesDB implements RepositoryArticles{

    //implementiert eine Klasse ein Interface, so verpflichtet sie
    // sich dazu, dass sei alle Methoden ausprogrammiert
    //WICHTIG:
    //Es können beliebig viele weitere Members a( Felder und Methoden)
    // vorhanden sein


    @Override
    public boolean insert(Article article) {
        System.out.println("Artikel wurde in DB abgespeichert!");
        return false;
    }

    @Override
    public boolean remove(int primaryKey) {
        System.out.println("Artikel wurde aus DB gelöscht!");
        return false;
    }

    @Override
    public boolean update(int primaryKey, Article newArticleData) {
        System.out.println("Artikel wurde in DB geändert!");
        return false;
    }

    @Override
    public List<Article> SearchByName(String name) {
        System.out.println("Artikelliste aus Db - NAME!");
        return null;
    }

    @Override
    public List<Article> SearchByCategory(String category) {
        System.out.println("Artikelliste aus Db - Kategorie!");
        return null;
    }

    @Override
    public Article SearchById(int primaryKey) {
        System.out.println("Artikelliste aus Db - ID!");
        return null;
    }
}
