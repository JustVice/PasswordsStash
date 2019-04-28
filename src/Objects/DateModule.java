package Objects;

public class DateModule {

    private int year;
    private int month;
    private int day;
    private int id;

    public DateModule() {
        id = ((int) (Math.random() * 100000));
    }

    public DateModule(int year, int month, int day) {
        id = ((int) (Math.random() * 100000));
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public String standard_date_format() {
        return year + "/" + month + "/" + day;
    }

    // <editor-fold desc="Get set">
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
// </editor-fold>

}
