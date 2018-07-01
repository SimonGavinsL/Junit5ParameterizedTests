class Phonebill {
    private int time;
    private int num;

    Phonebill(final int t, final int n) {
        time = t;
        num = n;
    }

    double calculateCharge() {
        if (0 > time || 0 > num) {
            return -1;  // -1 stands for error
        } else if (0 == time) {
            return 0;   // Spent no money
        } else if (60 >= time) {
            if (1 >= num) {
                return 25 + time * 0.15 * 0.99;
            } else {
                return 25 + time * 0.15;
            }
        } else if (120 >= time) {
            if (2 >= num) {
                return 25 + time * 0.15 * 0.985;
            } else {
                return 25 + time * 0.15;
            }
        } else if (180 >= time) {
            if (3 >= num) {
                return 25 + time * 0.15 * 0.98;
            } else {
                return 25 + time * 0.15;
            }
        } else if (300 >= time) {
            if (3 >= num) {
                return 25 + time * 0.15 * 0.975;
            } else {
                return 25 + time * 0.15;
            }
        } else {
            if (6 >= num) {
                return 25 + time * 0.15 * 0.97;
            } else {
                return 25 + time * 0.15;
            }
        }
    }
}
