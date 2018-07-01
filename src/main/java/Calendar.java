class Calendar {

    private static final int MIN_YEAR = 1980;
    private static final int MAX_YEAR = 2200;

    private int y;
    private int m;
    private int d;

    Calendar(int year, int month, int day) {
        y = year;
        m = month;
        d = day;
    }

    String calendar() {
        if(MIN_YEAR > y || MAX_YEAR < y) {
            return "Error";
        }

        else if(1 == m || 3 == m || 5 == m || 7 == m || 8 == m || 10 == m || 12 == m) {
            if(0 < d && 31 > d) {
                return "" + y + "-" + m + "-" + (d + 1);
            }
            else if(31 == d) {
                if(12 == m) {
                    if(MAX_YEAR == y) {
                        return "Error";
                    }
                    else {
                        return "" + (y + 1) + "-1-1";
                    }
                }
                else {
                    return "" + y + "-" + (m + 1) + "-1";
                }
            }
            else {
                return "Error";
            }
        }

        else if(4 == m || 6 == m || 9 == m || 11 == m) {
            if(0 < d && 30 > d) {
                return "" + y + "-" + m + "-" + (d + 1);
            }
            else if(30 == d) {
                return "" + y + "-" + (m + 1) + "-1";
            }
            else {
                return "Error";
            }
        }

        else if(2 == m) {
            if(0 < d && 28 > d) {
                return "" + y + "-2-" + (d + 1);
            }
            else if(28 == d) {
                if(0 == y % 100) {
                    if(0 == y % 400) {
                        return "" + y + "-2-29";
                    }
                    else {
                        return "" + y + "-3-1";
                    }
                }
                else if(0 == y % 4){
                    return "" + y + "-2-29";
                }
                else {
                    return "" + y + "-3-1";
                }
            }
            else if(29 == d) {
                if(0 == y % 100) {
                    if(0 == y % 400) {
                        return "" + y + "-3-1";
                    }
                    else {
                        return "Error";
                    }
                }
                else if(0 == y % 4){
                    return "" + y + "-3-1";
                }
                else {
                    return "Error";
                }
            }
            else {
                return "Error";
            }
        }

        else {
            return "Error";
        }
    }

}
