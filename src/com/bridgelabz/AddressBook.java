package com.bridgelabz;
import java.util.Scanner;
public class AddressBook {
	public static void main(String[] args) {
		System.out.println("welcome to address book program");
		newAddressBook person = new newAddressBook();
        person.addContact();
        }
        }
class contactDetails {
    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private int zip;
    private int phoneNumber;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public String getcity() {
        return city;
    }
    public void setcity(String city) {
        this.city = city;
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

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String toString() {
        return " FirstName :" + firstName + " LastName :" + lastName + " Address  : " + address  +" city : " + city + " State : "
                + state + " Zip :" + zip + '\'' + " PhoneNumber : " + phoneNumber + " Email : " + email;
    }
}

class newAddressBook {

    Scanner sc = new Scanner(System.in);
	 

    public void addContact() {
        contactDetails person = new contactDetails();    
        System.out.println("Enter First Name: ");
        String firstName = sc.nextLine();
        System.out.println("Enter last Name: ");
        String lastName = sc.nextLine();
        System.out.println("Enter your address: ");
        String address = sc.nextLine();
        System.out.println("Enter your city: ");
        String city = sc.nextLine();
        System.out.println("Enter your state: ");
        String state = sc.nextLine();
        System.out.println("Enter zip code : ");
        int zip = sc.nextInt();
        System.out.println("Enter phone number: ");
        int phoneNumber = sc.nextInt();
        System.out.println("Enter your EMail ID: ");
        String email = sc.next();
        person.setFirstName(firstName);
        person.setLastName(lastName);
        person.setAddress(address);
        person.setcity(city);
        person.setState(state);
        person.setZip(zip);
        person.setPhoneNumber(phoneNumber);
        person.setEmail(email);
        System.out.println("The Contact Details of " + firstName + "\n" + person);
    }
}

   




