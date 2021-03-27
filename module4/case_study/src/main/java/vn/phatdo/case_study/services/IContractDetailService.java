package vn.phatdo.case_study.services;

import vn.phatdo.case_study.models.entity.contract.AttachService;
import vn.phatdo.case_study.models.entity.contract.ContractDetail;

import java.util.List;

public interface IContractDetailService extends IService<ContractDetail> {
    List<AttachService> getListAttachService();
}
