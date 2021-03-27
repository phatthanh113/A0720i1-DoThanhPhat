package vn.phatdo.case_study.models.entity.customer;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import vn.phatdo.case_study.models.entity.contract.Contract;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Set;

@Data
@Entity
@NoArgsConstructor
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id ;

    @ManyToOne(cascade = CascadeType.ALL)
    private CustomerType customerType ;
    
    private String name ;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate birthday ;
    private String gender ;
    private String idCard ;
    private String phone ;
    private String email ;
    private String address ;
    @OneToMany
    private Set<Contract> contracts ;
}
