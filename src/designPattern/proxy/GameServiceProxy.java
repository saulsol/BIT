package designPattern.proxy;

import designPattern.proxy.DefaultGameService;
import designPattern.proxy.GameService;

public class GameServiceProxy implements GameService {

    private DefaultGameService gameService;

    @Override
    public void startGame() {

        // lazy init
        if(this.gameService == null){
            this.gameService =new DefaultGameService();
        }
        long before = System.currentTimeMillis();

        // target method
        gameService.startGame();


        System.out.println(System.currentTimeMillis() - before);
    }
}
