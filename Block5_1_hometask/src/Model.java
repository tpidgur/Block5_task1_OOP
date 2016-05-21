import java.time.LocalTime;

/**
 * In this class the program logic is demonstrated.
 * The  class provides the operations with time (increase/decrease 1hour,1 minute, 1 second)
 *
 * @author Pidhurska Tetiana
 * @version 1 (created on 21.05.16)
 */
public class Model {

    private LocalTime localTime;

    /**
     * constructor that sets the not-zero values of time
     * @param hour
     * @param minute
     * @param second
     */
    public Model(int hour, int minute, int second) {
        getTime(hour, minute, second);
    }

    /**
     * constructor that sets zero values of time
     */
    public Model() {
        getTime(0, 0, 0);
    }

    /**
     * sets the time parameters in LocalTime variable
     * @param hour
     * @param minute
     * @param second
     * @return
     */
    public LocalTime getTime(int hour, int minute, int second) {
        localTime = LocalTime.of(hour, minute, second);
        return localTime;
    }

    /**
     * sends the time parameters to the method that sets the time parameters in field localTime
     * @param hour
     * @param minute
     * @param second
     */
    public void setAllparameters(int hour, int minute, int second) {
        getTime(hour, minute, second);
    }

    /**
     * increases the time by 1 hour
     */
    public void increaseOneHour() {
        localTime = localTime.plusHours(1);
    }
    /**
     * decreases the time by 1 hour
     */
    public void decreaseOneHour() {
        localTime = localTime.minusHours(1);
    }
    /**
     * increases the time by 1 minute
     */
    public void increaseOneMinute() {
        localTime = localTime.plusMinutes(1);
    }
    /**
     * decreases the time by 1 minute
     */
    public void decreaseOneMinute() {
        localTime = localTime.minusMinutes(1);
    }
    /**
     * increases the time by 1 second
     */
    public void increaseOneSecond() {
        localTime = localTime.plusSeconds(1);
    }
    /**
     * decreases the time by 1 second
     */
    public void decreaseOneSecond() {
        localTime = localTime.minusSeconds(1);
    }

    public LocalTime getLocalTime() {
        return localTime;
    }

    public void setLocalTime(LocalTime localTime) {
        this.localTime = localTime;
    }

    @Override
    public String toString() {
        return
                "hour=" + localTime.getHour() +
                        ", minute=" + localTime.getMinute() +
                        ", second=" + localTime.getSecond();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Model model = (Model) o;

        return getLocalTime() != null ? getLocalTime().equals(model.getLocalTime()) : model.getLocalTime() == null;

    }


    @Override
    public int hashCode() {
        return getLocalTime() != null ? getLocalTime().hashCode() : 0;
    }
}
