package mail_box.service;

import mail_box.model.Mail;

import java.util.List;

public interface IMailService {
    List<Mail> findAll();
    void update(Mail mail);
    Mail findById(int id);
    List<String> findLanguage();
    List<Integer> findPageSize();
}
