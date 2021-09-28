class Date
{
    private int month;
    private int day;
    private int year;

    // Default constructor
    Date()
    {
        System.out.println("Constructor called");
        month = 1;
        day = 1;
        year = 1;
    }

    
    // Parametrized constructor
    Date(int a,int b ,int c)
    {
        System.out.println("Parametrized Constructor called");
        day = a;
        month = b;
        year = c;
    }
    
    //set and get methods for day
    public int getDay()
    {
        return day;
    }
    public void setDay(int val)
    {
        this.day = val;
    }

    //set and get methods for month
    public int getMonth()
    {
        return month;
    }
    public void setMonth(int mon)
    {
        this.month = mon;
    }
    
    //set and get methods for year
    public int getYear()
    {
        return year;
    }
    public void setYear(int yr)
    {
        this.year = yr;
    }

    //to display
    public void displayDate()
    {
        System.out.println(year +" / " + month +" / "+ day );
    }
    
}

class Date_Time
{
    public static void main(String []args)
    {
        Date obj = new Date(10,20,30); //calling parametrized
        //Date obj = new Date(); //calling default

        // to set a value
        //obj.setYear(15);
        
        /*
        int year = obj.getYear();
        int day = obj.getDay();
        int month = obj.getMonth();

        System.out.println(year);
        System.out.println(day);
        System.out.println(month);
        */
        
        obj.displayDate();
    }
}