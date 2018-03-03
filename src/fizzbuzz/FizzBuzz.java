package fizzbuzz;

/*
        Wypisz wszystkie liczby od 1 do 100
        Jeśli liczba jest podzielna przez trzy wypisz “Fizz“
        Jeśli liczba jest podzielna przez pięć wypisz “Buzz“
        Jeśli liczba jest podzielna przez trzy i pięć wypisz “FizzBuzz“
*/

public class FizzBuzz {
    public static void main(String[] args) {
        for (int i = 1; i <= 100 ; i++) {
            System.out.println(i);
            if(i%3 == 0){
                System.out.println("Fizz");
            }
            if (i%5 == 0) {
                System.out.println("Buzz");
            }
            if(i%3 == 0 && i%5 ==0){
                System.out.println("FizzBuzz");
            }
        }
    }
}
