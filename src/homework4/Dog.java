package homework4;
//2. Створити класи Собака та Кіт з успадкуванням від класу Тварини.

public class Dog extends Animal {

    private static int currentCount;

    public Dog(String name) {
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
            answer = name+" просто полежить тут";
        } else if (distance > 500) {
            answer = name+" втомлюється і не бігає так багато";
        } else {
            answer = name+" пробіг "+distance+" метрів";
        }
        System.out.println(answer);
        return answer;
    }

    @Override
    public String swim(String name, int distance) {
        String answer;
        if (distance<0) {
            answer = name+" починає погруження!";
        } else if (distance == 0) {
            answer = name+" просто сидить на матрасі";
        } else if (distance > 10) {
            answer = name+" втомлюється і не плаває так багато";
        } else {
            answer = name+" проплив "+distance+" метрів";
        }
        System.out.println(answer);
        return answer;
    }
}
