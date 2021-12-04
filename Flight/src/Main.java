public class Main {

    public static void main(String[] args) {

        class Flight {

            // Fields:
            int seats;
            int passengers;

            // Constructors
            Flight() {
                seats = 150;
                passengers = 0;
            }

            // Methods
            void add1Passenger() {
                if (passengers < seats) {
                    passengers += 1;
                }
            }

        };


        // Class instances
        Flight nycToSf = new Flight();
        Flight slcToDallas = new Flight();



        // Playing with the classs instances. showing they are actually references.
        System.out.println(slcToDallas.passengers);

        slcToDallas.add1Passenger();
        System.out.println(slcToDallas.passengers);

        nycToSf.add1Passenger();
        nycToSf.add1Passenger();
        System.out.println(nycToSf.passengers);

        slcToDallas = nycToSf; // SlcToDallas points to the same object as nycToSf.
        System.out.println(slcToDallas.passengers);


    }
}