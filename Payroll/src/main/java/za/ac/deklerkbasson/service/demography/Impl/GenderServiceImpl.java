package za.ac.deklerkbasson.service.demography.Impl;

import za.ac.deklerkbasson.domain.demography.Gender;
import za.ac.deklerkbasson.repositoryTest.demography.GenderRepository;
import za.ac.deklerkbasson.repositoryTest.demography.Impl.GenderRepositoryImpl;
import za.ac.deklerkbasson.service.demography.GenderService;

import java.util.Set;

public class GenderServiceImpl implements GenderService {

    private static GenderServiceImpl service = null;
    private GenderRepository repository;

    private GenderServiceImpl() {
        this.repository = GenderRepositoryImpl.getRepository();
    }

    public static GenderServiceImpl getService(){
        if (service == null) service = new GenderServiceImpl();
        return service;
    }

    @Override
    public Gender create(Gender gender) {
        return this.repository.create(gender);
    }

    @Override
    public Gender update(Gender gender) {
        return this.repository.update(gender);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }

    @Override
    public Gender read(String s) {
        return this.repository.read(s);
    }

    @Override
    public Set<Gender> getAll() {
        return this.repository.getAll();
    }
}