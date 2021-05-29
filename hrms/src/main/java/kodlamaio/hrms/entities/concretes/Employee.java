package kodlamaio.hrms.entities.concretes;

import kodlamaio.hrms.entities.abstracts.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "employees")
@PrimaryKeyJoinColumn(name = "id")  // User daki id ile Employee deki id ler baglanir
public class Employee extends User {

    @Column(name = "company_name")
    private String companyName;

    @Column(name = "web_address")
    private String webAddress;

}