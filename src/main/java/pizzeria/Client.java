package pizzeria;

/*
Пиццерия.

Разработать структуру программы управления пиццерией, протестировать ее.
Задачи:
1. Структура для выдачи номеров в очереди для клиентов (интерфейс с методом int next(),
класс реализующий этот интерфейс через закольцованный связный список из 10 элементов)
2. Структуры, описывающие повара, клиента (Абстрактный класс человек, перечисление Пол, класс Клиент (+ перечисление категория скидки), класс Повар)
3. Структура Заказ, описывающая клиента, повара, вид пиццы (перечисление Виды пиццы), время заказа, номер заказа, статус заказа (перечисление Статус), метод оформления заказа

Тест:
Создание 3 клиентов
Создание 2 поваров
Оформление 15 заказов
Изменение статуса заказов
 */

public class Client extends Person {
    private Discount discount;
    public Client(String name, Gender gender) {
        this.name = name;
        this.gender = gender;

        if (gender == Gender.Female) discount = Discount.Female;
    }

    public Client(String name, Gender gender, Discount discount) {
        this.name = name;
        this.gender = gender;
        this.discount = discount;
    }
}
