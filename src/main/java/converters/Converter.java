package converters;

import java.util.HashMap;

public class Converter {

    /**
     * Преобразует массив в HashMap, где ключи - это элементы массива,
     * а значения - количество их вхождений в массив.
     *
     * @param array массив элементов для подсчета
     * @param <T>   тип элементов массива
     * @return HashMap, где ключ - элемент массива, а значение - количество его вхождений
     */
    public <T> HashMap<T, Long> arrayToHashMapConvert(T[] array) {
        HashMap<T, Long> countMap = new HashMap<>();

        // Проходим по каждому элементу массива и обновляем счетчик в мапе
        for (T t : array) {
            // Используем метод compute для подсчета количества вхождений элемента
            countMap.compute(t, (key, value) -> (value == null) ? 1L : value + 1);
        }

        return countMap;
    }
}
