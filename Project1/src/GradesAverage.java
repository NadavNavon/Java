public class GradesAverage {

    void GradesAvgMethod(int x[]) {
        int sum = 0;
        for (int i = 0; i < x.length; i++){
            sum += x[i];

        }
        int avg = sum / 10;
        System.out.print(avg);

    }
}
