public class CharTest {
    public static void main(String[] args) {
        char c = 'A';
        System.out.println("c = " + c); // A
        //'A'를 컴퓨터에서 수치형 자료로 인식하기 때문에 int형으로 선언 가능
        // 'A'의 수치값인 65가 들어감
        int a = 'A';
        System.out.println("a = " + a);
        // 'B'의 수치값인 66과 1을 더함
        int b = 'B' + 1;
        //char을 통해 casting(형변환) : int형을 char형으로 바꾸자
        System.out.println("b = " + (char)b); // 67->c

        // Q. '가'라는 한글 한 문자를 변수에 저장하고 출력하시오.
        char han = '가';
        System.out.println("han = " + han);
        int hanD = '가'; //44032
        System.out.println("hanD = " + hanD);
        int hanU = '\uAC00'; // 16진수로 표현
        System.out.println("hanU = " + (char)hanU);


    }
}
