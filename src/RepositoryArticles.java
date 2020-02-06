import java.util.List;
public interface RepositoryArticles {
    //in einem Interface gibt man alle Methoden an welche von
    // implementierenden Klassen ausprogrammiert werden müssen
    //WICHTIG:
    //interfaces geben einen Vertrag vor
    //es werden nur die Methodenköpfe angegeben
    //      es existiert noch kein Code
    //      diesen müssen die implementierenden Klassen bereitstellen
    public boolean insert(Article article);
    public boolean remove(int primaryKey);
    public boolean update(int primaryKey, Article newArticleData);
    public List<Article> SearchByName(String name);
    public List<Article> SearchByCategory (String category);
    public Article SearchById(int primaryKey);
}
