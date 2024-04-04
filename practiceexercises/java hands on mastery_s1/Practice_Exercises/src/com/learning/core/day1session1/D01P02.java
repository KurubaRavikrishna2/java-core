package com.learning.core.day1session1;

interface MedicineInfo {
    void displayLabel();
}
 
class Tablet implements MedicineInfo {
    @Override
    public void displayLabel() {
        System.out.println("Store Tablets in a cool dry place.");
    }
}
 
class Syrup implements MedicineInfo {
    @Override
    public void displayLabel() {
        System.out.println("Syrup is consumable only on prescription.");
    }
}
 
class Ointment implements MedicineInfo {
    @Override
    public void displayLabel() {
        System.out.println("Ointment is for external use only.");
    }
}
 
class TestClass {
    public static void main(String[] args) {
        MedicineInfo[] medicines = {new Tablet(), new Syrup(), new Ointment()};
 
        for (MedicineInfo medicine : medicines) {
            medicine.displayLabel();
        }
    }
}