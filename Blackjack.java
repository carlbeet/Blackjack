import java.util.Scanner;

public class Blackjack {



        public static void main(String[] args) {
            Scanner scnr = new Scanner(System.in);
            P1Random rng = new P1Random();
            int op = 0; // menu input
            int playerWins = 0; // Player wins
            int dealerWins = 0; // Dealer wins
            int tieGames = 0; // tie Games
            int numGames = 0; // number of Games



            numGames = numGames + 1; // increment game number (counter)
            System.out.println("START GAME #" + numGames + ": ");


            int myHand = 0;
            int dealerNumber = 0;
            int dealerHand = 0;
            int myNumber0 = rng.nextInt(13) + 1; // generate random number for use in myHand


            switch (myNumber0) { // switch loop outputs correct value + face card for different random numbers
                case 1:
                    myHand = 10 + myHand;

                    System.out.println("Your card is a ACE!");
                    System.out.println("Your hand is: " + myHand);
                    break; // case 1 adds 10 to hand when random number is 1 (ace). continues below

                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                    myHand = myNumber0 + myHand; // fall through cases 2-8 because they all output the literal number

                    System.out.println("Your card is a " + myNumber0 + "!");
                    System.out.println("Your hand is: " + myHand);
                    break;

                case 11:
                    myHand = 10 + myHand;

                    System.out.println("Your card is a JACK!");
                    System.out.println("Your hand is: " + myHand);
                    break;
                case 12:
                    myHand = 10 + myHand;

                    System.out.println("Your card is a QUEEN!");
                    System.out.println("Your hand is: " + myHand);
                    break;
                case 13:
                    myHand = 10 + myHand;

                    System.out.println("Your card is a KING!");
                    System.out.println("Your hand is: " + myHand);
                    break;
            }


            System.out.println("1.  Get another card"); // first print menu before game loop begins
            System.out.println("2.  Hold hand");
            System.out.println("3.  Print statistics");
            System.out.println("4.  Exit");

            System.out.println("Choose an option: ");
            op = scnr.nextInt();


            while (op != 4) { //creates game loop that continues until user enters 4



                if (op == 1) {

                    myNumber0 = rng.nextInt(13) + 1; //player chooses 1- get new card

                    switch (myNumber0) { // switch loop outputs correct value and face card for different random numbers
                        case 1:
                            myHand = 10 + myHand;

                            System.out.println("Your card is a ACE!");
                            System.out.println("Your hand is: " + myHand);
                            break;

                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                            myHand = myNumber0 + myHand; // fall through cases 2-8 because they all output the literal number

                            System.out.println("Your card is a " + myNumber0 + "!");
                            System.out.println("Your hand is: " + myHand);
                            break;

                        case 11:
                            myHand = 10 + myHand;

                            System.out.println("Your card is a JACK!");
                            System.out.println("Your hand is: " + myHand);
                            break;
                        case 12:
                            myHand = 10 + myHand;

                            System.out.println("Your card is a QUEEN!");
                            System.out.println("Your hand is: " + myHand);
                            break;
                        case 13:
                            myHand = 10 + myHand;

                            System.out.println("Your card is a KING!");
                            System.out.println("Your hand is: " + myHand);
                            break;
                    }


                    if (myHand > 21) { // scenario 1: myHand > 21
                        System.out.println("You exceeded 21! You lose.\n");
                        dealerWins += 1;
                        myHand = 0;


                    } else if (myHand == 21) { // scenario 2: my Hand is 21
                        System.out.println("BLACKJACK! You win!\n");
                        playerWins += 1;
                        myHand = 0;


                    }

                    if (myHand == 0) {

                        numGames = numGames + 1; // increment game number (counter)
                        System.out.println("START GAME #" + numGames + ": ");

                        myNumber0 = rng.nextInt(13) + 1; // generate random number for use in myHand


                        switch (myNumber0) { // switch loop outputs correct value + face card for different random numbers
                            case 1:
                                myHand = 10 + myHand;

                                System.out.println("Your card is a ACE!");
                                System.out.println("Your hand is: " + myHand);
                                break; // case 1 adds 10 to hand when random number is 1 (ace). continues below

                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                                myHand = myNumber0 + myHand; // fall through cases 2-8 because they all output the literal number

                                System.out.println("Your card is a " + myNumber0 + "!");
                                System.out.println("Your hand is: " + myHand);
                                break;

                            case 11:
                                myHand = 10 + myHand;

                                System.out.println("Your card is a JACK!");
                                System.out.println("Your hand is: " + myHand);
                                break;
                            case 12:
                                myHand = 10 + myHand;

                                System.out.println("Your card is a QUEEN!");
                                System.out.println("Your hand is: " + myHand);
                                break;
                            case 13:
                                myHand = 10 + myHand;

                                System.out.println("Your card is a KING!");
                                System.out.println("Your hand is: " + myHand);
                                break;
                        }


                        System.out.println("1.  Get another card"); // first print menu before game loop begins
                        System.out.println("2.  Hold hand");
                        System.out.println("3.  Print statistics");
                        System.out.println("4.  Exit");

                        System.out.println("Choose an option: ");
                        op = scnr.nextInt();
                    }
                    System.out.println("1.  Get another card"); // first print menu before game loop begins
                    System.out.println("2.  Hold hand");
                    System.out.println("3.  Print statistics");
                    System.out.println("4.  Exit");

                    System.out.println("Choose an option: ");
                    op = scnr.nextInt();
                }

                else if (op == 2) { // player chooses 2- hold hand
                    dealerNumber = rng.nextInt(11) + 16; // generate random number for dealer
                    dealerHand = dealerNumber;
                    System.out.println("Dealer's hand: " + dealerHand);
                    System.out.println("Your hand is: " + myHand);


                    if (myHand > dealerHand) { // scenario 1: player hand > dealer hand
                        System.out.println("You win\n!");
                        playerWins += 1;
                        myHand = 0;
                        dealerHand = 0;


                    }

                    else if (dealerHand > myHand) { //scenario 2: dealer hand > player hand
                        if (dealerHand <= 21) { // "as long as dealer hand does not exceed 21"
                            System.out.println("Dealer wins\n!");
                            dealerWins += 1;
                            myHand = 0;
                            dealerHand = 0;


                        }
                        else {
                            System.out.println("You win!\n"); // "otherwise:"
                            playerWins += 1;
                            myHand = 0;
                            dealerHand = 0;


                        }

                    } else if (dealerHand == myHand) { // scenario 3: both are equivalent, tie
                        System.out.println("It's a tie! No one wins!\n");
                        tieGames += 1;
                        myHand = 0;
                        dealerHand = 0;


                    }
                    numGames = numGames + 1; // increment game number (counter)
                    System.out.println("START GAME #" + numGames + ": ");

                    myNumber0 = rng.nextInt(13) + 1; // generate random number for next round


                    switch (myNumber0) { // switch loop outputs correct value + face card for different random numbers
                        case 1:
                            myHand = 10 + myHand;

                            System.out.println("Your card is a ACE!");
                            System.out.println("Your hand is: " + myHand);
                            break; // case 1 adds 10 to hand when random number is 1 (ace). continues below

                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                            myHand = myNumber0 + myHand; // fall through cases 2-8 because they all output the literal number

                            System.out.println("Your card is a " + myNumber0 + "!");
                            System.out.println("Your hand is: " + myHand);
                            break;

                        case 11:
                            myHand = 10 + myHand;

                            System.out.println("Your card is a JACK!");
                            System.out.println("Your hand is: " + myHand);
                            break;
                        case 12:
                            myHand = 10 + myHand;

                            System.out.println("Your card is a QUEEN!");
                            System.out.println("Your hand is: " + myHand);
                            break;
                        case 13:
                            myHand = 10 + myHand;

                            System.out.println("Your card is a KING!");
                            System.out.println("Your hand is: " + myHand);
                            break;
                    }


                    System.out.println("1.  Get another card");
                    System.out.println("2.  Hold hand");
                    System.out.println("3.  Print statistics");
                    System.out.println("4.  Exit\n");
                    System.out.println("Choose an option: ");

                    op = scnr.nextInt();


                } else if (op == 3) { // player chooses to display statistics
                    numGames = numGames - 1;
                    double percent = Math.round(( (double)playerWins / (playerWins + dealerWins)) * 10.0) / 10.0; // calculate percentage of player wins and round it to one decimal

                    System.out.println("Number of Player wins: " + playerWins); // print stats list
                    System.out.println("Number of Dealer wins: " + dealerWins);
                    System.out.println("Number of tie games: " + tieGames);
                    System.out.println("Total # of games played is: " + numGames);
                    System.out.println("Percentage of Player wins: " + percent + "%\n");
                    numGames = numGames + 1;

                    System.out.println("1.  Get another card"); //print menu
                    System.out.println("2.  Hold hand");
                    System.out.println("3.  Print statistics");
                    System.out.println("4.  Exit\n");
                    System.out.println("Choose an option: ");

                    op = scnr.nextInt(); // read user input for next operation


                } else if (op == 4) { //exit sequence ends loop
                    break;

                } else if (op < 1 && op > 4){ // if user does not input int 1-4
                    System.out.println("Invalid input! Please enter an integer value between 1 and 4.\n");

                    System.out.println("1.  Get another card");
                    System.out.println("2.  Hold hand");
                    System.out.println("3.  Print statistics");
                    System.out.println("4.  Exit");

                    System.out.println("Choose an option: ");

                    op = scnr.nextInt();

                }

            } // end of while loop for ops


        }



    }
