

class Magatzem {
    Article[] articles;

    public Magatzem(Article[] articles) {
        this.articles = articles;
    }

    public void actualitzarEstat() {
        for (Article article : articles) {
            EstrategiaActualitzacio estrategia = triarEstrategia(article);
            estrategia.actualitzar(article);
        }
    }

    private EstrategiaActualitzacio triarEstrategia(Article a) {
        if (esLlegendari(a)) return new LlegendariEstrategia();
        if (esFormatge(a)) return new FormatgeEstrategia();
        if (esEntrada(a)) return new EntradaConcertEstrategia();
        return new ArticleNormalEstrategia();
    }

    private boolean esLlegendari(Article a) {
        return a.nom.equals("Martell de Thor (Llegendari)");
    }

    private boolean esFormatge(Article a) {
        return a.nom.equals("Formatge Gidurat");
    }

    private boolean esEntrada(Article a) {
        return a.nom.equals("Entrades per al Concert del Trobador");
    }
}
