import static java.lang.Math.*;
public class Calculator {
    public static void main(String[] args) {
        System.out.println(pow(3,2));//Данный метод возводит параметр `a` в степень `b`.
        System.out.println(sqrt(4));//Извлечение квадратного корня
        System.out.println(cbrt(8));//Извлечение кубического корня
        for (int i = 0; i < 5; i++) {//енерирует случайное позитивное вещественное (double) число в промежутке от 0.0 до 1.0.
            System.out.println(random());
            System.out.println(abs(-19.8d));//вычисляет значение по модулю
            System.out.println(sin(toRadians(10)));//Возвращает тригонометрический синус угла.
            System.out.println(cos(toRadians(30)));//Возвращает тригонометрический косинус угла.
            System.out.println(cos(toDegrees(25)));//Преобразует угол, измеренный в радианах, в приблизительно эквивалентный угол, измеренный в градусах.
            System.out.println(cosh(3.6));//Возвращает гиперболический косинус doubleзначения.
        }
    }
}
