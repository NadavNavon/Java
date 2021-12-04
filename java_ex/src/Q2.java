// Q2. Build a function that receives an array. If array[i] > 20, than array[i] = array[i] * 2.

public class Q2 {

// No fields

public void arrIf20(float arr[]) {

        for (int i = 0; i < arr.length; i++) {

        if (arr[i] > 20)
        arr[i] = arr[i] * 2;
        else
        arr[i] = arr[i];

        System.out.println(arr[i]);

        };
    };
};