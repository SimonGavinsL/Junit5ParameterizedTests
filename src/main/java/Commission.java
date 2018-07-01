class Commission {

    private int tower;
    private int display;
    private int peripheral;

    Commission(int t, int d, int p) {
        tower = t;
        display = d;
        peripheral = p;
    }

    String commission() {
        if(1 > tower || 70 < tower) {
            return "Error";
        }
        else if(1 > display || 80 < display) {
            return "Error";
        }
        else if(1 > peripheral || 90 < peripheral) {
            return "Error";
        }
        else {
            int turnover = tower * 25 + display * 30 + peripheral * 45;

            if(turnover <= 1000) {
                if(0 == turnover % 10){
                    return "" + turnover / 10;
                }
                else {
                    return "" + turnover * 0.10;
                }
            }
            else if(turnover <= 1800) {
                if(0 == turnover % 20) {
                    return  "" + turnover * 3 / 20;
                }
                else {
                    return "" + turnover * 0.15;
                }
            }
            else {
                if(0 == turnover % 5) {
                    return "" + turnover / 5;
                }
                else {
                    return "" + turnover * 0.20;
                }
            }
        }
    }

}
