package vn.phatdo.case_study.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import vn.phatdo.case_study.models.entity.contract.Contract;
import vn.phatdo.case_study.repositories.IContractRepository;
import vn.phatdo.case_study.services.IContractService;

import java.util.List;

@Service
public class ContractService implements IContractService {
    @Autowired
    IContractRepository contractRepository ;

    @Override
    public List<Contract> findAll() {
        return null;
    }

    @Override
    public Page<Contract> findAll(Pageable pageable) {
        return contractRepository.findAll(pageable);
    }

    @Override
    public void save(Contract contract) {
        contractRepository.save(contract);
    }

    @Override
    public void delete(int id) {
        contractRepository.deleteById(id);
    }

    @Override
    public Contract findById(int id) {
        return contractRepository.findById(id).orElse(null);
    }
}
