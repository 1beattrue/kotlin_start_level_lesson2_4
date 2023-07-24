fun main() {
    // условный оператор if
    val a = 50
    if (a < 40) {
        println("< 40")
    } else if (a < 60) {
        println("40 <= a < 60")
    } else {
        println(">= 60")
    }

    // в отличие от java условный оператор в kotlin может возвращать значение
    var count = 400
    val food = if (count > 500) {
        count -= 500
        "пицца"
    } else if (count > 200) {
        count -= 200
        "шаурма"
    } else { // в данном случае else обязательная часть конструкции
        count -= 50
        "доширак"
    }
    println(food)

    // при этом можно присваивать таким образом значения разных типов
    val n = 3
    val aboba = if (n > 3) { // при этом переменная будет иметь тип Any?
        "строка"
    } else if (n > 2) {
        2
    } else {
        null
    }


    // условный оператор when (аналог switch)
    val nameOfMonth = "сентябрь"
    var season: String
    when (nameOfMonth) {
        "декабрь", "январь", "февраль" -> {
            season = "зима"
        }

        "март", "апрель", "май" -> {
            season = "весна"
        }

        "июнь", "июль", "август" -> {
            season = "лето"
        }

        "сентябрь", "октябрь", "ноябрь" -> {
            season = "осень"
        }

        else -> {
            season = "не найдено"
        }
    }
    println(season)

    // аналогично if when возвращает значение
    season = when (nameOfMonth) {
        "декабрь", "январь", "февраль" -> {
            "зима"
        }

        "март", "апрель", "май" -> {
            "весна"
        }

        "июнь", "июль", "август" -> {
            "лето"
        }

        "сентябрь", "октябрь", "ноябрь" -> {
            "осень"
        }

        else -> {
            "не найдено"
        }
    }
    println(season)

    // задание: дана температура воды, вывести состояние
    val temperature = 10
    val condition = when {
        temperature > 100 -> "пар"
        temperature < 0 -> "лед"
        else -> "вода"
    }

    // домашнее задание
    val weather = "good"
    val time = 8

    when {
        time in 8..22 && weather == "good" -> println("walking outside")
        time in 8..22 && weather == "bad" -> println("read the book")
        else -> println("sleep")
    }
}