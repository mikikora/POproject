package cookieclicker.player;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowEvent;

class Window extends JPanel {
    JFrame frame;
    GridBagLayout layout;
    GridBagConstraints c;
    JButton cookie;
    JLabel amount;
    Container kontener;
    JButton savingButton;
    JButton SaveAndQuit;
    Player player;
    JLabel cookiesDescription;
    JLabel structureAmountDescription;
    JLabel structureDescruption;
    JLabel buy1Description;
    JLabel buy10Description;
    JLabel Cost1;
    JLabel Cost10;
    JLabel Description;
    JButton BuyCursor1;
    JButton BuyLab1;
    JButton BuyFactory1;
    JButton BuyGrandma1;
    JButton BuyMine1;
    JButton BuyPortal1;
    JButton BuyShipment1;
    JButton BuyMachine1;
    JButton BuyCursor10;
    JButton BuyLab10;
    JButton BuyFactory10;
    JButton BuyGrandma10;
    JButton BuyMine10;
    JButton BuyPortal10;
    JButton BuyShipment10;
    JButton BuyMachine10;
    JLabel AmountOfCursors;
    JLabel AmountOfLabs;
    JLabel AmountOfFactorys;
    JLabel AmountOfGrandmas;
    JLabel AmountOfMines;
    JLabel AmountOfPortals;
    JLabel AmountOfShipments;
    JLabel AmountOfMachines;
    JLabel CostCursor1;
    JLabel CostLab1;
    JLabel CostFactory1;
    JLabel CostGrandma1;
    JLabel CostMine1;
    JLabel CostPortal1;
    JLabel CostShipment1;
    JLabel CostMachine1;
    JLabel CostCursor10;
    JLabel CostLab10;
    JLabel CostFactory10;
    JLabel CostGrandma10;
    JLabel CostMine10;
    JLabel CostPortal10;
    JLabel CostShipment10;
    JLabel CostMachine10;
    ImageIcon cookieIcon;

    public Window(Player p) {
        cookieIcon = new ImageIcon("ciastko.jpg");
        player = p;
        frame = new JFrame("Cookie clicker");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        layout = new GridBagLayout();
        c = new GridBagConstraints();
        frame.setLayout(layout);
        kontener = frame.getContentPane();

        amount = new JLabel(Long.toString(player.cookies));
        c.anchor = GridBagConstraints.PAGE_START;
        c.gridx = 1;
        kontener.add(amount, c);

        cookie = new JButton(cookieIcon);
        cookie.setActionCommand("cookie");
        cookie.addActionListener(player);
        c.anchor = GridBagConstraints.CENTER;
        c.gridy = 1;
        c.gridx = 1;
        c.ipady = 40;
        c.ipadx = 20;
        c.insets = new Insets(10,10,20,10);
        kontener.add(cookie, c);
        c.insets = new Insets(0,0,0,0);
        c.ipadx = 0;
        c.ipady = 0;

        cookiesDescription = new JLabel("Your cookies:");
        c.weightx = 0;
        c.weighty = 0;
        c.gridx = 0;
        c.gridy = 0;
        kontener.add(cookiesDescription, c);

        savingButton = new JButton("Save game");
        savingButton.setActionCommand("save");
        savingButton.addActionListener(player);
        c.gridy = 0;
        c.gridx = 2;
        kontener.add(savingButton, c);

        SaveAndQuit = new JButton("Save and quit");
        SaveAndQuit.setActionCommand("quit");
        SaveAndQuit.addActionListener(player);
        c.gridx = 3;
        kontener.add(SaveAndQuit, c);
        ///////////////////////////////////////////////
        c.insets = new Insets(10,10,10,10);

        structureAmountDescription = new JLabel("Amount of structures");
//        c.gridx = 4;
        c.gridx = 2;
        c.gridy = 2;
        kontener.add(structureAmountDescription, c);

        structureDescruption = new JLabel("Structure");
        c.gridx = 0;
        kontener.add(structureDescruption, c);

        Description = new JLabel("Description");
        c.gridx = 1;
        kontener.add(Description, c);

        buy1Description = new JLabel("Buy 1");
        c.gridx = 3;
        kontener.add(buy1Description, c);

        Cost1 = new JLabel("Cost of 1");
        c.gridx = 4;
        kontener.add(Cost1,c);

        Cost10 = new JLabel("Cost of 10");
        c.gridx = 6;
        kontener.add(Cost10,c);

        buy10Description = new JLabel("Buy 10");
        c.gridx = 5;
        kontener.add(buy10Description, c);

        /*
        ********
        *cursor*
        ********
         */

        c.gridy = 3;
        c.gridx = 0;
        kontener.add(new JLabel("Cursor"), c);

        c.gridx = 1;
        kontener.add(new JLabel("Each cursor produces 0.2 CpS"), c);

        AmountOfCursors = new JLabel(Integer.toString(player.cursor.howMany()));
        c.gridx = 2;
        kontener.add(AmountOfCursors, c);

        BuyCursor1 = new JButton("Buy new cursor");
        BuyCursor1.setActionCommand("cursor1");
        BuyCursor1.addActionListener(player);
        c.gridx = 3;
        kontener.add(BuyCursor1, c);

        CostCursor1 = new JLabel(Long.toString(player.cursor.cost(1)));
        c.gridx = 4;
        kontener.add(CostCursor1, c);

        BuyCursor10 = new JButton("Buy 10 cursors");
        BuyCursor10.setActionCommand("cursor10");
        BuyCursor10.addActionListener(player);
        c.gridx = 5;
        kontener.add(BuyCursor10, c);

        CostCursor10 = new JLabel(Long.toString(player.cursor.cost(10)));
        c.gridx = 6;
        kontener.add(CostCursor10, c);

        /*
         *********
         *grandma*
         *********
         */

        c.gridy = 4;
        c.gridx = 0;
        kontener.add(new JLabel("Grandma"), c);

        c.gridx = 1;
        kontener.add(new JLabel("Each grandma produces 1 CpS"), c);

        AmountOfGrandmas = new JLabel(Integer.toString(player.grandma.howMany()));
        c.gridx = 2;
        kontener.add(AmountOfGrandmas, c);

        BuyGrandma1 = new JButton("Buy new grandma");
        BuyGrandma1.setActionCommand("grandma1");
        BuyGrandma1.addActionListener(player);
        c.gridx = 3;
        kontener.add(BuyGrandma1, c);

        CostGrandma1 = new JLabel(Long.toString(player.grandma.cost(1)));
        c.gridx = 4;
        kontener.add(CostGrandma1, c);

        BuyGrandma10 = new JButton("Buy 10 grandmas");
        BuyGrandma10.setActionCommand("grandma10");
        BuyGrandma10.addActionListener(player);
        c.gridx = 5;
        kontener.add(BuyGrandma10, c);

        CostGrandma10 = new JLabel(Long.toString(player.grandma.cost(10)));
        c.gridx = 6;
        kontener.add(CostGrandma10, c);

        /*
         *********
         *Factory*
         *********
         */

        c.gridy = 5;
        c.gridx = 0;
        kontener.add(new JLabel("Factory"), c);

        c.gridx = 1;
        kontener.add(new JLabel("Each factory produces 4 CpS"), c);

        AmountOfFactorys = new JLabel(Integer.toString(player.factory.howMany()));
        c.gridx = 2;
        kontener.add(AmountOfFactorys, c);

        BuyFactory1 = new JButton("Buy new factory");
        BuyFactory1.setActionCommand("factory1");
        BuyFactory1.addActionListener(player);
        c.gridx = 3;
        kontener.add(BuyFactory1, c);

        CostFactory1 = new JLabel(Long.toString(player.factory.cost(1)));
        c.gridx = 4;
        kontener.add(CostFactory1, c);

        BuyFactory10 = new JButton("Buy 10 factories");
        BuyFactory10.setActionCommand("factory10");
        BuyFactory10.addActionListener(player);
        c.gridx = 5;
        kontener.add(BuyFactory10, c);

        CostFactory10 = new JLabel(Long.toString(player.factory.cost(10)));
        c.gridx = 6;
        kontener.add(CostFactory10, c);

        /*
         ******
         *mine*
         ******
         */

        c.gridy = 6;
        c.gridx = 0;
        kontener.add(new JLabel("Mine"), c);

        c.gridx = 1;
        kontener.add(new JLabel("Each mine produces 10 CpS"), c);

        AmountOfMines = new JLabel(Integer.toString(player.mine.howMany()));
        c.gridx = 2;
        kontener.add(AmountOfMines, c);

        BuyMine1 = new JButton("Buy new mine");
        BuyMine1.setActionCommand("mine1");
        BuyMine1.addActionListener(player);
        c.gridx = 3;
        kontener.add(BuyMine1, c);

        CostMine1 = new JLabel(Long.toString(player.mine.cost(1)));
        c.gridx = 4;
        kontener.add(CostMine1, c);

        BuyMine10 = new JButton("Buy 10 mines");
        BuyMine10.setActionCommand("mine10");
        BuyMine10.addActionListener(player);
        c.gridx = 5;
        kontener.add(BuyMine10, c);

        CostMine10 = new JLabel(Long.toString(player.mine.cost(10)));
        c.gridx = 6;
        kontener.add(CostMine10, c);

        /*
         **********
         *shipment*
         **********
         */

        c.gridy = 7;
        c.gridx = 0;
        kontener.add(new JLabel("Shipment"), c);

        c.gridx = 1;
        kontener.add(new JLabel("Each shipment produces 20 CpS"), c);

        AmountOfShipments = new JLabel(Integer.toString(player.shipment.howMany()));
        c.gridx = 2;
        kontener.add(AmountOfShipments, c);

        BuyShipment1 = new JButton("Buy new shipment");
        BuyShipment1.setActionCommand("shipment1");
        BuyShipment1.addActionListener(player);
        c.gridx = 3;
        kontener.add(BuyShipment1, c);

        CostShipment1 = new JLabel(Long.toString(player.shipment.cost(1)));
        c.gridx = 4;
        kontener.add(CostShipment1, c);

        BuyShipment10 = new JButton("Buy 10 shipments");
        BuyShipment10.setActionCommand("shipment10");
        BuyShipment10.addActionListener(player);
        c.gridx = 5;
        kontener.add(BuyShipment10, c);

        CostShipment10 = new JLabel(Long.toString(player.shipment.cost(10)));
        c.gridx = 6;
        kontener.add(CostShipment10, c);

        /*
         *************
         *alchemy*lab*
         *************
         */

        c.gridy = 8;
        c.gridx = 0;
        kontener.add(new JLabel("Alchemy Lab"), c);

        c.gridx = 1;
        kontener.add(new JLabel("Each Lab produces 100 CpS"), c);

        AmountOfLabs = new JLabel(Integer.toString(player.alchemyLab.howMany()));
        c.gridx = 2;
        kontener.add(AmountOfLabs, c);

        BuyLab1 = new JButton("Buy new Alchemy Lab");
        BuyLab1.setActionCommand("lab1");
        BuyLab1.addActionListener(player);
        c.gridx = 3;
        kontener.add(BuyLab1, c);

        CostLab1 = new JLabel(Long.toString(player.alchemyLab.cost(1)));
        c.gridx = 4;
        kontener.add(CostLab1, c);

        BuyLab10 = new JButton("Buy 10 alchemy labs");
        BuyLab10.setActionCommand("lab10");
        BuyLab10.addActionListener(player);
        c.gridx = 5;
        kontener.add(BuyLab10, c);

        CostLab10 = new JLabel(Long.toString(player.alchemyLab.cost(10)));
        c.gridx = 6;
        kontener.add(CostLab10, c);

        /*
         ********
         *portal*
         ********
         */

        c.gridy = 9;
        c.gridx = 0;
        kontener.add(new JLabel("Portal"), c);

        c.gridx = 1;
        kontener.add(new JLabel("Each portal produces 5000 CpS"), c);

        AmountOfPortals = new JLabel(Integer.toString(player.portal.howMany()));
        c.gridx = 2;
        kontener.add(AmountOfPortals, c);

        BuyPortal1 = new JButton("Buy new portal");
        BuyPortal1.setActionCommand("portal1");
        BuyPortal1.addActionListener(player);
        c.gridx = 3;
        kontener.add(BuyPortal1, c);

        CostPortal1 = new JLabel(Long.toString(player.portal.cost(1)));
        c.gridx = 4;
        kontener.add(CostPortal1, c);

        BuyPortal10 = new JButton("Buy 10 portals");
        BuyPortal10.setActionCommand("portal10");
        BuyPortal10.addActionListener(player);
        c.gridx = 5;
        kontener.add(BuyPortal10, c);

        CostPortal10 = new JLabel(Long.toString(player.portal.cost(10)));
        c.gridx = 6;
        kontener.add(CostPortal10, c);

        /*
         **************
         *Time*Machine*
         **************
         */

        c.gridy = 10;
        c.gridx = 0;
        kontener.add(new JLabel("Time Machine"), c);

        c.gridx = 1;
        kontener.add(new JLabel("Each time machine produces 100 000 CpS"), c);

        AmountOfMachines = new JLabel(Integer.toString(player.timeMachine.howMany()));
        c.gridx = 2;
        kontener.add(AmountOfMachines, c);

        BuyMachine1 = new JButton("Buy new time machine");
        BuyMachine1.setActionCommand("machine1");
        BuyMachine1.addActionListener(player);
        c.gridx = 3;
        kontener.add(BuyMachine1, c);

        CostMachine1 = new JLabel(Long.toString(player.timeMachine.cost(1)));
        c.gridx = 4;
        kontener.add(CostMachine1, c);

        BuyMachine10 = new JButton("Buy 10 time machines");
        BuyMachine10.setActionCommand("machine10");
        BuyMachine10.addActionListener(player);
        c.gridx = 5;
        kontener.add(BuyMachine10, c);

        CostMachine10 = new JLabel(Long.toString(player.timeMachine.cost(10)));
        c.gridx = 6;
        kontener.add(CostMachine10, c);

        frame.pack();
        frame.setVisible(true);
    }

    public void update() {
        amount.setText(Long.toString(player.cookies));
        CostCursor1.setText(Long.toString(player.cursor.cost(1)));
        CostCursor10.setText(Long.toString(player.cursor.cost(10)));
        AmountOfCursors.setText(Integer.toString(player.cursor.howMany()));

        CostGrandma1.setText(Long.toString(player.grandma.cost(1)));
        CostGrandma10.setText(Long.toString(player.grandma.cost(10)));
        AmountOfGrandmas.setText(Integer.toString(player.grandma.howMany()));

        CostFactory1.setText(Long.toString(player.factory.cost(1)));
        CostFactory10.setText(Long.toString(player.factory.cost(10)));
        AmountOfFactorys.setText(Integer.toString(player.factory.howMany()));

        CostMine1.setText(Long.toString(player.mine.cost(1)));
        CostMine10.setText(Long.toString(player.mine.cost(10)));
        AmountOfMines.setText(Integer.toString(player.mine.howMany()));

        CostShipment1.setText(Long.toString(player.shipment.cost(1)));
        CostShipment10.setText(Long.toString(player.shipment.cost(10)));
        AmountOfShipments.setText(Integer.toString(player.shipment.howMany()));

        CostLab1.setText(Long.toString(player.alchemyLab.cost(1)));
        CostLab10.setText(Long.toString(player.alchemyLab.cost(10)));
        AmountOfLabs.setText(Integer.toString(player.alchemyLab.howMany()));

        CostPortal1.setText(Long.toString(player.portal.cost(1)));
        CostPortal10.setText(Long.toString(player.portal.cost(10)));
        AmountOfPortals.setText(Integer.toString(player.portal.howMany()));

        CostMachine1.setText(Long.toString(player.timeMachine.cost(1)));
        CostMachine10.setText(Long.toString(player.timeMachine.cost(10)));
        AmountOfMachines.setText(Integer.toString(player.timeMachine.howMany()));
    }

    public void close() {
        frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING));
    }
}
