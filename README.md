Java Variables
--------------

A variable in Java is like a container used to store data values that can change during program execution.
    Syntax:

        dataType variableName = value;

Example:
         int age = 25;

                int → data type
                age → variable name
                25  → value assigned

2.  Rules for Naming Variables:
            Must start with a letter, _, or $
            Cannot start with a number
            Cannot use Java reserved keywords
            Case-sensitive: age ≠ Age
            Use meaningful names


1. Local Variables
   ----------------
      1.  Declared inside a method, constructor, or block
      2. Accessible only within that block
      3.  Must be initialized before use

   Example:

        public class Main {
            public static void main(String[] args) {
                int age = 25; // local variable
                System.out.println(age);
            }
        }

2. Instance Variables (Non-Static Fields)
   --------------------------------------
    1. Declared inside a class but outside methods
    2. Each object has its own copy
    3. Default values are automatically assigned


   Example:

        class Student {
            int rollNo;       // instance variable
            String name;
            public void display() {
                System.out.println(rollNo + " " + name);
            }
        }
    
        public class Main {
            public static void main(String[] args) {
                Student s1 = new Student();
                s1.rollNo = 101;
                s1.name = "Alice";
                s1.display();
            }
       }

   3. Class Variables (Static Variables)
      ----------------------------------
       1. Declared inside a class with static keyword
       2. Shared by all objects of the class
       3. Default values are automatically assigned

   Example:

      class Student {
        static String school = "ABC School"; // class variable
      }

       public class Main {
           public static void main(String[] args) {
                System.out.println(Student.school);
           }
       }
    