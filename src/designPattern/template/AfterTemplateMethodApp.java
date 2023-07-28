package designPattern.template;

public class AfterTemplateMethodApp {
    public static void main(String[] args) {
        AbstractTemplate template1 = new SubClassLogic1();
        template1.execute();
        AbstractTemplate template2 = new SubClassLogic2();
        template2.execute();
    }
}
