import java.sql.SQLOutput;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Person> people = getPeople();
        //Filter using imperative way
//        List<Person>female = new ArrayList<>();
//        for(Person p : people){
//            if(p.getGender().equals(Gender.FEMALE)){
//                female.add(p);
//            }
//        }
//        female.forEach( System.out::println);

        //Filter using declarative way to print only females
//        List<Person> collect = people.stream().filter(person -> person.getGender().equals(Gender.FEMALE))
//                .collect(Collectors.toList());
//        collect.forEach(System.out::println);

        // sorting with age in reverse order
//        List<Person> sortedAge = people.stream().sorted(Comparator.comparing(Person::getAge).reversed())
//                .collect(Collectors.toList());
//        sortedAge.forEach(System.out::println);

        //All  match
//        boolean isAllAgeMoreThanSix = people.stream().allMatch(p -> p.getAge() > 6);
//        System.out.println(isAllAgeMoreThanSix);

        //Any match
//        boolean anyAgeGreaterThan100 = people.stream().anyMatch(p -> p.getAge() > 100);
//        System.out.println(anyAgeGreaterThan100);

        //None Match
//        boolean isAntonioAbsent = people.stream().noneMatch(p -> p.getName().equals("Antonio"));
//        System.out.println(isAntonioAbsent);

        // MAX Age
        //people.stream().max(Comparator.comparing(Person::getAge)).ifPresent(System.out::println);

        // MIN AGE
       // people.stream().min(Comparator.comparing(Person::getAge)).ifPresent(System.out::println);

        // Grouping by Gender
//        Map<Gender, List<Person>> groups = people.stream().collect(Collectors.groupingBy(Person::getGender));
//        groups.forEach((gender, people1) -> {
//                    System.out.println(gender);
//                    people1.forEach(System.out::println);
//                }
//                );

        // Finding the oldest Male name
        Optional<String> oldestLady = people.stream().filter(p -> p.getGender().equals(Gender.MALE)).
                max(Comparator.comparing(Person::getAge)).
                 map(person -> person.getName());  // or map(Person::getName);
        oldestLady.ifPresent(System.out::println);


    }
    private static List<Person> getPeople() {
        return List.of(
                new Person("Antonio", 20, Gender.MALE),
                new Person("Alina Smith", 33, Gender.FEMALE),
                new Person("Helen White", 57, Gender.FEMALE),
                new Person("Alex Boz", 14, Gender.MALE),
                new Person("Jamie Goa", 99, Gender.MALE),
                new Person("Anna Cook", 7, Gender.FEMALE),
                new Person("Zelda Brown", 120, Gender.FEMALE)
        );

    }

}
