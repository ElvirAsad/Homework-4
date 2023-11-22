public class Task11 {
    public static void main(String[] args) {
        System.out.println("Задание №11");
        for (int i = 1; i <= 1000; i++) {
            String n = Integer.toString(i);
            String f = "";
            String b = "";
            String h = "";
            if (i % 15 == 0) {
                f = "fizz";
            }
            if (i % 3 == 0) {
                b = "buzz";
            }
            if (i % 15 == 0){
                h = "hiss";
            }
            System.out.println(n + f + b + h);
        }
    }
}
