public class MyDate {
    public int year;
    public int month;
    public int day;
    public int objectNumber;

    public static int objectCounter = 0;
    public static String[] strMonths = {
        "January", "February", "March", "April",
        "May", "June", "July", "August",
        "September", "October", "November", "December"
    };

    public MyDate(int aYear ,int aMonth ,int aDay){
        year = aYear ;
        month = aMonth ;
        day = aDay ;
        objectCounter ++ ;
        objectNumber = objectCounter;
    }

    public MyDate(){
        year = 1900;
        month = 1;
        day = 1;
        objectCounter ++ ;
        objectNumber = objectCounter;
    }

    public static boolean isLeapYear(int year){
        if(year % 4 != 0){
            return false;
        }
        else if(year % 100!= 0){
            return true;
        }
        if(year % 400 != 0){
            return false;
        }
        else{
            return true;
        }
    }

    public int getObjectNumber(){
        return objectNumber;
    }

    public void setDate(int aYear,int aMonth, int aDay){
        this.year = aYear ;
        this.month = aMonth ;
        this.day = aDay ; 
    }

    public void setYear(int aYear){
        this.year = aYear ;
    }

    public void setMonth(int aMonth){
        this.month = aMonth ;
    }

    public void setDay(int aDay){
        this.day = aDay;
    }

    public int getYear(){
        return year;
    }
    public int getMonth(){
        return month;
    }
    public int getDay(){
        return day;
    }
    @Override
    public String toString() {
    return day + " " + strMonths[month - 1] + " " + year;
    }

    public MyDate previousDay(){
        if(month == 1 && day == 1){
            year = year - 1;
            month = 12;
            day = 31;
        }
        else if(month == 5 || month == 7 || month ==10 || month == 12){
            if(day == 1){
                month = month - 1;
                day = 30;
            }
            else{
                day = day - 1;
            }
        }
        else if(month != 3){
            if(day == 1){
                month = month - 1;
                day = 31;
            }
            else{
                day = day - 1;
            }
        }
        else{
            if(isLeapYear(year) && day ==1){
                month = month - 1;
                day = 29;
            }
            else if(day ==1){
                month = month - 1;
                day = 28;
            }
            else{
                day = day - 1;
            }
        }
    return this;
    }

    public MyDate previousMonth(){
        if(month==12){
            month =1;
        }
        else{
            month--;
        }
        return this;
    }

    public MyDate previousYear(){
        year --;
        if(month == 2  && day == 29 && !isLeapYear(year)) {
        day = 28;
        }
        return this;
    }

    public MyDate nextDay(){
        if (month ==12 && day == 31){
            year ++;
            month = 1;
            day = 1;
        }
        else if( month == 4 || month == 6 || month== 9 || month== 11 ){
            if(day ==30){
                month ++;
                day = 1;
            }
            else{
                day ++;
            }
        }
        else if(month !=2){
            if(day == 31){
                month++;
                day = 1;
            }
            else{
                day++;
            }
        }
        else if(isLeapYear(year)&& day ==29){
            month++;
            day =1;
        }
        else if (!isLeapYear(year)&& day == 28){
            month++;
            day = 1;
        }
        else{
            day ++;
        }
        return this;
    }
    public MyDate nextMonth(){
        if(month == 12){
            month = 1;
        }
        else{
            month++;
        }
        return this;
    }
    public MyDate nextYear(){
        year ++;
        if(month == 2  && day == 29 && !isLeapYear(year)) {
        day = 28;
        }
        return this;
    }
}
