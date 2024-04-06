public class Bicycle extends WheelableTransport {
    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку велосипеда");
    }
    @Override
    public void check(){
        System.out.println("Обслуживаем " + getModelName());
        for (int i = 0; i < getWheelsCount(); i++) { // вопрос, как работает цикл, если массив не объявлен? Он что создается автоматически при наследовании свойства родительского класса?
            updateTyre();
        }
    }

}
