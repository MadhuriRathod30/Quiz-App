
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.*;
import java.io.*;
class Quiz {
	
	String[][] qpa;
	String[][] qca;
	String Name;
	HashMap<Integer, String> map;
	Quiz() {
		new Start();
	}
class Start extends JFrame implements ActionListener {
	
	Start(){
	setTitle("Quiz Program");             
        setDefaultCloseOperation(EXIT_ON_CLOSE);
	setSize(600,450);
        setLocation(300,100);
	JPanel stpanel;
	JLabel quizup = new JLabel("               QUIZ UP");
	quizup.setFont(new Font("Serif",Font.BOLD, 40));
	quizup.setForeground(Color.WHITE);
	Container stcont = getContentPane();
	stcont.setLayout(null);	
	stcont.setBackground(new Color(58, 95, 205));
	JButton btstartq = new JButton("PLAY NOW !");
	btstartq.addActionListener(this);
	stpanel = new JPanel();
//	btstartq.setPreferredSize(new Dimension(400,30));
	btstartq.setBackground(Color.BLACK);
	btstartq.setForeground(Color.WHITE);
	btstartq.setLocation(200, 300);
	stpanel.setBackground(new Color(58, 95, 205));
	stpanel.setLocation(10,10);
        stpanel.setSize(100,300);
        stpanel.setLayout(new GridLayout(8,2));
	stpanel.add(quizup);
	stpanel.add(btstartq);
	stpanel.setSize(560,400);
	stcont.add(stpanel);
        setVisible(true);
	}
	public void actionPerformed(ActionEvent e) {
		new Init();
		setVisible(false);
	}
	
}        
class Init extends JFrame implements ActionListener {

	Init(){
	setTitle("Quiz Program");             
        setDefaultCloseOperation(EXIT_ON_CLOSE);
	setSize(600,450);
        setLocation(300,100);
	JPanel initpanel;
	Container initcont = getContentPane();
	initcont.setLayout(null);	
	initcont.setBackground(new Color(171, 130, 255));
	JLabel entername = new JLabel("Enter Name");
	entername.setForeground(Color.WHITE);
	entername.setFont(new Font("Serif",Font.BOLD,16));
	final JTextField inname = new JTextField(30);
	inname.setEditable(true);
	inname.setFont(new Font("Castellar", Font.BOLD, 16));
//	name.setLabelfor(inname);
	Name = inname.getText();
	JButton btstart = new JButton("Start quiz");
	btstart.addActionListener(this);
	initpanel = new JPanel();
	btstart.setPreferredSize(new Dimension(400,30));
	btstart.setBackground(Color.BLACK);
	btstart.setForeground(Color.WHITE);
	initpanel.setBackground(new Color(171, 130, 255));
	initpanel.setLocation(10,10);
        initpanel.setSize(100,300);
        initpanel.setLayout(new GridLayout(8,2));
	initpanel.add(entername);
	initpanel.add(inname);
	initpanel.add(btstart);
	initpanel.setSize(560,400);
	initcont.add(initpanel);
        setVisible(true);
	}
	public void actionPerformed(ActionEvent e) {
		new Cat();
		setVisible(false);
	}
}
class Cat extends JFrame {
	
	Cat(){
	setTitle("Quiz Program");             
        setDefaultCloseOperation(EXIT_ON_CLOSE);
	setSize(600,450);
        setLocation(305,100);
	JPanel catpanel;
	Container catcont = getContentPane();
	catcont.setLayout(null);	
	catcont.setBackground(new Color(255, 193, 193));
	JLabel selectcat = new JLabel("Choose category :");
	JButton Cat = new JButton("BOLLYWOOD");
	JButton Cat1 = new JButton("SPORTS");
	JButton Cat2 = new JButton("SPACE");
	JButton Cat3 = new JButton("SCIENCE");
	Cat.setBackground(Color.BLACK);
	Cat.setForeground(Color.WHITE);
	Cat1.setBackground(Color.WHITE);
	Cat1.setForeground(Color.BLACK);
	ActionListener cat = new catopen();
	Cat2.setBackground(Color.BLACK);
	Cat2.setForeground(Color.WHITE);
	Cat3.setBackground(Color.WHITE);
	Cat3.setForeground(Color.BLACK);
	ActionListener cat1 = new cat1open();
	ActionListener cat2 = new cat2open();
	ActionListener cat3 = new cat3open();
	Cat.addActionListener(cat);
	Cat1.addActionListener(cat1);
	Cat2.addActionListener(cat2);
	Cat3.addActionListener(cat3);
	catpanel = new JPanel();
	catpanel.setBackground(new Color(255, 193, 193));
	catpanel.setLocation(10,10);
        catpanel.setSize(800,350);
        catpanel.setLayout(new GridLayout(6,2));
	catpanel.add(selectcat);
	catpanel.add(Cat);
	catpanel.add(Cat1);
	catpanel.add(Cat2);
	catpanel.add(Cat3);
	catpanel.setSize(550,400);
	catcont.add(catpanel);
        setVisible(true);
	}
	private class catopen implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			initializedata();
			new QuizGame();
			setVisible(false);
	}
}
	private class cat1open implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			initializedata1();
			new QuizGame();
			setVisible(false);
		}
	}

	private class cat2open implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			initializedata2();
			new QuizGame();
			setVisible(false);
		}
	}

	private class cat3open implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			initializedata3();
			new QuizGame();
			setVisible(false);
		}
	}
       public void initializedata(){
			//Bollywood
                        //qpa stores pairs of question and its possible answers
                        qpa=new String[10][5];

                        qpa[0][0]="Name the production house owned by Dev Anand that produced the hit film 'Jewel Thief'.";
                        qpa[0][1]="Chetna productions";
                        qpa[0][2]="Ketan features";
                        qpa[0][3]="Navketan films";
                        qpa[0][4]="Dev talkies";

                        qpa[1][0]="Who directed the classic comedy 'Rang Birangi' (1983)? ";
                        qpa[1][1]="Gulzar";
                        qpa[1][2]="Sai Paranjape";
                        qpa[1][3]="Kundan Shah";
                        qpa[1][4]="Hrishikesh Mukherjee";
                       
                        qpa[2][0]="Shah rukh khan played a drug lord and a narrator in which movie";
                        qpa[2][1]="Don 2";
                        qpa[2][2]="Magic Magic";
                        qpa[2][3]="Thanga Mama";
                        qpa[2][4]="Action";

                        qpa[3][0]="Which of the following directors is famous for his high budget films?";
                        qpa[3][1]="Sanjay Leela Bhansali";
                        qpa[3][2]="Aditya chopra";
                        qpa[3][3]="Yash chopra";
                        qpa[3][4]="Karan Johar";

                        qpa[4][0]="In which film did SRK and Akii come together for the very first time?";
                        qpa[4][1]="Dil toh pagal hai";
                        qpa[4][2]="Kuch Kuch hota hain";
                        qpa[4][3]="K3G";
                        qpa[4][4]="Khiladi";

                        qpa[5][0]="Which of these movies is not directed by aditya chopra";
                        qpa[5][1]="Force";
                        qpa[5][2]="DDLJ";
                        qpa[5][3]="Rab ne bana di jodi";
                        qpa[5][4]="Mohabbattein";

                        qpa[6][0]="The protagonist of the Dhoom Series";
                        qpa[6][1]="Abhishek Bacchan";
                        qpa[6][2]="Hrithik roshan";
                        qpa[6][3]="Uday Chopra";
                        qpa[6][4]="Aamir khan";

                        qpa[7][0]="Bollywood movie doosra aadmi released in which year?";
                        qpa[7][1]="1973";
                        qpa[7][2]="1975";
                        qpa[7][3]="1976";
                        qpa[7][4]="1977";

                        qpa[8][0]="What is Akshay kumars real name?";
                        qpa[8][1]="Akshay Kumar";
                        qpa[8][2]="Rajeev Masand";
                        qpa[8][3]="Aditya sharma";
                        qpa[8][4]="Rajeev Bhatia";

                        qpa[9][0]="In which movie did deepika padukone play the love interest of SRK?";
                        qpa[9][1]="Om shanti Om";
                        qpa[9][2]="kal ho na ho";
                        qpa[9][3]="Chameli";
                        qpa[9][4]="Cocktail";

                       
                        //qca stores pairs of question and its correct answer
                        qca=new String[10][2];
                       
                        qca[0][0]="Name the production house owned by Dev Anand that produced the film 'Jewelthief' ?";
                        qca[0][1]="navketan films";

                        qca[1][0]="Who directed the classic comedy 'Rang Birangi' (1983)?";
                        qca[1][1]="Hrishikesh Mukherjee";

                        qca[2][0]="Shah rukh khan played a drug lord and a narrator in which movie";
                        qca[2][1]="Don2";

                        qca[3][0]="Which of the following directors is famous for his high budget films?";
                        qca[3][1]="Sanjay Leela Bhansali";


                        qca[4][0]="In which film did SRK and Akii come together for the very first time?";
                        qca[4][1]="Dil toh pagal hai";

                        qca[5][0]="Which of these movies is not directed by aditya chopra";
                        qca[5][1]="Force";

                        qca[6][0]="The protagonist of the Dhoom Series";
                        qca[6][1]="Abhishek Bacchan";
                       
                        qca[7][0]="Bollywood movie doosra aadmi released in which year?";
                        qca[7][1]="1973";
                       
                        qca[8][0]="What is Akshay kumars real name?";
                        qca[8][1]="Rajeev bhatia";

                        qca[9][0]="In which movie did deepika padukone play the love interest of SRK?";
                        qca[9][1]="Om shanti Om";
                       
                       
                        //create a map object to store pairs of question and selected answer
                        map=new HashMap<Integer, String>();
                       
                        }
	
                     
       public void initializedata1(){
                        //qpa stores pairs of question and its possible answers
			//Sports
                        qpa=new String[10][5];

                        qpa[0][0]="India won its first Olympic hockey gold in...?";
                        qpa[0][1]="1928";
                        qpa[0][2]="1932";
                        qpa[0][3]="1936";
                        qpa[0][4]="1948	";

                        qpa[1][0]="2010 World Cup football tournament was held in?";
                        qpa[1][1]="Austria";
                        qpa[1][2]="Germany";
                        qpa[1][3]="South Africa";
                        qpa[1][4]="Turin";
                       
                        qpa[2][0]="Who was the 1st ODI captain for India?";
                        qpa[2][1]="Ajit Wadekar";
                        qpa[2][2]="Bishen Singh Bedi";
                        qpa[2][3]="Nawab Pataudi";
                        qpa[2][4]="Vinoo Mankad";

                        qpa[3][0]="Who is the winner of Indian Premier League 2012?";
                        qpa[3][1]="Delhi Daredevils";
                        qpa[3][2]="Mumbai Indians";
                        qpa[3][3]="Chennai Super Kings ";
                        qpa[3][4]="Kolkata Knight Riders";

                        qpa[4][0]="The term Grand Slam is associated with?";
                        qpa[4][1]="Badminton";
                        qpa[4][2]="Lawn Tennis";
                        qpa[4][3]="Table Tennis";
                        qpa[4][4]="Squash";

                        qpa[5][0]="Who among the following has scored first double century in World Cup Cricket?";
                        qpa[5][1]="Sachin Tendulkar";
                        qpa[5][2]="Martin Guptill";
                        qpa[5][3]="AB de Villiers";
                        qpa[5][4]="Chris Gayle";

                        qpa[6][0]="The distance covered in half Marathon is approximately?";
                        qpa[6][1]="21 km";
                        qpa[6][2]="42 km";
                        qpa[6][3]="11 km";
                        qpa[6][4]="5 km";

                        qpa[7][0]="Who among the following is an Olympic Medal winner?";
                        qpa[7][1]="P.T.Usha";
                        qpa[7][2]="Sania Mirza";
                        qpa[7][3]="Mahesh Bhupathi";
                        qpa[7][4]="Saina Nehwal";

                        qpa[8][0]="'Ryder Cup' is awarded to the players of -";
                        qpa[8][1]="Golf";
                        qpa[8][2]="Baseball";
                        qpa[8][3]="Basket ball";
                        qpa[8][4]="Cards";

                        qpa[9][0]="Sachin Tendulkar scored his 100th century on 12th March, 2012 while playing in Asia Cup against?";
                        qpa[9][1]="Bangladesh";
                        qpa[9][2]="Sri Lanka";
                        qpa[9][3]="Pakistan";
                        qpa[9][4]="Indonesia";

                       
                        //qca stores pairs of question and its correct answer
                        qca=new String[10][2];
                       
                        qca[0][0]="India won its first Olympic hockey gold in...?";
                        qca[0][1]="1928";

                        qca[1][0]="2010 World Cup football tournament was held in?";
                        qca[1][1]="South Africa";

                        qca[2][0]="Who was the 1st ODI captain for India";
                        qca[2][1]="Ajit Wadekar";

                        qca[3][0]="Who is the winner of Indian Premier League 2012?";
                        qca[3][1]="Kolkata Knight Riders";


                        qca[4][0]="The term Grand Slam is associated with ?";
                        qca[4][1]="Lawn Tennis";

                        qca[5][0]="who among the following has scored first double century in World Cup Cricket?";
                        qca[5][1]="Chris Gayle";

                        qca[6][0]="The distance covered in half Marathon is approximately ?";
                        qca[6][1]="21";
                       
                        qca[7][0]="Who among the following is an Olympic Medal winner?";
                        qca[7][1]="Saina Nehwal";
                       
                        qca[8][0]="'Ryder Cup' is awarded to the players of ?";
                        qca[8][1]="Golf";

                        qca[9][0]="Sachin Tendulkar scored his 100th century on 12th March, 2012 while playing in Asia Cup against";
                        qca[9][1]="Bangladesh";
                       
                       
                        //create a map object to store pairs of question and selected answer
                        map=new HashMap<Integer, String>();
                       
                        }

public void initializedata2(){
                        //qpa stores pairs of question and its possible answers
			//space
                        qpa=new String[10][5];

                        qpa[0][0]="The planet Jupiter takes about..... to complete one revolution in its orbit around the Sun.";
                        qpa[0][1]="11.86 years";
                        qpa[0][2]="248 years";
                        qpa[0][3]="84 years";
                        qpa[0][4]="165 years";

                        qpa[1][0]="The biggest star in our galaxy is";
                        qpa[1][1]="Epsilon Aurigae";
                        qpa[1][2]=" Proxima Centauri ";
                        qpa[1][3]="Sirius";
                        qpa[1][4]="Sun";
                       
                        qpa[2][0]="The nearest star to Earth (excepting the Sun) in our galaxy is?";
                        qpa[2][1]="Epsilon Aurigae";
                        qpa[2][2]="Proxima Centauri";
                        qpa[2][3]="Sirius";
                        qpa[2][4]="None of the above";

                        qpa[3][0]="Who was the first to observe Sun spots?";
                        qpa[3][1]="Galileo";
                        qpa[3][2]="Halley";
                        qpa[3][3]="Newton";
                        qpa[3][4]="None";

                        qpa[4][0]=" Why is it very difficult to observe the planet Mercury most of the time?";
                        qpa[4][1]="It is too far away from the Earth ";
                        qpa[4][2]="The glare of the Sun usually keeps it hidden, it being too close to the Sun";
                        qpa[4][3]="It lies away from the Earth’s orbit ";
                        qpa[4][4]="It revolves round the Sun such that it cannot be seen easily from the Earth";

                        qpa[5][0]="Name the two planets which appear as ‘morning star’ in the eastern sky and ‘evening star’ in the western sky ";
                        qpa[5][1]="Mars and Venus ";
                        qpa[5][2]="Jupiter and Mars ";
                        qpa[5][3]="Saturn and Uranus ";
                        qpa[5][4]="Mercury and Venus ";

                        qpa[6][0]="How long does a Sun ray take to travel from the Sun to the Earth?";
                        qpa[6][1]="400 seconds";
                        qpa[6][2]="450 seconds ";
                        qpa[6][3]="500 seconds ";
                        qpa[6][4]="600 seconds ";

                        qpa[7][0]="Which planet has the strongest winds?";
                        qpa[7][1]="Neptune";
                        qpa[7][2]="Earth";
                        qpa[7][3]="Mars";
                        qpa[7][4]="Venus";

                        qpa[8][0]="What is the Red planet?";
                        qpa[8][1]="Uranus";
                        qpa[8][2]="Pluto";
                        qpa[8][3]="Mars";
                        qpa[8][4]="Mercury";

                        qpa[9][0]="About how many stars are in our galaxy?";
                        qpa[9][1]="200 billion";
                        qpa[9][2]="200 thousand";
                        qpa[9][3]="2 million";
                        qpa[9][4]="200 million";

                       
                        //qca stores pairs of question and its correct answer
                        qca=new String[10][2];
                       
                        qca[0][0]="The planet Jupiter takes about..... to complete one revolution in its orbit around the Sun. ";
                        qca[0][1]="11.86 years";

                        qca[1][0]="The biggest star in our galaxy is";
                        qca[1][1]="Proxima Centauri ";

                        qca[2][0]="The nearest star to Earth (excepting the Sun) in our galaxy is?";
                        qca[2][1]="Proxima Centauri";

                        qca[3][0]="Who was the first to observe Sun spots?";
                        qca[3][1]="Galileo";

                        qca[4][0]="Why is it very difficult to observe the planet Mercury most of the time?";
                        qca[4][1]="The glare of the Sun usually keeps it hidden, it being too close to the Sun";

                        qca[5][0]="Name the two planets which appear as ‘morning star’ in the eastern sky and ‘evening star’ in the western sky";
                        qca[5][1]="Mercury and Venus ";

                        qca[6][0]="How long does a Sun ray take to travel from the Sun to the Earth? ";
                        qca[6][1]="500 seconds ";
                       
                        qca[7][0]="Which planet has the strongest winds?";
                        qca[7][1]="Neptune";
                       
                        qca[8][0]="Which planet has the strongest winds?";
                        qca[8][1]="Mars";

                        qca[9][0]="About how many stars are in our galaxy?";
                        qca[9][1]="200 billion";
                       
                       
                        //create a map object to store pairs of question and selected answer
                        map=new HashMap<Integer, String>();
                       
                        }
public void initializedata3(){
                        //qpa stores pairs of question and its possible answers
			//Science
                        qpa=new String[10][5];

                        qpa[0][0]="What is the biggest planet in our solar system?";
                        qpa[0][1]="Mars";
                        qpa[0][2]="Earth";
                        qpa[0][3]="Jupiter";
                        qpa[0][4]="Neptune";

                        qpa[1][0]="What is the chemical symbol for the element oxygen?";
                        qpa[1][1]="02";
                        qpa[1][2]="He";
                        qpa[1][3]="Mn";
                        qpa[1][4]="Ge";
                       
                        qpa[2][0]="Another name for a tidal wave is a?";
                        qpa[2][1]="low tide";
                        qpa[2][2]="high tide";
                        qpa[2][3]="Tsunami";
                        qpa[2][4]="none of the above";

                        qpa[3][0]="The highest mountain on earth is?";
                        qpa[3][1]="Everest";
                        qpa[3][2]="K2";
                        qpa[3][3]="Mt Titlis";
                        qpa[3][4]="The Eiger";

                        qpa[4][0]="The fear of what animal is known as ‘arachnophobia’?";
                        qpa[4][1]="Darkness";
                        qpa[4][2]="spider";
                        qpa[4][3]="closed spaces";
                        qpa[4][4]="None of the above";

                        qpa[5][0]="Pure water has a pH level of a around?";
                        qpa[5][1]="7";
                        qpa[5][2]="8";
                        qpa[5][3]="1";
                        qpa[5][4]="2";

                        qpa[6][0]="How many bones do sharks have in their bodies?";
                        qpa[6][1]="162";
                        qpa[6][2]="300";
                        qpa[6][3]="565";
                        qpa[6][4]="0";

                        qpa[7][0]="What famous scientist was awarded the 1921 Nobel Prize in Physics for his work on theoretical physics?";
                        qpa[7][1]="Nikola Tesla";
                        qpa[7][2]="Edison";
                        qpa[7][3]="Einstein";
                        qpa[7][4]=" Alexander Graham bell";

                        qpa[8][0]="What is the name of the element with the chemical symbol ‘He’";
                        qpa[8][1]="hydrogen";
                        qpa[8][2]="mercury";
                        qpa[8][3]="helium";
                        qpa[8][4]="None of the above";

                        qpa[9][0]="What is the name of the closest star to the earth?";
                        qpa[9][1]="Europa";
                        qpa[9][2]="sun";
                        qpa[9][3]="andromeda";
                        qpa[9][4]="Io";

                       
                        //qca stores pairs of question and its correct answer
                        qca=new String[10][2];
                       
                        qca[0][0]="What is the biggest planet in our solar system?";
                        qca[0][1]="Jupiter";

                        qca[1][0]="What is the chemical symbol for the element oxygen?";
                        qca[1][1]="O2";

                        qca[2][0]=" Another name for a tidal wave is a?";
                        qca[2][1]="Tsunami";

                        qca[3][0]="The highest mountain on earth is?";
                        qca[3][1]="Mt Everest";


                        qca[4][0]="The fear of what animal is known as ‘arachnophobia’?";
                        qca[4][1]="spiders";

                        qca[5][0]="Pure water has a pH level of a around?";
                        qca[5][1]="7";

                        qca[6][0]="How many bones do sharks have in their bodies";
                        qca[6][1]="0";
                       
                        qca[7][0]="hat famous scientist was awarded the 1921 Nobel Prize in Physics for his work on theoretical physics";
                        qca[7][1]="Einstein";
                       
                        qca[8][0]="What is the name of the element with the chemical symbol ‘He’";
                        qca[8][1]="helium";

                        qca[9][0]="What is the name of the closest star to the earth?";
                        qca[9][1]="sun";
                       
                        //create a map object to store pairs of question and selected answer
                        map=new HashMap<Integer, String>();
                       
                        }
}
class  QuizGame extends JFrame {
            JPanel panel;
            JPanel panelresult;
            JRadioButton choice1;
            JRadioButton choice2;
            JRadioButton choice3;
            JRadioButton choice4;
            ButtonGroup bg;
            JLabel lblmess;
		JTextArea textArea;
            JButton btnext, btback;
         //   String[][] qpa;
         //   String[][] qca;
            int qaid;
          //  HashMap<Integer, String> map;

            QuizGame(){
                     
                      setTitle("Quiz Program");
                     setDefaultCloseOperation(EXIT_ON_CLOSE);
                      setSize(780,480);
                     setLocation(300,100);
                      setResizable(false);
                      Container cont=getContentPane();

                      cont.setLayout(null);             
                                         cont.setBackground(new Color(255, 62, 150));
                   bg=new ButtonGroup();     
                   
                    choice1=new JRadioButton("Choice1",true);
                    choice2=new JRadioButton("Choice2",false);
                    choice3=new JRadioButton("Choice3",false);
                    choice4=new JRadioButton("Choice4",false);
                    bg.add(choice1);
                    bg.add(choice2);
                    bg.add(choice3);
                    bg.add(choice4);
                    //lblmess=new JLabel("Choose a correct anwswer");
                    //lblmess.setForeground(Color.BLUE);
                    //lblmess.setFont(new Font("Serif", Font.BOLD, 16));
		    textArea = new JTextArea("...");
			textArea.setLineWrap(true);
			textArea.setWrapStyleWord(true);
			textArea.setEditable(false);
			textArea.setBackground(new Color(255, 192, 203));
			textArea.setForeground(Color.BLACK);
			textArea.setFont(new Font("Serif", Font.BOLD, 16));
			//JScrollPane scrollPane = new JScrollPane(textArea);
		    ActionListener next = new nextp();
		    ActionListener back = new backp();
                    btnext=new JButton("Next");
                    btnext.setForeground(Color.WHITE);  
		    btnext.setBackground(Color.BLACK);
		    btnext.setFont(new java.awt.Font("Serif", Font.BOLD, 16));              
                    btnext.addActionListener(next);
		    btback = new JButton("Back to categories");
                    btback.setForeground(Color.WHITE);  
		    btback.setBackground(Color.BLACK);
		    btback.setFont(new java.awt.Font("Serif", Font.BOLD, 16)); 
		    btback.addActionListener(back);
                    panel=new JPanel();
                    panel.setBackground(Color.WHITE);
                    panel.setLocation(10,10);
                    panel.setSize(750,500);
                    panel.setLayout(new GridLayout(8,1));
		//    GridBagConstraints c = new GridBagConstraints();
                    panel.add(textArea);
                    panel.add(choice1);
                    panel.add(choice2);
                    panel.add(choice3);
                   panel.add(choice4);
                   panel.add(btnext);
		   panel.add(btback);
                    cont.add(panel);
                    setVisible(true);
                    qaid=0;
                    readqa(qaid);
           
            }
        private class nextp implements ActionListener {
        	public void actionPerformed(ActionEvent e){
           
                        if(btnext.getText().equals("Next")){
                                    if(qaid<9){
                                               
                                                map.put(qaid,getSelection());
                                                qaid++;
                                                readqa(qaid);
                                                }
                                    else {
                                                map.put(qaid,getSelection());
                                                btnext.setText("Calculate score");
                                               
                                             }
                                    }
                        else if(btnext.getText().equals("Calculate score"))
                                    new Score();
                       
                       
            }
	}
	private class backp implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			
			new Cat();	
			setVisible(false);
		}
	}
           

        public String getSelection(){
                        String selectedChoice=null;
                        Enumeration<AbstractButton> buttons=bg.getElements(); 
                        while(buttons.hasMoreElements()) 
                        { 
                        JRadioButton temp=(JRadioButton)buttons.nextElement(); 
                        if(temp.isSelected()) 
                                    { 
                                                selectedChoice=temp.getText();
                                    } 
                         }  
                        return(selectedChoice);
            }


        public void readqa(int qid){
                        textArea.setText("  "+qpa[qid][0]);
                        choice1.setText(qpa[qid][1]);
                        choice2.setText(qpa[qid][2]);
                        choice3.setText(qpa[qid][3]);
                        choice4.setText(qpa[qid][4]);
                        choice1.setSelected(true);
            }
      public void reset(){
                        qaid=0;
                        map.clear();
                        readqa(qaid);
                        btnext.setText("Next");
                        }
       public int calCorrectAnswer(){
                        int qnum=10;
                        int count=0;
                        for(int qid=0;qid<qnum;qid++)
                                    if(qca[qid][1].equals(map.get(qid))) count++;
                        return count;
            }

      public class Score extends JFrame{
		
		Score(){
		setTitle("Quiz Program");             
        	setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(600,450);
        	setLocation(300,100);
		JPanel spanel;
		Container scont = getContentPane();
		scont.setLayout(null);	
		scont.setBackground(new Color(193, 255, 193));
		int scoreno = calCorrectAnswer();
		JLabel score = new JLabel("                     Number of correct answers : " + scoreno);
		JLabel remark;
		if(scoreno < 3)
			remark = new JLabel("                    BETTER LUCK NEXT TIME! :(");
		else if(scoreno < 7)
			remark = new JLabel("                    GOOD..! CAN DO BETTER :)");
		else
			remark = new JLabel("                    CONGRATULATIONS! AMAZING SCORE! :D :D");
		JButton btans = new JButton("Show answers");
		btans.setForeground(Color.WHITE);
		btans.setBackground(Color.BLACK);
		JButton bttry = new JButton("Try Again");
		bttry.setForeground(Color.WHITE);
		bttry.setBackground(Color.BLACK);
		ActionListener showans = new showansp();
		ActionListener tryag = new tryagp();
		btans.addActionListener(showans);
		bttry.addActionListener(tryag);
		spanel = new JPanel();
		spanel.setBackground(new Color(193, 255, 193));
		spanel.setLocation(10,10);
        	spanel.setSize(400,300);
        	spanel.setLayout(new GridLayout(8,1,0,10));
		spanel.add(score);
		spanel.add(remark);
		spanel.add(btans);
		spanel.add(bttry);
		spanel.setSize(550,400);
		scont.add(spanel);
        	setVisible(true);
		try {
			FileWriter wr = new FileWriter("HighScores.txt");
			PrintWriter pwr = new PrintWriter(wr);
			pwr.println(Name + "         " + scoreno);
			pwr.close();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
	private class showansp implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			new Report();

		}
	}
	private class tryagp implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			new Cat();
			setVisible(false);
		}
	}

}
      public class Report extends JFrame{
                        Report(){
                                    setTitle("Answers");
                                    setSize(1000,550);
                                    setBackground(new Color(189, 252, 201));
                                    addWindowListener(new WindowAdapter(){
                                                            public void windowClosing(WindowEvent e){
                                                                        dispose();
                                                                        reset();
                                                            }
                                                });
                                    Draw d=new Draw();                                  
                                    add(d);
                                    setVisible(true);
                                    }
                       
                       
                   class Draw extends Canvas{
                                    public void paint(Graphics g){
                                                int qnum=10;
                                                int x=10;
                                                int y=20;
                                                for(int i=0;i<qnum;i++){
                                                            //print the 1st column
                                                            g.setFont(new Font("Serif",Font.BOLD,12));                                         
                                                            g.drawString(i+1+". "+qca[i][0], x,y);
                                                            y+=30;           
                                                            g.setFont(new Font("Serif",Font.PLAIN,12));                             
                                                            g.drawString("      Correct answer:"+qca[i][1], x,y);
                                                            y+=30;
                                                            g.drawString("      Your answer:"+map.get(i), x,y);
                                                            y+=32;
                                                            //print the 2nd column
                                                            if(y>400)
                                                            {y=20;
                                                              x=650;
                                                            }
                                                           
                                                }
                                                //Show number of correct answers
                                               // int numc=calCorrectAnswer();
                                               // g.setColor(Color.BLUE);
                                               // g.setFont(new Font("Arial",Font.BOLD,14));
                                               // g.drawString("Number of correct answers:"+numc,300,500);
                       
                                               
                                    }
                        }
                                   
            }
           
 }          

}
/*
public class QuizProgram{
 
            public static void main(String args[]){
                         new Quiz();
  
            }


}*/

