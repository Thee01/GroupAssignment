/*
 * Questions and getter
 */

package zodiacGame;


public class Questions {
	Dialogue dialogue = new Dialogue();	
	
	public String getQuestion(int index) {
		return questions[index];
	}

public String[] questions =  {
			String.format("n/a n/a"),
			
			String.format("Which one of these personality traits best describes you? %n 1 – Courageous%n 2 – Dependable%n 3 – Responsive%n"
					+ " 4 – Loyal%n 5 – Exuberance%n 6 – Conscientiousness%n 7 - Charming%n 8 – Idealistic%n 9 – Optimistic%n 10 – Steady%n" 
					+ " 11 – Friendly%n 12 – Compassionate%n"), 
			// 1.Aries 2.Taurus 3.Gemini 4.Cancer 5.Leo 6.Virgo 7.Libra 8.Scorpio 9.Sagittarius 10.Capricorn 
			// 11. Aquarius 12. Pisces
			//REPLY: "Good for you! Next question."
			
			String.format("What about these personality traits? Be honest with yourself.%n 1 – Impulsive%n 2 – Stubborn%n 3 – Sarcastic%n"
					+ " 4 – Clingy%n 5 – Bossy%n 6 – Petty%n 7 – Indecisive%n 8 – Secretive%n 9 – Impatient%n 10 – Pessimistic%n 11 – Cold%n"
					+ " 12 – Manipulative"),
			// 1.Aries 2.Taurus 3.Gemini 4.Cancer 5.Leo 6.Virgo 7.Libra 8.Scorpio 9.Sagittarius 10.Capricorn 
			// 11. Aquarius 12. Pisces
			//REPLY: "Yikes. You should work on that. Next!"
			
			String.format("What are you most likely to be insecure about out of these?%n 1 – Your loud voice%n 2 – Your lack of money%n 3 – How many people like you%n"
					+ " 4 – Everything!%n 5 -  How pretty/handsome you are%n 6 - How nerdy you are%n 7 – If you are annoying to people or not%n" 
					+ " 8 – How many secrets you have...%n 9 – Your loud personality%n 10 - Being judged by people%n 11 – Whether your friends "
					+ "secretly hate you%n 12 –  If you are a good person"),
			// 1.Aries 2.Taurus 3.Gemini 4.Cancer 5.Leo 6.Virgo 7.Libra 8.Scorpio 9.Sagittarius 10.Capricorn 
			// 11. Aquarius 12. Pisces
			//REPLY: I would be insecure about that too... anyways. Next question.
			

		    String.format("If you could study one of these subjects for fun, which would it be?%n 1 - Physical education%n 2 - Culinary arts%n 3 - English%n "
		    		+ "4 - Social Studies%n 5 - Drama%n 6 - Biology%n 7 - Legal Studies%n 8 - Psychology%n 9 - Philosophy%n 10 - Government Studies%n"
		    		+ " 11 - Anthropology%n 12 - Art History"), 
			// 1.Aries 2.Taurus 3.Gemini 4.Cancer 5.Leo 6.Virgo 7.Libra 8.Scorpio 9.Sagittarius 10.Capricorn 
			// 11. Aquarius 12. Pisces
			//REPLY: Very revealing. Let's move on		    
			
		    String.format("Choose your dream job from this list.%n 1 – Entrepreneur%n 2 – Designer%n 3 – Architect%n 4 – CEO%n 5 – Musician%n"
					+ " 6 – Teacher%n 7 – Diplomat%n 8 – Detective%n 9 - Public Relations%n 10 - Scientist%n 11 - Artist%n 12 – Nurse%n"
					+ " 13 – My dream job isn't on this list!"),
			// 1.Aries 2.Taurus 3.Gemini 4.Cancer 5.Leo 6.Virgo 7.Libra 8.Scorpio 9.Sagittarius 10.Capricorn 
			// 11. Aquarius 12. Pisces 13.conversation
			//REPLY: Good luck with that.
			
			//REPLY to 13: Program: Did I ask you if your dream job was on this list? No? Okay then pick one.
			// guys is it easier if we don't have user options to reply to this? Or can we fit them in? Do you think they would add? 
			
		    String.format("Okay, time to go a little deeper. Which one of these describes you when you are at work?%n 1 - Playing loud music to combat bordom%n "
		    		+ "2 - Mostly on Facebook%n 3 - Stumble in late drinking your third cup of coffee%n 4 - Complaining to HR about someone playing loud "
		    		+ "music%n 5 - Basically begging for a promotion%n 6 - Employee of the month every month%n 7 - Always schmoozing with the higher ups%n "
		    		+ "8 - You're required to take attend anger managment classes%n 9 - All your co-workers love you%n 10 - You keep a list of people you "
		    		+ "want fired%n 11 - You get most of your sleep in at work%n 12 - Finds the easiest ways to do things (lazy)"), 
			// 1.Aries 2.Taurus 3.Gemini 4.Cancer 5.Leo 6.Virgo 7.Libra 8.Scorpio 9.Sagittarius 10.Capricorn 
			// 11. Aquarius 12. Pisces
		    //You are gonna go far kid. 
			
		    String.format("What do people do that really makes you mad?%n 1 – People who take forever to text back%n 2 – People who don't clean up after themselves%n"
                    + " 3 - People who interrupt you when you're talking%n 4 - People who are forgetful%n 5 – People who don't pay enough attention%n"
                    + " 6 – People complain to them often%n 7 – People who don't like loud music%n 8 - People who aren't open books%n"
                    +  " 9 - People who don't speak their mind%n 10 – People who want to borrow things%n 11 – People who like to tease you%n 12 – People who are sarcastic"),
			// 1.Aries 2.Taurus 3.Gemini 4.Cancer 5.Leo 6.Virgo 7.Libra 8.Scorpio 9.Sagittarius 10.Capricorn 
			// 11. Aquarius 12. Pisces
		    //REPLY: Ugh, me too girl, me too.
		    
		    String.format("What is most important to you in a friendship?%n 1 - That you get enough space to be independent %n 2 - Your friends let you be stubborn once in a while%n"
		    		+ " 3 - Your friends must be able to laugh at themsleves%n 4 - You always need to feel supported%n 5 - You are always taken seriously%n 6 - You're friends can't try to change"
		    		+ "your beliefs%n 7 - You must be able to spend a lot of time with your friends%n 8 - Your friends must be able to mind their own business%n 9 - Your friends must be "
		    		+ "confident in themselves%n 10 - Your friends must be funny%n 11 - Your friends must be able to take sarcasm%n 12 - Your friends must enjoy the finer things in life"
		    		+ "%n 13 - How much longer is this going to take? Are you ever going to guess my Zodiac sign? "),
			// 1.Aries 2.Taurus 3.Gemini 4.Cancer 5.Leo 6.Virgo 7.Libra 8.Scorpio 9.Sagittarius 10.Capricorn 
			// 11. Aquarius 12. Pisces 13.conversation
		    //REPLY: At least you have your priorities straight. 
		    
		    //REPLY to 13: Are you ever going to stop interrupting me? I'll ask again.
		    
		    String.format("Which one of these sounds like the best vacation?%n 1 - Going to Machu Pichu so you can brag to everyone about it%n 2 - Getting day drunk at a winery in Tuscany%n"
		    		+ " 3 - Anywhere, as long as you visit more than one city. Gotta get all the vibez %n 4 - Pretending to be rich at a spa in Palm Springs %n 5 - Celebrating \"Carnival\" in Rio De Janeiro for three days straight%n 6 - Seeing 10 European cities in a week"
		    		+ " because you are organized enough for that%n 7 - Doing all the romatic things that someone visiting Paris would do%n 8 - Avoiding your family and friends in a "
		    		+ "in a villa in the Maldives%n 9 - Visiting the Australian outback and coming back with an animal attack story%n 10 - Honestly vacations can wait until"
		    		+ " you've saved a million dollars and retired%n 11 - Getting lost in Iceland- literally. You have a terrible sense of direction%n 12 - If you can see a sparkling blue ocean"
		    		+ " you don't care where you are"),
			// 1.Aries 2.Taurus 3.Gemini 4.Cancer 5.Leo 6.Virgo 7.Libra 8.Scorpio 9.Sagittarius 10.Capricorn 
			// 11. Aquarius 12. Pisces
		    //REPLY: Sounds dreamy. We should go sometime.
		    
		    String.format("Choose one of these foods. What does this have to do with your Zodiac sign? Wait and be amazed.%n 1 - Chips and Dip%n 2 - Something chocolate%n 3 - Anything"
		    		+ " between two pieces of bread%n 4 - Leftovers%n 5 - Gratuitous amount of pizza%n 6 - Celery%n 7 - A beautiful tapas plate%n 8 - A steak cooked rare%n 9 - "
		    		+ "Cookies and milk%n 10 - Cheesecake%n 11 - Top Ramen%n 12 - Ice Cream"),
			// 1.Aries 2.Taurus 3.Gemini 4.Cancer 5.Leo 6.Virgo 7.Leo 8.Scorpio 9.Sagittarius 10.Capricorn 
			// 11. Aquarius 12. Pisces 
			//REPLY: Almost there.  
		    
		    String.format("Okay, are you ready to get really personal? How do you act when you have a crush on someone?%n 1 - You give them awkward sideways glances constantly%n 2 - Let them"
		    		+ " copy all of your homework%n 3 - You can't shut yourself up around them%n 4 - LOTS of flirting%n 5 - You must be showing off at every second%n 6 - You are pretty"
		    		+ " rude to them%n 7 - You don't have crushes on people. They have crushes on you%n 8 - Stalk them on every social media ever created%n 9 - You just come out with it"
		    		+ "%n 10 - Can't stop making really unfunny jokes%n 11 - Pretends they don't exist%n 12 - Overload them with questions%n 13 - I really don't want to get personal"
		    		+ " with you"), 
			// 1.Aries 2.Taurus 3.Gemini 4.Cancer 5.Leo 6.Virgo 7.Libra 8.Scorpio 9.Sagittarius 10.Capricorn 
			// 11. Aquarius 12. Pisces 13.conversation
		    //Reply: AWKWARD. 
		    
		    //And I really don't want to have to raise my voice with you, so please answer me.
		    
		    String.format("What do you do when someone breaks up with you??%n 1 - Go mental for a week, and then make a complete recovery"
		    		+ "%n 2 - Changes address, phone number, name and facebook status%n 3 - You had a plan B anyways so whatever%n 4 - You take all the mutual friends "
		    		+ "in the break up%n 5 - Throw everything they own out the window%n 6 - Talk an endless amount of trash on your ex%n 7 - Wait a few years and then crash "
		    		+ "their wedding%n 8 - Become a professional detective%n 9 - *never gets broken up with*%n 10 - They haven't broken up yet because you require them to submit "
		    		+ "an essay about why they want to break up first%n 11 - Try to date all their friends%n 12 - Convince them to get back together and then dump them instead"),
			// 1.Aries 2.Taurus 3.Gemini 4.Cancer 5.Leo 6.Virgo 7.Leo 8.Scorpio 9.Sagittarius 10.Capricorn 
			// 11. Aquarius 12. Pisces 
			//REPLY: I mean.. I guess that sounds reasonable?

		    String.format("What do you think you would find your best friend saying behind behind your back? If you don't have a best friend.. well then I guess use your imagination.%n"
		    			+ " 1 - They remind me of an invertebrate. Completely spineless%n"
		    			+ " 2 - OMG. They have a cold again so obviously life as we know it is over. %n"
		    			+ " 3 - They think they know everything don't they? Well last week they used the wrong you're.%n"
		    			+ " 4 - Level 100 Clinger. They seriously need to let go%n"
		    			+ " 5 - They would seriously break their own fingers to be the center of attention%n"
		    			+ " 6 - Don't invite them anywhere, they are the flakiest person you've ever met%n"
		    			+ " 7 - Have they ever made a decision in their life? Not that I can think of%n"
		    			+ " 8 - Just between you and me... I genuinely think they're evil.%n"
		    			+ " 9 - It's them or the highway, and I'm about 5 seconds from choosing the highway%n"
		    			+ " 10 - They make the WORST choices and then act like it isn't actually 100%% their own fault%n"
		    			+ " 11 - They are lowkey the most petty person I have ever met"
		    			+ " 12 - I didn't think it was physically possible to move as slow as they do"
		    			+ " and don't even think they wouldn't talk about you behind you're back, they've got a lot to talk about. Choose one."),
		    /*
	    String.format("What do you think you would find your best friend saying behind your back? If you don't have a best friend - well then I guess use your imagination%n 1 - \""
		    		+ "%s reminds me of an invertebrate. Completely spineless.\"%n 2 - \"%s has a cold again so obviously life as we know it is over.%n 3 - \"%n thinks they know "
		    		+ "everything don't they? Well last week they used the wrong you're.\"%n 4 -\"Level 100 Clingon. %s seriously needs to let go.\"%n 5 - \"%s would literally break "
		    		+ "their own fingers to be the center of attention\"%n 6 - \"Don't invite %s anywhere. They are the flakiest person you've ever met.\"%n 7 - \"Has %s ever made a "
		    		+ "decision in their life? Not that I can think of.\"%n 8 - \"Just between you and me... I genuinly think %s is evil\"%n 9 - \"It's %s's way or the highway. And "
		    		+ "I'm about five seconds from choosing the highway.\"%n 10 - \"%s makes the worst choices and then acts like it isn't actually 100%% their own fault\"%n 11 - \""
		    		+ "%s is lowkey the most petty person I have ever met\"%n 12 - \"I didn't think it was physically possible to move as slow as %s\"%n My best friend would never"
		    		+ "talk about me behind my back", dialogue.getName()),
			// 1.Aries 2.Taurus 3.Gemini 4.Cancer 5.Leo 6.Virgo 7.Leo 8.Scorpio 9.Sagittarius 10.Capricorn 
			// 11. Aquarius 12. Pisces 13.
			//REPLY: SPICY! I think I know exactly what your sign is.
		    
		    //HAHA yes they would. They've got a lot to talk about. Now choose one.  
		   
*/
	};
}
