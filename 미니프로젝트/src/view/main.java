package view;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import controller.gameController;
import javazoom.jl.player.MP3Player;
import model.DAO;
import model.User;
import model.musicDTO;
import model.userRank;

public class main {

	public static void main(String[] args) {
		Random ran = new Random();
		Scanner sc = new Scanner(System.in);
		DAO dao = new DAO();
		MP3Player mp3 = new MP3Player();

		System.out.println("กเกเกเกเกเกเกเกเกเกเกเกเกเกเกเกเกเกเกเกเกเกเกเกเกเกเกเกเกเกเกเกเกเกเกเกเกเกเกเกเกเกเกเกเกเกเกเกเกเกเกเกเกเกเกเกเกเกเกเกเกเกเกเกเกเกเกเกเกเกเกเ");
		System.out.println("กเกแกเกเกเกเกเกเกเกแกเกเกแกเกเกเกเกแกเกเกเกแกแกแกแกเกเกเกแกเกเกเกเกแกแกแกแกเกเกเกเกเกเกเกเกเกแกแกแกเกเกเกเกแกเกเกเกเกแกเกเกแกเกเกแกแกแกแกแกแกเ");
		System.out.println("กเกแกแกเกเกเกเกเกแกแกเกเกแกเกเกเกเกแกเกเกแกเกเกเกเกแกเกเกแกเกเกเกแกเกเกเกเกแกเกเกเกเกเกเกเกแกเกเกเกแกเกเกเกแกเกเกเกเกแกเกเกแกเกเกเกเกเกเกเกแกเ");
		System.out.println("กเกแกแกเกเกเกเกเกแกแกเกเกแกเกเกเกเกแกเกเกแกเกเกเกเกแกเกเกแกเกเกแกเกเกเกเกเกเกเกเกเกเกเกเกแกเกเกเกเกเกแกเกเกแกเกเกเกเกแกเกเกแกเกเกเกเกเกเกแกเกเ");
		System.out.println("กเกแกเกแกเกเกเกแกเกแกเกเกแกเกเกเกเกแกเกเกแกเกเกเกเกเกเกเกแกเกเกแกเกเกเกเกเกเกเกเกเกเกเกเกแกเกเกเกเกเกแกเกเกแกเกเกเกเกแกเกเกแกเกเกเกเกเกแกเกเกเ");
		System.out.println("กเกแกเกแกเกเกเกแกเกแกเกเกแกเกเกเกเกแกเกเกเกแกแกเกเกเกเกเกแกเกเกแกเกเกเกเกเกเกเกเกเกเกเกเกแกเกเกเกเกเกแกเกเกแกเกเกเกเกแกเกเกแกเกเกเกเกเกแกเกเกเ");
		System.out.println("กเกแกเกเกแกเกแกเกเกแกเกเกแกเกเกเกเกแกเกเกเกเกเกแกแกเกเกเกแกเกเกแกเกเกเกเกเกเกเกเกเกเกเกเกแกเกเกเกเกเกแกเกเกแกเกเกเกเกแกเกเกแกเกเกเกเกแกเกเกเกเ");
		System.out.println("กเกแกเกเกแกเกแกเกเกแกเกเกแกเกเกเกเกแกเกเกเกเกเกเกเกแกเกเกแกเกเกแกเกเกเกเกเกเกเกเกเกเกเกเกแกเกเกเกเกเกแกเกเกแกเกเกเกเกแกเกเกแกเกเกเกแกเกเกเกเกเ");
		System.out.println("กเกแกเกเกเกแกเกเกเกแกเกเกแกเกเกเกเกแกเกเกแกเกเกเกเกแกเกเกแกเกเกแกเกเกเกเกเกเกเกเกเกเกเกเกแกเกเกเกแกเกแกเกเกแกเกเกเกเกแกเกเกแกเกเกเกแกเกเกเกเกเ");
		System.out.println("กเกแกเกเกเกแกเกเกเกแกเกเกแกเกเกเกเกแกเกเกแกเกเกเกเกแกเกเกแกเกเกเกแกเกเกเกเกแกเกเกเกเกเกเกเกแกเกเกเกแกเกเกเกแกเกเกเกเกแกเกเกแกเกเกแกเกเกเกเกเกเ");
		System.out.println("กเกแกเกเกเกเกเกเกเกแกเกเกเกแกแกแกแกเกเกเกเกแกแกแกแกเกเกเกแกเกเกเกเกแกแกแกแกเกเกเกเกเกเกเกเกเกแกแกแกเกแกเกเกเกแกแกแกแกเกเกเกแกเกเกแกแกแกแกแกแกเ");
		System.out.println("กเกเกเกเกเกเกเกเกเกเกเกเกเกเกเกเกเกเกเกเกเกเกเกเกเกเกเกเกเกเกเกเกเกเกเกเกเกเกเกเกเกเกเกเกเกเกเกเกเกเกเกเกเกเกเกเกเกเกเกเกเกเกเกเกเกเกเกเกเกเกเ");

		//ธ?ดบ รโทย
		while (true) {
			mp3.play("C:\\Users\\GITCT\\Desktop\\ณ๋ทก\\ภฮฦฎทฮ.mp3");
			System.out.println("ฆฎฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆฏ");
			System.out.println("ฆข   [1] ทฮฑืภฮ  [2] ศธฟ๘ฐกภิ  [3] มพทแ   ฆข");
			System.out.println("ฆฑฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆฐ");
			System.out.print("ธ?ดบ >> ");
			int input1 = sc.nextInt();
			if (input1 == 1) {
				System.out.println("ฆกฆกฆกฆกฆกฆกฆกฆก  Log In  ฆกฆกฆกฆกฆกฆกฆกฆก");
				System.out.print("พฦภฬต๐ ภิทย : ");
				String id = sc.next();

				System.out.print("บ๑นะน๘ศฃ ภิทย : ");
				String pw = sc.next();
				System.out.println("ฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆก");
				
				String nickName = dao.userLogin(id, pw);
				if (nickName != null) {
					System.out.println();
					System.out.println(nickName + "ดิ พ๎ผญฟภผผฟไ~ข?");
					mp3.stop();

					while (true) {
						System.out.println();
						System.out.println("กฺฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกกฺ");
						System.out.println("    [1] ฐิภำวฯฑโ [2] ทฉลทบธฑโ [3] ฐิภำผณธํ [4] ทฮฑืพฦฟ๔");
						System.out.println("กฺฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกกฺ");
						System.out.print("ธ?ดบ >> ");
						int input2 = sc.nextInt();
						
						System.out.println();
						if (input2 == 1) {
							System.out.println("ฐิภำวฯฑโธฆ ผฑลรวฯผฬฝภดฯดู.");
							System.out.print("ฐณน฿ภฺฐก ณ๋ทกธฆ ฑ?พ๎ฟภฐํ ภึฝภดฯดู. ภแฝรธธ ฑโดูทมมึผผฟไ");
							
							
							Thread thread = new Thread();
							
							try {
								for(int i =0; i<5; i++) {
									thread.sleep(500);
									System.out.print(" . ");
								}
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							
							
							System.out.println();
							gameController game = new gameController();
											
							game.play(id, nickName);

							
						} else if (input2 == 2) {
							System.out.println();
							System.out.println("ฆกฆกฆกฆกฆกฆกฆกฆกฆก ทฉลท ฆกฆกฆกฆกฆกฆกฆกฆก");
							
							ArrayList<userRank> resultList = dao.getRankingList();

							
							for(int i = 0; i<resultList.size(); i++) {
								System.out.println(resultList.get(i).toString());
								
								
							}
							System.out.println("ฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆก");
							System.out.println();

						} else if (input2 == 3) {
							System.out.println();
							System.out.println("กฺฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกกฺ");
							System.out.println("ฐิภำภบ รั 3ฐกม๖ ภฏว?ภธทฮ รโมฆ ตหดฯดู.");
							System.out.println("ธ๑ผ๛ภบ 3ฐณทฮ ฝรภ?วฯฐํ รั 10น๘ภว มคดไภิทย ฑโศธฐก มึพ๎ม?ดฯดู.\n");
							System.out.println("รนน๘ยฐ, TTS ภฝผบภธทฮ ฐกป็ต่ฐํ มฆธ๑ธยร฿ฑโ\n");
							System.out.println("ตฮน๘ยฐ, ฐกป็ต่ฐํ ผาภ? ธยร฿ฑโ");
							System.out.println("* ถ็พ๎พฒฑโ พ๘ภฬ ภิทยวฯผผฟไ.\n");
							System.out.println("ผผน๘ยฐ, ผผฐกม๖ ศฅวีตศ ณ๋ทก ม฿ฟก ฦ๗วิตวม๖ พสภบ ณ๋ทก ธยร฿ฑโ");
							System.out.println("* ผ?ภฺธฆ ภิทยวฯผผฟไ.\n");
							System.out.println("TTSนฎมฆ 100มก, ฐกป็ธยร฿ฑโ 200มก, มฆธ๑ธยร฿ฑโ 300มก");
							System.out.println("กฺฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกฆกกฺ");
							System.out.println();
						} else if (input2 == 4) {
							System.out.println("ทฮฑืพฦฟ๔ วฯผฬฝภดฯดู.");
							break;
						} else {
							System.out.println("ภ฿ธ๘ตศ ผ?ภฺธฆ ภิทยวฯผฬฝภดฯดู.");
						}
					}

				} else
					System.out.println("ทฮฑืภฮ ฝวฦะ");
				mp3.stop();

			} else if (input1 == 2) {
				System.out.println("===== ศธฟ๘ฐกภิ =====");
				System.out.print("พฦภฬต๐ ภิทย : ");
				String id = sc.next();

				System.out.print("บ๑นะน๘ศฃ ภิทย : ");
				String pw = sc.next();

				System.out.print("ดะณืภำ ภิทย : ");
				String nick = sc.next();

				int row = dao.join(id, pw, nick);

				if (row > 0) {
					System.out.println("ศธฟ๘ฐกภิ ฟฯทแ!!");
					mp3.stop();
				} else {
					System.out.println("ศธฟ๘ฐกภิ ฝวฦะ คะคะ");
				}

			} else if (input1 == 3) {
				System.out.println("มพทแวีดฯดู.");
				mp3.stop();
				break;

			} else {
				System.out.println("ภ฿ธ๘ตศ ผ?ภฺธฆ ภิทยวฯผฬฝภดฯดู.");
			}
		}

	}

	

}