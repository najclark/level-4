public class Trail {

	private int[] markers;

	public Trail(int[] markers) {
		this.markers = markers;
	}

	public boolean isLevelTrailSegment(int start, int end) {

		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;

		for (int i = 0; i < end - start; i++) {
			int number = markers[start + i];

			if (number > max)
				max = number;
			if (number < min)
				min = number;

		}

		if (max - min <= 10) {
			return true;
		}

		return false;
	}

	public boolean isDifficult() {
		int changes = 0;

		for (int i = 1; i < markers.length; i++) {
			if (Math.abs(markers[i] - markers[i - 1]) >= 30) {
				changes++;
			}
		}

		if (changes >= 3) {
			return true;
		}
		return false;
	}

}
