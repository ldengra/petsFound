package com.ldengra.repository;

import com.ldengra.dto.PostDto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<PostDto, Long> {
}
