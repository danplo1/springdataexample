package pl.danplo.springdataexample;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class Start {

    private CarRepo carRepo;

    @Autowired
    public Start(CarRepo carRepo) {
        this.carRepo = carRepo;
    }

    @EventListener(ApplicationReadyEvent.class)
    public void runExample() {
//        Car car1 = new Car("Volvo", "XC90", Color.SILVER);
//        carRepo.save(car1);
//
//        Car car2 = new Car("Audi", "Q7", Color.WHITE);
//        carRepo.save(car2);
//
//        Car car3 = new Car("BMW", "X5", Color.BLACK);
//        carRepo.save(car3);
//
//        Car car4 = new Car("Toyota", "RAW", Color.RED);
//        carRepo.save(car4);

//        carRepo.deleteById(1L);

        Iterable<Car> all = carRepo.findAllByColor(Color.BLACK);
        all.forEach(System.out::println);

    }

}
