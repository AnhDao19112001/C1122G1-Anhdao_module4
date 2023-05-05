package mail_box.repository.impl;

import mail_box.model.Mail;
import mail_box.repository.IMailRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class MailRepository implements IMailRepository {

    private static final List<Mail> mailList = new ArrayList<>();

    static {
        mailList.add(new Mail(1, "English", 5, true, "thor"));
        mailList.add(new Mail(2, "Vietnamese", 10, true, "thor"));
        mailList.add(new Mail(3, "Japanese", 15, true, "thor"));
        mailList.add(new Mail(4, "Chinese", 25, false, "thor"));
    }

    @Override
    public List<Mail> findAll() {
        return mailList;
    }

    @Override
    public void update(Mail mail) {
        for (Mail item : mailList) {
            if (mail.getId() == item.getId()){
                item.setLanguage(mail.getLanguage());
                item.setPageSize(mail.getPageSize());
                item.setSpamsFilter(mail.getSpamsFilter());
                item.setSignature(mail.getSignature());
                break;
            }
        }
    }

    @Override
    public Mail findById(int id) {
        for (Mail items : mailList) {
            if (items.getId() == id) {
                return items;
            }
        }
        return null;
    }

    @Override
    public List<String> findLanguage() {
        List<String> stringList = new ArrayList<>();
        stringList.add("English");
        stringList.add("Vietnamese");
        stringList.add("Japanese");
        stringList.add("Chinese");
        return stringList;
    }

    @Override
    public List<Integer> findPageSize() {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(5);
        integerList.add(10);
        integerList.add(15);
        integerList.add(25);
        integerList.add(50);
        integerList.add(100);
        return integerList;
    }
}
