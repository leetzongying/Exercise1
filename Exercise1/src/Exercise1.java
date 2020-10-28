import java.util.*;
public class Exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 printName();
		    printGender();
		    printBday();
		    printAge();
		    printMarital();
		    printCitizen();
		    printWorkExp();
		    printLanguage();
		    printSkill();
		    printAwards();
		    printCGPA();
		    printGrade();
		    printGPA();
		    
			}
			
			public static void printName() {
				Scanner in=new Scanner (System.in);
				System.out.print("Enter your name");
			    String name = in.next();
			    System.out.println("name:" + name);
			}
			
			public static void printAge() {
				Scanner in=new Scanner (System.in);
				System.out.print("Enter your age");
			    int age = in.nextInt();
			    System.out.println("age:" + age);
			}
		     
			public static void printCGPA() {
				Scanner in=new Scanner (System.in);
				System.out.print("Enter your CGPA");
			    double cgpa = in.nextDouble();
			    System.out.println("cgpa:" + cgpa);
				}
			
			public static void printGrade() {
				Scanner in=new Scanner (System.in);
				System.out.print("Enter grade STIA1113");
				String str = in.next();
			    char grade = str.charAt(0);
			    System.out.println("grade:" + grade);
			}
			
			public static void printGPA() {
				Scanner in=new Scanner (System.in);
				System.out.print("Enter GPA Sem 1:");
			    double num1 = in.nextDouble();
			    System.out.print("Enter GPA Sem 2:");
			    double num2 = in.nextDouble();
			    double sum = num1 + num2;
			    double totalgpa = sum/2;
			    System.out.println("Total GPA equal to:" + totalgpa);
			}
			
			public static void printGender() {
				Scanner in=new Scanner (System.in);
				System.out.print("Enter your gender");
				String gender = in.next();
			    System.out.println("Your gender:" + gender);
			}
			
			public static void printBday() {
				Scanner in=new Scanner (System.in);
				System.out.print("Enter your birthday");
			    String bday = in.next();
			    System.out.println("Birthday:" + bday);
			}
			public static void printMarital() {
				Scanner in=new Scanner (System.in);
				System.out.print("Enter your marital status:");
			    String marry = in.next();
			    System.out.println("Marital Status:" + marry);
			}
			public static void printCitizen() {
				Scanner in=new Scanner (System.in);
				System.out.print("Enter your citizenship:");
			    String citizen = in.next();
			    System.out.println("Citizenship:" + citizen);
			}
			public static void printWorkExp() {
				Scanner in=new Scanner (System.in);
				System.out.print("Enter your work experience:");
				String workExp1 = in.next();
				 System.out.println("Work Experience:" + workExp1);
				 System.out.print("Enter your any other work experiences:");
				 String workExp2 = in.next();
				 System.out.println("Work Experience:" + workExp2);
			}
			public static void printLanguage() {
				Scanner in=new Scanner (System.in);
				System.out.print("Enter your language proficiency:");
				String Lan1 = in.next();
				 System.out.println("Language proficiency:" + Lan1);
				 System.out.print("Enter your any other language proficiency:");
				 String Lan2 = in.next();
				 System.out.println("Language proficiency:" + Lan2);
			}
			public static void printSkill() {
				Scanner in=new Scanner (System.in);
				System.out.print("Enter your profesional skill:");
				String skill1 = in.next();
				System.out.println("Profesional Skill:" + skill1);
				 System.out.print("Enter your any other profesional skills:");
				 String skill2 = in.next();
				 System.out.println("Profesional Skill:" + skill2);
			}
			public static void printAwards() {
				Scanner in=new Scanner (System.in);
				System.out.print("Enter your awards:");
				String award1 = in.next();
				System.out.println("Award 1:" + award1);
				 System.out.print("Enter your any other awards:");
				 String award2 = in.next();
				 System.out.println("Relevant awards:" + award2);
			}
		

	}


