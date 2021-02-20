package pl.gov.policja.ka.SOS.model;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@NoArgsConstructor
@Getter
@Setter
@Data
@Entity
@Table(name = "sos_department")
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "department_id")
    private int departmentId;
    @Column(name = "department_name")
    private String departmentName;

}
