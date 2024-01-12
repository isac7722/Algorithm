package 단계별로_풀어보기.BJ11브푸트포스.bj2231;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj2231 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int result = 0;

        for (int i = 0; i < N; i++){
            int number = i;
            int sum = 0;

            while (number != 0){
                sum += number % 10;
                number /= 10;

            }

            if(sum + i == N){
                result = i;
                break;
            }
        }

        System.out.println(result);
    }
}
    
    
    
    
    
    
    
    
    
    
    /*public static void main(String[] args) {
        a+b+c+(a*100 + b*10 + c) = D

        Scanner scanner = new Scanner(System.in);

        *//* 사용자에게 정수를 입력받는다 *//*
        int number = scanner.nextInt();

        *//* 입력 받은 정수가 몇자리 숫자 인지 확인 한다 *//*
        int digit = countDigits(number);

        int result = 0;

        for (int i = 0; i < digit; i++) {


            if (number == result){
                System.out.println(result);
                return;
            }
        }
        System.out.println(result);

    }





    public static int countDigits (int number){
        //숫자가 0인 경우 1자리로 처리
        if (number == 0){
            return 1;
        }

        int count = 0;
        while (number > 0){
            number /= 10;
            count++;
        }
        return count;
    }*/




