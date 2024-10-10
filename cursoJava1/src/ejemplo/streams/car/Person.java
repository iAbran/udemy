package ejemplo.streams.car;

import ejemplo.streams.person.Gender;

import java.time.LocalDate;

public class Person {

    private Integer id;
    private String name;
    private Integer age;
    private LocalDate birthday;
    private Gender gender;

    public Person(Integer id, String name, Integer age,
                  LocalDate birthday, Gender gender) {

        this.id = id;
        this.name = name;
        this.age = age;
        this.birthday = birthday;
        this.gender = gender;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {

        return STR."id=\{id}, name=\{name}, age=\{age}, birthday=\{birthday}, gender=\{gender}";
    }
}
