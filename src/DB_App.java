public class DB_App {
    //Wichtig: Interface als Instanzentyp verwenden
    //      hinter new wird die benötigte Klasse verwendet
    static RepositoryArticles dbArticles = new RepositoryArticlesDB();

    public static void main(String[] args) {

        dbArticles.insert(new Article());
        dbArticles.SearchByCategory("laptop");
        //usw. - beliebig viele Methoden im Hauptprogramm verwenden

    }

}
