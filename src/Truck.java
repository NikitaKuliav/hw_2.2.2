public class Truck extends WheelTransport implements Serviceable, Engineable {
    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
    @Override
    public void check() {

        System.out.println("Обслуживаем " + getModelName() + " грузовик");
        for (int i = 0; i < getWheelsCount(); i++) {
            updateTyre();
        }
        checkEngine();
        checkTrailer();

    }
    @Override
     public void updateTyre() {
        System.out.println("Меняем покрышку у грузовика");
    }

     @Override
     public void checkEngine() {
        System.out.println("Проверяем двигатель у грузовика");
    }

     private void checkTrailer() {
        System.out.println("Проверяем прицеп у грузовика");
    }
}