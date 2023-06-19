package org.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.entity.Comments;

@Repository
public interface CommentRepository extends JpaRepository<Comments,Long> {

}
