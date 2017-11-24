public abstract class Animal{
private String name;
protected double weight;

public Animal(String n,double w){
name=n;
weight=w;}

public abstract void eat();

public String toString(){
return "Name: "+name+"\tWeight: "+weight;}}