package w3;

public class TestPassingParameter {

    public static void main(String[] args){
        DigitalVideoDisc jungledvd = new DigitalVideoDisc("Jungle");
        DigitalVideoDisc cinderelladvd = new DigitalVideoDisc("Cinderella");

        swap(jungledvd, cinderelladvd);
        System.out.println("jungle dvd title: " + jungledvd.getTitle());
        System.out.println("cinderella dvd title: " + cinderelladvd.getTitle());

        changeTitle(jungledvd, cinderelladvd.getTitle());

        System.out.println("jungle dvd title: " + jungledvd.getTitle());

    }

    public static void swap(Object x1, Object x2){
        Object tmp = x1;
        x1 = x2;
        x2 = tmp;
    }

    public static void changeTitle(DigitalVideoDisc dvd, String title){
        String oldTitle = dvd.getTitle();
        dvd.setTitle(title);
        dvd = new DigitalVideoDisc(oldTitle);
        
    }

}
