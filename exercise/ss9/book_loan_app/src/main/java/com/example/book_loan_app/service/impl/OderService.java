package com.example.book_loan_app.service.impl;
import com.example.book_loan_app.model.Oder;
import com.example.book_loan_app.repository.IOderRepository;
import com.example.book_loan_app.service.IOderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class OderService implements IOderService {
    @Autowired
    private IOderRepository iOderRepository;

    @Override
    public List<Oder> findAll() {
        return iOderRepository.findAll();
    }

    @Override
    public void save(Oder oder) {
        iOderRepository.save(oder);
    }

    @Override
    public Oder findByCode(String code) {
        return iOderRepository.findByCode(code);
    }

    @Override
    public void delete(int id) {
        iOderRepository.deleteById(id);
    }


}
