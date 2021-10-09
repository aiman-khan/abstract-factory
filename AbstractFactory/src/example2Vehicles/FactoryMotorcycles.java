package example2Vehicles;

public class FactoryMotorcycles extends Factory {

    @Override
    public Car createCar(BrandCars brandCars) {
        return null;
    }

    @Override
    public Motorcycle createMotorcycle(BrandMotorcycle brandMotorcycle) {
        switch (brandMotorcycle) {
            case DUCATI:
                return new Ducati();
            case YAMAHA:
                return new Yamaha();
            default:
                return null;
        }
    }
}
