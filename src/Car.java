public class Car extends WheelTransport implements Serviceable, Engineable{
    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
    @Override
    public void check() {

        System.out.println("Обслуживаем " + getModelName() + " машину");
        for (int i = 0; i < getWheelsCount(); i++) {
            updateTyre();
        }
        checkEngine();
    }

    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку у машины");
    }

    @Override
    public void checkEngine() {
        System.out.println("Проверяем двигатель у машины");
    }
}