package solution;

public class Mass {
    public static void main(String[] args) {
        int sample[] = {1, 1, 0, 0, 1, 1, 0, 1, 1, 0};
        for (int i = 0; i < sample.length; ++i) {
            if (sample[i] == 1) {
                sample[i] = 0;
            }
            else if (sample[i] == 0) {
                sample[i] = 1;
            }

            System.out.print(sample[i]+ " ");
        }
    }
}

