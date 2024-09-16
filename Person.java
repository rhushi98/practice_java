public class Person {

       String name;
       int age;
       String gender;

    public Person(String name,int age, String gender) {
        this.name=name;
        this.age=age;
        this.gender=gender;
    }


    public Person(String name,int age) {
        this.name=name;
        this.age=age;
        gender="NA";
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
            System.out.println(getname()+","+getage()+","+getgender());
        }
    }

