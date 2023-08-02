https://github.com/SB44444/ArhDz3.git

**Архитектура ПО (семинары)**
*Урок 3.*
1. Задание 1.
   Четвертый принцип SOLID - Принцип сегрегации интерфейса (Interface Segregation Principle, ISP). Он гласит: 
   "Клиенты не должны зависеть от интерфейсов, которые они не используют".
   Вам надо написать код который исправяет эту ошибку и реализует этот принцип
   Пример кода, который нарушает ISP:


public interface Worker {
void work();
void eat();
}

public class HumanWorker implements Worker {
public void work() {
System.out.println("Человек работает");
}

public void eat() {
System.out.println("Человек ест");
}
}

public class RobotWorker implements Worker {
public void work() {
System.out.println("Робот работает");
}

public void eat() {
throw new UnsupportedOperationException("Роботы не едят!");
}
}

Реализация: Для каждого класса созданы свои специфические интерфейсы Eater & Maintenance.
В тоже время оба класса имплементируют общий интерфес Worker'
Таким образом, принцип сегрегации интерфейса (Interface Segregation Principle, ISP) не нарушается.

2. Задание 2.
   Пятый принцип SOLID - принцип инверсии зависимостей (Dependency Inversion Principle, DIP) гласит: 
   "Зависимости на абстракциях. Нет зависимостей на что-то конкретное". Это означает, что высокоуровневые модули,
   которые обеспечивают сложную логику, должны быть независимы от низкоуровневых модулей, 
   которые обеспечивают утилитарные функции. Оба типа модулей должны зависеть от абстракций.

public class Text {
   String text;

   public Text(String text) {
   this.text = text;
   }

   public String getText() {
   return text;
   }
   }

public class Printer {
public void print(Text text) {
System.out.println(text.getText());
}
}

public class Main {
public static void main(String[] args) {
Text myText = new Text("Hello, world!");
Printer myPrinter = new Printer();
myPrinter.print(myText);
}
}
В этом примере класс Printer зависит от конкретного класса Text.   

Реализация: Создан абстрактный класс Data от которого наследуются классы Text и Printer, теперь нет зависимости
одного класса от другого. Свободно можно расширять функциональность, например добавим класс Figure функции которого 
можно также реализовать через класс Printer, даже если класс Text перестанет существовать.

