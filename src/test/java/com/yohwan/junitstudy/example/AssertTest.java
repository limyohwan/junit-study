package com.yohwan.junitstudy.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class AssertTest {
    private Account account;

    @BeforeEach
    public void createAccount() {
        account = new Account("an account name");
    }

    @Test
    @Disabled("don't forget me!")
    public void somethingWeCannotHandleRightNow() {
        // ...
    }

    private class Account {
        private String name;

        public Account(String name) {
            this.name = name;
        }
    }
}
