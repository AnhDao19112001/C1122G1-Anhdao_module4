package com.example.book_loan_app.service.impl;

import com.example.book_loan_app.model.Oder;
import com.example.book_loan_app.repository.IOderRepository;
import com.example.book_loan_app.service.IOderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Random;

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
    public String findByCode() {
        String code = String.valueOf(new Random().nextInt(90000) + 10000);
        List<Oder> oderList = findAll();
        for (int i = 0; i < oderList.size(); i++) {
            if (code.equals(oderList.get(i).getCode())) {
                code = String.valueOf(new Random().nextInt(90000) + 10000);
            }
        }
        return code;
    }

    @Override
    public void delete(int id) {
        iOderRepository.deleteById(id);
    }


}
