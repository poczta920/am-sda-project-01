package am.sda.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Data
@NoArgsConstructor

@Entity
@Table(name = "person")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_person")
    int idPerson;

    @Column(name = "first_name", nullable = false, length = 50)
    String firstName;

    @Column(name = "last_name", nullable = false, length = 50)
    String lastName;

    @Column(name = "birth_day")
    LocalDate birthDay;

    @Column(name = "email", length = 30)
    String eamil;

    @Column(name = "phone")
    String phone;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "person")
    List<Address> address;
}
