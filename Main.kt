import java.util.concurrent.ThreadLocalRandom

fun main() {
    val cities = listOf("Москва", "Санкт-Петербург", "Новосибирск", "Екатеринбург", "Нижний Новгород", "Казань",
        "Челябинск", "Омск", "Самара", "Ростов-на-Дону", "Уфа", "Красноярск", "Пермь", "Воронеж", "Волгоград")

    var createPlan = true

    while (createPlan) {
        val fromCity = cities.random()
        var toCity = cities.random()
        while (toCity == fromCity) {
            toCity = cities.random()
        }

        println("Создать направление: $fromCity - $toCity")

        val numberOfPassengers = ThreadLocalRandom.current().nextInt(5, 201)
        println("Продать билеты: $numberOfPassengers пассажиров купили билеты на это направление")

        var passengersRemaining = numberOfPassengers
        val train = mutableListOf<Int>()
        while (passengersRemaining > 0) {
            val capacity = ThreadLocalRandom.current().nextInt(5, 26)
            train.add(capacity)
            passengersRemaining -= capacity
        }

        println("Сформировать поезд: Создан поезд с ${train.size} вагонами")

        println("Отправить поезд: Поезд $fromCity - $toCity, состоящий из ${train.size} вагонов отправлен")
        train.forEachIndexed { index, capacity -> println("Вагон ${index + 1}: Вместимость - $capacity, Пассажиров - ${if (index == train.size - 1) numberOfPassengers % capacity else capacity}") }
