public class Main {
    public static void main(String[] args) {
        Car car = new Car("car1", 4);
        Car car2 = new Car("car2", 4);

        Truck truck = new Truck("truck1", 6);
        Truck truck2 = new Truck("truck2", 8);

        Bicycle bicycle = new Bicycle("bicycle1", 2);
        Bicycle bicycle2 = new Bicycle("bicycle2", 2);

        ServiceStation station = new ServiceStation();
        station.check(car);
        station.check(car2);
        station.check(bicycle);
        station.check(bicycle2);
        station.check(truck);
        station.check(truck2);

        car.check();        //Вопрос: Нарушил ли бы я полиморфизм, если бы сделал так, а класс ServiceStation просто удалил? (На мой взгляд класс ServiceStation явно лишний.)
        car2.check();
        bicycle.check();
        bicycle2.check();
        truck.check();
        truck2.check();
    }
}