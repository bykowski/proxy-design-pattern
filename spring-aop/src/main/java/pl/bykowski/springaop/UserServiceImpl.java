package pl.bykowski.springaop;

import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public void hello() {
        System.out.println("siema!");
    }
}