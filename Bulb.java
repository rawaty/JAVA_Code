class Bulb
{
int watt;
float price;
String color;
boolean state;
static int counter;
static String cname;

static 
{
counter=0;
cname="Yogesh";
}
Bulb()
{
watt=10;
price=14.5f;
color="Yellow";
state=true;

}
void showDetail()
{
System.out.println("Watt of Bulb="+watt);
System.out.println("Price of Bulb="+price);
System.out.println("Color of Bulb="+color);
System.out.println("State of Bulb="+state);

System.out.println("Company name of Bulb="+cname);

}

void changeState()
{
if(state==true)
{
state=false;
 
}
else
{
state=false;
}

}

static void countBulb()
{
System.out.println("Total number of Bulb="+counter);

}

void changeCompanyName(String cn)
{
cname=cn; 
}

{
counter++;
}
Bulb(int w,float p,String c,boolean b)
{
watt=w;
price=p;
color=c;
state=b;

}
public static void main(String args[])
{
Bulb.countBulb();
System.out.println("*********create same type of Bulb********");
Bulb b1=new Bulb();
Bulb b2=new Bulb();
Bulb b3=new Bulb();
System.out.println("*********Detail of Bulb b1..********");
b1.showDetail();

System.out.println("*********Detail of Bulb b2..********");
b2.showDetail();

System.out.println("*********Detail of Bulb b3..********");
b3.showDetail();

Bulb.countBulb();

System.out.println("*********Different type of Bulb********");
Bulb b4=new Bulb(34,45.5f,"pink",true);

Bulb.countBulb();

System.out.println("*********Detail of Bulb b4..********");
b4.showDetail();

Bulb b5=new Bulb(36,78.5f,"blue",true);
System.out.println("*********Detail of Bulb b5..********");
b5.showDetail();


Bulb b6=new Bulb(100,100.5f,"yellow",true);
System.out.println("*********Detail of Bulb b6..********");
b6.showDetail();

b6.changeState();
b6.showDetail();
b6.changeCompanyName("Philips");
b6.showDetail();
}
}