package mail_box.bai_1.service;

import mail_box.bai_1.model.Mail;

import java.util.List;

public interface IMailService {
    List<Mail> findAll();
    void update(Mail mail);
    Mail findById(int id);
    List<String> findLanguage();
    List<Integer> findPageSize();
}
