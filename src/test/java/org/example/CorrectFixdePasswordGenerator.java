package org.example;

public class CorrectFixdePasswordGenerator implements PasswordGenerator {
    @Override
    public String generatePassword() {
        return "abcdefgh";  //8글자
    }
}
