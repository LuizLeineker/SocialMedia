parece qpackage Adapters;

import SocialMediaAPIs.TwitterAPI;

public class TwitterAdapter implements AdapterRedeSocial {
    TwitterAPI twitterAPI = new TwitterAPI();

    @Override
    public void publicar(String conteudo) {
        twitterAPI.fazerPostagem(conteudo);
    }
}
