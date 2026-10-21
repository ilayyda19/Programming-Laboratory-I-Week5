package labweek_5;


public class LabWeek_5 {

    
    public static void main(String[] args) {
        
        Package p = new Package("Ayse Yılmaz", "Atatürk Cad.", "Kadıkçöy", "İstanbul", "34890", "Mehmet Demir", "Cumhuriyet Mah.", "Çankaya", "Ankara","0619257", 2.5, 75);
        TwoDayPackage t = new TwoDayPackage(15,"Ahmet Gun", "İnönü Bulv.", "Konak", "İzmir", "35220", "Fatma Çelik", "Gazi Cad.", "Muratpaşa", "Antalya", "07100", 0.4, 45);
        OvernightPackage o = new OvernightPackage(2, "Zeynep Arslan", "Moda Cad.", "Kadıköy","İstanbul", "349885","Burak Sahin", "Fahrikayahan Bulv.", "Mev", "Malatya", "441655", 0.5, 50);
        
        System.out.println(p);
        System.out.println("--------------------------");
        System.out.println(t);
        System.out.println("--------------------------");
        System.out.println(o);
                
    }
    
}
