package by.itacademy.nataliya;

import java.util.Objects;
public class User {
    private String age;
    private String name;
    public int id;
    public User(int id,String name, String age ) {
        this.age = age;
        this.name = name;
        this.id = id;
    }
    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    @Override
    public String toString() {
        return "User{" +
                "age='" + age + '\'' +
                ", name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return getId() == user.getId() && getAge().equals(user.getAge()) && getName().equals(user.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAge(), getName(), getId());
    }
}
