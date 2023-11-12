//Aravind Alwar;
//October 30, 2023;
//Advisor_Tester.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Scanner;

public class Advisor_Tester {
    //This will be our tester,Advisor_Tester file
    public static void main(String[] Args) {
        //Variables needed for the program
        Scanner scanner = new Scanner(System.in); //Scanner
        boolean work = true;
        //-Variables for the Advisor
        String ad_F_Initial = " ";
        String ad_M_Initial = " ";
        String ad_L_Initial = " ";
        String acad_ID = " ";
        int ad_Phone = 0;
        String adv_Email;
        String ad_Street = " ";
        String ad_City = " ";
        String ad_State = " ";
        int ad_Zip = 00000;
        String ad_Title = " ";
        double ad_Salary = 0.0;
        int ad_Hired_Month = 0;
        int ad_Hired_Day = 0;
        int ad_Hired_Year = 0;
        Advisor[] heads = new Advisor[3]; //3 Advisors
        ArrayList<Advisor> heads = new ArrayList<>();
        //-Student,advisee Variables
        String student_F_Initial = " ";
        String student_M_Initial = " ";
        String student_L_Initial = " ";
        String student_ID = " ";
        int student_Phone;
        String student_Email;
        String student_Street = " ";
        String student_City = " ";
        String student_State = " ";
        int student_Zip = 00000;
        String major_Student = " ";
        int student_Admitted_Month, student_Admitted_Day, student_Admitted_Year;
        Student[] student_A = new Student[3]; //3 Students for each advisor
        //-Course Variables
        String course = " ";
        int course_Credits = 0;
        double total_Price = 0.0;
        Course[] classes1 = new Course[3]; //3 Courses,max for each student----
        Course[] classes2 = new Course[3];
        Course[] classes3 = new Course[3];
        //Functions for the program
        int input = 0;
        int edit_Op = 0;
        int address_Edit = 0;
        int add_Course = 0;
        int add_Student = 0;
        int ad_Tally = 0;
        int stu_Tally_A = 0; //How many Students are currently in the Advisor's list,for each advisor.
        int stu_Edit = 0;
        int search = 0;
        System.out.println("Welcome to the Advisor Data System. You enter in an advisor info,we will do the work to manage the system.");
        while (work) {
            System.out.println("Choose a valid option from the following values");
            System.out.println("1.Add an Advisor to the System.\n2.Edit an advisor in the advisor array.\n3.Delete an advisor in the array.\n4.Display an advisor’s basic information and the advisees in the array.\n5.Exit the application.");
            input = scanner.nextInt();

            if (input == 1) { //Add An Advisor
                boolean advisors = true;
                boolean students = true; //We may now add a student or so to the list.
                while (advisors) {
                    System.out.println("You will now add an advisor to the array of advisors");
                    System.out.println("Enter Advisor's first name:");
                    ad_F_Initial = scanner.next();
                    System.out.println("Enter Advisor's middle name:");
                    ad_M_Initial = scanner.next();
                    System.out.println("Enter Advisor's last name:");
                    ad_L_Initial = scanner.next();
                    System.out.println("Enter Advisor's ID:");
                    acad_ID = scanner.next();
                    System.out.println("Enter Advisor's Phone Number:");
                    ad_Phone = scanner.nextInt();
                    adv_Email = acad_ID + "@psu.edu";
                    System.out.println("Enter Advisor's Street:");
                    ad_Street = scanner.next();
                    System.out.println("Enter Advisor's City:");
                    ad_City = scanner.next();
                    System.out.println("Enter Advisor's State:");
                    ad_State = scanner.next();
                    System.out.println("Enter Advisor's Zip:");
                    ad_Zip = scanner.nextInt();
                    System.out.println("Enter Advisor's Title:");
                    ad_Title = scanner.next();
                    System.out.println("Enter Advisor's Annual Salary:");
                    ad_Salary = scanner.nextDouble();
                    System.out.println("Enter Advisor's Hiring Month:");
                    ad_Hired_Month = scanner.nextInt();
                    while (ad_Hired_Month < 1 || ad_Hired_Month > 12) {
                        System.out.println("Not a valid hiring month.");
                        System.out.println("Enter Advisor's Hiring Month:");
                        ad_Hired_Month = scanner.nextInt();
                    }
                    System.out.println("Enter Advisor's Hiring Day:");
                    ad_Hired_Day = scanner.nextInt();
                    while (ad_Hired_Day < 1 || ad_Hired_Day > 31) {
                        System.out.println("Not a valid hiring Day.");
                        System.out.println("Enter Advisor's Hiring day:");
                        ad_Hired_Day = scanner.nextInt();
                    }
                    System.out.println("Enter Advisor's Hiring Year:");
                    ad_Hired_Year = scanner.nextInt();
                    while (ad_Hired_Year < 1970) {
                        System.out.println("Not a valid hiring Year.");
                        System.out.println("Enter Advisor's Hiring Year:");
                        ad_Hired_Year = scanner.nextInt();
                    }
                    while (students && stu_Tally_A < 4) { //Going to add a student to the list of advisees.
                        System.out.println("Enter Student's first name:");
                        student_F_Initial = scanner.next();
                        System.out.println("Enter Student's middle name:");
                        student_M_Initial = scanner.next();
                        System.out.println("Enter Student's last name:");
                        student_L_Initial = scanner.next();
                        System.out.println("Enter Student's ID:");
                        student_ID = scanner.next();
                        System.out.println("Enter Student's Phone Number:");
                        student_Phone = scanner.nextInt();
                        student_Email = student_ID + "@psu.edu";
                        System.out.println("Enter Student's Street Number:");
                        student_Street = scanner.next();
                        System.out.println("Enter Student's City:");
                        student_City = scanner.next();
                        System.out.println("Enter Student's State:");
                        student_State = scanner.next();
                        System.out.println("Enter Student's Zip:");
                        student_Zip = scanner.nextInt();
                        System.out.println("Enter Student's Major:");
                        major_Student = scanner.next();
                        System.out.println("Enter Student's Admission Month:");
                        student_Admitted_Month = scanner.nextInt();
                        while (student_Admitted_Month < 1 || student_Admitted_Month > 12) {
                            System.out.println("Not a valid hiring month.");
                            System.out.println("Enter Student's Admission Month:");
                            student_Admitted_Month = scanner.nextInt();
                        }
                        System.out.println("Enter Student's Admission Day:");
                        student_Admitted_Day = scanner.nextInt();
                        while (student_Admitted_Day < 1 || student_Admitted_Day > 31) {
                            System.out.println("Not a valid hiring day.");
                            System.out.println("Enter Student's Admission Day:");
                            student_Admitted_Day = scanner.nextInt();
                        }
                        System.out.println("Enter Student's Admission Year:");
                        student_Admitted_Year = scanner.nextInt();
                        while (student_Admitted_Year < 1) {
                            System.out.println("Not a valid hiring Year.");
                            System.out.println("Enter Student's Admission Year:");
                            student_Admitted_Year = scanner.nextInt();
                        }
                        boolean Class = true;
                        while (Class) { //Adding classes
                            System.out.println("Type in the course name:");
                            course = scanner.next();
                            System.out.println("Credits for the course:");
                            course_Credits = scanner.nextInt();
                            if (course_Credits < 0) {
                                while (course_Credits < 0) {
                                    System.out.println("Invalid value of credits,try again please");
                                    course_Credits = scanner.nextInt();
                                }
                            }
                            total_Price += course_Credits * 500; //Add this to the total price.
                            System.out.println("Add another Course:");
                            add_Course = scanner.nextInt(); //If yes,do so.
                            if (add_Course == 0) {
                                Class = false;
                            }
                        }
                        stu_Tally_A += 1; //Added a student
                        //Name the courses for the student
                        //Student A Courses
                        Course A = new Course(course, course_Credits, total_Price);
                        Course C = new Course(course, course_Credits, total_Price);
                        Course E = new Course(course, course_Credits, total_Price);
                        //Student B Courses
                        Course B = new Course(course, course_Credits, total_Price);
                        Course D = new Course(course, course_Credits, total_Price);
                        Course F = new Course(course, course_Credits, total_Price);
                        //Student C Courses
                        Course G = new Course(course, course_Credits, total_Price);
                        Course H = new Course(course, course_Credits, total_Price);
                        Course I = new Course(course, course_Credits, total_Price);
                        classes1[0] = A; //Title this as Course_A to first positiion.
                        classes1[1] = C;
                        classes1[2] = E;
                        classes2[0] = B; //Title this as Course_A to first positiion.
                        classes2[1] = D;
                        classes2[2] = F;
                        classes3[0] = G; //Title this as Course_G to first position for the 3rd advisee.
                        classes3[1] = H;
                        classes3[2] = I;
                        String student_Address = student_Street + "," + student_City + "," + student_State + "," + student_Zip;
                        double student_Tuition = total_Price + 1000; //Student Tuition sum
                        Date student_Admission = new Date(student_Admitted_Month, student_Admitted_Day, student_Admitted_Year);

                        for (Student n : student_A) {
                            n = new Student(student_F_Initial + student_M_Initial + student_L_Initial, student_ID);
                            n.setMajor(major_Student);
                            n.setAdmittedDate(student_Admission);
                            n.setTuition(student_Tuition);
                            n.setPhoneNum(student_Phone);
                            n.setEmail(student_Email);
                            n.setAddress(new Address(100, student_Street, student_City, student_State, student_Zip));
                            ArrayList<Course> list = new ArrayList<>();
                            Collections.addAll(list, classes1);
                            n.setCourses(list);
                        }
                        //Created 3 Students
                        System.out.println("Want to add in another Student:");
                        add_Student = scanner.nextInt();
                        if (add_Student == 0 || stu_Tally_A > 3) {
                            students = false; //No more adding students.
                        }
                    }
                    Date ad_Hired = new Date(ad_Hired_Month, ad_Hired_Day, ad_Hired_Year);
                    Advisor a = new Advisor(ad_F_Initial + ad_M_Initial + ad_L_Initial, acad_ID);
                    a.setPhoneNum(ad_Phone);
                    a.setEmail(adv_Email);
                    a.setAddress(new Address(100, ad_Street, ad_City, ad_State, ad_Zip));
                    ArrayList<Student> list = new ArrayList<>();
                    Collections.addAll(list, student_A);
                    a.setAdvisees(list);
                    a.setHiredDate(ad_Hired);
                    a.setTitle(ad_Title);
                    a.setAnnualSalary(ad_Salary);

                    heads[ad_Tally] = a; //First Advisor created;
                    ad_Tally += 1;
                    System.out.println("Advisor has been successfully added!Want to add another Advisor:");
                    input = scanner.nextInt();
                    if (input == 0 || ad_Tally > 3) {
                        advisors = false;
                    }
                }
            } else if (input == 2) {
                boolean advisors = true;
                boolean students = false; //Still not true for now
                boolean Class = false;
                Advisor a = searchAdvisor(scanner, heads);

                while (advisors) {
                    System.out.println("Please select a following field to edit");
                    System.out.println("1.Edit Advisor's first name:");
                    System.out.println("2.Edit Advisor's Middle name:");
                    System.out.println("3.Edit Advisor's Last name:");
                    System.out.println("4.Edit Advisor's Academic_ID:");
                    System.out.println("5.Edit Advisor's Phone number:");
                    System.out.println("6.Edit Advisor's Address:");
                    System.out.println("7.Edit Advisor's Title:");
                    System.out.println("8.Edit Advisor's Hiring Month:");
                    System.out.println("9.Edit Advisor's Hiring Day:");
                    System.out.println("10.Edit Advisor's Year:");
                    System.out.println("11.Edit Student List:");
                    System.out.println("12.Return to the main menu:");
                    edit_Op = scanner.nextInt(); //Choice 1-12;
                    if (edit_Op == 1) {
                        System.out.println("Type in the new first name:");
                        ad_F_Initial = scanner.next();
                        String[] parts = a.getName().split(" ");
                        a.setName(ad_F_Initial + parts[1] + parts[2]);
                        System.out.println("Updated First name Successfully!");
                    } else if (edit_Op == 2) {
                        System.out.println("Type in the new middle name:");
                        ad_M_Initial = scanner.next();
                        String[] parts = a.getName().split(" ");
                        a.setName(parts[0] + ad_M_Initial + parts[2]);
                        System.out.println("Updated Middle name Successfully!");
                        if (ad_M_Initial.equalsIgnoreCase("none")) {
                            ad_M_Initial = " "; //No middle name
                            System.out.println("Updated Middle name Successfully!");
                        }
                    } else if (edit_Op == 3) {
                        System.out.println("Type in the new surname:");
                        ad_L_Initial = scanner.next();
                        String[] parts = a.getName().split(" ");
                        a.setName(parts[0] + parts[1] + ad_L_Initial);
                        System.out.println("Updated Last name Successfully!");
                    } else if (edit_Op == 4) {
                        System.out.println("Type in the new Advisor ID:");
                        acad_ID = scanner.next();
                        a.setID(acad_ID);
                        System.out.println("Updated Advisor ID Successfully!");
                    } else if (edit_Op == 5) {
                        System.out.println("Type in the new Advisor Phone Number:");
                        ad_Phone = scanner.nextInt();
                        a.setPhoneNum(ad_Phone);
                        System.out.println("Updated Advisor Phone Number Successfully!");
                    } else if (edit_Op == 6) {
                        System.out.println("Type in the new Advisor Address,specifically which part:");
                        address_Edit = scanner.nextInt();
                        if (address_Edit == 1) {
                            System.out.println("Enter Advisor's new Street Number:");
                            ad_Street = scanner.next();
                            a.getAddress().setStreet(ad_Street);
                            System.out.println("Street Number updated successfully!");
                        } else if (address_Edit == 2) {
                            System.out.println("Enter Advisor's new City:");
                            ad_City = scanner.next();
                            a.getAddress().setTown(ad_City);
                            System.out.println("City name updated successfully!");
                        } else if (address_Edit == 3) {
                            System.out.println("Enter Advisor's new State:");
                            ad_Street = scanner.next();
                            a.getAddress().setState(student_State);
                            System.out.println("State updated successfully!");
                        } else if (address_Edit == 4) {
                            System.out.println("Enter Advisor's new ZIPCODE:");
                            ad_Zip = scanner.nextInt();
                            a.getAddress().setZip_code(ad_Zip);
                            System.out.println("Zipcode updated successfully!");
                        } else if (address_Edit == 0) {
                            System.out.println("Bye Bye.");
                        } else {
                            while (address_Edit < 1 && address_Edit > 4) {
                                System.out.println("Type in the new Advisor Address,specifically which part:");
                                address_Edit = scanner.nextInt();
                            }
                        }
                    } else if (edit_Op == 7) {
                        System.out.println("Enter Advisor's new Title.");
                        ad_Title = scanner.next();
                        a.setTitle(ad_Title);
                        System.out.println("Title Updated Successfully.");
                    } else if (edit_Op == 8) {
                        System.out.println("Enter Advisor's updated Hiring Month:");
                        ad_Hired_Month = scanner.nextInt();
                        if (ad_Hired_Month < 1 || ad_Hired_Month > 12) {
                            while (ad_Hired_Month < 1 || ad_Hired_Month > 12) {
                                System.out.println("Not a valid hiring month.");
                                System.out.println("Enter Advisor's updated Hiring Month:");
                                ad_Hired_Month = scanner.nextInt();
                            }
                        }
                        a.getHiredDate().setMonth(ad_Hired_Month);
                    } else if (edit_Op == 9) {
                        System.out.println("Enter Advisor's updated Hiring Day:");
                        ad_Hired_Day = scanner.nextInt();
                        if (ad_Hired_Day < 1 || ad_Hired_Day > 31) {
                            while (ad_Hired_Day < 1 || ad_Hired_Day > 31) {
                                System.out.println("Not a valid hiring Day.");
                                System.out.println("Enter Advisor's updated Hiring day:");
                                ad_Hired_Day = scanner.nextInt();
                            }
                        }
                        a.getHiredDate().setDate(ad_Hired_Day);
                    } else if (edit_Op == 10) {
                        System.out.println("Enter Advisor's updated Hiring Year:");
                        ad_Hired_Year = scanner.nextInt();
                        if (ad_Hired_Day < 1 || ad_Hired_Day > 31) {
                            while (ad_Hired_Year < 1970) {
                                System.out.println("Not a valid hiring Year.");
                                System.out.println("Enter Advisor's Hiring Year:");
                                ad_Hired_Year = scanner.nextInt();
                            }
                        }
                        a.getHiredDate().setYear(ad_Hired_Year);
                    } else if (edit_Op == 11) {
                        students = true; //We may now add a student or so to the list.
                        Student s = searchStudent(scanner, a.getAdvisees().toArray(new Student[0]));
                        while (students) { //Going to add a student to the list of advisees.
                            System.out.println("Please select a following field to edit");
                            System.out.println("1.Edit Student's first name:");
                            System.out.println("2.Edit Student's Middle name:");
                            System.out.println("3.Edit Student's Last name:");
                            System.out.println("4.Edit Student's Academic_ID:");
                            System.out.println("5.Edit Student's Phone number:");
                            System.out.println("6.Edit Student's Address:");
                            System.out.println("7.Edit Student's Title:");
                            System.out.println("8.Edit Student's Admission Month:");
                            System.out.println("9.Edit Student's Admission Day:");
                            System.out.println("10.Edit Student's Admission:");
                            System.out.println("11.Return to the main menu:");
                            stu_Edit = scanner.nextInt();
                            if (stu_Edit == 1) {
                                System.out.println("Type in the new first name:");
                                student_F_Initial = scanner.next();
                                String[] parts = s.getName().split(" ");
                                a.setName(student_F_Initial + parts[1] + parts[2]);
                                System.out.println("Updated First name Successfully!");
                            } else if (stu_Edit == 2) {
                                System.out.println("Type in the new middle name:");
                                student_M_Initial = scanner.next();
                                String[] parts = s.getName().split(" ");
                                a.setName(parts[0] + student_M_Initial + parts[2]);
                                System.out.println("Updated Student Middle name Successfully!");
                                if (student_M_Initial.equalsIgnoreCase("none")) {
                                    student_M_Initial = " "; //No middle name
                                    System.out.println("Updated Middle name Successfully!");
                                }
                            } else if (stu_Edit == 3) {
                                System.out.println("Type in the new surname:");
                                student_L_Initial = scanner.next();
                                String[] parts = s.getName().split(" ");
                                a.setName(parts[0] + parts[1] + student_L_Initial);
                                System.out.println("Updated Last name Successfully!");
                            } else if (stu_Edit == 4) {
                                System.out.println("Type in the new Student ID:");
                                student_ID = scanner.next();
                                s.setID(student_ID);
                                System.out.println("Updated Advisor ID Successfully!");
                            } else if (stu_Edit == 5) {
                                System.out.println("Type in the new Student Phone Number:");
                                student_Phone = scanner.nextInt();
                                s.setPhoneNum(student_Phone);
                                System.out.println("Updated Student Phone Number Successfully!");
                            } else if (stu_Edit == 6) {
                                System.out.println("Type in the new Student Address,specifically which part:");
                                address_Edit = scanner.nextInt();
                                if (address_Edit == 1) {
                                    System.out.println("Enter Student's new Street Number:");
                                    student_Street = scanner.next();
                                    s.getAddress().setStreet(student_Street);
                                    System.out.println("Street NNumber updated successfully!");
                                } else if (address_Edit == 2) {
                                    System.out.println("Enter Student's new City:");
                                    student_City = scanner.next();
                                    s.getAddress().setTown(student_City);
                                    System.out.println("City name updated successfully!");
                                } else if (address_Edit == 3) {
                                    System.out.println("Enter Student's new State:");
                                    student_State = scanner.next();
                                    s.getAddress().setState(student_State);
                                    System.out.println("State updated successfully!");
                                } else if (address_Edit == 4) {
                                    System.out.println("Enter Student's new ZIPCODE:");
                                    student_Zip = scanner.nextInt();
                                    s.getAddress().setZip_code(student_Zip);
                                    System.out.println("Zipcode updated successfully!");
                                } else if (address_Edit == 0) {
                                    System.out.println("Bye Bye.");
                                } else {
                                    while (address_Edit < 1 && address_Edit > 4) {
                                        System.out.println("Type in the new Student Address,specifically which part:");
                                        address_Edit = scanner.nextInt();
                                    }
                                }
                            } else if (stu_Edit == 7) {
                                System.out.println("Enter Student's Major:");
                                major_Student = scanner.next();
                                s.setMajor(major_Student);
                                System.out.println("Updated major successfully!");
                            } else if (stu_Edit == 8) {
                                System.out.println("Enter Student's Admission Month:");
                                student_Admitted_Month = scanner.nextInt();
                                if (student_Admitted_Month < 1 || student_Admitted_Month > 12) {
                                    while (student_Admitted_Month < 1 || student_Admitted_Month > 12) {
                                        System.out.println("Not a valid admission month.");
                                        System.out.println("Enter Student's Admission Month:");
                                        student_Admitted_Month = scanner.nextInt();
                                    }
                                }
                                s.getAdmittedDate().setMonth(student_Admitted_Month);
                                System.out.println("Updated the Month successfully.");
                            } else if (stu_Edit == 9) {
                                System.out.println("Enter Student's Admission Day:");
                                student_Admitted_Day = scanner.nextInt();
                                if (student_Admitted_Day < 1 || student_Admitted_Day > 31) {
                                    while (student_Admitted_Day < 1 || student_Admitted_Day > 31) {
                                        System.out.println("Not a valid admission Day.");
                                        System.out.println("Enter Student's Admission Day:");
                                        student_Admitted_Day = scanner.nextInt();
                                    }
                                }
                                s.getAdmittedDate().setDate(student_Admitted_Day);
                                System.out.println("Updated the Month successfully.");
                            } else if (stu_Edit == 10) {
                                System.out.println("Enter Student's Admission Year:");
                                student_Admitted_Year = scanner.nextInt();
                                if (student_Admitted_Year < 1) {
                                    while (student_Admitted_Year < 1) {
                                        System.out.println("Not a valid hiring Year.");
                                        System.out.println("Enter Student's Admission Year:");
                                        student_Admitted_Year = scanner.nextInt();
                                    }
                                }
                                s.getAdmittedDate().setYear(student_Admitted_Year);
                                System.out.println("Updated the Month successfully.");
                            } else if (stu_Edit == 11) {
                                System.out.println("Updated info successfully,bye bye."); //Ending the program editing
                                students = false;
                            }
                        }
                    } else if (edit_Op == 12) {
                        advisors = false;
                    }
                }
            } else if (input == 3) {
                boolean advisors = true;
                while (advisors) {
                    System.out.println("Enter the ID for the Advisor:");
                    acad_ID = scanner.next();
                    int deletion_index = -1;

                    //We now loop through the list of Advisors,Heads;
                    try {
                        for (int i = 0; i <= heads.length; i++) {
                            if (heads[i].getID() == acad_ID) {
                                deletion_index = i;
                                break;
                            }
                        }

                        for (int i = deletion_index; i < heads.length - 1; i++) {
                            heads[i] = heads[i++];
                        }
                        heads[heads.length - 1] = null;
                        System.out.println("Advisor was deleted.");

                    } catch (ArrayIndexOutOfBoundsException e) {
                        System.out.println("Advisor could not be found");
                    }

                    System.out.println("Search for another advisor? :");
                    search = scanner.nextInt();
                    if (search == 0) {
                        advisors = false; //Exit function
                    }
                }
            } else if (input == 4) {
                boolean advisors = true;
                while (advisors) {
                    Advisor a = null;
                    try {
                        a = searchAdvisor(scanner, heads);
                        a.Display();
                    } catch (NullPointerException e) {
                        System.out.println("Advisor was not found");
                    }

                    System.out.println("Search for another advisor? :");
                    search = scanner.nextInt();
                    if (search == 0) {
                        advisors = false; //Exit function
                    }
                }
            } else if (input == 5) {
                System.out.print("Thanks for using this app. Bye-bye.");
                work = false;
            }
        }
    }

    private static Advisor searchAdvisor(Scanner scanner, Advisor[] heads) {
        String acad_ID;
        System.out.println("Enter the ID for the Advisor:");
        acad_ID = scanner.next();
        Advisor a = null;

        //We now loop through the list of Advisors,Heads;
        for (Advisor n : heads) {
            if (n.getID().equals(acad_ID)) {
                a = n;
            }
        }

        return a;
    }

    private static Student searchStudent(Scanner scanner, Student[] students) {
        String acad_ID;
        System.out.println("Enter the ID for the Student:");
        acad_ID = scanner.next();
        Student s = null;

        //We now loop through the list of Advisors,Heads;
        for (int i = 0; i <= students.length; i++) {
            if (students[i].getID() == acad_ID) {
                s = students[i];
            }
        }

        return s;
    }
}