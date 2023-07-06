package com.yohwan.junitstudy.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProfileTest {
    private Profile profile;
    private BooleanQuestion question;
    private Criteria criteria;

    @BeforeEach
    void create() {
        profile = new Profile("Bull Hockey, Inc. ");
        question = new BooleanQuestion(1, "Got bonuses?");
        criteria = new Criteria();
    }

    @Test
    @DisplayName("무조건 매치해야 되는 기준에 매치되지 않으면 false를 응답해야함")
    void matchAnswersFalseWhenMustMatchCriteriaNotMet() {
        profile.add(new Answer(question, Bool.FALSE));
        criteria.add(new Criterion(new Answer(question, Bool.TRUE), Weight.MustMatch));

        boolean matches = profile.matches(criteria);

        assertFalse(matches);
    }

    @Test
    @DisplayName("상관 없는 기준에 매치되면 true를 응답해야함")
    void matchAnswersTrueForAnyDontCareCriteria() {
        profile.add(new Answer(question, Bool.FALSE));
        criteria.add(new Criterion(new Answer(question, Bool.TRUE), Weight.DontCare));

        boolean matches = profile.matches(criteria);
        assertTrue(matches);
    }

}