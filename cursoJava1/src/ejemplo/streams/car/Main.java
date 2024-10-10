package ejemplo.streams.car;


import ejemplo.streams.person.Gender;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;

public class Main {

    record PersonDTO(Integer id, String name, Integer age) {}

    public static void main() {

        List<Car> cars = List.of(

                new Car(1,"sedan", "BMW", "520", 1998),
                new Car(2,"sedan", "Audi", "A5", 1998),
                new Car(3,"sedan", "Mercedes", "E-Class", 2500),
                new Car(4,"hatchback", "Skoda", "Octavia", 1600),
                new Car(5,"hatchback", "Toyota", "TypeR", 1450)
        );

        List<Person> people = List.of(

                new Person(1,"Abrahan", 19, LocalDate.of(2005, 7, 9), Gender.MALE),
                new Person(2,"Alex", 20, LocalDate.of(2004, 2, 20), Gender.MALE),
                new Person(3,"Claudia", 17, LocalDate.of(2007, 4, 9), Gender.FEMALE),
                new Person(4,"Carlos", 21, LocalDate.of(2003, 8 ,17), Gender.MALE),
                new Person(5,"Esmeralda", 22, LocalDate.of(2002, 7, 30), Gender.FEMALE),
                new Person(1,"Esmerlyn", 36, LocalDate.of(1987, 9, 8), Gender.FEMALE)
        );

        List<Person> person = people.stream()
                .filter(p -> p.getAge() <= 22)
                .limit(3)
                .sorted(Comparator.comparing(Person::getAge))
                .toList();

        person.forEach(System.out::println);

        System.out.println();

        List<Car> car = cars.stream()
                .filter(c -> c.getEngineCapacity() <= 1800)
                .sorted(Comparator.comparing(Car::getEngineCapacity))
                .toList();

        car.forEach(System.out::println);

        System.out.println();

        List<PersonDTO> dto = people.stream()
                .filter(p -> p.getAge() >= 20)
                .map(p -> new PersonDTO(
                        p.getId(),
                        p.getName(),
                        p.getAge()))
                .toList();

        dto.forEach(System.out::println);



    }
}
