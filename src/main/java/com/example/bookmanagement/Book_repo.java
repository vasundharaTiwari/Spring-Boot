package com.example.bookmanagement;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Book_repo extends JpaRepository <Book,Integer>{

}
