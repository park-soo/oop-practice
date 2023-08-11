package org.example;

public class PasswordValidator {

    public static final String WRONG_PASSWORD_LENGTH_EXCEPTION_MESSAGE = "비밀번호는 최소 8자 이상 12자 이하여야 한다.";

    public static void validate(String password) {
//        리팩토링 전
//        if (password.length() < 8 || password.length() > 12) {
//            throw new IllegalArgumentException("비밀번호는 최소 8자 이상 12자 이하여야 한다.");
//        }

        //리팩토링
        int length = password.length();
        if (length < 8 || length > 12) {
            throw new IllegalArgumentException(WRONG_PASSWORD_LENGTH_EXCEPTION_MESSAGE);
        }



    }
}
