package stream.practice;

import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.IntStream;

class Result {

	/*
	 * Complete the 'maximumSum' function below.
	 *
	 * The function is expected to return a LONG_INTEGER. The function accepts
	 * INTEGER_ARRAY arr as parameter.
	 */

	public static long maximumSum(List<Integer> arr) {
		// Write your code here
		long maxSum = arr.get(0);
		long sum = arr.get(0);
		for (int i = 1; i < arr.size(); i++) {
			if (sum < 0) {
				sum = arr.get(i);
			} else {
				sum = sum + arr.get(i);
			}
			maxSum = Math.max(sum, maxSum);
		}
		return maxSum;
	}

}

public class MaximumSumSubArray {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

		List<Integer> arr = IntStream.range(0, arrCount).mapToObj(i -> {
			try {
				return bufferedReader.readLine().replaceAll("\\s+$", "");
			} catch (IOException ex) {
				throw new RuntimeException(ex);
			}
		}).map(String::trim).map(Integer::parseInt).collect(toList());

		long result = Result.maximumSum(arr);

		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();

		bufferedReader.close();
		bufferedWriter.close();
	}
}
