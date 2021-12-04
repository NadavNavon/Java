public class Main {

    public static void main(String[] args) {

        double[] arr1  = {10.0d, 20.0d, 30.0d, 40.0d};
        double[] arr2  = {2.0d, 5.0d, 10.0d, 20.0d};
        char[] opCodes = {'a', 's', 'd', 'm'};

        double[] results = new double[opCodes.length];

        for (int i = 0; i < opCodes.length; i++){

          switch(opCodes[i]){

              case 'a':
                  results[i] = arr1[i] + arr2[i];
                  System.out.println(results[i]);
                  break;


              case 's':
                  results[i] = arr1[i] - arr2[i];
                  System.out.println(results[i]);
                  break;


              case 'd':
                  results[i] = arr2[i] != 0.0d? arr1[i]/arr2[i]: 0.0d;
                  System.out.println(results[i]);
                  break;


              case 'm':
                  results[i] = arr1[i] * arr2[i];
                  System.out.println(results[i]);
                  break;


              default:
                  System.out.println("Error!");
                  results[i] = 0.0d;
                  break;


          };
        };


        for (int i = 0; i < opCodes.length; i++){

            switch(opCodes[i]){

                case 'a':
                    results[i] = arr1[i] + arr2[i];
                    break;

                case 's':
                    results[i] = arr1[i] - arr2[i];
                    break;

                case 'd':
                    results[i] = arr2[i] != 0.0d? arr1[i]/arr2[i]: 0.0d;
                    break;

                case 'm':
                    results[i] = arr1[i] * arr2[i];
                    break;

                default:
                    System.out.println("Error!");
                    results[i] = 0.0d;
                    break;


            };

            System.out.println(results[i]);

        };



    }
}
