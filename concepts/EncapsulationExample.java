class Money{
    private int amount;
    public int getAmount(){
        return amount;
    }
    public void setAmount(int amount){
        this.amount = amount;
    }

    
}

class EncapsulationExample{
    public static void main(String[] args){
        Money money = new Money();
        money.setAmount(100);
        System.out.println("Amount: " + money.getAmount());
    }
}