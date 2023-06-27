package Homework7;

import java.util.Random;

import Homework7.Vacancy.Type;

public class Program {

    /**
     * TODO: 1.Доработать приложение, поработать с шаблоном проектирования Observer
     *   добавить новый тип соискателя.
     *   **.2 Добавить новую сущность "Вакансия", компания должна рассылать вакансии.
     *   **.3 Предусмотреть тип вакансии (enum)
     * @param args
     */
    public static void main(String[] args) {

        JobAgency jobAgency = new JobAgency();

        // Student student1 = new Student("A");
        // Object student2 = new Student("B");
        // Observer student3 = new Student("C");

        final Random random = new Random();

        final Type[] vacancies = Type.values();
        //Type vacancyType = vacancies[Random];
        Vacancy vacancy1 = new Vacancy(random.nextDouble(90000, 150000), vacancies[random.nextInt(0, 3)]);
        Vacancy vacancy2 = new Vacancy(random.nextDouble(90000, 150000), vacancies[random.nextInt(0, 3)]);
        Vacancy vacancy3 = new Vacancy(random.nextDouble(90000, 150000), vacancies[random.nextInt(0, 3)]);

        Company geekBrains = new Company("GeekBrains",jobAgency, vacancy1);
        Company google = new Company("Google", jobAgency, vacancy2);
        Company yandex = new Company("Yandex", jobAgency, vacancy3);

        Master ivanov = new Master("Ivanov");
        Master petrov = new Master("Petrov");
        Student sidorov = new Student("Sidorov");
        Accounter nikitin = new Accounter("Nikitin");

        jobAgency.registerObserver(ivanov);
        jobAgency.registerObserver(petrov);
        jobAgency.registerObserver(sidorov);
        jobAgency.registerObserver(nikitin);


        for (int i = 0; i < 5; i++){
            System.out.println(vacancy1.toString()+ "\n");
            geekBrains.needEmployee();
            System.out.println();
            System.out.println(vacancy2.toString() + "\n");
            google.needEmployee();
            System.out.println();
            System.out.println(vacancy3.toString()+ "\n");
            yandex.needEmployee();
            System.out.println();
        }

    }

}
