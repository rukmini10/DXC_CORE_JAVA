package com.training;

public class LanguageService {
	public static void main(String[] args) {
	Language sc = new English();
    sc.lanType("English");
    sc.getVersion("Advanced");
    sc = new Hindi();
    sc.lanType("Hindi");
    sc.getVersion("Intermediate");
}}
