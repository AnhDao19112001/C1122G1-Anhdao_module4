package com.example.validate_form_regiter.dto;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import javax.validation.constraints.*;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
public class UserDto implements Validator {
    @NotBlank(message = "Tên không được để trống.")
    @Size(min = 5, max = 45, message = "Tên có độ dài tối thiểu 5, tối đa 45 ký tự.")
    private String firstName;
    @NotBlank(message = "Tên không được để trống.")
    @Size(min = 5, max = 45, message = "Tên có độ dài tối thiểu 5, tối đa 45 ký tự.")
    private String lastName;
    @NotBlank(message = "SĐT không được để trống.")
    @Pattern(regexp = "^0\\d{9}$", message = "SĐT phải có 10 số, và bắt đầu bằng số 0.")
    private String phoneNumber;
    @NotBlank(message = "Tuổi không được để trống.")
    private String age;
    @NotBlank(message = "Email không được để trống.")
    @Email(message = "Email phải đúng định dạng.")
    @Size(min = 5, max = 45, message = "Vui lòng nhập lại đúng với độ dài!")
    private String email;

    public UserDto() {
    }

    public UserDto(String firstName, String lastName, String phoneNumber, String age, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.age = age;
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {
        UserDto user = (UserDto) target;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        try {
            LocalDate age = LocalDate.parse(user.getAge(), formatter);
            LocalDate now = LocalDate.now();
            int yearOld = Period.between(age, now).getYears();
            if (yearOld < 18) {
                errors.rejectValue("age", "age","Tuổi tối thiểu là 18 vui lòng kiểm tra lại");
            }
        } catch (DateTimeParseException e) {
            errors.rejectValue("age", "age","Định dạng ngày không hợp lệ, vui lòng kiểm tra lại");
        }
    }
}
