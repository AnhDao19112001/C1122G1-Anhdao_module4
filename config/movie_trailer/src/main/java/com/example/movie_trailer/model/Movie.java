//Bài tập nhỏ: Xây dựng hệ thống quản lý suất chiếu phim tại rạp ABC, biết mỗi suất chiếu có các thông tin sau:
//        - Mã suất chiếu (định dạng CI-XXXX, với X là số nguyên dương), mã không được trùng nhau.
//        - Tên phim (mỗi suất chiếu chỉ xem được 1 phim, một phim sẽ có nhiều suất chiếu khác nhau)
//        - Ngày chiếu (phải sau ngày hiện tại)
//        - Số lượng vé (là số nguyên dương)
//        Tạo các chức năng sau:
//        1. Danh sách toàn bộ suất chiếu của rạp.
//        2. Thêm mới một suất chiếu
//        3. Xoá suất chiếu bất kì theo Mã suất chiếu, trước khi xoá thì cần hiển thị confirm.
//        4. Thoát
//        Lưu ý:
//        - Cần validate khi thêm mới thông tin.
//        - Dữ liệu sẽ được lưu trữ ở DB.
package com.example.movie_trailer.model;

import javax.persistence.*;
import javax.xml.crypto.Data;
import java.util.Date;
import java.util.Set;

@Entity
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private Date date;
    private int ticket;
    @OneToMany(mappedBy = "movie")
    Set<Premiere> premiereSet;

    public Movie() {
    }

    public Movie(int id, String name, Date date, int ticket, Set<Premiere> premiereSet) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.ticket = ticket;
        this.premiereSet = premiereSet;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getTicket() {
        return ticket;
    }

    public void setTicket(int ticket) {
        this.ticket = ticket;
    }

    public Set<Premiere> getPremiereSet() {
        return premiereSet;
    }

    public void setPremiereSet(Set<Premiere> premiereSet) {
        this.premiereSet = premiereSet;
    }
}
