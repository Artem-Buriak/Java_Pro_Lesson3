package homework4;
//2. Створити класи Собака та Кіт з успадкуванням від класу Тварини.

public class Cat extends Animal {

    private static int currentCount;

    public Cat(String name) {
        super(name);
        currentCount++;
    }

    public int getCurrentCount() {
        return currentCount;
    }

    //Кожна тварина має обмеження на дії (біг: кіт 200 м., собака 500 м.; плавання: кіт не вміє плавати, собака 10 м.).
    @Override
    public String run(String name, int distance) {
        String answer;
        if (distance<0) {
            answer = name+" не ходить задом";
        } else if (distance == 0) {
            answer = name+" просто погріється тут";
        } else if (distance > 200) {
            answer = name+" втомлюється і не бігає так багато";
        } else {
            answer = name+" пробіг "+distance+" метрів";
        }
        System.out.println(answer);
        return answer;
    }

    @Override
    public String swim(String name, int distance) {
        String answer = name+" не вміє плавати(";
        System.out.println(answer);
        return answer;
    }
}
