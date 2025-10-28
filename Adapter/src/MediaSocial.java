// Coloquei todas as classes e interface em apenas um arquivo para agilizar o processo..

// Conteudo inserido para a publicação
class Conteudo {
    private String texto;

    public Conteudo(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }
}

// Para cada rede social será preciso um adapter
interface AdapterMidiaSocial {
    void publicar(Conteudo conteudo);
}

// Para o X
class TwitterAdapter implements AdapterMidiaSocial {
    @Override
    public void publicar(Conteudo conteudo) {
        String texto = conteudo.getTexto();
        if (texto.length() > 200) {
            texto = texto.substring(0, 200);
        }
        System.out.println("[X] nova publicação: " + texto);
    }
}

// Para o Insta
class InstagramAdapter implements AdapterMidiaSocial {
    @Override
    public void publicar(Conteudo conteudo) {
        System.out.println("[Instagram] nova publicação: " + conteudo.getTexto());
    }
}


class GerenciadorMidiaSocial {
    private AdapterMidiaSocial adapter;

    public GerenciadorMidiaSocial(AdapterMidiaSocial adapter) {
        this.adapter = adapter;
    }

    public void publicar(Conteudo conteudo) {
        adapter.publicar(conteudo);
        System.out.println("Conteudo publicado: " + conteudo.getTexto());
    }
}

// Factory Method
class SocialMediaFactory {
    public static AdapterMidiaSocial criarAdapter(String plataforma) {
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
