import java.util.Scanner;
public class hello{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String str1 = str.toLowerCase();

        char[] a = str.toCharArray();

        char[] c = str1.toCharArray();
        char ch = sc.next().charAt(0);
        int count = 0;
        for(char b:a){
            System.out.print(b+" ");
        }
        for(char b:c){
            if(b==ch){
                count++;
            }
        }
        System.out.println();
        System.out.println(count);
    }
}