package com.cisco.learning.two.abstracts.enums;

public enum WeekDayHipster {

    MONDAY {
        public int getTemperature() {
            return 0;
        }
    },

    TUESDAY {
        public int getTemperature() {
            return 1;
        }
    };

    public abstract int getTemperature();
}
