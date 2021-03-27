package vn.phatdo.case_study.models.entity.service;

import lombok.Data;
import lombok.NoArgsConstructor;
import vn.phatdo.case_study.models.entity.contract.Contract;

import javax.persistence.*;
import java.util.Set;

@Data
@NoArgsConstructor
@Entity
public class Service {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id ;
    private String name ;
    private long area ;
    private Double cost ;
    private int maxPeople ;
    private String stardardRoom ;
    private String descriptionOtherConvinience ;
    private Double poolArea ;
    private int numberFloor ;
    @ManyToOne(cascade = CascadeType.ALL)
    private RentType rentType ;
    @ManyToOne(cascade = CascadeType.ALL)
    private ServiceType serviceType ;
    @OneToMany(cascade = CascadeType.ALL)
    Set<Contract> contracts ;
}
