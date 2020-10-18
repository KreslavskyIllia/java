package ru.geekbrains;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class ArraysUtilsTest {
    @Test
    public void shouldCreateArrayAfterLastFour() {
        Assertions.assertArrayEquals(new int[] {5, 1, 3, 5, 6}, ArraysUtils.arrayAfterLastFour(new int[] {1, 4, 8, 6, 2, 4, 5, 1, 3, 5, 6}));

    }

    @ParameterizedTest
    @MethodSource("arraySuccessfulProvider")
    void shouldCreateArray(int[] expectedArray, int[] SourceArray) {
        Assertions.assertArrayEquals(expectedArray, ArraysUtils.arrayAfterLastFour(SourceArray));
    }

    private static Stream<Arguments> arraySuccessfulProvider() {
        return Stream.of(
                Arguments.arguments(new int[] {5, 7, 1}, new int[] {1, 4, 3, 4, 5, 7, 1}),
                Arguments.arguments(new int[] {3, 5, 7, 1}, new int[] {1, 4, 3, 5, 7, 1}),
                Arguments.arguments(new int[] {3}, new int[] {1, 4, 3})
        );
    }

    @ParameterizedTest
    @MethodSource("emptyArraysProvider")
    void shouldCreateEmptyArray(int[] expectedArray, int[] SourceArray) {
        Assertions.assertArrayEquals(expectedArray, ArraysUtils.arrayAfterLastFour(SourceArray));
    }

    private static Stream<Arguments> emptyArraysProvider() {
        return Stream.of(
                Arguments.arguments(new int[]{}, new int[]{9, 4, 4}),
                Arguments.arguments(new int[]{}, new int[]{1, 4, 3, 5, 7, 4})
        );
    }

    @ParameterizedTest
    @MethodSource("notFourParametersProvider")
    public void shouldNotFindFourInArray(int[] array, int valueToFind) {
        Assertions.assertFalse(ArraysUtils.ifArrayContainsOneAndFour(array), String.valueOf(valueToFind));
    }

    private static Stream<Arguments> notFourParametersProvider() {
        return Stream.of (
                Arguments.arguments(new int[]{1, 1, 1, 1}, 4),
                Arguments.arguments(new int[]{}, 4),
                Arguments.arguments(new int[]{5, 7, 1}, 4)
        );
    }
    @ParameterizedTest
    @MethodSource("notOneParametersProvider")
    public void shouldNotFindOneInArray(int[] array, int valueToFind) {
        Assertions.assertFalse(ArraysUtils.ifArrayContainsOneAndFour(array), String.valueOf(valueToFind));
    }

    private static Stream<Arguments> notOneParametersProvider() {
        return Stream.of (
                Arguments.arguments(new int[]{4, 4, 4}, 1),
                Arguments.arguments(new int[]{}, 1),
                Arguments.arguments(new int[]{5, 7, 1}, 1)
        );
    }

    @ParameterizedTest
    @MethodSource("notOneAndFourParametersProvider")
    public void shouldNotFindOneAndFourInArray(int[] array) {
        Assertions.assertFalse(ArraysUtils.ifArrayContainsOneAndFour(array));
    }

    private static Stream<Arguments> notOneAndFourParametersProvider() {
        return Stream.of (
                Arguments.arguments(new int[]{4, 4, 4}),
                Arguments.arguments(new int[]{}),
                Arguments.arguments(new int[]{5, 7, 1}),
                Arguments.arguments(new int[]{1, 1, 1, 1, 1})
        );
    }

    @Test
    public void shouldFindOneAndFour() {
        Assertions.assertTrue(ArraysUtils.ifArrayContainsOneAndFour(new int[] {1, 4, 4, 4}));
    }
}
