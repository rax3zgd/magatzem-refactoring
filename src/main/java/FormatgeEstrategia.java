public class FormatgeEstrategia implements EstrategiaActualitzacio {
    public void actualitzar(Article a) {
        if (a.qualitat < 50) a.qualitat++;
        a.diesPerVendre--;
        if (a.diesPerVendre < 0 && a.qualitat < 50) a.qualitat++;
    }
}