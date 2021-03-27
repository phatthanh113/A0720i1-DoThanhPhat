package vn.phatdo.case_study.models.entity.employee;

import lombok.Data;
import lombok.NoArgsConstructor;
import vn.phatdo.case_study.models.entity.contract.Contract;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Data
@Entity
@NoArgsConstructor
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id ;
    private String name ;
    private Date birthday;
    private String idCard ;
    private Double salary ;
    private String phone ;
    private String email ;
    private String address ;
    @ManyToOne(cascade = CascadeType.ALL)
    private Position position ;
    @ManyToOne(cascade = CascadeType.ALL)
    private EducationDegree educationDegree ;
    @ManyToOne(cascade = CascadeType.ALL)
    private Division division ;
    @OneToMany(cascade = CascadeType.ALL)
    private Set<Contract> contracts ;
}
