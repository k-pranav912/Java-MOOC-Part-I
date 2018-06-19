import java.lang.Math;

public class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate(int day, int montd, int year) {
        this.day = day;
        this.month = montd;
        this.year = year;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(MyDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month
                && this.day < compared.day) {
            return true;
        }

        return false;
    }
    
    public void advance() {
        if (this.day == 30 && this.month == 12) {
            this.day = 1;
            this.month = 1;
            this.year++;
        } else if (this.day == 30 && this.month < 12) {
            this.day = 1;
            this.month++;
        } else if (this.day < 30) {
            this.day++;
        }
    }
    
    public int differenceInYears(MyDate comparedDate) {
        return Math.abs(((this.year*365 + this.month*30 + this.day)-(comparedDate.year*365 + comparedDate.month*30 + comparedDate.day))/365);
    }

}
