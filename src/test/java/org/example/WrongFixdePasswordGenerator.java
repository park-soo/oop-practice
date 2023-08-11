package org.example;

public class WrongFixdePasswordGenerator implements PasswordGenerator {
    @Override
    public String generatePassword() {
        return "ab";  //8글자
    }
}
