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
@Table(name = "status")
public class Status {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "status_id")
    private int statusId;
    //nazwa statusu
    @Column(name = "status_name")
    private String statusName;
    //czy aktywny
    @Column(name = "status_active")
    private boolean statusActive;
}
