package Homework7;

import java.util.Random;

public class Master implements Observer {

    private static Random random = new Random();

    private String name;

    private double minSalary;

    public Master(String name) {
        this.name = name;
        minSalary = random.nextDouble(80000, 140000);
    }

    @Override
    public void receiveOffer(String nameCompany, Vacancy vacancy) {
        if ((vacancy.getVacancyType().equals("Manager") || vacancy.getVacancyType().equals("Worker")) & minSalary <= vacancy.getMaxSalary()){
            System.out.printf("Мастер %s (%.0f) >>> Мне нужна эта работа! (%s - %.0f)\n",
                    name, minSalary, nameCompany, vacancy.getMaxSalary());
        }
        else if((vacancy.getVacancyType().equals("Manager") || vacancy.getVacancyType().equals("Worker"))==false){
            System.out.printf("Мастер %s (%.0f) >>> Не подходящая специализация! (%s - %s)\n",
                    name, minSalary, nameCompany, vacancy.getVacancyType());
        }
        else{
            System.out.printf("Мастер %s (%.0f) >>> Я найду работу получше! (%s - %.0f)\n",
                    name, minSalary, nameCompany, vacancy.getMaxSalary());
        }
    }

}
