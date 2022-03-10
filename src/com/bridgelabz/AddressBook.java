package com.bridgelabz;

public class AddressBook {

	public static void main(String[] args) {
		System.out.println("welcome to address book program");
		contactDetails newContact = new contactDetails();  //create object 

        newContact.setFirstName("Neha \n");
        newContact.setLastName("chougule \n");
        newContact.setAddressCity("burli \n");
        newContact.setState("Maharashtra \n");
        newContact.setZip(416308);
        newContact.setPhoneNumber("9657475623 \n");
        newContact.setEmail("nehachougule830@gmail.com \n");
        System.out.println("The Contact is : \n" + newContact);

    }

}

class contactDetails {
    private String firstName;
    private String lastName;
    private String addressCity;
    private String state;
    private int zip;
    private String phoneNumber;
    private String email;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddressCity() {
        return addressCity;
    }

    public void setAddressCity(String addressCity) {
        this.addressCity = addressCity;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String toString() {
        return " FirstName :" + firstName + " LastName :" + lastName + " Address City : " + addressCity + " State : "
                + state + " Zip :" + zip + '\'' + " PhoneNumber : " + phoneNumber + " Email : " + email;

    }

}

	
