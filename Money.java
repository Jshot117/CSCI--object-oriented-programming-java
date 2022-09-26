public class Money {
    private int dollars;
    private int cents;
    
    public Money(){
        dollars=0;
        cents=0;
    }

    public Money(int dollars, int cents){
        this.dollars= dollars;
        this.cents= cents;
    }
    public int getDollar(){
        return dollars;
    }
    public int getCent(){
        return cents;
    }
    public String toStringMoney(){
        if ( this.cents < 10)
        return "$"+ this.dollars + ".0" + this.cents; 
        if ( this.cents > 100) this.dollars = this.dollars + (this.cents/100);
        return "$"+ this.dollars + "." + this.cents%100;
    }
    
    public int compareTo(Money money){
       int newD=money.getDollar();
       int newC=money.getCent();
       if( this.dollars > newD) return (int)1;
       if( this.dollars < newD) return (int)-1;
       if( this.cents < newC) return (int)-1;
       if( this.cents > newC) return (int)1;
       return 0;
    }
    public boolean equals(Money money){
        if( this.dollars == money.getDollar() && this.cents == money.getCent()) return true;
        else return false;
    }
    public Money add( Money money){
        this.cents = this.cents + money.cents;
        this.dollars = this.dollars + money.dollars;
        if ( this.cents > 100){
         dollars = dollars  + cents/100;
        this.cents = this.cents % 100;}
        return this;
    }
    public static void main(String[] args) throws Exception {
        Money m1 = new Money();
        Money m2 = new Money(6,505);
        System.out.println(m1.getCent());
        System.out.println(m2.getDollar());
        System.out.println(m2);
        System.out.println(m1.compareTo(m2));
        System.out.println(m1.equals(m2));
        System.out.println(m2.toStringMoney());
    }

    }

