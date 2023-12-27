package enums_in_java;

enum Cricketers {
    VIRAT(18, "RHB"),
    DHONI(07, "RHB"),
    ROHIT(45, "RHB"),
    ABD(17, "RHB"),
    KLRAHUL(01, "RHB");

    private int jersey;
    private String hand;

    

    private Cricketers(int jersey, String hand) {
        this.jersey = jersey;
        this.hand = hand;
    }

    public int getJersey(){
        return jersey;
    }

    public void setJersey(int jersey){
        this.jersey = jersey;
    }

    public String getHand(){
        return hand;
    }

    public void setHand(String hand){
        this.hand = hand;
    }

    public static void main(String[] args) {
        Cricketers[] d = Cricketers.values();

        for (Cricketers s : d) {
            System.out.println(s.getHand()); // This line of code prints are the exisiting enum values present inside the
                                   // enum. it returns the array of existing values
            System.out.println(s.ordinal()); // This line of code prints the order or how many values present inside the
                                             // enums.
        }

    }

}
