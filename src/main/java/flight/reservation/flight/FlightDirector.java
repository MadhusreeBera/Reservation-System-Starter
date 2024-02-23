
public class FlightDirector {

    public ScheduledFlight scheduleStandardFlight(int flightNumber, Airport departure, Airport arrival, Object aircraft, Date departureTime, List<Passenger> passengers) {
        return new ScheduledFlight.Builder(flightNumber)
                .departure(departure)
                .arrival(arrival)
                .aircraft(aircraft)
                .departureTime(departureTime)
                .passengers(passengers)
                .build();
    }

    public ScheduledFlight scheduleDiscountedFlight(int flightNumber, Airport departure, Airport arrival, Object aircraft, Date departureTime, List<Passenger> passengers, double discountPrice) {
        return new ScheduledFlight.Builder(flightNumber)
                .departure(departure)
                .arrival(arrival)
                .aircraft(aircraft)
                .departureTime(departureTime)
                .currentPrice(discountPrice)
                .passengers(passengers)
                .build();
    }

    // More methods for different types of flights can be added here...
};