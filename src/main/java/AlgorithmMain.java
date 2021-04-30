import java.lang.reflect.Method;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import com.datastructure.Array;
import com.ifuwanna.cls.TestClass;
import com.programmers.SkillCheck;
import com.programmers.SkillCheck2;
import com.programmers.Sort;
import com.ifuwanna.*;
import sun.swing.plaf.windows.ClassicSortArrowIcon;

public class AlgorithmMain {

	public static void main(String[] args) throws ParseException {

		//Loop.LoopMain();
		ClassInfo.main();

		Scanner sc = new Scanner(System.in);
		SkillCheck skillCheck = new SkillCheck();
		SkillCheck2 skillCheck2 = new SkillCheck2();
		Sort sort = new Sort();
		
		Array array = new Array();
		array.main();

		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date fromDate= simpleDateFormat.parse("2020-06-30 23:59:99");

		//System.out.println(skillCheck2.solution4(new int[][]{{0,1,1,1},{1,1,1,1},{1,1,1,1},{0,0,1,0}}));
		
		//sort.solution3(new int[]{3, 0, 6, 1, 5});
		//sort.solution2(new int[]{3, 30, 34, 5, 9});

/*		//input
		System.out.println("입력 :");
		int i = sc.nextInt();
		String s = sc.next();

		//result
		System.out.println("level1.solution1 :");
		System.out.println(level1.solution1(i));
		System.out.println("level1.solution2 :");		
		System.out.println(level1.solution2(s));
		
		System.out.println("skillCheck.solution2 :");		
		System.out.println(skillCheck.solution2(s));*/
		
		
	}

}
