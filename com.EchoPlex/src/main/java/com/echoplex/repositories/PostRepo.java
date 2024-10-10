package com.echoplex.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.echoplex.entities.*;

public interface PostRepo extends JpaRepository<Post, Long>
{

}
