package com.ironyard.blackjack.Controller;

import com.ironyard.blackjack.Model.Dealer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.ironyard.blackjack.Model.Table;
import com.ironyard.blackjack.Model.Player;

import java.util.ArrayList;
import java.util.List;

@Controller
public class BlackjackController {
    public Table table = new Table();

    @RequestMapping(path ="/", method = RequestMethod.GET)
    public String index() {
        return "index";
    }

    @RequestMapping(path = "/index", method = RequestMethod.POST)
    public String start(@RequestParam(value="num-players") int num) {
        List<Player> players = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            Player temp = new Player();
            int pNum = i + 1;
            temp.setName("Player #" + Integer.toString(pNum));
            players.add(temp);
        }
        Dealer dealer = new Dealer();
        table.setDealer(dealer);
        table.setPlayers(players);
        table.setEndHand(true);
        return "redirect:table";
    }

    @RequestMapping(path = "/table", method = RequestMethod.GET)
    public String showTable(Model model) {
        model.addAttribute("table", table);
        return "table";
    }
}
