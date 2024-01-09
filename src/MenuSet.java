import java.util.HashMap;
import java.util.Map;

public class MenuSet {
    Map<String, Menu> shakeshackMenu = new HashMap<>();
    String[] menuname;
    public void getShakeshackMenu(){
        shakeshackMenu.put("Beer", new Menu("Beer", "뉴욕 브루클린 브루어리에서 양조한 맥주"));
        shakeshackMenu.put("Drinks", new Menu("Drinks", "매장에서 직접 만드는 음료"));
        shakeshackMenu.put("Forzen Custard", new Menu("Forzen Custard", "매장에서 신선하게 만드는 아이스크림"));
        shakeshackMenu.put("Burgers", new Menu("Burgers", "앵거스 비프 통살을 다져만든 버거"));
        menuname = new String[] {"Burgers", "Drinks", "Forzen Custard", "Beer"};
    }
    Map<String, Menu> orderMenu = new HashMap<>();
    Map<String, Menu> getOrderMenu(){
        orderMenu.put("Cancle", new Menu("Cancle", "진행중인 주문을 취소합니다."));
        orderMenu.put("Order", new Menu("Order", "장바구니를 확인 후 주문합니다."));
        return orderMenu;
    }
    Map<String, Item> burgerItem = new HashMap<>();
    String[] menuname_burgers;
    public void getBurgerItem(){
        burgerItem.put("ShackBurger",new Item("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        burgerItem.put("SmokeShack",new Item("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        burgerItem.put("Shroom Burger",new Item("Shroom Burger", 9.4, "몬스터 치즈와 체다 치즈로 속을 채운 베지테리안 버거"));
        burgerItem.put("Cheeseburger",new Item("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        burgerItem.put("Hamburger",new Item("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거"));
        menuname_burgers = new String[]{"ShackBurger", "SmokeShack", "Shroom Burger", "Cheeseburger", "Hamburger"};
    }
    Map<String, Item> custardItem = new HashMap<>();
    String[] menuname_custard;
    public void getCustardItem(){
        custardItem.put("Shakes", new Item("Shakes", 5.9, "바닐라, 초콜렛, 솔티드 카라멜, 커피"));
        custardItem.put("Shake of the Week", new Item("Shake of the Week", 6.5, "특별한 커스터드 플레이버"));
        custardItem.put("Red Bean Shake", new Item("Red Bean Shake", 6.5, "신선한 커스터드와 함께 우유와 레드빈이 블렌딩 된 시즈널 쉐이크"));
        custardItem.put("Floats", new Item("Floats", 5.9, "루트비어, 퍼플 카우, 크림시클"));
        menuname_custard = new String[]{"Shakes","Shake of the Week","Red Bean Shake","Floats"};
    }
    Map<String, Item> drinksItem = new HashMap<>();
    String[] menuname_drinks;
    public void getDrinksItem(){
        drinksItem.put("Fountain Soda", new Item("Fountain Soda", 2.7, "코카콜라, 코카콜라 제로, 스프라이트, 환타 오렌지, 환타 그레이프"));
        drinksItem.put("Fifty/Fifty", new Item("Fifty/Fifty", 3.5, "레몬에이드와 아이스티의 만남"));
        drinksItem.put("Fresh Brewed Iced Tea", new Item("Fresh Brewed Iced Tea", 3.4, "직접 유기농 홍차를 우려낸 아이스티"));
        drinksItem.put("Shack-made Lemonade", new Item("Shack-made Lemonade", 3.9, "매장에서 직접만드는 상큼한 레몬에이드"));
        menuname_drinks = new String[] {"Shack-made Lemonade","Fresh Brewed Iced Tea","Fifty/Fifty","Fountain Soda"};
    }
    Map<String, Item> beerItem = new HashMap<>();
    String[] menuname_beer;
    public void getBeerItem(){
        beerItem.put("ShackMeister Ale", new Item("ShackMeister Ale", 9.8, "쉐이크쉑 버거를 위해 뉴욕 브루쿨린 브루어리에서 특별히 양조한 에일 맥주"));
        beerItem.put("Magpie Brewing Co.", new Item("Magpie Brewing Co.", 6.8, ""));
        menuname_beer = new String[] {"ShackMeister Ale","Magpie Brewing Co."};
    }
    Map<String, Item> allItem = new HashMap<>();
    public Map<String, Item> putAll(){
        allItem.putAll(burgerItem);
        allItem.putAll(custardItem);
        allItem.putAll(drinksItem);
        allItem.putAll(beerItem);
        return allItem;
    }
}
