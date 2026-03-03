public class Telco {
    private String telcoName;
    private double promoPrice;
    private int dataAllowance;    
    private boolean unliCallText;

    public Telco(int dataAllowance, int promoPrice, String telcoName, boolean unliCallText){
        this.dataAllowance=dataAllowance;
        this.promoPrice=promoPrice;
        this.telcoName=telcoName;
        this.unliCallText=unliCallText;
    }

    public void setDataAllowance(int dataAllowance){
        this.dataAllowance=dataAllowance;
    }

    public int getDataAllowance(){
        return dataAllowance;
    }

    public void setPromoPrice(int promoPrice){
        this.promoPrice=promoPrice;
    }

    public double getPromoPrice(){
        return promoPrice;
    }

    public void setTelcoName(String telcoName){
        this.telcoName=telcoName;
    }

    public String getTelcoName(){
        return telcoName;
    }

    public void setUnliCallText(boolean unliCallText){
        this.unliCallText=unliCallText;
    }

    public boolean getUnliCallText(){
        return unliCallText;
    }
    
}
