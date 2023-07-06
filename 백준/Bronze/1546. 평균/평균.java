import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str, " ");

        double[] score = new double[N];
        for (int i = 0; i < N; i++) {
            score[i] = Double.parseDouble(st.nextToken());
        }
        Arrays.sort(score);

        double sum = 0.0;
        for (int i = 0; i < N; i++) {
            sum += score[i] / score[N - 1] * 100;
        }
        System.out.println(sum / N);
    }
}