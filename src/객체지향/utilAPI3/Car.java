package 객체지향.utilAPI3;

public class Car implements Comparable<Car> {

    private int carNum;
    private String carName;
    private String maker;


    public Car(int carNum, String carName, String maker) {
        this.carNum = carNum;
        this.carName = carName;
        this.maker = maker;
    }

    public int getCarNum() {
        return carNum;
    }

    public String getCarName() {
        return carName;
    }

    public String getMaker() {
        return maker;
    }

    public void setCarNum(int carNum) {
        this.carNum = carNum;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    @Override
    public int compareTo(Car car) {
        if(this.carNum > car.carNum){
            return 1;
        } else if (this.carNum == car.carNum) {
            return 0;
        }

        return -1;

    }

    @Override
    public String toString() {
        return "Car{" +
                "carNum=" + carNum +
                ", carName='" + carName + '\'' +
                ", maker='" + maker + '\'' +
                '}';
    }
}
