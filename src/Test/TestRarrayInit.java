package Test;
import rarray.*;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * 
 * @author Paul
 * @version 1.0.0
 * @since JDK1.8
 * 创建时间：2016年10月15日
 * 功能描述：
 * 邮箱地址：yangnaihua.2008@163.com
 */
public class TestRarrayInit {
	Rarray A;

	//1.objectif : tester la creation d'un Rarray de capacite strictement positive
	//1.测试目标：测试创建含有容量的Rarry
	
	//2.resultat attendu : un Rarray de taille 0 est cree
	//2.预期结果：一个容量为0 的Rarray  被创建出来
	
    @Test
	public void initTaillePos() {
		try {
	        // appel du constructeur de Rarray avec une capacite strictement positive
			//创建一个Rarray
			A = new Rarray(10);
		} catch (Exception e) {
			// si l'appel au constructeur leve une exception, on fait echouer le test
			//如果失败，返回一个失败的方法fail（）
			fail();
		}

		// si l'appel au constructeur ne leve pas d'exception,
		//方法如果不是空的话
		// on verifie que le Rarray est cree et qu'il est de taille 0
		//方法进行比较
		assertNotNull(A);
		assertEquals(0,A.size());
		
	}
    
}
