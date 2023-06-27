package Homework7;

import java.util.Random;

public class Company {

    private static Random random = new Random();
    private String nameCompany;
    //private  double maxSalary;
    private Vacancy vacancy;

    private Publisher jobAgency;

    public Company(String nameCompany, Publisher jobAgency, Vacancy vacancy) {
        this.nameCompany = nameCompany;
        //this.maxSalary = maxSalary;
        this.jobAgency = jobAgency;
        this.vacancy = vacancy;
    }

    public void needEmployee(){
        jobAgency.sendOffer(nameCompany, vacancy);
    }

}
