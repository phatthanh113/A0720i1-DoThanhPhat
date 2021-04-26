package vn.phatdo.case_study.models.entity.service;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;
import vn.phatdo.case_study.models.entity.contract.Contract;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import java.util.Set;

@Data
@NoArgsConstructor
@Entity
public class Service {
    @Id
    @GeneratedValue(generator = "id")
    @GenericGenerator(name = "id",
            strategy = "vn.phatdo.case_study.models.generator.MyGenerator",
            parameters = {@org.hibernate.annotations.Parameter(name = "prefix", value = "DV-"),
                    @org.hibernate.annotations.Parameter(name = "sequence", value = "service_sequence")})
    private String id ;
    @NotBlank
    private String name ;

    private long area ;

    private Double cost ;
    @Min(1)
    @Max(15)
    private int maxPeople ;
    private String stardardRoom ;
    private String descriptionOtherConvinience ;
    private Double poolArea ;
    private int numberFloor ;
    @ManyToOne(cascade = CascadeType.ALL)
    private RentType rentType ;
    @ManyToOne(cascade = CascadeType.ALL)
    private ServiceType serviceType ;
    @OneToMany
    Set<Contract> contracts ;
}
