package designPattern.singleton;

public class Settings {

//    private static final Settings INSTANCE = new Settings();

    private Settings() {} // 생성자를 private로 변경

//    public static Settings getInstance1(){
//        return new Settings();
//    }
    // 위 메소드는 메소드를 호출할 때마다 새로운 Settins 객체를 생성한다.
    // 따라서 싱글톤 패턴에 어울리지 않다.

//    public static Settings getInstance2(){
//
//        if(settings == null){
//            // Thread A 끝난 시점
//            settings = new Settings();
//        }
//        return settings;
//    }

//    public static synchronized Settings getInstance3(){
//
//        if(settings == null){
//            // Thread A 끝난 시점
//            settings = new Settings();
//        }
//        return settings;
//    }
    
    // 이른 초기화 방식
//    public static Settings getInstance4(){
//        return INSTANCE;
//    }


    private static class SingletonHelper{
        private static final Settings SINGLETON = new Settings();
    }

    public static Settings getInstance(){
        return SingletonHelper.SINGLETON;
    }

}
