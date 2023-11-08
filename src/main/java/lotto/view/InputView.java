package lotto.view;

import camp.nextstep.edu.missionutils.Console;

public class InputView {

    public int getMoney(){
        System.out.println("구입금액을 입력해 주세요.");
        int money;
        try{
            String input = Console.readLine();
            money = validateNumber(input);
            validateInputMoneyUnit(money);
        }catch (Exception e){
            System.out.println(e.getMessage());
            money = getMoney();
        }
        return money;
    }

    public void validateInputMoneyUnit(int money){
        if(money % 1000 != 0){
            throw new IllegalArgumentException("[ERROR] 구입금액은 1000원 단위여야 합니다.");
        }
    }
    
    public int validateNumber(String input){
        int money;
        try{
            money = Integer.parseInt(input);
        }catch (NumberFormatException e){
            throw new IllegalArgumentException("[ERROR] 구입금액은 숫자이여아 합니다.");
        }
        return money;
    }
}
