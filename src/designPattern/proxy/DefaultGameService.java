package designPattern.proxy;

public class DefaultGameService implements GameService {
    @Override
    public void startGame() {
        System.out.println("(타겟 메서드)게임이 시작되었습니다.");
    }
}
