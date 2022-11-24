package by.academy.hanna;

public class User{
    private int id;
    private String name;
    private String age;

    public User(int id, String name, String age){
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getAge(){
        return age;
    }

    public void setAge(String age){
        this.age = age;
    }

    public String toString(){
        return "User:{id:" + id + ",name:" + name + ",age:" + age + "}";
    }

    public boolean equals(User user){
        if(user == null)
            return false;
        if(user == this)
            return true;
        if(getClass() != user.getClass())
            return false;
        if(user.getAge().equals(this.age) && user.getId() == (this.id) && user.getName().equals(this.name))
            return true;
        return false;
    }
}

