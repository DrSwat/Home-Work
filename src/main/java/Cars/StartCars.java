package Cars;

import Cars.Car.TypeCar;
import Cars.DieselCar.KindOfEngine;

public class StartCars {

	public static void main(String[] args) {

		Bus bus = new Bus();
		Car car = new Car();
		CargoFreight cargo = new CargoFreight();
		SpecialTransport spec = new SpecialTransport();
		Truck truck = new Truck();
		Bus busParam = new Bus("MersedesBenz", "Jumbo", 10, 180, 700, 12, 5, KindOfEngine.TDI, true);
		Car carParam = new Car("BMW", "325i", 2, 280, 350, 4.0, 1.8, TypeCar.hactchback);
		CargoFreight cargoParam = new CargoFreight("Wolkswagen", "Caddy", 2, 220, 200, 3, 2.3, KindOfEngine.TDI, 2);
		SpecialTransport specParam = new SpecialTransport("Volvo", "Helper", 3, 180, 300, 5, 2.5, 6, 300, 310,
				"Saved Lifes");
		Truck truckParam = new Truck("БелАЗ", "БелАЗ 75600", 240, 64, 3500, 15, 7, KindOfEngine.TDI, 560);

		bus.signalBus();
		car.signalCar();
		cargo.signalCargo();
		spec.specSignal();
		truck.signalTruck();

		System.out.println(busParam);
		System.out.println(carParam);
		System.out.println(cargoParam);
		System.out.println(specParam);
		System.out.println(truckParam);
	}

}
