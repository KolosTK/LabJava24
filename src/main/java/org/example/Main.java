package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args) {
        Card myCard = new Card();
        Initialization init = new Initialization();
        init.InitProducts();
        UserInterface user = new UserInterface();
        user.Start();
  }
}

