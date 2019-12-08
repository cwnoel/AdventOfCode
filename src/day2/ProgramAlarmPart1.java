package day2;

public class ProgramAlarmPart1 {
	public static int[] ops = { 1, 0, 0, 3, 1, 1, 2, 3, 1, 3, 4, 3, 1, 5, 0, 3, 2, 1, 6, 19, 1, 19, 5, 23, 2, 13, 23,
			27, 1, 10, 27, 31, 2, 6, 31, 35, 1, 9, 35, 39, 2, 10, 39, 43, 1, 43, 9, 47, 1, 47, 9, 51, 2, 10, 51, 55, 1,
			55, 9, 59, 1, 59, 5, 63, 1, 63, 6, 67, 2, 6, 67, 71, 2, 10, 71, 75, 1, 75, 5, 79, 1, 9, 79, 83, 2, 83, 10,
			87, 1, 87, 6, 91, 1, 13, 91, 95, 2, 10, 95, 99, 1, 99, 6, 103, 2, 13, 103, 107, 1, 107, 2, 111, 1, 111, 9,
			0, 99, 2, 14, 0, 0 };

	public static int[] ops2 = { 1, 9, 10, 3, 2, 3, 11, 0, 99, 30, 40, 50 };

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum = 0;
		int product = 0;
		int position = 0;
		ops[1] = 12;
		ops[2] = 2;

		for (int i = 0; i < ops.length; i = i + 4) {

			if (ops[i] == 1) {
				sum = ops[ops[i + 1]] + ops[ops[i + 2]];
				position = ops[i + 3];
				ops[position] = sum;

			}

			if (ops[i] == 2) {
				product = ops[ops[i + 1]] * ops[ops[i + 2]];
				position = ops[i + 3];
				ops[position] = product;
			}

			if (ops[i] == 99) {

				break;
			}

		}
		System.out.println("Part1 answer is: " + ops[0]);
	}

}
