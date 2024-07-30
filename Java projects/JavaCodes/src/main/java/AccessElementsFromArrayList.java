import java.util.ArrayList;
import java.util.List;
public class AccessElementsFromArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String>topCompanies = new ArrayList<>();
		System.out.println("Is the topCompanies list is emppty:?"+topCompanies.isEmpty());
		topCompanies.add("Google");
		topCompanies.add("Microsoft");
		topCompanies.add("Apple");
		topCompanies.add("Amazon");
		topCompanies.add("Facebook");
		
		System.out.println("Here are the top"+topCompanies.size()+"companies in the world");
		String bestCompany = topCompanies.get(0);
        String secondBestCompany = topCompanies.get(1);
        String lastCompany = topCompanies.get(topCompanies.size() - 1);
        
        System.out.println("The Best Company is:"+bestCompany);
        System.out.println("The secondBestCompany is:"+secondBestCompany);
        System.out.println("The last company is:"+lastCompany);
        
        topCompanies.set(4,"Walmart");
        System.out.println(topCompanies);
        
        topCompanies.remove(4);
        System.out.println(topCompanies);
        
     //  topCompanies.removeAll(topCompanies);
     // System.out.println(topCompanies);
     
        
        System.out.println("Does any company name Google contain in the list?"+ topCompanies.contains("Google"));
        
        System.out.println("The index of amazon compnay in the list:"+topCompanies.indexOf("Amazon"));
        
        
		

	}

}
