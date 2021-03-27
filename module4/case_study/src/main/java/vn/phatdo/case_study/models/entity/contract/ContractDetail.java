package vn.phatdo.case_study.models.entity.contract;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity
public class ContractDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne(cascade = CascadeType.ALL)
    Contract contract ;
    private int quantity;
    @ManyToOne(cascade = CascadeType.ALL)
    private AttachService attachServices ;
}
