package cookieclicker.player;

import cookieclicker.*;
import cookieclicker.Cursor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Player implements ActionListener {
    long cookies;
    long t0;
    Cursor cursor;
    Grandma grandma;
    AlchemyLab alchemyLab;
    Factory factory;
    Mine mine;
    Portal portal;
    Shipment shipment;
    TimeMachine timeMachine;
    SavingPackage saveObject;
    Saving<SavingPackage> save;
    long timeToSave;
    Window window;
    public boolean end;

    public Player() {
        end = false;
        save = new Saving<>("cookieclicker.player.txt");
        saveObject = save.Read();
        if (saveObject == null) {
            cookies = 0;
            t0 = System.currentTimeMillis();
            cursor = new Cursor(t0, 0);
            grandma = new Grandma(t0, 0);
            alchemyLab = new AlchemyLab(t0, 0);
            factory = new Factory(t0, 0);
            mine = new Mine(t0, 0);
            portal = new Portal(t0, 0);
            shipment = new Shipment(t0, 0);
            timeMachine = new TimeMachine(t0, 0);
        }
        else {
            cookies = saveObject.cookies;
            t0 = saveObject.time;
            cursor = new Cursor(t0, saveObject.cursors);
            grandma = new Grandma(t0, saveObject.grandmas);
            alchemyLab = new AlchemyLab(t0, saveObject.labs);
            factory = new Factory(t0, saveObject.factorys);
            mine = new Mine(t0, saveObject.mines);
            portal = new Portal(t0, saveObject.portals);
            shipment = new Shipment(t0, saveObject.shipments);
            timeMachine = new TimeMachine(t0, saveObject.timeMachines);
        }
        timeToSave = System.currentTimeMillis();
        window = new Window(this);
    }

    void update() {
        cookies += cursor.produce(System.currentTimeMillis());
        cookies += grandma.produce(System.currentTimeMillis());
        cookies += factory.produce(System.currentTimeMillis());
        cookies += mine.produce(System.currentTimeMillis());
        cookies += shipment.produce(System.currentTimeMillis());
        cookies += alchemyLab.produce(System.currentTimeMillis());
        cookies += portal.produce(System.currentTimeMillis());
        cookies += timeMachine.produce(System.currentTimeMillis());
        window.update();
    }

    public void loop() {
        if (System.currentTimeMillis() > t0 + 1000) {
            this.update();
            t0 = System.currentTimeMillis();
        }
        if (System.currentTimeMillis() > timeToSave + 120000) {
            this.Save();
            timeToSave = System.currentTimeMillis();
        }
    }

    public void Save() {
        saveObject = new SavingPackage();
        saveObject.cookies = cookies;
        saveObject.time = t0;
        saveObject.cursors = cursor.howMany();
        saveObject.grandmas = grandma.howMany();
        saveObject.factorys = factory.howMany();
        saveObject.mines = mine.howMany();
        saveObject.shipments = shipment.howMany();
        saveObject.labs = alchemyLab.howMany();
        saveObject.portals = portal.howMany();
        saveObject.timeMachines = timeMachine.howMany();
        save.Save(saveObject);
        System.out.println("Gamed saved");
    }

    public void actionPerformed(ActionEvent a) {
        switch (a.getActionCommand()) {
            case "cookie":
                cookies += 1;
                break;
            case "cursor1":
                if (cookies >= cursor.cost(1)) {
                    cookies -= cursor.cost(1);
                    cursor.buy(1);
                }
                break;
            case "cursor10":
                if (cookies >= cursor.cost(10)) {
                    cookies -= cursor.cost(10);
                    cursor.buy(10);
                }
                break;
            case "grandma1":
                if (cookies >= grandma.cost(1)) {
                    cookies -= grandma.cost(1);
                    grandma.buy(1);
                }
                break;
            case "factory1":
                if (cookies >= factory.cost(1)) {
                    cookies -= factory.cost(1);
                    factory.buy(1);
                }
                break;
            case "mine1":
                if (cookies >= mine.cost(1)) {
                    cookies -= mine.cost(1);
                    mine.buy(1);
                }
                break;
            case "shipment1":
                if (cookies >= shipment.cost(1)) {
                    cookies -= shipment.cost(1);
                    shipment.buy(1);
                }
                break;
            case "lab1":
                if (cookies >= alchemyLab.cost(1)) {
                    cookies -= alchemyLab.cost(1);
                    alchemyLab.buy(1);
                }
                break;
            case "portal1":
                if (cookies >= portal.cost(1)) {
                    cookies -= portal.cost(1);
                    portal.buy(1);
                }
                break;
            case "machine1":
                if (cookies >= timeMachine.cost(1)) {
                    cookies -= timeMachine.cost(1);
                    timeMachine.buy(1);
                }
                break;
            case "grandma10":
                if (cookies >= grandma.cost(10)) {
                    cookies -= grandma.cost(10);
                    grandma.buy(10);
                }
                break;
            case "factory10":
                if (cookies >= factory.cost(10)) {
                    cookies -= factory.cost(10);
                    factory.buy(10);
                }
                break;
            case "mine10":
                if (cookies >= mine.cost(10)) {
                    cookies -= mine.cost(10);
                    mine.buy(10);
                }
                break;
            case "shipment10":
                if (cookies >= shipment.cost(10)) {
                    cookies -= shipment.cost(10);
                    shipment.buy(10);
                }
                break;
            case "lab10":
                if (cookies >= alchemyLab.cost(10)) {
                    cookies -= alchemyLab.cost(10);
                    alchemyLab.buy(10);
                }
                break;
            case "portal10":
                if (cookies >= portal.cost(10)) {
                    cookies -= portal.cost(10);
                    portal.buy(10);
                }
                break;
            case "machine10":
//                System.out.println("Wszedlem tutaj");
                if (cookies >= timeMachine.cost(10)) {
                    cookies -= timeMachine.cost(10);
                    timeMachine.buy(10);
                }
                break;
            case "save":
//                System.out.println("Hi");
                this.Save();
                break;
            case "quit":
//                System.out.println("Hello");
                this.Save();
                end = true;
                window.close();
                break;
            default:
                break;
        }
        this.update();
    }
}
