Установите Java Development Kit (JDK):

Установите JDK, если у вас его еще нет. Вы можете скачать JDK с официального сайта Oracle: Java SE Downloads
Установите Maven:

Установите Maven, если у вас его еще нет. Вы можете скачать Maven с официального сайта: Apache Maven
Распакуйте архив с Maven и добавьте путь к исполняемому файлу Maven в переменную среды PATH.
Создайте проект с помощью Maven:

В командной строке выполните следующую команду для создания проекта Maven:

bash
Copy code
mvn archetype:generate -DgroupId=com.example -DartifactId=mykotlinproject -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
Замените com.example и mykotlinproject на соответствующие значения.

Измените pom.xml для добавления зависимости Selenium WebDriver:

Откройте файл pom.xml, созданный в вашем проекте, и добавьте следующую зависимость в раздел <dependencies>:

xml
Copy code
<dependencies>
<dependency>
<groupId>org.seleniumhq.selenium</groupId>
<artifactId>selenium-java</artifactId>
<version>3.141.59</version>
</dependency>
</dependencies>
Создайте файл теста:

В каталоге src/test/kotlin создайте новый Kotlin файл для вашего теста, например, LoginUITest.kt.
Напишите тест в Kotlin:

Вставьте код теста в файл LoginUITest.kt.
Запустите тест с помощью Maven:

В командной строке перейдите в корневую директорию вашего проекта.

Выполните следующую команду для запуска тестов:

bash
Copy code
mvn test
Если Maven находится в вашем PATH, эта команда выполнит тесты из вашего проекта.