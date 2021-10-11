package fi.hyte.esportsburner;

import java.util.ArrayList;
import java.util.List;

public class Global {
    private static  final Global ourInstance = new Global();

    private List<Game> lista;
    public static Global getInstance(){
        return  ourInstance;
    }

    private Global(){
        lista = new ArrayList<>();

        lista.add(new Game("Counter-Strike: Global Offensive", 150, R.drawable.csgo));
        lista.add(new Game("Among Us", 200, R.drawable.amongus));
        lista.add(new Game("Hitman 2", 190, R.drawable.hitman));
        lista.add(new Game("Minecraft", 150));
        lista.add(new Game("The Forest", 220, R.drawable.forest));
        lista.add(new Game("No Man's Sky", 130, R.drawable.nomanssky));
        lista.add(new Game("Call of Duty: WWII", 190, R.drawable.codwwii));


    }

    public  List<Game> getGames(){
        return lista;
    }
}
