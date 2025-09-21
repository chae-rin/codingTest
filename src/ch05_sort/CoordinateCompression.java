package ch05_sort;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CoordinateCompression {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        String[] tokens = br.readLine().split(" ");

        int[] origin = new int[N];
        for (int i = 0; i < N; i++) {
            origin[i] = Integer.parseInt(tokens[i]);
        }

        // 복사 → 정렬 → 중복 제거
        int[] sorted = Arrays.copyOf(origin, N);
        Arrays.sort(sorted);

        Map<Integer, Integer> map = new HashMap<>();
        int idx = 0;
        for (int i = 0; i < N; i++) {
            if (!map.containsKey(sorted[i])) {
                map.put(sorted[i], idx++);
            }
        }

        // 결과 출력
        for (int i = 0; i < N; i++) {
            bw.write(map.get(origin[i]) + " ");
        }

        bw.flush();
        bw.close();
        br.close();
	}

}
