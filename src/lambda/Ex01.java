package lambda;

public class Ex01 {

    //    예제 심화 (메소드 대체)
//1. 정수 두개를 더하기
    interface Calculator {
        int calculate(int a, int b);
    }

    public class lambdaEx01 {
        public static void main(String[] args) {
            Calculator c = (a, b) -> a + b;
            int result = c.calculate(3, 5);
            System.out.println("결과: " + result);
        }
    }

    //2. 문자를 대문자로 변환
    interface StringTransformer {
        String transform(String str);
    }

    public class lambdaEx02 {
        public static void main(String[] args) {
            StringTransformer transformer = str -> str.toUpperCase();
            String result = transformer.transform("hello");
            System.out.println("결과: " + result);
        }
    }

    //3. 문자열 합성
//package ex07;
    interface StringFunction {
        String run(String str);
    }

    public class lambdaEx03 {
        public static void printFormatted(String str, StringFunction format) {
            String result = format.run(str);
            System.out.println(result);
        }

        public static void main(String[] args) {
            StringFunction exclaim = (s) -> s + "!";
            StringFunction ask = (s) -> s + "?";
            printFormatted("Hello", exclaim);
            printFormatted("Hello", ask);
        }
    }

    //4. 배열의 모든 요소를 출력
    interface ArrayProcessor {
        void process(int[] array);
    }

    public class lambdaEx04 {
        public static void main(String[] args) {
            ArrayProcessor processor = array -> {
                for (int num : array) {
                    System.out.println(num);
                }
            };
            int[] numbers = {1, 2, 3, 4, 5};
            processor.process(numbers);
        }
    }

    public static void main(String[] args) {
//        Math plusLambda = (first, second) -> {
//            first + second
//        };
//        System.out.println(plusLambda.Calc(4, 2));
//        Math minusLambda = (first, second) -> first - second;
//        System.out.println(minusLambda.Calc(4, 2));
    }
}

