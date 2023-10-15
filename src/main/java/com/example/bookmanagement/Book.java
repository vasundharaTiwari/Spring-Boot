package com.example.bookmanagement;

import jakarta.persistence.*;


@Entity
@Table(name ="BOOK")
public class Book {
    @Id
   // @GeneratedValue(strategy = GenerationType.AUTO)

    private int bid;

    private String b_name;

    private  String b_author;

    public Book(int bid, String b_name, String b_author) {
        this.bid = bid;
        this.b_name = b_name;
        this.b_author = b_author;
    }

    public Book() {
    }

    public int getbid() {
        return bid;
    }

    public void setbid(int bid) {
        this.bid = bid;
    }
    @Column(name = "b_name")

    public String getB_name() {
        return b_name;
    }

    public void setB_name(String b_name) {
        this.b_name = b_name;
    }
    @Column(name = "b_author")

    public String getB_author() {
        return b_author;
    }

    public void setB_author(String b_author) {
        this.b_author = b_author;
    }


}
