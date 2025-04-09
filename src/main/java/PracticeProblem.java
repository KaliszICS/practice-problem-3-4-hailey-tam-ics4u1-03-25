public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static int[] recaman(int n){
		int[] arr = {};
		if (n <= 0){
			return arr;
		}
		arr = new int[n];
		recamanHelper(n, 0, 0, arr);
		return arr;
	}

	public static void recamanHelper(int n, int a, int index, int[] arr){

		if (index == n){
			return ;
		}
		
		int nextNum = a - (index + 1);
		boolean valid = true;
		if (nextNum > 0){
		for (int i = 0; i < index; i++){
			if (arr[i] == nextNum){
				valid = false;
				i = index;
				}
			}
		}
		else {
			valid = false;
		}

		if (!valid){
			nextNum = a + (index + 1);
		}
		arr[index] = nextNum;
		recamanHelper(n, nextNum, index + 1, arr);
	}
}