package pl.sda.builder;

import java.time.LocalDate;

/**
 * Created by m.losK on 2017-02-25.
 */
public class Main {
    public static void main(String[] args) {
        PersonBuilder personBuilder = new PersonBuilder();

        PersonAddress personAddress = new PersonAddress();
        personAddress.setCity("Poznan");
        personAddress.setStreet("Mlynska");
        personAddress.setPostalCode("61-726");
        Person person = personBuilder
                .withFirstName("Mateusz")
                .withLastName("Loska")
                .withPesel("77777777777")
                .withPersonAddress(personAddress)
                .build();
        System.out.println(person.toString());

        MovieBuilder movieBuilder = new MovieBuilder();

        Movie movie = movieBuilder
                .withTitle("Song of the Sea")
                .withDirector("Tomm Moore")
                .withReleaseDate(LocalDate.of(2015,5,8))
                .build();

        System.out.println(movie.toString());
    }
}
