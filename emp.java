public class emp{
public static void main(String[] args){
System.out.println("Welcome to Employee Wage Computation Program on Master Branch");
int hrs=0;
int wage=0;
int monWage=0;
for(int day =0; day < 20; day++){
int attend =(int)Math.floor(Math.random()*10)%3;
switch(attend){
case 1: hrs=8;break;
case 2: hrs=4;break;
default: hrs=0;
}
wage=hrs*20;
monWage=monWage+wage;}
System.out.println("Monthly Emp Wage: "+monWage);}}
