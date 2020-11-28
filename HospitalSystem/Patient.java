package HospitalSystem;

public class Patient {
    private String name;
    private String address;
    private char sex;
    private String illness;
    private int age;
    //private Doctor<>;



    public Patient(){
        setName(name);
        setAddress(address);
        setSex(sex);
        setIllness(illness);
        setAge(age);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public String getIllness() {
        return illness;
    }

    public void setIllness(String illness) {
        this.illness = illness;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
