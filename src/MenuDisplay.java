import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;
public class MenuDisplay extends MenuSet{
    public Scanner sc = new Scanner(System.in);
    public ArrayList<Item> cart = new ArrayList<>();
    public String input(){
        System.out.print("입력: ");
        String input = sc.nextLine();
        return input;
    }
    public void firstdisplay(){
        System.out.println("SHAKESHACK BURGER 에 오신걸 환영합니다.");
        System.out.println("아래 메뉴판을 보시고 메뉴를 골라 입력해주세요.");
        System.out.println();
        printshakeshackMenu();
        printorderMenu();
        inputMenu();
    }
    public void printshakeshackMenu(){
        System.out.println("[ SHAKESHACK MENU ]");
        int num = 1;
        getShakeshackMenu();
        for (String category : menuname){
            Menu menu = shakeshackMenu.get(category);
            System.out.println(num++ + ". " + menu.name + " | " + menu.discription);
        }
        System.out.println();
    }
    public void printorderMenu(){
        System.out.println("[ ORDER MENU ]");
        int num = 5;
        for (Menu menu : getOrderMenu().values()){
            System.out.println(num++ + ". " + menu.name + " | " + menu.discription);
        }
        System.out.println();
    }
    public void printBurgersMenu(){
        System.out.println("SHAKESHACK BURGER 에 오신걸 환영합니다.");
        System.out.println("아래 상품메뉴판을 보시고 상품을 골라 입력해주세요.");
        System.out.println();
        System.out.println("[ Burgers MENU ]");
        getBurgerItem();
        int num = 1;
        for (String burger : menuname_burgers){
            Item item = burgerItem.get(burger);
            System.out.println(num++ + ". " + item.name + " | " + item.discription);
        }
        System.out.println();
        choice();
    }
    public void printDrinkMenu(){
        System.out.println("SHAKESHACK BURGER 에 오신걸 환영합니다.");
        System.out.println("아래 상품메뉴판을 보시고 상품을 골라 입력해주세요.");
        System.out.println();
        System.out.println("[ Drinks MENU ]");
        getDrinksItem();
        int num = 1;
        for (String drink : menuname_drinks){
            Item item = drinksItem.get(drink);
            System.out.println(num++ + ". " + item.name + " | " + item.discription);
        }
        System.out.println();
        choice();
    }
    public void printCustardMenu(){
        System.out.println("SHAKESHACK BURGER 에 오신걸 환영합니다.");
        System.out.println("아래 상품메뉴판을 보시고 상품을 골라 입력해주세요.");
        System.out.println();
        System.out.println("[ Forzen Custard MENU ]");
        getCustardItem();
        int num = 1;
        for (String custard : menuname_custard ){
            Item item = custardItem.get(custard);
            System.out.println(num++ + ". " + item.name + " | " + item.discription);
        }
        System.out.println();
        choice();
    }
    public void printBeerMenu(){
        System.out.println("SHAKESHACK BURGER 에 오신걸 환영합니다.");
        System.out.println("아래 상품메뉴판을 보시고 상품을 골라 입력해주세요.");
        System.out.println();
        System.out.println("[ Beer MENU ]");
        getBeerItem();
        int num = 1;
        for (String beer : menuname_beer){
            Item item = beerItem.get(beer);
            System.out.println(num++ + ". " + item.name + " | " + item.discription);
        }
        System.out.println();
        choice();
    }
    public void inputMenu(){
        String input = input();
        switch (input){
            case "Burgers": printBurgersMenu();
                break;
            case "Forzen Custard": printCustardMenu();
                break;
            case "Drinks": printDrinkMenu();
                break;
            case "Beer": printBeerMenu();
                break;
            case "Order": orderBefore();
                break;
            case "Cancle": cancleprogress();
                break;
        }
    }
    public void menuchoice(String menuinput){
        Item menuchoice = putAll().get(menuinput);
        System.out.println(menuchoice.name + " | " + "W "+ menuchoice.price +" | " + menuchoice.discription);
        System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
        System.out.println("1. 확인             2. 취소");
        String yesOrno = input();
        if (yesOrno.equals("확인")){
            cartadd(menuchoice);
        } else if (yesOrno.equals("취소")){
            firstdisplay();
        }
    }
    public void cartadd(Item menuchoice){
        cart.add(menuchoice);
        System.out.println(menuchoice.name + "가 장바구니에 추가되었습니다.");
        System.out.println();
        firstdisplay();
    }
    public void choice(){
        String choice = input();
        switch (choice) {
            case "ShackBurger":
                menuchoice("ShackBurger");
                break;
            case "SmokeShack":
                menuchoice("SmokeShack");
                break;
            case "Shroom Burger":
                menuchoice("Shroom Burger");
                break;
            case "Cheeseburger":
                menuchoice("Cheeseburger");
                break;
            case "Hamburger":
                menuchoice("Hamburger");
                break;
            case "Shakes":
                menuchoice("Shakes");
                break;
            case "Shake of the Week":
                menuchoice("Shake of the Week");
                break;
            case "Red Bean Shake":
                menuchoice("Red Bean Shake");
                break;
            case "Floats":
                menuchoice("Floats");
                break;
            case "Shack-made Lemonade":
                menuchoice("Shack-made Lemonade");
                break;
            case "Fresh Brewed Iced Tea":
                menuchoice("Fresh Brewed Iced Tea");
                break;
            case "Fifty/Fifty":
                menuchoice("Fifty/Fifty");
                break;
            case "Fountain Soda":
                menuchoice("Fountain Soda");
                break;
            case "ShackMeister Ale":
                menuchoice("ShackMeister Ale");
                break;
            case "Magpie Brewing Co.":
                menuchoice("Magpie Brewing Co.");
                break;
        }
    }
    public void orderBefore(){
        orderprogress(cart);
        totalCost(cart);
        orderafter();
    }
    public void orderafter(){
        String orderOrmenu = input();
        if (orderOrmenu.equals("주문")){
            Order.setWaiting(cart);
            System.out.println("주문이 완료되었습니다!");
            System.out.println();
            System.out.println("대기번호는 [ " + Order.ordernum + " ] 번 입니다.");
            System.out.println("(3초후 메뉴판으로 돌아갑니다.)");
            cart.clear();
            try{
                Thread.sleep(3000);
                firstdisplay();
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        } else if (orderOrmenu.equals("메뉴판")) {
            firstdisplay();
        }
    }
    public void orderprogress(ArrayList<Item> cart){
        Map<String, Integer> itemnumbermap = new HashMap<>();
        System.out.println("아래와 같이 주문 하시겠습니까?");
        System.out.println("[ Orders ]");
        for ( Item item : cart){
            if(itemnumbermap.containsKey(item.name)){
                int count = itemnumbermap.get(item.name);
                itemnumbermap.put(item.name, count + 1);
            } else{
                itemnumbermap.put(item.name, 1);
            }
        }
        for ( String name : itemnumbermap.keySet()){
            Item item = allItem.get(name);
            System.out.println(item.name + " | W " + item.price + " | " + itemnumbermap.get(name) +" 개 | " + item.discription);
        }
        System.out.println();
    }
    public void totalCost(ArrayList<Item> cart){
        Double totalcost = 0.0;

        for ( Item item : cart){
            totalcost += item.price;
        }
        System.out.println("[ Total ]");
        System.out.println("W "+totalcost);
        System.out.println();
        System.out.println("1. 주문          2. 메뉴판");
    }
    public void cancleprogress(){
        System.out.println("진행하던 주문을 취소하시겠습니까?");
        System.out.println("1. 확인         2. 취소");
        String cancle = input();
        if (cancle.equals("확인")){
            cart.clear();
            System.out.println("진행하던 주문이 취소되었습니다.");
            firstdisplay();
        } else if (cancle.equals("취소")){
            firstdisplay();
        }
    }
}
