public class test{
public static void main(String[] args){
Animal[] list=new Animal[3];
Penguin p=new Penguin("Pengin_1",0.5);
Penguin p1=new Penguin("Prey1",20);
Penguin p2=new Penguin("Prey2",30);
Hawk h=new Hawk("Hawk_1",1,60,p1);
Hawk h1=new Hawk("Hawk_2",0.80,50,p2);

list[0]=p;
list[1]=h;
list[2]=h1;

boolean fly=false;
for (int i=0;i<list.length;i++)
if (list[i] instanceof Hawk)
fly=((Hawk)list[i]).fliesHight();
if (fly==true)
System.out.println("The Hawk flies high");
else
System.out.println("The Hawk does not fly high");

for (int s=0;s<list.length;s++)
list[s].eat();

for (int f=0;f<list.length;f++)
System.out.println("Informaton: "+list[f]);}}