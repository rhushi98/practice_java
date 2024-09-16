public class Person {

       String name;
       int age;
       String gender;

    public Person(String rhushi, String number, String male) {
        this.name=name;
        this.age=age;
        this.gender=gender;
    }

    public String getname(){
           return name;
        }
        public int getage() {
            return age;
        }
        public String getgender() {
            return gender;
        }
        public void setage(int age){
           this.age=age;
        }
        public void setgender(String gender){
           this.gender=gender;
        }
        void display(){
            System.out.println(getage()+","+getname()+","+getgender());
        }
    }

