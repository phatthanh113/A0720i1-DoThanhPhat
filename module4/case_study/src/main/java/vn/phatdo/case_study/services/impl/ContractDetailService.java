package vn.phatdo.case_study.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import vn.phatdo.case_study.models.entity.contract.AttachService;
import vn.phatdo.case_study.models.entity.contract.ContractDetail;
import vn.phatdo.case_study.repositories.IContractDetailRepository;
import vn.phatdo.case_study.services.IContractDetailService;

import java.util.List;

@Service
public class ContractDetailService implements IContractDetailService {
    @Autowired
    IContractDetailRepository contractDetailRepository ;
    @Override
    public List<AttachService> getListAttachService() {
        return contractDetailRepository.findAllAttachService();
    }

    @Override
    public Page findAll(Pageable pageable) {
        return contractDetailRepository.findAll(pageable);
    }

    @Override
    public void save(ContractDetail contractDetail) {
        contractDetailRepository.save(contractDetail);
    }

    @Override
    public void delete(int id) {
        contractDetailRepository.deleteById(id);
    }

    @Override
    public ContractDetail findById(int id) {
        return contractDetailRepository.findById(id).orElse(null);
    }
}
