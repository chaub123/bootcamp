package day20;

public enum Currency {
  USD(1, "US Dollar"),
  HKD(2, "Hong Kong Dollar"),
  CNY(3, "Chinese Yuan Renminbi"),
  GBP(4, "British Pound Sterling"),
  ;

  private String desc;
  private int id;

  private Currency(int id, String desc){
    this.desc = desc;
    this.id = id;
  }

  public String getDesc(){
    return this.desc;
  }

  public int getId(){
    return this.id;
  }

  public static Currency getCurrency(int id){
    for(Currency currency : Currency.values()){
      if(currency.id == id) return currency;
    }
    return null;
  }

  
}
