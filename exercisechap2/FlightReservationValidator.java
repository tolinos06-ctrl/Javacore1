package javacore.chapter02.condition.exercisechap2;

public class FlightReservationValidator {
    public static void main(String[] args) {
        //0
        int planeAvailableSeats = 12;
        //>planeAvailableSeats
        int customerDesireSeats = 13;
        //<18
        int customerAge = 25;
        //false
        boolean isCustomerConnected = true;
        if(planeAvailableSeats>=customerDesireSeats && customerAge>=18 && isCustomerConnected==true){
            System.out.println("Réservation confirmée");
        }
        else if(planeAvailableSeats>=customerDesireSeats && customerAge<18 && isCustomerConnected==true){
            System.out.println("Vous devez être majeur");
        }
        else if(planeAvailableSeats<customerDesireSeats && customerAge>=18 && isCustomerConnected==true){
            System.out.println("Il n'y a pas assez de sièges dispo dans l'avion (places restantes : " + planeAvailableSeats +" )");
        }
        else{
            System.out.println("Réservation impossible");
        }
    }
}
