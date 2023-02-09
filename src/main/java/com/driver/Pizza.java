package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private int cheeseprice;
    private int topping;
    private int takeaway;
    private Boolean addExtraCheese;
    private Boolean addExtraToppings;
    private Boolean addTakeaway;
    private Boolean calculateBill;
    
    
    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        this.cheeseprice=80;
        this.takeaway=20;
        if(isVeg==true){
            this.price = 300;
            this.topping = 70;
        }
        else{
            this.price = 400;
            this.topping = 120;
        }
        this.addExtraCheese=false;
        this.addExtraToppings=false;
        this.addTakeaway=false;
        this.calculateBill=false;

        this.bill = "Base Price Of The Pizza:" + this.price + "\n";
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        if(this.addExtraCheese==false){
            this.price = this.price + this.cheeseprice;
            this.addExtraCheese=true;
        }
        
    }

    public void addExtraToppings(){
        
        if(this.addExtraToppings==false){
            this.price = this.price + this.topping;
            this.addExtraToppings=true;
        }
    }

    public void addTakeaway(){
        if(this.addTakeaway==false){
            this.price = this.price + this.takeaway;
            this.addTakeaway=true;
        }
    }

    public String getBill(){
        if(this.calculateBill==false){
            // check for cheese
            if(this.addExtraCheese==true){
                this.bill = this.bill + "Extra Cheese Added: " + this.cheeseprice + "\n"; 
            }
            // check for tooping
            if(this.addExtraToppings==true){
                this.bill = this.bill +"Extra Toppings Added: "+ this.topping + "\n";
            }
            // check for takeaway
            if(this.addTakeaway==true){
                this.bill = this.bill +"Paperbag Added: "+ this.takeaway + "\n";
            }
            this.bill = this.bill +"Total Price: " +this.price;
            calculateBill = true;

        }

        return this.bill;
    }
}
