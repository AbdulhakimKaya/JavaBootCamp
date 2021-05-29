package kodlamaio.hrms.entities.abstracts;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "users")
@Inheritance(strategy = InheritanceType.JOINED)  // base class olduğunu belirtir
public abstract class User {

    @Id  // primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id")
    private int id;

    @Column(name = "email_address")
    private String emailAddress;

    @Column(name = "password")
    private String password;
}