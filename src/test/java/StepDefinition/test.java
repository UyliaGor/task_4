package StepDefinition;

import io.cucumber.java.ru.Дано;
import io.cucumber.java.ru.И;
import io.cucumber.java.ru.Тогда;

public class test {
    int a;
    int b;
    int sum;
    @Дано("^два числа (\\d) and (\\d)$")
    public void given(int a, int b) {
        this.a = a;
        this.b = b;
    }
    @Тогда("^находим сумму двух чисел$")
    public void summa() {
        this.sum = this.a + this.b;
    }
    @И("^выводим на экран$")
    public void printrezult() {
        System.out.println("Сумма чисел " + this.a + " и " + this.b + " равняется " + this.sum);
    }
}


