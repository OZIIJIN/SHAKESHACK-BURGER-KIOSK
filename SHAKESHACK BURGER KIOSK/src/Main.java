import java.util.*;
import java.lang.Thread;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static ArrayList<Item> cart = new ArrayList<>();
    public static void main(String[] args) {
        firstdisplay();
    }

    public static void firstdisplay(){
        System.out.println("SHAKESHACK BURGER 에 오신걸 환영합니다.");
        System.out.println("아래 메뉴판을 보시고 메뉴를 골라 입력해주세요.");
        System.out.println();
        printshakeshackMenu();
        printorderMenu();
        inputMenu();
    }
    public static void printshakeshackMenu(){
        System.out.println("[ SHAKESHACK MENU ]");
        int num = 1;
        MenuSet.getShakeshackMenu();
        for (String category : MenuSet.menuname){
            Menu menu = MenuSet.shakeshackMenu.get(category);
            System.out.println(num++ + ". " + menu.name + " | " + menu.discription);
        }
        System.out.println();
    }
    public static void printorderMenu(){
        System.out.println("[ ORDER MENU ]");
        int num = 5;
        for (Menu menu : MenuSet.getOrderMenu().values()){
            System.out.println(num++ + ". " + menu.name + " | " + menu.discription);
        }
        System.out.println();
    }
    public static void printBurgersMenu(){
        System.out.println("SHAKESHACK BURGER 에 오신걸 환영합니다.");
        System.out.println("아래 상품메뉴판을 보시고 상품을 골라 입력해주세요.");
        System.out.println();
        System.out.println("[ Burgers MENU ]");
        MenuSet.getBurgerItem();
        int num = 1;
        for (String burger : MenuSet.menuname_burgers){
            Item item = MenuSet.burgerItem.get(burger);
            System.out.println(num++ + ". " + item.name + " | " + item.discription);
        }
        System.out.println();
        choice();
    }
    public static void printDrinkMenu(){
        System.out.println("SHAKESHACK BURGER 에 오신걸 환영합니다.");
        System.out.println("아래 상품메뉴판을 보시고 상품을 골라 입력해주세요.");
        System.out.println();
        System.out.println("[ Drinks MENU ]");
        MenuSet.getDrinksItem();
        int num = 1;
        for (String drink : MenuSet.menuname_drinks){
            Item item = MenuSet.drinksItem.get(drink);
            System.out.println(num++ + ". " + item.name + " | " + item.discription);
        }
        System.out.println();
        choice();
    }
    public static void printCustardMenu(){
        System.out.println("SHAKESHACK BURGER 에 오신걸 환영합니다.");
        System.out.println("아래 상품메뉴판을 보시고 상품을 골라 입력해주세요.");
        System.out.println();
        System.out.println("[ Forzen Custard MENU ]");
        MenuSet.getCustardItem();
        int num = 1;
        for (String custard : MenuSet.menuname_custard ){
            Item item = MenuSet.custardItem.get(custard);
            System.out.println(num++ + ". " + item.name + " | " + item.discription);
        }
        System.out.println();
        choice();
    }
    public static void printBeerMenu(){
        System.out.println("SHAKESHACK BURGER 에 오신걸 환영합니다.");
        System.out.println("아래 상품메뉴판을 보시고 상품을 골라 입력해주세요.");
        System.out.println();
        System.out.println("[ Beer MENU ]");
        MenuSet.getBeerItem();
        int num = 1;
        for (String beer : MenuSet.menuname_beer){
            Item item = MenuSet.beerItem.get(beer);
            System.out.println(num++ + ". " + item.name + " | " + item.discription);
        }
        System.out.println();
        choice();
    }
    public static void inputMenu(){
        String input = sc.nextLine();
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
    public static void menuchoice(String menuinput){
        Item menuchoice = MenuSet.putAll().get(menuinput);
        System.out.println(menuchoice.name + " | " + "W "+ menuchoice.price +" | " + menuchoice.discription);
        System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
        System.out.println("1. 확인             2. 취소");
        String yesOrno = sc.nextLine();
        if (yesOrno.equals("확인")){
            cartadd(menuchoice);
        } else if (yesOrno.equals("취소")){
            firstdisplay();
        }
    }
    public static void cartadd(Item menuchoice){
        cart.add(menuchoice);
        System.out.println(menuchoice.name + "가 장바구니에 추가되었습니다.");
        System.out.println();
        firstdisplay();
    }
    public static void choice(){
        String choice = sc.nextLine();
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
    public static void orderBefore(){
        double totalcost = 0;
        System.out.println("아래와 같이 주문 하시겠습니까?");
        System.out.println("[ Orders ]");
        for(Item item : cart){
            System.out.println(item.name + " | W " + item.price + " | " + item.discription);
            totalcost += item.price;
        }
        System.out.println();
        System.out.println("[ Total ]");
        System.out.println("W "+totalcost);
        System.out.println();
        System.out.println("1. 주문          2. 메뉴판");
        orderprogress();
    }
    public static void orderprogress(){
        String orderOrmenu = sc.nextLine();
        if (orderOrmenu.equals("주문")){
            Order neworder = new Order(cart);
            System.out.println("주문이 완료되었습니다!");
            System.out.println();
            System.out.println("대기번호는 [ " + neworder.waiting + " ] 번 입니다.");
            System.out.println("(3초후 메뉴판으로 돌아갑니다.)");
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
    public static void cancleprogress(){
        System.out.println("진행하던 주문을 취소하시겠습니까?");
        System.out.println("1. 확인         2. 취소");
        String cancle = sc.nextLine();
        if (cancle.equals("확인")){
            cart.clear();
            System.out.println("진행하던 주문이 취소되었습니다.");
            firstdisplay();
        } else if (cancle.equals("취소")){
            firstdisplay();
        }
    }
}