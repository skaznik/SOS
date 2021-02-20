package pl.gov.policja.ka.SOS.model;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@NoArgsConstructor
@Getter
@Setter
@Entity
@Data
@Table(name = "group")
public class Group {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "group_id")
    private int groupId;
    @Column(name = "group_name")
    private String groupName;
    @Column(name = "group_active")
    private boolean groupActive;
    @ManyToMany(cascade = CascadeType.MERGE)
    @JoinTable(name = "group_type", joinColumns = @JoinColumn(name = "group_id"), inverseJoinColumns = @JoinColumn(name = "type_id"))
    private Set<Type> types;

}
