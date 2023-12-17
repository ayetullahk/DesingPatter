package BehavioralDP.ObserverDP;

import java.util.ArrayList;
import java.util.List;

public class NewsChannel implements Channel{

    private List<String> newList=new ArrayList<>();
    @Override
    public void update(String news) {
        newList.add(news);

    }

    @Override
    public void printNews() {
       for (String news:newList){
           System.out.println(news);
       }
    }
}
