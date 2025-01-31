# Практическая работа №1
## Java Core, наследование
**Цель работы:** Ознакомиться с механизмом наследования в языке Java. Повторить основные языковые конструкции языка Java.

**Общая постановка задачи:** Для каждого варианта имеется набор из четырех сущностей. Необходимо выстроить иерархию наследования. В каждом классе (базовом и производных) должно быть минимум одно числовое и одно текстовое поле. При вводе числовых параметров обязательна проверка на число и на диапазон (даже если число может быть любое, проверку необходимо реализовать).

Для всех классов должны быть реализованы конструкторы (по умолчанию, с параметрами), методы _equals()_, _hashCode()_, _toString()_.

Необходимо реализовать консольное Java-приложение, которое имеет простейшее пользовательское меню, состоящее как минимум из следующих пунктов:

- Добавить новый элемент (Элементы должны добавляться в коллекцию элементов типа базового класса. Необходимо предусмотреть возможность добавления любого объекта производного класса в данную коллекцию).
- Удалить элемент по индексу
- Вывод всех элементов в консоль
- Сравнение двух элементов на равенство (по индексам)
- Завершение работы приложения.

## Сборка и результат
_Вариант №2: Персона, рабочий, инженер, служащий._

**Сборка проекта:**
1. Распаковать проект
2. Перейдя в дирректорию, в которой находится работа, проверить наличие [JDK](https://www.oracle.com/java/technologies/downloads/#jdk17-windows)
```
java -version
```
3. Cкомпилировать проект
```
javac -encoding UTF-8 *.java
```
4. Запустить программу
```
java Main
```
