package com.yohwan.junitstudy.chater01;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ScoreCollectionTest {
    @Test
    void test() {
    }

    @Test
    void answerArithmeticMeanOfTwoNumbers() {
        ScoreCollection collection = new ScoreCollection();
        collection.add(() -> 5);
        collection.add(() -> 7);

        int actualResult = collection.arithmeticMean();

        assertThat(actualResult).isEqualTo(6);
    }

}