package vn.phatdo.case_study.models.entity.user;

import lombok.Data;
import lombok.NoArgsConstructor;
import vn.phatdo.case_study.models.entity.employee.Employee;

import javax.persistence.*;
import java.util.Set;

@Data
@NoArgsConstructor
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String username ;
    private String password ;
    @OneToMany
    private Set<Employee> employees ;
    @ManyToMany
    private Set<Role> likedRoles ;
}
