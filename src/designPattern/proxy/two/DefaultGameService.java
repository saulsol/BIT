package designPattern.proxy.two;

public class DefaultGameService implements GameService {
    @Override
    public void startGame() {
        System.out.println("게임이 시작되었습니다.");
    }
}
