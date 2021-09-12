public class ColecionavelFactory {

    public static Colecionavel create(String tipo, int posicao, String urlDaImagem) {

        return switch (tipo.toLowerCase()) {
            case "figurinha" -> new Figurinha(posicao, urlDaImagem);
            case "selo" -> new Selo(posicao, urlDaImagem, 0);
            default -> null;
        };
    }
}
