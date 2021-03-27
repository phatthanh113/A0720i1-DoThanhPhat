package vn.phatdo.case_study.models.entity.contract;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import vn.phatdo.case_study.models.entity.customer.Customer;
import vn.phatdo.case_study.models.entity.employee.Employee;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Set;

@Data
@NoArgsConstructor
@Entity
public class Contract {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id ;
    private String name ;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate startDate ;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate endDate ;
    private Double depostit ;
    private Double totalMoney ;
    @OneToMany(cascade = CascadeType.ALL)
    private Set<Employee> employees ;
    @ManyToOne(cascade = CascadeType.MERGE)
    Customer customer ;
    @ManyToOne(cascade = CascadeType.ALL)
    Employee employee ;
    @OneToMany(cascade = CascadeType.ALL)
    Set<ContractDetail> contractDetail ;
}
