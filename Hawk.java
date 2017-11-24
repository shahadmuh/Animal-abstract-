public class Hawk extends Bird{

private int maxFlightHeight;
private Animal favPrey;
public Hawk(String m,double w,int max, Animal fave){
super(m,w);
maxFlightHeight=max;
favPrey=fave;}

public void eat(){
System.out.println("I like to eat birds");
}

public boolean fliesHight(){
if (maxFlightHeight>40)
return true;
else
return false;}

public String toString(){
return "Maximum Flight Height: "+maxFlightHeight+"\tHawk's Favorite prey: "+favPrey;}} 