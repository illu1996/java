package enumeration.test.http;

import java.util.Scanner;

public class ReHttpStatusMain {
    public static void main(String[] args) {

        // 입력
        Scanner sc = new Scanner(System.in);
        System.out.print("HTTP CODE: ");
        int httpCodeInput = sc.nextInt();

        ReHttpStatus status = ReHttpStatus.reFindByCode(httpCodeInput);

        if (status == null) {
            System.out.println("정의되지 않은 코드");

        }
        else {
            System.out.println(status.getCode() + " " + status.getMessage());
            System.out.println("is Success : " + status.isSuccess());
        }
    }
}
