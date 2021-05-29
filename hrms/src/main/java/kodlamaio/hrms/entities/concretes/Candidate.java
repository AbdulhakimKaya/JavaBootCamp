package kodlamaio.hrms.entities.concretes;


import kodlamaio.hrms.entities.abstracts.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.boot.convert.DataSizeUnit;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "candidates")
@EqualsAndHashCode(callSuper = false)
@PrimaryKeyJoinColumn(name = "id")  // User daki id ile Candidate deki id ler baglanir
public class Candidate extends User {

    @NotNull(message = "Isim alani bos olamaz")
    @Size(min=2,message="isim 2 harften az olamaz")
    @Column(name = "first_name")
    private String firstName;

    @NotNull(message = "Soyisim alani bos olamaz")
    @Column(name = "last_name")
    private String lastName;

    @NotNull(message = "TC kimlik numarasi alani bos olamaz")
    @Column(name = "identification_number")
    private String identificationNumber;

    @NotNull(message = "Dogum tarihi alani bos olamaz")
    @Column(name = "birth_date")
    private LocalDate birthDate;
}
