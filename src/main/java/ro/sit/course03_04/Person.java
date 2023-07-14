package ro.sit.course03_04;

public class Person {
    private String name;
    private byte age;

    private String sex;

    private String cnp;
    private boolean hungry;

    public Person(String name, byte age, String sex, String cnp) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.cnp = cnp;
    }

    public void eat() {
        hungry = false;
    }

    public String getName() {
        return name;
    }

    public byte getAge() {
        return age;
    }

    public boolean isHungry() {
        return hungry;
    }

    public void setHungry(boolean hungry) {
        this.hungry = hungry;
    }

    public String getSex() {
        return sex;
    }

    public String getCnp() {
        return cnp;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", cnp='" + cnp + '\'' +
                ", hungry=" + hungry +
                '}';
    }
}

// Putem defini doar persoane care au aceleasi tipuri de comportamente
// Atributele sunt caracteristicile unei clase / persoane . Comportamentul = metode = actiuni. ==> schimba ceva din caracteristicile obiectului.
// Orice clasa trebuie sa aiba un body (fie variabile , fie metode, fie goala (nu are niciun scop).

