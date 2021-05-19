package vn.phatdo.case_study.models.entity.customer;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.validator.constraints.Range;
import org.springframework.format.annotation.DateTimeFormat;
import vn.phatdo.case_study.models.entity.contract.Contract;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.time.LocalDate;
import java.util.Set;

@Data
@Entity
@NoArgsConstructor

public class Customer {
    @Id
    @GeneratedValue(generator = "id")
    @GenericGenerator(name = "id",
            strategy = "vn.phatdo.case_study.models.generator.MyGenerator",
            parameters = {@org.hibernate.annotations.Parameter(name = "prefix", value = "KH-"),
                    @org.hibernate.annotations.Parameter(name = "sequence", value = "customer_sequence")})
    private String id ;

    @ManyToOne(cascade = CascadeType.ALL)
    private CustomerType customerType ;
    @NotBlank(message = "{NotNull.customer.name}")
    private String name ;
    @DateTimeFormat(pattern = "dd-MM-yyyy")
    private LocalDate birthday ;
    @NotNull
    private String gender ;
    @Pattern(regexp = "^([\\d]{9}|[\\d]{12})$",message = "{reg.customer.idCard}s")
    private String idCard ;
    @Pattern(regexp = "([+84|84|0]+[3|5|7|8|9])+([0-9]{8})\\b",message = "{reg.customer.phone}")
    private String phone ;
    private String email ;
    private String address ;
    @OneToMany
    private Set<Contract> contracts ;
    @Range(min = 0l, message = "Please select positive numbers Only")
    private int amount;

}
