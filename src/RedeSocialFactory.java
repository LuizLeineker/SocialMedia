import Adapters.*;

public class RedeSocialFactory {
    public static AdapterRedeSocial criarAdapter(String plataforma) {
        if (plataforma.equalsIgnoreCase("X")) {
            return new TwitterAdapter();
        } else if (plataforma.equalsIgnoreCase("Instagram")) {
            return new InstagramAdapter();
        } else {
            System.out.println("Não foi possivel realizar a postagem, sem suporte!");
            return null;
        }
    }
}
