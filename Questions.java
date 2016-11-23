/****************************
* Author:Jude
****************************/
package finalProject1400;

public class Questions {
	public String getQuestion(int index) {
		return questions[index];
	}

	private String[] questions = {
			String.format("Which one of these personality traits best describes you? %n"
					+ " 1 - Courage %n 2 - Dependability %n 3 - Responsiveness %n 4 - Loyalty %n 5 - Exuberance %n"
					+ " 6 - Conscientiousness %n 7 - Charm %n 8 - Idealism %n 9 - Optimism %n 10 - Steadiness %n"
					+ " 11- Friendliness %n 12 - Compassion"),
			// 1.Aries 2.Taurus 3.Gemini 4.Cancer 5.Leo 6.Virgo 7.Leo 8.Scorpio
			// 9.Sagittarius 10.Capricorn
			// 11. Aquarius 12. Pisces

			String.format("Be honest with yourself. Which one of these negative traits best desribes you? %n"
					+ " 1 - Manipulative %n 2 - Cold %n 3 - Pessimistic %n 4 - Impatient %n 5 - Secretive %n 6 - "
					+ "Indecisive %n 7 - Petty %n 8 - Bossy %n 9 - CLingy %n 10 - Sarcastic %n 11 - Stubborn %n "
					+ "12 - Impulsive"),
			// 1.Pisces 2.Aquarius 3.Capricorn 4.Sagittarius 5.Scorpio 6.Libra
			// 7.Virgo 8.Leo 9.Cancer
			// 10.Gemini 11.Taurus 12.Aries

			String.format("Which one of these is most likely to cause you stress? %n"
					+ " 1 - You forgot to slow down, and take a lazy day%n 2 - Not enough time to finish a "
					+ "task just the way you want%n 3 - Someone spells or mispronounces a word%n 4 - "
					+ "Being brushed off or offended by someone%n 5 - Not being in complete control of "
					+ "a situation%n 6 - You are over thinking something%n 7 - Not being treated fairly by the "
					+ "people around you%n 8 - No one is taking you seriously%n 9 - Being stuck in traffic%n"
					+ "10 - You demanded to much from yourself%n 11 - something that would make an aquarius "
					+ "stressed out%n 12 - Public speaking"), };
}