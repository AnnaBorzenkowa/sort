package ru.netology.javaqa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.*;

class AviaSoulsTest {

    @Test
    public void ShouldSortTicketsByPrice() {
        AviaSouls manager = new AviaSouls();
        Ticket ticket1 = new Ticket("MSK", "SPB", 600, 16, 18);
        Ticket ticket2 = new Ticket("MSK", "SPB", 150,14, 20);
        Ticket ticket3 = new Ticket("MSK", "SPB", 350,11,18);
        Ticket ticket4 = new Ticket("MSK","SPB",480, 10,15);
        Ticket ticket5 = new Ticket("MSK", "SPB",760, 11,12);
        Ticket ticket6 = new Ticket("MSK", "SPB", 210,8,19);
        Ticket ticket7 = new Ticket("MSK", "NY", 890, 4,18);

        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);

        Ticket[] actual = manager.search("MSK", "SPB");
        Ticket[] expected = {ticket2, ticket6, ticket3, ticket4, ticket1, ticket5};
        Assertions.assertArrayEquals(expected,actual);

    }

    @Test
    public void ShouldSortTicketsByPriceOne() {
        AviaSouls manager = new AviaSouls();
        Ticket ticket1 = new Ticket("MSK", "SPB", 600, 16, 18);
        Ticket ticket2 = new Ticket("MSK", "SPB", 150,14, 20);
        Ticket ticket3 = new Ticket("MSK", "SPB", 350,11,18);
        Ticket ticket4 = new Ticket("MSK","SPB",480, 10,15);
        Ticket ticket5 = new Ticket("MSK", "SPB",760, 11,12);
        Ticket ticket6 = new Ticket("MSK", "SPB", 210,8,19);
        Ticket ticket7 = new Ticket("MSK", "NY", 890, 4,18);

        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);

        Ticket[] actual = manager.search("MSK", "NY");
        Ticket[] expected = {ticket7};
        Assertions.assertArrayEquals(expected,actual);

    }

    @Test
    public void ShouldSortTicketsByPriceNone() {
        AviaSouls manager = new AviaSouls();
        Ticket ticket1 = new Ticket("MSK", "SPB", 600, 16, 18);
        Ticket ticket2 = new Ticket("MSK", "SPB", 150,14, 20);
        Ticket ticket3 = new Ticket("MSK", "SPB", 350,11,18);
        Ticket ticket4 = new Ticket("MSK","SPB",480, 10,15);
        Ticket ticket5 = new Ticket("MSK", "SPB",760, 11,12);
        Ticket ticket6 = new Ticket("MSK", "SPB", 210,8,19);
        Ticket ticket7 = new Ticket("MSK", "NY", 890, 4,18);

        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);

        Ticket[] actual = manager.search("MSK", "UFA");
        Ticket[] expected = {};
        Assertions.assertArrayEquals(expected,actual);

    }

    @Test
    public void ShouldSortTicketsByTime() {
        AviaSouls manager = new AviaSouls();
        Ticket ticket1 = new Ticket("MSK", "SPB", 600, 16, 18);
        Ticket ticket2 = new Ticket("MSK", "SPB", 150,14, 20);
        Ticket ticket3 = new Ticket("MSK", "SPB", 350,11,18);
        Ticket ticket4 = new Ticket("MSK","SPB",480, 10,15);
        Ticket ticket5 = new Ticket("MSK", "SPB",760, 11,12);
        Ticket ticket6 = new Ticket("MSK", "SPB", 210,8,19);
        Ticket ticket7 = new Ticket("MSK", "NY", 890, 4,18);


        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);

        Comparator<Ticket> comparator = new TicketTimeComparator();

        Ticket[] actual = manager.search("MSK", "SPB", comparator);
        Ticket[] expected = {ticket5, ticket1, ticket4, ticket2, ticket3, ticket6};
        Assertions.assertArrayEquals(expected,actual);

    }

    @Test
    public void ShouldSortTicketsByTimeOne() {
        AviaSouls manager = new AviaSouls();
        Ticket ticket1 = new Ticket("MSK", "SPB", 600, 16, 18);
        Ticket ticket2 = new Ticket("MSK", "SPB", 150,14, 20);
        Ticket ticket3 = new Ticket("MSK", "SPB", 350,11,18);
        Ticket ticket4 = new Ticket("MSK","SPB",480, 10,15);
        Ticket ticket5 = new Ticket("MSK", "SPB",760, 11,12);
        Ticket ticket6 = new Ticket("MSK", "SPB", 210,8,19);
        Ticket ticket7 = new Ticket("MSK", "NY", 890, 4,18);


        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);

        Comparator<Ticket> comparator = new TicketTimeComparator();

        Ticket[] actual = manager.search("MSK", "NY", comparator);
        Ticket[] expected = {ticket7};
        Assertions.assertArrayEquals(expected,actual);

    }

    @Test
    public void ShouldSortTicketsByTimeNone() {
        AviaSouls manager = new AviaSouls();
        Ticket ticket1 = new Ticket("MSK", "SPB", 600, 16, 18);
        Ticket ticket2 = new Ticket("MSK", "SPB", 150,14, 20);
        Ticket ticket3 = new Ticket("MSK", "SPB", 350,11,18);
        Ticket ticket4 = new Ticket("MSK","SPB",480, 10,15);
        Ticket ticket5 = new Ticket("MSK", "SPB",760, 11,12);
        Ticket ticket6 = new Ticket("MSK", "SPB", 210,8,19);
        Ticket ticket7 = new Ticket("MSK", "NY", 890, 4,18);


        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);

        Comparator<Ticket> comparator = new TicketTimeComparator();

        Ticket[] actual = manager.search("MSK", "UFA", comparator);
        Ticket[] expected = {};
        Assertions.assertArrayEquals(expected,actual);

    }

}