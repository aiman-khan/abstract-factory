package example2Vehicles;

public class FactoryCars extends Factory{

    @Override
    public Car createCar(BrandCars brandCars) {
        switch (brandCars) {
            case BENTLEY:
                return new Bentley();
            case CHEVROLET:
                return new Chevrolet();
            default:
                return null;
        }
    }

    @Override
    public Motorcycle createMotorcycle(BrandMotorcycle brandMotorcycle) {
        return null;
    }
}
