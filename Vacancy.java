package Homework7;

public class Vacancy{

    private  double maxSalary;
    private Type vacancyType;


    public Vacancy(double maxSalary, Type vacancyType) {
        this.maxSalary = maxSalary;
        this.vacancyType = vacancyType;
    }
    public double getMaxSalary() {
        return maxSalary;
    }
    public void setMaxSalary(double maxSalary) {
        this.maxSalary = maxSalary;
    }
    public String getVacancyType() {
        return vacancyType.toString();
    }
    public void setVacancyType(Type vacancyType) {
        this.vacancyType = vacancyType;
    }
    

enum Type {

    Accounter,
    Manager,
    Worker,
    Junior;
}


@Override
public String toString() {
    return String.format("Vacancy: maxSalary= %.0f, vacancyType=%s", getMaxSalary(), getVacancyType());
}

}