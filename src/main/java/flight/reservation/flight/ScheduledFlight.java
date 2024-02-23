package flight.reservation.flight;

import flight.reservation.Airport;
import flight.reservation.Passenger;
import flight.reservation.plane.Helicopter;
import flight.reservation.plane.PassengerDrone;
import flight.reservation.plane.PassengerPlane;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;




public class ScheduledFlight extends Flight {
    
    private final List<Passenger> passengers;
    private final Date departureTime;
    private double currentPrice;
    
    // Private constructor to enforce the use of the Builder
    private ScheduledFlight(Builder builder) {
        super(builder.number, builder.departure, builder.arrival, builder.aircraft);
        this.departureTime = builder.departureTime;
        this.passengers = builder.passengers;
        this.currentPrice = builder.currentPrice;
    }
    
    // Getters for ScheduledFlight properties
    public Date getDepartureTime() {
        return departureTime;
    }
    
    public List<Passenger> getPassengers() {
        return new ArrayList<>(passengers); // Return a copy to maintain encapsulation
    }
    
    public double getCurrentPrice() {
        return currentPrice;
    }
    
    // Builder class
    public static class Builder {
        private int number;
        private Airport departure;
        private Airport arrival;
        private Object aircraft;
        private Date departureTime;
        private double currentPrice = 100; // Default price
        private List<Passenger> passengers = new ArrayList<>();
        
        public Builder(int number) {
            this.number = number;
        }
        
        public Builder departure(Airport departure) {
            this.departure = departure;
            return this;
        }
        
        public Builder arrival(Airport arrival) {
            this.arrival = arrival;
            return this;
        }
        
        public Builder aircraft(Object aircraft) {
            this.aircraft = aircraft;
            return this;
        }
        
        public Builder departureTime(Date departureTime) {
            this.departureTime = departureTime;
            return this;
        }
        
        public Builder currentPrice(double currentPrice) {
            this.currentPrice = currentPrice;
            return this;
        }
        
        public Builder addPassenger(Passenger passenger) {
            this.passengers.add(passenger);
            return this;
        }
        
        public Builder addPassengers(List<Passenger> passengers) {
            this.passengers.addAll(passengers);
            return this;
        }
        
        public ScheduledFlight build() {
            return new ScheduledFlight(this);
        }
    }
}
// public class ScheduledFlight extends Flight {

//     private final List<Passenger> passengers;
//     private final Date departureTime;
//     private double currentPrice = 100;

//     public ScheduledFlight(int number, Airport departure, Airport arrival, Object aircraft, Date departureTime) {
//         super(number, departure, arrival, aircraft);
//         this.departureTime = departureTime;
//         this.passengers = new ArrayList<>();
//     }

//     public ScheduledFlight(int number, Airport departure, Airport arrival, Object aircraft, Date departureTime, double currentPrice) {
//         super(number, departure, arrival, aircraft);
//         this.departureTime = departureTime;
//         this.passengers = new ArrayList<>();
//         this.currentPrice = currentPrice;
//     }

//     public int getCrewMemberCapacity() throws NoSuchFieldException {
//         if (this.aircraft instanceof PassengerPlane) {
//             return ((PassengerPlane) this.aircraft).crewCapacity;
//         }
//         if (this.aircraft instanceof Helicopter) {
//             return 2;
//         }
//         if (this.aircraft instanceof PassengerDrone) {
//             return 0;
//         }
//         throw new NoSuchFieldException("this aircraft has no information about its crew capacity");
//     }

//     public void addPassengers(List<Passenger> passengers) {
//         this.passengers.addAll(passengers);
//     }

//     public void removePassengers(List<Passenger> passengers) {
//         this.passengers.removeAll(passengers);
//     }

//     public int getCapacity() throws NoSuchFieldException {
//         if (this.aircraft instanceof PassengerPlane) {
//             return ((PassengerPlane) this.aircraft).passengerCapacity;
//         }
//         if (this.aircraft instanceof Helicopter) {
//             return ((Helicopter) this.aircraft).getPassengerCapacity();
//         }
//         if (this.aircraft instanceof PassengerDrone) {
//             return 4;
//         }
//         throw new NoSuchFieldException("this aircraft has no information about its capacity");
//     }

//     public int getAvailableCapacity() throws NoSuchFieldException {
//         return this.getCapacity() - this.passengers.size();
//     }

//     public Date getDepartureTime() {
//         return departureTime;
//     }

//     public List<Passenger> getPassengers() {
//         return passengers;
//     }

//     public double getCurrentPrice() {
//         return currentPrice;
//     }

//     public void setCurrentPrice(double currentPrice) {
//         this.currentPrice = currentPrice;
//     }
// }
