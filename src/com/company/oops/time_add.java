package com.company.oops;

class time_add
{
    int hour;
    int min;
    int sec;

    void set_time(int h, int m , int s)
    {
        hour=h;
        min=m;
        sec=s;
    }

    void display()
    {
        System.out.println(hour+" hour "+min+" min "+sec+" sec");

    }
    time_add addTime(time_add t){


        time_add time3 = new time_add();
        time3.hour=hour+t.hour;
        time3.min=min+t.min;
        time3.sec=sec+t.sec;
        if(time3.sec>59)
        {
            time3.min=time3.min+(time3.sec/60);
            time3.sec=time3.sec%60;
        }
        if(time3.min>59) {
            time3.hour = time3.hour + (time3.min / 60);
            time3.min = time3.min % 60;
        }


            return time3;
    }
    public static void main(String args[])
    {

        time_add time1=new time_add();
        time_add time2=new time_add();
        time_add time3=new time_add();
        time1.set_time(2,45,20);
        time2.set_time(3,50,55);
        time3=time1.addTime(time2);

        time3.display();
    }
}