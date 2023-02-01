package com.springdemo.springbootnote.repository;

import com.springdemo.springbootnote.model.Note;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotesRepository extends JpaRepository<Note,Long> {
}
