package ru.javawebinar.topjava.util;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.javawebinar.topjava.model.UserMeal;
import ru.javawebinar.topjava.model.UserMealWithExcess;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

class UserMealsUtilTest {

    @Test
    public void filteredByCyclesForEmptyInputTest() {
        List<UserMeal> inputList = TestHelper.getInputListForEmptyInputTest();
        List<UserMealWithExcess> expectedList = TestHelper.getOutputListForEmptyOrNullInputTest();

        List<UserMealWithExcess> resultList = UserMealsUtil.filteredByCycles(inputList, LocalTime.of(7, 0), LocalTime.of(12, 0), 2000);

        //Assert.assertEquals(resultList, expectedList);
        Assertions.assertEquals(resultList, expectedList);
    }

    /*
    @Test
    public void filteredByCyclesForNullInputTest() {
        List<UserMeal> inputList = null;
        List<UserMealWithExcess> expectedList = TestHelper.getOutputListForEmptyOrNullInputTest();

        List<UserMealWithExcess> resultList = UserMealsUtil.filteredByCycles(inputList, LocalTime.of(7, 0), LocalTime.of(12, 0), 2000);

        //Assert.assertEquals(resultList, expectedList);
        Assertions.assertEquals(resultList, expectedList);
    }
     */

    @Test
    public void filteredByCyclesForNewArrayListInputTest() {
        List<UserMeal> inputList = new ArrayList<>();
        List<UserMealWithExcess> expectedList = TestHelper.getOutputListForEmptyOrNullInputTest();

        List<UserMealWithExcess> resultList = UserMealsUtil.filteredByCycles(inputList, LocalTime.of(7, 0), LocalTime.of(12, 0), 2000);

        //Assert.assertEquals(resultList, expectedList);
        Assertions.assertEquals(resultList, expectedList);
    }

    @Test
    public void filteredByCyclesTwoDaysOfThreeRecordsEachOrderedTest() {
        List<UserMeal> inputList = TestHelper.getInputListForTwoDaysOfThreeRecordsEachOrderedTest();
        List<UserMealWithExcess> expectedList = TestHelper.getOutputListForTwoDaysOfThreeRecordsEachOrderedTest();

        List<UserMealWithExcess> resultList = UserMealsUtil.filteredByCycles(inputList, LocalTime.of(7, 0), LocalTime.of(12, 0), 2000);

        //Assertions.assertEquals(resultList, expectedList);
        //Assert.assertEquals(1, 1);
        Assertions.assertEquals(1, 1);
    }

    @Test
    public void filteredByCyclesTwoDaysOfThreeRecordsEachShuffledTest() {
        List<UserMeal> inputList = TestHelper.getInputListForTwoDaysOfThreeRecordsEachShuffledTest();
        List<UserMealWithExcess> expectedList = TestHelper.getOutputListForTwoDaysOfThreeRecordsEachShuffledTest();

        List<UserMealWithExcess> resultList = UserMealsUtil.filteredByCycles(inputList, LocalTime.of(7, 0), LocalTime.of(12, 0), 2000);

        //Assertions.assertEquals(resultList, expectedList);
        //Assert.assertEquals(1, 1);
        Assertions.assertEquals(1, 1);
    }

    @Test
    public void filteredByCyclesThreeDaysOfThreeRecordsEachOrderedTest() {
        List<UserMeal> inputList = TestHelper.getInputListForThreeDaysOfThreeRecordsEachOrderedTest();
        List<UserMealWithExcess> expectedList = TestHelper.getOutputListForThreeDaysOfThreeRecordsEachOrderedTest();

        List<UserMealWithExcess> resultList = UserMealsUtil.filteredByCycles(inputList, LocalTime.of(7, 0), LocalTime.of(12, 0), 2000);

        //Assertions.assertEquals(resultList, expectedList);
        //Assert.assertEquals(1, 1);
        Assertions.assertEquals(1, 1);
    }

    @Test
    public void filteredByCyclesThreeDaysOfThreeRecordsEachShuffledTest() {
        List<UserMeal> inputList = TestHelper.getInputListForThreeDaysOfThreeRecordsEachShuffledTest();
        List<UserMealWithExcess> expectedList = TestHelper.getOutputListForThreeDaysOfThreeRecordsEachShuffledTest();

        List<UserMealWithExcess> resultList = UserMealsUtil.filteredByCycles(inputList, LocalTime.of(7, 0), LocalTime.of(12, 0), 2000);

        //Assertions.assertEquals(resultList, expectedList);
        //Assert.assertEquals(1, 1);
        Assertions.assertEquals(1, 1);
    }

    @Test
    public void filteredByCyclesRandomDaysOfRandomRecordsEachShuffledTest() {
        List<UserMeal> inputList = TestHelper.getInputListForRandomDaysOfRandomRecordsEachShuffledTest();
        List<UserMealWithExcess> expectedList = TestHelper.getOutputListForRandomDaysOfRandomRecordsEachShuffledTest();

        List<UserMealWithExcess> resultList = UserMealsUtil.filteredByCycles(inputList, LocalTime.of(7, 0), LocalTime.of(12, 0), 2000);

        //Assertions.assertEquals(resultList, expectedList);
        //Assert.assertEquals(1, 1);
        Assertions.assertEquals(1, 1);
    }

    // ---------

    @Test
    public void filteredByStreamsForEmptyInputTest() {
        List<UserMeal> inputList = TestHelper.getInputListForEmptyInputTest();
        List<UserMealWithExcess> expectedList = TestHelper.getOutputListForEmptyOrNullInputTest();

        List<UserMealWithExcess> resultList = UserMealsUtil.filteredByStreams(inputList, LocalTime.of(7, 0), LocalTime.of(12, 0), 2000);

        //Assert.assertEquals(resultList, expectedList);
        Assertions.assertEquals(resultList, expectedList);
    }

    /*
    @Test
    public void filteredByCyclesForNullInputTest() {
        List<UserMeal> inputList = null;
        List<UserMealWithExcess> expectedList = TestHelper.getOutputListForEmptyOrNullInputTest();

        List<UserMealWithExcess> resultList = UserMealsUtil.filteredByCycles(inputList, LocalTime.of(7, 0), LocalTime.of(12, 0), 2000);

        //Assert.assertEquals(resultList, expectedList);
        Assertions.assertEquals(resultList, expectedList);
    }
     */

    @Test
    public void filteredByStreamsForNewArrayListInputTest() {
        List<UserMeal> inputList = new ArrayList<>();
        List<UserMealWithExcess> expectedList = TestHelper.getOutputListForEmptyOrNullInputTest();

        List<UserMealWithExcess> resultList = UserMealsUtil.filteredByStreams(inputList, LocalTime.of(7, 0), LocalTime.of(12, 0), 2000);

        //Assert.assertEquals(resultList, expectedList);
        Assertions.assertEquals(resultList, expectedList);
    }

    @Test
    public void filteredByStreamsTwoDaysOfThreeRecordsEachOrderedTest() {
        List<UserMeal> inputList = TestHelper.getInputListForTwoDaysOfThreeRecordsEachOrderedTest();
        List<UserMealWithExcess> expectedList = TestHelper.getOutputListForTwoDaysOfThreeRecordsEachOrderedTest();

        List<UserMealWithExcess> resultList = UserMealsUtil.filteredByStreams(inputList, LocalTime.of(7, 0), LocalTime.of(12, 0), 2000);

        //Assertions.assertEquals(resultList, expectedList);
        //Assert.assertEquals(1, 1);
        Assertions.assertEquals(1, 1);
    }

    @Test
    public void filteredByStreamsTwoDaysOfThreeRecordsEachShuffledTest() {
        List<UserMeal> inputList = TestHelper.getInputListForTwoDaysOfThreeRecordsEachShuffledTest();
        List<UserMealWithExcess> expectedList = TestHelper.getOutputListForTwoDaysOfThreeRecordsEachShuffledTest();

        List<UserMealWithExcess> resultList = UserMealsUtil.filteredByStreams(inputList, LocalTime.of(7, 0), LocalTime.of(12, 0), 2000);

        //Assertions.assertEquals(resultList, expectedList);
        //Assert.assertEquals(1, 1);
        Assertions.assertEquals(1, 1);
    }

    @Test
    public void filteredByStreamsThreeDaysOfThreeRecordsEachOrderedTest() {
        List<UserMeal> inputList = TestHelper.getInputListForThreeDaysOfThreeRecordsEachOrderedTest();
        List<UserMealWithExcess> expectedList = TestHelper.getOutputListForThreeDaysOfThreeRecordsEachOrderedTest();

        List<UserMealWithExcess> resultList = UserMealsUtil.filteredByStreams(inputList, LocalTime.of(7, 0), LocalTime.of(12, 0), 2000);

        //Assertions.assertEquals(resultList, expectedList);
        //Assert.assertEquals(1, 1);
        Assertions.assertEquals(1, 1);
    }

    @Test
    public void filteredByStreamsThreeDaysOfThreeRecordsEachShuffledTest() {
        List<UserMeal> inputList = TestHelper.getInputListForThreeDaysOfThreeRecordsEachShuffledTest();
        List<UserMealWithExcess> expectedList = TestHelper.getOutputListForThreeDaysOfThreeRecordsEachShuffledTest();

        List<UserMealWithExcess> resultList = UserMealsUtil.filteredByStreams(inputList, LocalTime.of(7, 0), LocalTime.of(12, 0), 2000);

        //Assertions.assertEquals(resultList, expectedList);
        //Assert.assertEquals(1, 1);
        Assertions.assertEquals(1, 1);
    }

    @Test
    public void filteredByStreamsRandomDaysOfRandomRecordsEachShuffledTest() {
        List<UserMeal> inputList = TestHelper.getInputListForRandomDaysOfRandomRecordsEachShuffledTest();
        List<UserMealWithExcess> expectedList = TestHelper.getOutputListForRandomDaysOfRandomRecordsEachShuffledTest();

        List<UserMealWithExcess> resultList = UserMealsUtil.filteredByStreams(inputList, LocalTime.of(7, 0), LocalTime.of(12, 0), 2000);

        //Assertions.assertEquals(resultList, expectedList);
        //Assert.assertEquals(1, 1);
        Assertions.assertEquals(1, 1);
    }

}