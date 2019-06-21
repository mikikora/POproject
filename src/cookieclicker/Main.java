package cookieclicker;

import cookieclicker.player.Player;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");
        Player p = new Player();
        while (!p.end) {
            p.loop();
        }  
    }
}
