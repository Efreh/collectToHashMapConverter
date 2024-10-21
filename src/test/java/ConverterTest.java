import converters.Converter;
import org.junit.jupiter.api.Test;
import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConverterTest {

    @Test
    public void testArrayToHashMapConvert_withIntegerArray() {
        Converter converter = new Converter();
        Integer[] array = {1, 2, 2, 3, 3, 3};

        // Ожидаемая мапа с подсчитанными элементами
        HashMap<Integer, Long> expectedMap = new HashMap<>();
        expectedMap.put(1, 1L);
        expectedMap.put(2, 2L);
        expectedMap.put(3, 3L);

        // Выполняем тестируемый метод
        HashMap<Integer, Long> resultMap = converter.arrayToHashMapConvert(array);

        // Сравниваем результат с ожидаемой мапой
        assertEquals(expectedMap, resultMap);
    }

    @Test
    public void testArrayToHashMapConvert_withStringArray() {
        Converter converter = new Converter();
        String[] array = {"apple", "banana", "apple", "orange", "banana", "banana"};

        // Ожидаемая мапа с подсчитанными элементами
        HashMap<String, Long> expectedMap = new HashMap<>();
        expectedMap.put("apple", 2L);
        expectedMap.put("banana", 3L);
        expectedMap.put("orange", 1L);

        // Выполняем тестируемый метод
        HashMap<String, Long> resultMap = converter.arrayToHashMapConvert(array);

        // Сравниваем результат с ожидаемой мапой
        assertEquals(expectedMap, resultMap);
    }

    @Test
    public void testArrayToHashMapConvert_withEmptyArray() {
        Converter converter = new Converter();
        Integer[] array = {};

        // Ожидаемая пустая мапа
        HashMap<Integer, Long> expectedMap = new HashMap<>();

        // Выполняем тестируемый метод
        HashMap<Integer, Long> resultMap = converter.arrayToHashMapConvert(array);

        // Сравниваем результат с ожидаемой пустой мапой
        assertEquals(expectedMap, resultMap);
    }
}
