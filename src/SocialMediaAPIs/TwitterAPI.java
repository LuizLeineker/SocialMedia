package SocialMediaAPIs;

public class TwitterAPI {
    // Método para publicar da API do Twitter
    public void fazerPostagem(String conteudo) {
        System.out.println("[X] nova publicação: " +
                // Aplica regra de negócio da plataforma
                (conteudo.length() > 200 ? conteudo.substring(0, 200) : conteudo)
        );
    }
}
