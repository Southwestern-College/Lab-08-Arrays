import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class ArraysTest {

    @ParameterizedTest
    @MethodSource("toStringCases")
    void testToString(int[] input, String expected) {
        assertEquals(expected, Arrays.toString(input).replaceAll("\\s", ""));
    }

    static Stream<Arguments> toStringCases() {
        return Stream.of(
                Arguments.of(new int[] {7, -1, 0, 67}, "[7,-1,0,67]"),
                Arguments.of(new int[] {5}, "[5]"),
                Arguments.of(new int[] {}, "[]"),
                Arguments.of(new int[] {-3, -2, -1}, "[-3,-2,-1]")
        );
    }

    @ParameterizedTest
    @MethodSource("copyOfCases")
    void testCopyOf(int[] input, int newLength, int[] expected) {
        assertArrayEquals(expected, Arrays.copyOf(input, newLength));
    }

    static Stream<Arguments> copyOfCases() {
        return Stream.of(
                Arguments.of(new int[] {7, -1, 0, 67}, 3, new int[] {7, -1, 0}),
                Arguments.of(new int[] {7, -1, 0, 67}, 4, new int[] {7, -1, 0, 67}),
                Arguments.of(new int[] {7, -1, 0, 67}, 6, new int[] {7, -1, 0, 67, 0, 0}),
                Arguments.of(new int[] {7, -1, 0, 67}, 0, new int[] {}),
                Arguments.of(new int[] {}, 3, new int[] {0, 0, 0})
        );
    }

    @ParameterizedTest
    @MethodSource("equalsCases")
    void testEquals(int[] a, int[] b, boolean expected) {
        assertEquals(expected, Arrays.equals(a, b));
    }

    static Stream<Arguments> equalsCases() {
        return Stream.of(
                Arguments.of(new int[] {7, -1, 0, 67}, new int[] {7, -1, 0}, false),
                Arguments.of(new int[] {7, -1, 0, 67}, new int[] {7, -1, 0, 67, 0, 0}, false),
                Arguments.of(new int[] {7, -1, 0, 67}, new int[] {7, -1, 0, 68}, false),
                Arguments.of(new int[] {7, -1, 0, 67}, new int[] {67, 0, -1, 7}, false),
                Arguments.of(new int[] {7, -1, 0, 67}, new int[] {7, -1, 0, 67}, true),
                Arguments.of(new int[] {}, new int[] {}, true)
        );
    }

    @ParameterizedTest
    @MethodSource("maxCases")
    void testMax(int[] input, int expected) {
        assertEquals(expected, Arrays.max(input));
    }

    static Stream<Arguments> maxCases() {
        return Stream.of(
                Arguments.of(new int[] {7, -1, 0, 67}, 67),
                Arguments.of(new int[] {-7, -1, -10}, -1),
                Arguments.of(new int[] {5}, 5),
                Arguments.of(new int[] {9, 9, 3}, 9),
                Arguments.of(new int[] {1, 2, 3, 4}, 4),
                Arguments.of(new int[] {4, 3, 2, 1}, 4)
        );
    }

    @ParameterizedTest
    @MethodSource("minCases")
    void testMin(int[] input, int expected) {
        assertEquals(expected, Arrays.min(input));
    }

    static Stream<Arguments> minCases() {
        return Stream.of(
                Arguments.of(new int[] {7, -1, 0, 67}, -1),
                Arguments.of(new int[] {-7, -1, -10}, -10),
                Arguments.of(new int[] {5}, 5),
                Arguments.of(new int[] {9, 9, 3}, 3),
                Arguments.of(new int[] {1, 2, 3, 4}, 1),
                Arguments.of(new int[] {4, 3, 2, 1}, 1)
        );
    }
}
