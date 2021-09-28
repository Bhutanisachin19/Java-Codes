
class HeartRates
{
    private String firstname , lastname;
    private int day,month,year; //DOB


    //parametrized constructor
    HeartRates(String first, String Last,int d,int m,int yr)
    {
        firstname = first;
        lastname = Last;
        day = d;
        month = m ;
        year = yr;
    }

    //default constructor
    HeartRates()
    {
        //do nothing
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

    //set and get for firstname
    public String getFirst()
    {
        return firstname;
    }

    public void setFirst(String s)
    {
        this.firstname = s;
    }

    
    //set and get for lastname
    public String getLast()
    {
        return lastname;
    }

    public void setLast(String s)
    {
        this.lastname = s;
    }

    //calculate age
    public void Age()
    {
        int current_year = 2020;
        int age = current_year - this.year;
        System.out.println("Age is " +age); 
    }

    //calculate heartrate
    public void Rate()
    {
        int current_year = 2020;
        int age = current_year - this.year;
        //  220 - age
        int max_rate = 220 - age;
        System.out.println("Max HeartRate is "+max_rate);
    }

    //target heart rate

}

class Demo
{
    public static void main(String []args)
    {
        HeartRates heart = new HeartRates("Sachin","Bhutani",19,9,1997);

        String name = heart.getFirst();
        System.out.println(name);
        String last_name = heart.getLast();
        System.out.println(last_name);

        heart.Rate();
        heart.Age();
    }
}