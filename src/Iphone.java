
import java.util.List;
import java.util.*;

public class Iphone implements DevicePlayerMusic,Phone,Internet {

    private Music music;
    private Contact contact;
    private List<Music> musicList = new ArrayList<>();

    public Iphone(Contact contact, Music music) {
        this.contact = contact;
        this.music = music;
    }


    public void adicionarMusica(){
        this.musicList .add(new Music());
    }



    public void multi() {
        System.out.println("Yo soy MultiTouch");

    }

    @Override
    public void connection() {

        throw new UnsupportedOperationException("Unimplemented method 'connection'");
    }

    @Override
    public void pageBroser() {

        throw new UnsupportedOperationException("Unimplemented method 'pageBroser'");
    }

    @Override
    public void call() {
        
        throw new UnsupportedOperationException("Unimplemented method 'call'");
    }

    @Override
    public void receiveCall() {
        
        throw new UnsupportedOperationException("Unimplemented method 'receiveCall'");
    }

    @Override
    public void voiceMail() {
        
        throw new UnsupportedOperationException("Unimplemented method 'voiceMail'");
    }

    @Override
    public void SMS() {
        
        throw new UnsupportedOperationException("Unimplemented method 'SMS'");
    }

    @Override
    public void play() {
        
        throw new UnsupportedOperationException("Unimplemented method 'play'");
    }

    @Override
    public void pause() {
        
        throw new UnsupportedOperationException("Unimplemented method 'pause'");
    }

    @Override
    public void stop() {
        
        throw new UnsupportedOperationException("Unimplemented method 'stop'");
    }

    @Override
    public void suffle() {
        
        throw new UnsupportedOperationException("Unimplemented method 'suffle'");
    }

    @Override
    public void nextMusic() {
        
        throw new UnsupportedOperationException("Unimplemented method 'nextMusic'");
    }

    @Override
    public void backMusic() {
        
        throw new UnsupportedOperationException("Unimplemented method 'backMusic'");
    }

}