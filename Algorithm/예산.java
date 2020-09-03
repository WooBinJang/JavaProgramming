import java.util.Arrays;
class Solution {
 		public static int solution(int[] d, int budget) {
		int answer = 0;
		Arrays.sort(d);
		for (int i = 0; i < d.length; i++) {
			if (budget > 0) {
				budget = budget - d[i];
				if (budget >= 0) {
					answer++;
				}

			} else if (budget <= 0) {
				break;
			}
		}
		return answer;
	}


}
