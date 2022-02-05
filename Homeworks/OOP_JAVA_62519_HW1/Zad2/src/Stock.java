public class Stock {
    private String symbol;
    private String name;
    private double previousClosingPrice;
    private double currentPrice;

    public Stock(String symbol , String name ) {
        if (symbol != null && name != null) {
            this.symbol = symbol;
            this.name = name;
        }else{
            symbol = "ERROR";
            name = "ERROR";
        }
    }

    public String getSymbol(){
        return symbol;
    }
    public String getName(){
        return name;
    }
    public double getPreviousClosingPrice(){
        return previousClosingPrice;
    }
    public double getCurrentPrice(){
        return currentPrice;
    }

    public void setPreviousClosingPrice(double price){
        if(price != 0){
            this.previousClosingPrice = price;
        }
    }
    public void setCurrentPrice(double price){
        if(price != 0){
            this.currentPrice = price;
        }
    }
    public double changePercent(){
        return (currentPrice - previousClosingPrice) * 100 / previousClosingPrice;
    }
}
