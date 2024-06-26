import java.util.Scanner;

public class WorldWideExplorer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("Welcome to the World Wide Explorer!");
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.println("Nice to meet you fellow traveler, " + name + ".");

            while (true) {
                displayMenu();
                int option = getOption(scanner);

                switch (option) {
                    case 1:
                        displayMexicoMenu();
                        int mexicoOption = getOption(scanner);
                        handleMexicoOption(mexicoOption);
                        break;
                    case 2:
                        displayIndiaMenu();
                        int indiaOption = getOption(scanner);
                        handleIndiaOption(indiaOption);
                        break;
                    case 3:
                        displayJapanMenu();
                        int japanOption = getOption(scanner);
                        handleJapanOption(japanOption);
                        break;
                    case 0:
                        running = false;
                        break;
                    default:
                        System.out.println("Invalid option. Please try again.");
                        break;
                }

                if (!running) {
                    break;
                }
            }
        }
    }

    private static void displayMenu() {
        System.out.println("[1] Option Mexico");
        System.out.println("[2] Option India");
        System.out.println("[3] Option Japan");
        System.out.println("[0] Exit");
    }

    private static void displayMexicoMenu() {
        System.out.println("[1] Mexico City");
        System.out.println("[2] Cancun");
        System.out.println("[0] Back to main menu");
    }

    private static void displayIndiaMenu() {
        System.out.println("[1] Mumbai");
        System.out.println("[2] Hyderabad");
        System.out.println("[0] Back to main menu");
    }

    private static void displayJapanMenu() {
        System.out.println("[1] Tokyo");
        System.out.println("[2] Osaka");
        System.out.println("[0] Back to main menu");
    }

    private static int getOption(Scanner scanner) {
        System.out.print("Select which option: ");
        return scanner.nextInt();
    }

    private static void handleMexicoOption(int option) {
        switch (option) {
            case 1:
                System.out.println("You selected Mexico City.");
                break;
            case 2:
                System.out.println("You selected Cancun.");
                break;
            case 0:
                System.out.println("Returning to main menu.");
                break;
            default:
                System.out.println("Invalid option. Please try again.");
                break;
        }
    }

    private static void handleIndiaOption(int option) {
        switch (option) {
            case 1:
                System.out.println("You selected Mumbai.");
                break;
            case 2:
                System.out.println("You selected Hyderabad.");
                break;
            case 0:
                System.out.println("Returning to main menu.");
                break;
            default:
                System.out.println("Invalid option. Please try again.");
                break;
        }
    }

    private static void handleJapanOption(int option) {
        switch (option) {
            case 1:
                System.out.println("You selected Tokyo.");
                break;
            case 2:
                System.out.println("You selected Osaka.");
                break;
            case 0:
                System.out.println("Returning to main menu.");
                break;
            default:
                System.out.println("Invalid option. Please try again.");
                break;
        }
    }
}
import java.util.Scanner;

class Question {
    private String prompt;
    private String[] choices;
    private String correctAnswer;

    public Question(String prompt, String[] choices, String correctAnswer) {
        this.prompt = prompt;
        this.choices = choices;
        this.correctAnswer = correctAnswer;
    }

    public String getPrompt() {
        return prompt;
    }

    public String[] getChoices() {
        return choices;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        printMenu();

        while (true) {
            System.out.print("Select an option: ");
            String option = scanner.nextLine();

            if (option.equals("1")) {
                runQuiz("Mexico City");
            } else if (option.equals("2")) {
                runQuiz("Cancun");
            } else if (option.equals("3")) {
                runQuiz("Tokyo");
            } else if (option.equals("4")) {
                runQuiz("Osaka");
            } else if (option.equals("5")) {
                runQuiz("Mumbai");
            } else if (option.equals("6")) {
                runQuiz("Hyderabad");
            } else if (option.equals("0")) {
                System.out.println("Exiting the program. Goodbye!");
                break;
            } else {
                System.out.println("Invalid option. Please select again.");
            }
        }
    }

    public static void printMenu() {
        System.out.println("[1] Option Mexico City");
        System.out.println("[2] Option Cancun");
        System.out.println("[3] Option Tokyo");
        System.out.println("[4] Option Osaka");
        System.out.println("[5] Option Mumbai");
        System.out.println("[6] Option Hyderabad");
        System.out.println("[0] Exit");
    }

    public static void runQuiz(String city) {
        Question[] questionList = getQuestions(city);
        int score = 0;

        System.out.println("\n" + city + " Quiz:");

        for (Question question : questionList) {
            System.out.println(question.getPrompt());

            for (String choice : question.getChoices()) {
                System.out.println(choice);
            }

            System.out.print("Enter your choice (A/B/C/D): ");
            String userAnswer = scanner.nextLine().toUpperCase();

            if (userAnswer.equals(question.getCorrectAnswer())) {
                System.out.println("Correct!");
                score += 5;
            } else {
                System.out.println("Incorrect.");
            }
        }

        System.out.println("\nYour score for " + city + " quiz: " + score + "/" + questionList.length);
    }

    public static Question[] getQuestions(String city) {
        switch (city) {
            case "Mexico City":
                return new Question[]{
                        new Question("What is the city's most famous festival?", new String[]{"A. Day of the Dead", "B. Cinco de Mayo", "C. Christmas", "D. Carnival"}, "B"),
                        new Question("What are they well known for food in Mexico City?", new String[]{"A. Tamales", "B. Mole", "C. Pasta", "D. Bagels"}, "A"),
                        new Question("Where is Mexico City located?", new String[]{"A. Sea", "B. On top of the Mountain", "C. By a river", "D. Desert"}, "B"),
                        new Question("Which one is not a common color seen in Mexico City streets?", new String[]{"A. Pastels", "B. Red", "C. Pink", "D. Gray"}, "D")
                };
            case "Cancun":
                return new Question[]{
                        new Question("What is the city most famous for?", new String[]{"A. College Spring Break Fun", "B. Beach", "C. Food", "D. Coffee"}, "B"),
                        new Question("What are they well known for food in Cancun?", new String[]{"A. Tamales", "B. Mole", "C. Shrimp", "D. Donuts"}, "B"),
                        new Question("Where is Cancun located?", new String[]{"A. Sea", "B. On top of the Mountain", "C. By a river", "D. Desert"}, "A"),
                        new Question("Which one is not a common color seen in Cancun shores?", new String[]{"A. Pastels", "B. Red", "C. Pink", "D. Gray"}, "B")
                };
            case "Tokyo":
                return new Question[]{
                        new Question("What is the city's most famous festival?", new String[]{"A. Hachioji Matsuri", "B. Fuji Matsuri", "C. Christmas", "D. Torigeo Matsuri"}, "B"),
                        new Question("What are they well known for food in Tokyo?", new String[]{"A. Nigiri-zushi", "B. Soba", "C. Pasta", "D. Tsukudani"}, "D"),
                        new Question("Where is Tokyo located?", new String[]{"A. Sea", "B. On top of the Mountain", "C. By a river", "D. Desert"}, "B"),
                        new Question("Which one of these colors is commonly seen in Tokyo city limits?", new String[]{"A. Pastels", "B. Red", "C. Blue", "D. Gray"}, "C")
                };
            case "Osaka":
                return new Question[]{
                        new Question("What is the city's most famous festival?", new String[]{"A. Tenjin Matsuri", "B. Gion Matsuri", "C. Christmas", "D. Setsuban"}, "D"),
                        new Question("What are they well known for food in Osaka?", new String[]{"A. Tamales", "B. Tako-yaki", "C. Ramen", "D. Kushi-Katsu"}, "B"),
                        new Question("Where is Osaka located?", new String[]{"A. Sea", "B. On top of the Mountain", "C. By a river", "D. Desert"}, "B"),
                        new Question("Which one of these colors is commonly seen in Osaka city limits?", new String[]{"A. Pastels", "B. White", "C. Pink", "D. Blue"}, "B")
                };
            case "Mumbai":
                return new Question[]{
                        new Question("What is the city's most famous festival?", new String[]{"A. Day of the Dead", "B. Ganesh Chaturthi", "C. Christmas", "D. Madurai"}, "B"),
                        new Question("What are they well known for food in Mumbai?", new String[]{"A. Tamales", "B. Tako-yaki", "C. Ramen", "D. Kushi-Katsu"}, "B"),
                        new Question("Where is Mumbai located?", new String[]{"A. Sea", "B. On top of the Mountain", "C. Center of an island", "D. Desert"}, "C"),
                        new Question("Which one of these colors is commonly seen in Mumbai cityscape?", new String[]{"A. Red", "B. Fuchsia Pink", "C. Orange", "D. Sunny Yellow"}, "B")
                };
            case "Hyderabad":
                return new Question[]{
                        new Question("What is the city's most famous festival?", new String[]{"A. Day of the Dead", "B. Ganesh Chaturthi", "C. Sankranthi", "D. Madurai"}, "C"),
                        new Question("What are they well known for food in Hyderabad?", new String[]{"A. Osmania Biscuit", "B. Panipuri", "C. Bombay sandwich", "D. Chicken masala"}, "A"),
                        new Question("Where is Hyderabad located?", new String[]{"A. Sea", "B. On top of the Mountain", "C. Landlocked", "D. Desert"}, "C"),
                        new Question("Which one of these colors is commonly seen in Hyderabad region?", new String[]{"A. Pink", "B. Red", "C. Golden Orange", "D. White"}, "A")
                };
            default:
                return new Question[0];
        }
    }
}


import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class QuizApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, List<Question>> questions = new HashMap<>();
        // Initialize questions map with data

        while (true) {
            printMenu();
            System.out.print("Select an option: ");
            String option = scanner.nextLine();

            switch (option) {
                case "1":
                    runQuiz("Mexico City", questions.get("Mexico City"), scanner);
                    break;
                case "2":
                    runQuiz("Cancun", questions.get("Cancun"), scanner);
                    break;
                case "3":
                    runQuiz("Tokyo", questions.get("Tokyo"), scanner);
                    break;
                case "4":
                    runQuiz("Osaka", questions.get("Osaka"), scanner);
                    break;
                case "5":
                    runQuiz("Mumbai", questions.get("Mumbai"), scanner);
                    break;
                case "6":
                    runQuiz("Hyderabad", questions.get("Hyderabad"), scanner);
                    break;
                case "0":
                    System.out.println("Exiting the program. Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Please select again.");
            }
        }
    }

    public static void runQuiz(String city, List<Question> questionList, Scanner scanner) {
        int score = 0;
        System.out.println("\n" + city + " Quiz:");
        for (Question question : questionList) {
            System.out.println(question.getPrompt());
            for (String choice : question.getChoices()) {
                System.out.println(choice);
            }
            System.out.print("Enter your choice (A/B/C/D): ");
            String userAnswer = scanner.nextLine().toUpperCase();
            if (userAnswer.equals(question.getCorrectAnswer())) {
                System.out.println("Correct!");
                score += 5;
            } else {
                System.out.println("Incorrect.");
            }
        }
        System.out.println("\nYour score for " + city + " quiz: " + score + "/" + (questionList.size() * 5));
    }

    public static void printMenu() {
        System.out.println("1. Mexico City Quiz");
        System.out.println("2. Cancun Quiz");
        System.out.println("3. Tokyo Quiz");
        System.out.println("4. Osaka Quiz");
        System.out.println("5. Mumbai Quiz");
        System.out.println("6. Hyderabad Quiz");
        System.out.println("0. Exit");
    }
}

class Question {
    private String prompt;
    private List<String> choices;
    private String correctAnswer;

    public Question(String prompt, List<String> choices, String correctAnswer) {
        this.prompt = prompt;
        this.choices = choices;
        this.correctAnswer = correctAnswer;
    }

    public String getPrompt() {
        return prompt;
    }

    public List<String> getChoices() {
        return choices;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }
}

import java.awt.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class WorldWideExplorer extends JFrame {
    private Image bgImage;
    private Font customFont;
    private JButton playButton, selectButton, quitButton, backButton;
    private JPanel mainPanel, playPanel, selectPanel;

    public WorldWideExplorer() {
        setTitle("World Wide Explorer");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        bgImage = new ImageIcon("logo.png").getImage();
        customFont = new Font("Comic Sans MS", Font.PLAIN, 45);

        mainPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(bgImage, 0, 0, getWidth(), getHeight(), this);
            }
        };
        mainPanel.setLayout(null);

        playButton = createButton("Play", 640, 460);
        selectButton = createButton("Select Country and City", 640, 520);
        quitButton = createButton("Quit", 640, 580);

        mainPanel.add(playButton);
        mainPanel.add(selectButton);
        mainPanel.add(quitButton);

        playPanel = createPlayPanel();
        selectPanel = createSelectPanel();

        add(mainPanel);

        playButton.addActionListener(e -> switchPanel(playPanel));
        selectButton.addActionListener(e -> switchPanel(selectPanel));
        quitButton.addActionListener(e -> System.exit(0));

        setVisible(true);
    }

    private JButton createButton(String text, int x, int y) {
        JButton button = new JButton(text);
        button.setFont(customFont);
        button.setBounds(x - 150, y - 25, 300, 50);
        button.setBackground(Color.WHITE);
        button.setForeground(Color.BLACK);
        button.setFocusPainted(false);
        button.setBorderPainted(false);
        button.setContentAreaFilled(false);
        button.setOpaque(true);
        button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                button.setBackground(Color.GREEN);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                button.setBackground(Color.WHITE);
            }
        });
        return button;
    }

    private JPanel createPlayPanel() {
        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setColor(Color.BLACK);
                g.fillRect(0, 0, getWidth(), getHeight());
                g.setFont(customFont);
                g.setColor(Color.WHITE);
                g.drawString("This is the PLAY screen", 320, 260);
            }
        };
        panel.setLayout(null);

        backButton = createButton("Back to Menu", 640, 460);
        panel.add(backButton);

        backButton.addActionListener(e -> switchPanel(mainPanel));

        return panel;
    }

    private JPanel createSelectPanel() {
        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setColor(Color.WHITE);
                g.fillRect(0, 0, getWidth(), getHeight());
                g.setFont(customFont);
                g.setColor(Color.BLACK);
                g.drawString("This is the Select Country and City screen", 320, 260);
            }
        };
        panel.setLayout(null);

        backButton = createButton("Back to Menu", 640, 460);
        panel.add(backButton);

        backButton.addActionListener(e -> switchPanel(mainPanel));

        return panel;
    }

    private void switchPanel(JPanel panel) {
        getContentPane().removeAll();
        add(panel);
        revalidate();
        repaint();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(WorldWideExplorer::new);
    }
}




