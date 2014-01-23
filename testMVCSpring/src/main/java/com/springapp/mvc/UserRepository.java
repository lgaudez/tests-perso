package com.springapp.mvc;

/**
 * Created by leoG on 20/01/14.
 */


        import com.springapp.model.User;
        import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}