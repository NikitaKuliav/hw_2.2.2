public class Bicycle extends WheelTransport implements Serviceable {
    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
    @Override
    public void check() {

        System.out.println("Обслуживаем " + getModelName() + " велосипед");
        for (int i = 0; i < getWheelsCount(); i++) {
            updateTyre();
        }
    }
    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку у велосипеда");
    }
}