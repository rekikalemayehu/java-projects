package emailapp;
public  class email{
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int  mailboxCapacity;
    private int defaultpasswordlength;
    private String alternateEmail;
    //constructor to receive the first name and last name
    public email (String firstname, String lastName){
        this.firstName=firstname;
        this.lastName=lastName;
        System.out.println("email created:"+ this.firstName+" "+this.lastName);
    
    //call a method asking for the department return the departement
    this.department=set.Department();
    System.out.println("department:"+this.department);
    //call a method that return a random password
    this.passwored=randompassword(defaultpasswordlength);
    System.out.println("your password is :"+ this.password);



    }
    //ask for the department
    private String setDepartment() {
        System.out.println("department codes\n1 for Sales\n2 for development\n3 for accounting \n0 for none\n enter department code:");
        Scanner in= new Scanner(System.in);
        int depChoice=in.nextInt();
        if (depChoice==1){return"sales";}
        else if (depChoice==2){return"dev";}
        else if(depChoice==3){return"accounting";}
        else {return"";}

    }
    //generate a random password
    private String randompassword(int length){
        String passwordSet="ABCDEFGHIGKLMNOPQRST1234567890#$%^&*";
        char[]password=new char[length];
        for (int i=0; i<length; i++){
           int rand= (int ) Math.random() * passwordSet.length();
        password[i]= passwordSet.charAt(rand);
        }
        return new String (password);
    }
    //set mailbox capacity
    //set the alternate email
    //change the password

}