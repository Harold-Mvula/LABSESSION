class StudentAccount extends AccountDetails{
   private String regNumber;

    StudentAccount(){}
    StudentAccount(String regNumber){
        this.regNumber = regNumber;
    }
    public String getRegNumber(){
        return regNumber;
    }
}