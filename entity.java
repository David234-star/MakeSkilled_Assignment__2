import java.io.*;
public class entity {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());

        bufferedReader.close();
        if((N % 2 != 0)||(N % 2 == 0 && N >= 6 && N <= 20)){
            System.out.println("Weird");
        }
        else{
            System.out.println("Not Weird");
        }
    }
}
