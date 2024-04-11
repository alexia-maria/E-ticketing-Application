public enum TipEveniment {
    BALET("balet"),
    CONCERT("concert"),
    EVENIMENT_SPORTIV("eveniment sportiv"),
    FESTIVAL("festival"),
    FILM("film"),
    OPERA("opera"),
    PIESA_DE_TEATRU("piesa de teatru"),
    STANDUP("standup");

    private String tip;

    private TipEveniment(String tip){
        this.tip = tip;
    }

    public String getTip() {
        return tip;
    }
}
