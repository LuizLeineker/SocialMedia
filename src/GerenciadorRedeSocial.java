import Adapters.AdapterRedeSocial;

public class GerenciadorRedeSocial {
    private AdapterRedeSocial adapter;

    public GerenciadorRedeSocial(AdapterRedeSocial adapter) {
        this.adapter = adapter;
    }

    void publicar(String conteudo) {
        adapter.publicar(conteudo);
        System.out.println("Conteudo publicado!");
    }
}
