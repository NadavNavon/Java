
public class Main {

    public static void main(String[] args) {

        float arr1[] = {10.0f, 5.0f, 4.5f, 17.0f, 13.5f, 13.5f, 9.0f, 14.0f, 85.3f, 157f};

    // A set of questions to answer using java, including the switch and for each statements.

    //Q1.
        Q1 arr3 = new Q1();
        arr3.arrMan(arr1);

        System.out.println("\n\n\n");

    //Q2.
        arrIf20(arr1); // Q2. execution with a method outside of the main function but INSIDE the public class Main

        System.out.println("\n\n\n");

        Q2 arr2 = new Q2(); // Q2. execution with class instance.  IMPORTANT- arr2 is just a class instance (reference!)
                            // This is because Q2 has no field in it nor any return
        arr2.arrIf20(arr1); // notice arrIf20 is a void, meaning it doesn't return any value/


    };


    //Q2 method. Inside class, outside of main.
    public static void arrIf20(float arr[]) {

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > 20)
                arr[i] = arr[i] * 2;
            else
                arr[i] = arr[i];

            System.out.println(arr[i]);

        };
    };


      // Q3. Write a function that rotate an array left n times.
      // Q4. arr1 = [1,2,3,4,5,6] --> [6,5,4,3,2,1].
};




