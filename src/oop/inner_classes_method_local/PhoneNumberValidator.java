package oop.inner_classes_method_local;

public class PhoneNumberValidator {
    private static String phoneNumberRegex = "^[+][0-9]+$";

    public void validatePhoneNumber(String number){
        String russianCountryCode = "+7";

        class PhoneNumber{
            private String phoneNumber;

            public PhoneNumber(String phoneNumber) {
                this.phoneNumber = phoneNumber;
            }

            public String getPhoneNumber() {
                return phoneNumber;
            }

            public void setPhoneNumber(String phoneNumber) {
                this.phoneNumber = phoneNumber;
            }

            public void printRussianCountryCode(){
                System.out.println(russianCountryCode);
            }
        }

        PhoneNumber phoneNumber = new PhoneNumber(number);
        if (phoneNumber.getPhoneNumber().matches(phoneNumberRegex) != true){
            System.out.println("Incorrect phone number " + phoneNumber.getPhoneNumber());
            phoneNumber.printRussianCountryCode();
        } else {
            System.out.println("Correct phone number " + phoneNumber.getPhoneNumber());
        }
    }
}
