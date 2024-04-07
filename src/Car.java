public class Car extends WheelableTransport{
    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышкумашины");
    }
    @Override
    public void check(){
        System.out.println("Обслуживаем " + getModelName());
        for (int i = 0; i < getWheelsCount(); i++) {
            updateTyre();
        }
        checkEngine();
    }

    private void checkEngine() {
        System.out.println("Проверяем двигатель машины");
    }
}
