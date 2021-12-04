public class MyClass {

    void ShowSum(int x, int y, int count){
        int sum = x + y;
        if (count < 1)
            return;
        for (int i = 0; i < count; i++)
            System.out.println(sum);
    }
}
