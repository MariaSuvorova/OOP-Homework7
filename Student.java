package Homework7;

import java.util.Random;

public class Student implements Observer {

    private static Random random = new Random();

    private String name;

    private double minSalary;

    public Student(String name) {
        this.name = name;
        minSalary = random.nextDouble(50000, 80000);
    }

    @Override
    public void receiveOffer(String nameCompany, Vacancy vacancy) {
        if ((vacancy.getVacancyType().equals("Junior")||vacancy.getVacancyType().equals("Worker")) & minSalary <= vacancy.getMaxSalary()){
            System.out.printf("Студент %s (%.0f) >>> Мне нужна эта работа! (%s - %.0f)\n",
                    name, minSalary, nameCompany, vacancy.getMaxSalary());
        }
        else if((vacancy.getVacancyType().equals("Junior")||vacancy.getVacancyType().equals("Worker"))==false){
            System.out.printf("Студент %s (%.0f) >>> Не подходящая квалификация! (%s - %s)\n",
                    name, minSalary, nameCompany, vacancy.getVacancyType());
        }
        else{
            System.out.printf("Студент %s (%.0f) >>> Я найду работу получше! (%s - %.0f)\n",
                    name, minSalary, nameCompany, vacancy.getMaxSalary());
        }
    }
}
