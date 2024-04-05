package bookMarket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SwBookMarket {

	// 책 목록을 2차원 String배열로 정의
    static String[][] bookList = { 
        { "ID2401", "쉽게 배우는 자바 프로그래밍 2판", "우종정", "한빛아카데미", "20,000원" },
        { "ID2402", "코딩 자율학습 HTML+CSS+자바스크립트", "김기수", "길벗", "30,000원" },
        { "ID2403", "Do It! 자료구조와 함께 배우는 알고리즘 입문 - 자바편", "보요시바타", "이지스퍼블리싱", "25,000원" } 
    };
    static int[] cartList = {0, 0, 0};	
    static int numCartItem = 0;			
    static int NUM_MENU = 4;			

    public static void main(String[] args) throws IOException {
        displayWelcome();	
        bookMarket();	
    }
    
    //북마켓 의 전체적인 틀을 잡아주는 메소드
    static void bookMarket() throws IOException {
        boolean loop_TF = true;				
        while (loop_TF) {					
        	int numMenu = displayGetMenu();
            switch (numMenu) {				
                case 1:
                    menuBookList();			
                    break;
                case 2:
                    menuCartList();			
                    break;
                case 3:
                	menuBookList();			
                    menuAddCartItem();		
                    break;
                case 4:
                    menuClearCart();	
                    break;
                case 0:
                    menuExit();				
                    loop_TF = false;		
                    break;
                default:
                	menuWrongNumber();		
                    break;
            }
        }
    }
   
   
    static void displayWelcome() {
        System.out.println("*****************************************\n"
                + "*    Welcome to YoonWu Book Market    *\n"
                + "*****************************************");
    }
 
 
    static int displayGetMenu() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("=========================================\n"
                + "1. 도서 목록 보기\n"
                + "2. 장바구니 보기\n"
                + "3. 장바구니에 도서 추가\n"
                + "4. 장바구니 비우기\n"
                + "0. 종료\n"
                + "=========================================\n"
                + ">> 메뉴 선택 : ");
        int numMenu = Integer.parseInt(br.readLine());

        return numMenu;
    }
    
    // static으로 선언한 bookㅣist이차원 배열에서 도서목록을 출력
    static void menuBookList() {
        System.out.println(">> 도서 목록\n"
                + "------------------------------------------------------------------------");
        for (int i = 0; i < bookList.length; i++) {		
            String[] book = bookList[i];				
            System.out.println(book[0] + ", " + book[1] + ", " + book[2] + ", " + book[3] + ", " + book[4]);
        }
        System.out.println("------------------------------------------------------------------------");
    }

    //종료안내문 출력하는 메소드
    static void menuExit() {
        System.out.println("YoonWu Book Market을 종료합니다. ");
    }

    //장바구니 목록 출력
    static void menuCartList() {
        System.out.println(">> 장바구니 보기\n"
                + "------------------------------------------------------------------------");
        boolean cartEmpty = true;	
   
        for (int i = 0; i < cartList.length; i++) {
            if (cartList[i] > 0) {
                cartEmpty = false;
                String[] book = bookList[i];
                System.out.println(cartList[i] + "권, " + book[0] + ", " + book[1] + ", " + book[2] + ", " + book[3] + ", " + book[4]);
            }
        }
        if (cartEmpty) {	//장바구니가 비어있으면 비었다고 알려줌
            System.out.println("장바구니가 비어 있습니다.");
        }
        System.out.println("------------------------------------------------------------------------");
    }

    //장바구니에 책 추가하는 메소드
    static void menuAddCartItem() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print(">> 추가할 도서 ID 입력 : ");

        String bookID = br.readLine();
        boolean found = false;

        for (int i = 0; i < bookList.length; i++) {	
            if (bookList[i][0].equals(bookID)) {
                // 장바구니에 추가
                cartList[i]++;						
                numCartItem++;						
                found = true;						
                System.out.println(">> 장바구니에 추가되었습니다.");
                break;
            }
        }

        if (!found) {							
            System.out.println("없는 ID입니다. 도서 목록에 있는 ID를 입력하세요.");
        }
    }

    //장바구니에 담긴 내용을 초기화해주는 메소드
    static void menuClearCart() {
        for (int i = 0; i < cartList.length; i++) {
            cartList[i] = 0; // 장바구니 비우기
        }
        numCartItem = 0;	// 권수 초기화
        System.out.println(">> 장바구니에 있는 아이템을 모두 삭제하였습니다.");
    }
    
    //switch에서 case에 없는 번호를 입력받았을때 default에서 실행될 메소드
    static void menuWrongNumber() {
        System.out.println("없는 메뉴입니다. 0번부터 " + NUM_MENU + "번까지의 메뉴중에서 선택하세요");
     }
}