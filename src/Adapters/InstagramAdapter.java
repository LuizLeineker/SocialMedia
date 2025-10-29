package Adapters;

import SocialMediaAPIs.InstagramAPI;

public class InstagramAdapter implements AdapterRedeSocial {
    InstagramAPI instagramAPI = new InstagramAPI();

    @Override
    public void publicar(String conteudo) {
        instagramAPI.postar(conteudo);
    }
}
