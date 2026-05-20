public class ArticleNormalEstrategia implements EstrategiaActualitzacio {
    public void actualitzar(Article a) {
        if (a.qualitat > 0) {
            a.qualitat--;
        }
        a.diesPerVendre--;
        if (a.diesPerVendre < 0 && a.qualitat > 0) {
            a.qualitat--;
        }
    }
}