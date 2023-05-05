package mail_box.service.impl;

import mail_box.model.Mail;
import mail_box.repository.IMailRepository;
import mail_box.service.IMailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MailService implements IMailService {
    @Autowired
    private IMailRepository iMailRepository;
    @Override
    public List<Mail> findAll() {
        return iMailRepository.findAll();
    }

    @Override
    public void update(Mail mail) {
        iMailRepository.update(mail);
    }

    @Override
    public Mail findById(int id) {
        return iMailRepository.findById(id);
    }

    @Override
    public List<String> findLanguage() {
        return iMailRepository.findLanguage();
    }

    @Override
    public List<Integer> findPageSize() {
        return iMailRepository.findPageSize();
    }
}
