package vn.phatdo.case_study.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import vn.phatdo.case_study.models.entity.contract.AttachService;
import vn.phatdo.case_study.models.entity.contract.ContractDetail;

import java.util.List;

@Repository
public interface IContractDetailRepository extends JpaRepository<ContractDetail,Integer> {
    Page<ContractDetail> findAll(Pageable pageable) ;
    @Query("select ct from AttachService ct")
    List<AttachService> findAllAttachService();

}
