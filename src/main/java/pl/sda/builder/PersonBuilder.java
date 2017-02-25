package pl.sda.builder;

/**
 * Created by m.losK on 2017-02-25.
 */
public class PersonBuilder {
    private Person person;

    public PersonBuilder() {
        this.person = new Person();
    }

    public PersonBuilder withFirstName(String firstName){
        this.person.setFirstName(firstName);
        return this;
    }

    public PersonBuilder withLastName(String lastName) {
        this.person.setLastName(lastName);
        return this;
    }

    public PersonBuilder withPersonAddress(PersonAddress personAddress) {
        this.person.setAddress(personAddress);
        return this;
    }

    public PersonBuilder withPesel(String pesel) {
        this.person.setPesel(pesel);
        return this;
    }

    public Person build(){
        return person;
    }
}
