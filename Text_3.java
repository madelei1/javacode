package practice;
/*
1. 模拟汽车网站信息。
        2. 定义汽车Auto类
        1. 属性：品牌，车长，价格
        3. 定义SUV继承Auto类
        1. 属性：小型车车长标准值：4295，中型车车长标准值：5070。
        2. 定义判断车型方法
        1. 判断小型车：小于小型车车长标准值
        2. 判断大型车：大于中型车车长标准值
        3. 判断中型车：大于小型车车长标准值并且小于等于中型车车长标准值
        4. 测试类中，创建若干SUV对象，保存到集合，遍历集合，输出中型SUV。
        */

public class Text_3 {
    public static void main(String[] args) {
        SUV x = new SUV("奥迪",4555,500000);
        x.print();
        x.carLength();
    }

}
class  Auto {
    private String brand;
    private double length;
    private double price;


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Auto(String brand, double length, double price) {
        this.brand = brand;
        this.length = length;
        this.price = price;

    }
}
class SUV extends Auto {
    private double i = 4295;
    private double y = 5070;
    public SUV(String brand, double length, double price) {
        super(brand, length, price);
    }
    public void carLength() {
        if( i >= getLength()) {
            System.out.println("是小型车");
        } else if( y >= getLength()) {
            System.out.println("是中型车");
        } else {
            System.out.println("是大型车");
        }
    }
    public void print() {
        System.out.println("品牌："+getBrand()+"---"+"车长："+getLength()+"---"+"价格："+getPrice());
    }
}
