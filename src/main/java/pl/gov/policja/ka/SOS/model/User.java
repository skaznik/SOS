package pl.gov.policja.ka.SOS.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import java.util.Set;

@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "users")

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id")
    private int id;
    //identyfikator do logowania
    @Column(name = "oic")
    @Length(min = 5, message = "*Nazwa użytkownika musi zawierać co najmniej 5 znaków")
    @NotEmpty(message = "*Proszę wprowadzić nazwę użytkownika")
    private String oic;
    //hasło
    @Column(name = "password")
    @Length(min = 5, message = "*Hasło musi zawierać co najmniej 5 znaków")
    @NotEmpty(message = "*Proszę wprowadzić hasło")
    private String password;
    //imie
    @Column(name = "first_name")
    @NotEmpty(message = "*Pole imię nie może być puste!")
    private String firstName;
    //nazwisko
    @Column(name = "last_name")
    @NotEmpty(message = "*Pole nazwisko nie może być puste!")
    private String lastName;
    //nr telefonu
    @Column(name = "phone")
    @NotEmpty(message = "*Proszę podać numer telefonu")
    private String phone;
    //poczta e-mail
    @Column(name = "email")
    @Email(message = "*Proszę wprowadzić poprawny adres e-mail")
    @NotEmpty(message = "*Adres e-mail nie może być pusty")
    private String email;
    //czy aktywny
    @Column(name = "active")
    private boolean active;
    //czy może dodawać usterki
    @Column(name = "addFault")
    private boolean addFault;
    //czy może dodawać zlecenia
    @Column(name = "addOrder")
    private boolean addOrder;
    //rola użytkownika
    @ManyToMany(cascade = CascadeType.MERGE)
    @JoinTable(name = "user_role", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<Role> roles;
    // dział użytkownika
    @ManyToMany(cascade = CascadeType.MERGE)
    @JoinTable(name = "user_department", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "department_id"))
    private Set<Department> departments;
}
