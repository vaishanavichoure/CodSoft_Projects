package atm_Interface;

import java.util.*;

public class ATM_Interface {

	    public static void main(String[] args) {
	        ATMop obj = new ATMop();
	        
	    }
	}
	class Data{
	    int balance;
	}

	 class ATMop {
	    HashMap<Integer , Data >  map  = new HashMap<>();
	    Scanner sc = new Scanner(System.in);
	    ATMop(){
	            System.out.println("Welcome To The SBI ATM");
	            op();
	    }

	     public void op(){
	         System.out.println("Enter Valid PIN");

	         int pin = sc.nextInt();

	         if(map.containsKey(pin)){
	             Data obj = map.get(pin);
	             menu(obj);
	         }else{
	             System.out.println("Please Create Account First ");
	             System.out.println("set pin code");
	             System.out.println("set pin greater than 2  and less than 5");

	             int setpin = sc.nextInt();

	             Data obj = new Data();
	             if(Integer.toString(setpin).length() < 5 && 2<Integer.toString(setpin).length() ){
	                 obj.balance = 0;
	                 map.put(setpin , obj);
	                 menu(obj);
	             }
	             else{
	                 System.out.println("Invalid PIN System Terminate");
	             }
	         }
	     }


	    public void menu(Data obj){
	        System.out.println("---------------------------------------------------------------------");
	        System.out.println("Enter your Choice");

	        System.out.println("1 . Check balance");
	        System.out.println("2 . Withdraw money");
	        System.out.println("3 . Deposit money");
	        System.out.println("4 . Exit");
	        System.out.println("5 . Check another account");
	        System.out.println("Enter Option Choose");
	        int x = sc.nextInt();

	        if(x == 1){
	            check_balance(obj);
	        }
	        else if(x==2){
	            withdraw(obj);
	        }
	        else if(x==3){
	            deposite(obj);
	        }
	        else if(x == 4){
	            System.out.println("Thank You For Using This ATM");
	        }else if(x == 5){
//	            ATMop obj = new ATMop();
	            op();
	        }
	        else{
	            System.out.println("Enter Valid Option");
	            menu(obj);
	        }
	    }

	    public void check_balance(Data obj){
	        System.out.println("Your Current Balance " + obj.balance);
	        System.out.println("---------------------------------------------------------------------");
	        menu(obj);
	    }

	    public void deposite(Data obj){
	        System.out.println("Enter The Amount ");
	        float d = sc.nextFloat();
	        obj.balance += d;
	        System.out.println("Amount Deposited Successfully ");
	        System.out.println("---------------------------------------------------------------------");
	        menu(obj);
	    }

	    public void withdraw(Data obj){
	        System.out.println("Enter The Amount ");
	        float d = sc.nextFloat();
	       if(d > obj.balance) {System.out.println("Insufficient Balance"); menu(obj);}
	        obj.balance -= d;
	        System.out.println("Amount Withdraw Successfully ");
	        System.out.println("---------------------------------------------------------------------");
	        menu(obj);
	    }


	}