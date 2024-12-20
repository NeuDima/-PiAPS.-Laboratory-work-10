package ru.vsu.cs;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main {

    public static void main(String[] args) throws ParseException {
        Faculty FCS = new Faculty("Faculty of Computer Science");
        Institute SE = new Institute("Software engineering", "University square, 1");
        Institute ISAT = new Institute("Information systems and technologies", "University square, 1");
        FCS.setInstitutes(new Institute[]{SE, ISAT});

        ResearchAssociate employee1 = new ResearchAssociate(1, "Willy Wonka", "willywonka@gmail.com", "SE");
        ResearchAssociate employee2 = new ResearchAssociate(2, "Jack Sparrow", "jacksparrow@mail.com", "SE");
        ResearchAssociate employee3 = new ResearchAssociate(3, "Tony Stark", "tonystark@gmail.com", "ISAT");
        ResearchAssociate employee4 = new ResearchAssociate(4, "Mark Zuckerberg", "markzuckerberg@gmail.com", "ISAT");
        SE.setEmployees(new ResearchAssociate[]{employee1, employee2});
        ISAT.setEmployees(new ResearchAssociate[]{employee3, employee4});

        Project project1 = new Project("Facebook",
                new SimpleDateFormat( "dd.MM.yyyy" ).parse( "10.02.2004" ),
                new SimpleDateFormat( "dd.MM.yyyy" ).parse( "31.12.2024" ), new Participation(5));
        employee1.setProjects(new Project[]{project1});

        Course course1 = new Course("computer graphics", 111, 60);
        Lecturer lecturer1 = new Lecturer(1, "Willy Wonka", "willywonka@gmail.com", "SE");
        lecturer1.setCourses(new Course[]{course1});

        AdministrativeEmployee administrativeEmployee = new AdministrativeEmployee(6,
                "Jack Sparrow", "jacksparrow@gmail.com", "admin");

        Institute[] institutes = FCS.getInstitutes();
        System.out.println("Institutes on " + FCS.getName() + ": \n");
        for (Institute institute : institutes) {
            System.out.println(institute.getName());
        }
        System.out.println();

        ResearchAssociate[] researchEconomy = SE.getEmployees();
        System.out.println("Research Associates on " + SE.getName() + ": \n");
        for (ResearchAssociate researchAssociate : researchEconomy) {
            System.out.println(researchAssociate.getName());
        }
        System.out.println();

        ResearchAssociate[] researchFinance = ISAT.getEmployees();
        System.out.println("Research Associates on " + ISAT.getName() + ": \n");
        for (ResearchAssociate researchAssociate : researchFinance) {
            System.out.println(researchAssociate.getName());
        }
        System.out.println();

        Project[] projects = employee1.getProjects();
        System.out.println("Projects of " + employee1.getName() + ": \n");
        for (Project project : projects) {
            System.out.println(project.getName());
        }
        System.out.println();

        Course[] courses = lecturer1.getCourses();
        System.out.println("Courses of " + lecturer1.getName() + ": \n");
        for (Course course : courses) {
            System.out.println(course.getName());
        }
        System.out.println();
        System.out.println("Admin:");
        System.out.println();
        System.out.println(administrativeEmployee.getName());
    }
}
