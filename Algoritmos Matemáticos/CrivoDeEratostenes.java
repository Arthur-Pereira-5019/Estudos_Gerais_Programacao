import java.util.ArrayList;
import java.util.Scanner;

public class CrivoDeEratostenes {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        int l;
        System.out.println("Forneça o limite dos primos");
        l = r.nextInt();
        ArrayList<Integer> p = new ArrayList<>();
        ArrayList<Integer> s = new ArrayList<>();
        for(int i = 0; i < l; i++) {
            p.add(i);
        }

        for(int i = 2; i < p.size(); i++) {
            int c = p.get(i);
            s.add(c);
            for(int j = c; j < p.size(); j++) {
                if(p.get(j) % c == 0) {
                    p.remove(j);
                }
            }
        }
        for(int i = 0; i < s.size(); i++) {
            System.out.println(s.get(i));
        }
    }
}
