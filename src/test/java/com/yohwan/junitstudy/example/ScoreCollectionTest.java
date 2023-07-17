package com.yohwan.junitstudy.example;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ScoreCollectionTest {

    // 메서드명 잘 짓는 법 = whenDoingSomeBehaviorThenSomeResultOccurs(어떤 일을 하면 어떤 결과가 나온다.)
    @Test
    void answerArithmeticMeanOfTwoNumbers() {
        // Arrange(준비), Given
        ScoreCollection collection = new ScoreCollection();
        collection.add(() -> 5);
        collection.add(() -> 7);

        // Act(실행), When
        int actualResult = collection.arithmeticMean();

        // Assert(단언), Then
        assertThat(actualResult).isEqualTo(6);
    }

}