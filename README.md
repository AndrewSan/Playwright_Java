# Template for Java with Playwright, TestNG and Allure

Виконана робота

1) Реалізований базовий клас для запуску
 - налаштовано запуск хром браузеру на повний екран
 - додана можливість запису відео роботи тесту ( -DrecordVideo=true )
 - додана можливість робити скріншот у будь-якому місці виконання тесту(як повного вікна так і повної сторінки сайту)
 - додано вивід логів у випадку падіння тестів зі скінотом
 - allure results

2) Використані елементи архітектури
 - properties file, Constants class, PageTools class, Pages class і дочірні до нього
 - реалізовані сторінки для кожного необхідного тесту

3) Реалізовано 5 тестів
 - опис задуму присутній як коментар в кожному класі
 - використані такі базові засоби як click, type, wait for element, sleep, assert