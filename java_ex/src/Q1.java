
/* Q1.  Build class with a method which receives an array and manipulates it:

        if array[i] > array[i-1], than array[i] = array[i] * 2.
        if array[i] < array[i-1], than array[i] = array[i] - 1.
        Else, array[i] = array[i].

        - Do it without creating a new array.
 */


public class Q1 {

    public void arrMan(float arr1[]) {

        float temp = arr1[0];
        System.out.println(temp);

        for (int i = 1; i < arr1.length; i++) {

            float temp2 = arr1[i];

            if (arr1[i] > temp) {
                arr1[i] = arr1[i] * 2;
            }
            else if (arr1[i] < temp) {
                arr1[i] = arr1[i] - 1;
            }
            else {
                arr1[i] = arr1[i];
            };

            temp = temp2;
            System.out.println(arr1[i]);

        };

    }


};
