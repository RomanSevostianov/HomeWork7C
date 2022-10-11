public class Main {
    public static void main(String[] args) {
        int salary = 15000;
        int general = 0;
        int percentages = 100;
        int counter = 0;
        while (general <= 2459000) {
            general = general + salary;
            general = (general / percentages) + general;
            counter++;
        }
        System.out.println("Необходимо " + counter + " месяцев для накопления 2459000 руб");
        int i = 0;
        while (i < 10) {
            i++;
            System.out.print(i + " ");
        }
        System.out.print("\n");
        for (int p = 10; p >= 1; p--)
            System.out.print(p + " ");

        int populationSize = 12000000;
        int birthRate = 17; //рождаемость
        int mortality = 8; //смертность
        int generalPopulation1;
        int generalPopulation2;
        int fP;
        generalPopulation1 = ((populationSize / 1000) * birthRate) * 10;
        generalPopulation2 = ((populationSize / 1000) * mortality) * 10;
        System.out.print("\n");
        fP = generalPopulation1 - generalPopulation2;
        System.out.println("За 10 лет население выростит на " + fP + " человек");


        int vasy = 15000;
        int bank = 12000000;
        int savings = 0;
        int month = 0;
        while (savings <= bank) {
            savings = savings + vasy;
            savings = ((savings / 100) * 7) + savings;
            month++;
            if (month%6==0)
                System.out.println("За "+month +" месяцев, накоплений "+savings+" руб");
        }
        System.out.println("Василию необходимо "+month+" месяцев, для того чтобы накопить 12000000 рублей");

        int savings1=0;

        for (int t=1; t<=108;t++)
        {
            savings1 = savings1 + 15000;
            savings1 = ((savings1 / 100) * 7) + savings1;

            if (t%6==0)
                System.out.println("За "+t+" месяц Василий накопил "+savings1+" руб");
        }
        int friday=7;
        for (int fr=1; fr<=31; fr++)
        {
            if (fr%friday==0)
                System.out.println("Сегодня пятница, "+fr+" число. Необходимо отправить отчет");
        }

        int curent=2022; // текущий год
        int past =200; // прошедший
        int future =100;

        for (int k=curent-past; k<=curent+future;k++)
        {
            if (k%79==0)
                System.out.println(k+" пролетает комета ");


        }

        int u;
        int j=2;
        for (int tab=1; tab<=10; tab++)
        {
            u=j*tab;
            System.out.println("2*"+tab+"="+u);
        }

    }
}