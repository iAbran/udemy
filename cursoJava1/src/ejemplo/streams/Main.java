package ejemplo.streams;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main() {

        List<Person> people = getPeople();

        //Filter
        List<Person> females = people.stream()
                .filter(p -> p.getGender().equals(Gender.FEMALE))
                .filter(p -> p.getName().startsWith("E"))
                .collect(Collectors.toList());

        //females.forEach(System.out::println);

        //Sort
        List<Person> sort = people.stream()
                .sorted(Comparator.comparing(Person::getAge).reversed())
                .collect(Collectors.toList());

        //sort.forEach(System.out::println);

        //All Match
        Boolean m = people.stream()
                .allMatch(p -> p.getAge() > 8);

        //System.out.println(m);

        //Any Match
        Boolean any = people.stream()
                .anyMatch(p -> p.getName().equalsIgnoreCase("motete"));

        //System.out.println(any);

        Boolean none = people.stream()
                .noneMatch(p -> p.getName().equals("Pipigey"));

        //System.out.println(none);

        //Max
        Optional<Person> op1 = people.stream()
                .max(Comparator.comparing(Person::getAge));

        //System.out.println(op1);

        //Min
        Optional<Person> op2 = people.stream()
                .min(Comparator.comparing(Person::getAge));

        //System.out.println(op2);

        //Group
        Map<Gender , List<Person>> groupByGender = people.stream()
                .collect(Collectors.groupingBy(Person::getGender));

//        groupByGender.forEach(((gender, people1) -> {
//            System.out.println(gender);
//            people1.forEach(System.out::println);
//            System.out.println();
//        }));


        //Encuentra el mayor de los hombres
        Optional<String> oldestMaleAge = people.stream()
                .filter(p -> p.getGender().equals(Gender.MALE))
                .max(Comparator.comparing(Person::getAge))
                .map(Person::getName);

        oldestMaleAge.ifPresent(System.out::println);

    }

    private static List<Person> getPeople() {

        return List.of(

                new Person("Motete", 19, Gender.MALE),
                new Person("Abrahan", 20, Gender.MALE),
                new Person("Claudia", 18, Gender.FEMALE),
                new Person("Esmeralda", 21, Gender.FEMALE),
                new Person("Estephany", 15, Gender.FEMALE),
                new Person("Alex", 9, Gender.MALE)
        );
    }
}
