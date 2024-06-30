public class Car {
    int wheels;
    int Doors;
    int maxSpeed;
    String name;
    String modelNumber;
    String company;

    public Car(int wheels,int Doors,int maxSpeed,String name,String modelNumber,String company) {
        this.wheels=wheels;
        this.maxSpeed=maxSpeed;
        this.Doors=Doors;
        this.name=name;
        this.modelNumber=modelNumber;
        this.company=company;
    }

    @Override
    public String toString() {
        return "Car{" +
                "wheels=" + wheels +
                ", Doors=" + Doors +
                ", maxSpeed=" + maxSpeed +
                ", name='" + name + '\'' +
                ", modelNumber='" + modelNumber + '\'' +
                ", company='" + company + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Car swift=new Car(4,4,210,"BMW9i","fej345","BMW");
        System.out.println(swift);
    }
}
