package kodlamaio.hrms.business.concretes;

import kodlamaio.hrms.business.abstracts.CandidateService;

import kodlamaio.hrms.core.utilities.results.*;
import kodlamaio.hrms.dataAccess.abstracts.CandidateDao;
import kodlamaio.hrms.entities.concretes.Candidate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CandidateManager implements CandidateService {

    private CandidateDao candidateDao;

    @Autowired
    public CandidateManager(CandidateDao candidateDao) {
        this.candidateDao = candidateDao;
    }

    @Override
    public DataResult<List<Candidate>> getAll() {
        return new SuccessDataResult<List<Candidate>> (this.candidateDao.findAll(), "İş adayları listelendi.");
    }

    @Override
    public Result register(Candidate candidate) {
        this.candidateDao.save(candidate);
        if (true) {
            return new SuccessResult("Kaydınız başarıyla tamamlandı.");
        }
        else {
            return new ErrorResult("Kaydınız gerçekleşemedi");
        }
    }
}
