package at.cc.jk.BankKonto;

public class Person {
    private String name;
    private String birthday ;

    public Person(String name, String birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public void printPersonDetails() {
        System.out.println("Name:\t\t\t\t" + this.name);
        System.out.println("Birthday:\t\t\t" + this.birthday);
    }
}
