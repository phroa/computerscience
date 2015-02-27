package comparing;

public class Date implements Comparable {
    private Integer day;
    private Integer month;
    private Integer year;

    public Date(Integer day, Integer month, Integer year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public Integer getDay() {
        return day;
    }

    public Integer getMonth() {
        return month;
    }

    public Integer getYear() {
        return year;
    }

    @Override
    public String toString() {
        return String.format("%02d/%02d/%04d", month, day, year);
    }

    @Override
    public int compareTo(Object o) {

        if (!(o instanceof Date)) {
            return -1;
        }
        
        Date other = (Date) o;
        
        if (!this.getYear().equals(other.getYear())) {
            return this.getYear() - other.getYear();
        }

        if (!this.getMonth().equals(other.getMonth())) {
            return this.getMonth() - other.getMonth();
        }

        if (!this.getDay().equals(other.getDay())) {
            return this.getDay() - other.getDay();
        }

        return 0;

    }
}
