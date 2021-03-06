public class Main {
    public static void main(String[] args) {
		/*Знаешь, нужно быть не просто хорошим программистом чтобы написать систему, 
		подобную Linux. Нужно быть ещё и хитрой сволочью.  Линус Торвальдс
		
		Кофе не помогает программировать, зато он приятен на вкус. Джеймс Гослинг
		*/
        Specialist specTanya = new Specialist("Tanya",25,700,1);
        Specialist specDima = new Specialist("Dmitrii",22,800,2);
        Specialist specEvgen = new Specialist("Evgenii",27,1000,3);

        Developer [] coders = new Developer[4];
        coders[0] = new Developer("Chingiz",18,400,"Junior");
        coders[1]= new Developer("Artem",20,1200,"Middle");
        coders[2]= new Developer("Bektur",24,1400,"Middle");
        coders[3]= new Developer("Temir",33,2000,"Senior");

        Manager managerOlga = new Manager("Olga",30,1300,false);
        Manager managerOleg = new Manager("Oleg",29,1600,true);
        Ceo ceo=new Ceo("Nick",41,2400,false,true);

        specTanya.print();
        specTanya.workWithClients();
        specDima.print();
        specDima.workWithClients();
        specEvgen.print();
        specEvgen.workWithClients();
        System.out.println();

        for (Developer coder:coders){
            coder.print();
            coder.writeCode();
        }
        System.out.println();

        managerOleg.print();
        managerOleg.writeProcedures();
        managerOlga.print();
        managerOlga.writeProcedures();
        System.out.println();

        ceo.print();
        ceo.goPublic();
    }
}
