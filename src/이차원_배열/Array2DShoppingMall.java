package 이차원_배열;

public class Array2DShoppingMall {

    private static String [][] shopList = {
            {"나이키 신발", "자바의 정석","그냥 신발"},
            {"냉장고", "사과", "과자"},
            {"음료수", "포도", "맛있는 음식"}
    };

    // READ
    public void showList(){
        for (String [] i : shopList){
            for(String k : i){
                System.out.print(k + " | ");
            }
            System.out.println();
        }
    }


    public void productNameModify(String oldName, String modifyingName){
        for(int i=0; i<shopList.length; i++){
            for(int j=0; j<shopList[i].length; j++){
                if(shopList[i][j].equals(oldName)){
                    shopList[i][j] = modifyingName;
                }
            }

        }
    }


    //DELETE, 상품 구매
    public String purchaseProduct(String value){

        String deleteValue = "";

        for(int i=0; i<shopList.length; i++){
            for(int j=0; j<shopList[i].length; j++){
                if(shopList[i][j].equals(value)){
                    deleteValue = shopList[i][j];
                    shopList[i][j] = null;
                }
            }

        }

        drawInProduct(); // 상품 빈 공간으로 끌어당기기
        return deleteValue;
    }


    private void drawInProduct() {

        for (int i = 0; i < shopList.length; i++) {
            for (int j = 0; j < shopList[i].length; j++) {
                if (shopList[i][j] == null) {
                    if (j != shopList[i].length - 1 && shopList[i][j + 1] != null) {
                        shopList[i][j] = shopList[i][j + 1];
                        shopList[i][j + 1] = null;
                    }

                    if (j == shopList[i].length - 1 && i != shopList.length - 1 && shopList[i + 1][0] != null) {
                        shopList[i][j] = shopList[i + 1][0];
                        shopList[i + 1][0] = null;
                        for (int k = 0; k < shopList[i + 1].length - 1; k++) {
                            shopList[i + 1][k] = shopList[i + 1][k + 1];
                        }
                        shopList[i + 1][shopList[i + 1].length - 1] = null;
                    }
                }

            }
        }

    }

    public void enrollProduct(String newProduct){
        for(int i=0; i<shopList.length; i++){
            for(int j=0; j<shopList[i].length; j++){
                if(shopList[i][j] == null){
                    shopList[i][j] = newProduct;
                }
            }

        }
    }



    public static void main(String[] args) {

        Array2DShoppingMall array2DShoppingMall = new Array2DShoppingMall();
        array2DShoppingMall.showList();

        array2DShoppingMall.purchaseProduct("냉장고");
        array2DShoppingMall.enrollProduct("수박");
        array2DShoppingMall.purchaseProduct("자바의 정석");

        System.out.println("-----------------------------------------------");
        array2DShoppingMall.showList();

        System.out.println("-----------------------------------------------");
        array2DShoppingMall.enrollProduct("치킨");
        array2DShoppingMall.showList();

        System.out.println("-----------------------------------------------");
        array2DShoppingMall.productNameModify("맛있는 음식", "아이스크림");
        array2DShoppingMall.showList();
    }

}
