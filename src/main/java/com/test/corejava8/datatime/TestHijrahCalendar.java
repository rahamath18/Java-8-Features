package com.test.corejava8.datatime;

import java.time.ZoneId;
import java.time.chrono.Chronology;
import java.time.chrono.HijrahChronology;
import java.time.chrono.HijrahDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class TestHijrahCalendar {
	public static void main(String[] args) {
		
		HijrahChronology hc = HijrahChronology.INSTANCE;
		
		System.out.println(hc.dateNow());
		

	}

}
