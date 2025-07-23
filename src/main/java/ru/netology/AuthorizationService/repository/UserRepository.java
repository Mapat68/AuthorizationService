package ru.netology.AuthorizationService.repository;

import org.springframework.stereotype.Repository;
import ru.netology.AuthorizationService.model.Authorities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Repository
public class UserRepository {
    public List<Authorities> getUserAuthorities(String user, String password) {
        List<Authorities> authorities = new ArrayList<>();
        if (user.equals("administrator") && password.equals("qwerty")) {
            authorities.add(Authorities.WRITE);
            authorities.add(Authorities.READ);
            authorities.add(Authorities.DELETE);
        } else if (user.equals("user") && password.equals("1234")) {
            authorities.add(Authorities.READ);
        } else if (user.equals("names") && password.equals("123456")) {
            authorities.add(Authorities.WRITE);
            authorities.add(Authorities.READ);
        } else {
            return Collections.emptyList();
        }
        return authorities;
    }
}
