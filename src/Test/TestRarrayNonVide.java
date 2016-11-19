package Test;
import rarray.*;
import org.junit.*;
import static org.junit.Assert.*;
/**
 * 
 * @author paul
 * @version 1.0.0
 * @since JDK1.8
 * 创建时间：2016年10月15日
 * 功能描述：判断Rarray非空
 * 邮箱地址：yangnaihua.2008@163.com
 */
public class TestRarrayNonVide {
	
	//全局变量
	Rarray A;
	Object a,b,c,d;
	
	@Before
	public void creerRarrayNonVide() throws Exception {

		try {
			A = new Rarray(10);//创建一个Rarray
			a = new Object();
			b = new Object();
			c = new Object();
			d = new Object();
			
			//添加对象到Rarray中
			A.add(a);
			A.add(b);
			A.add(c);
			A.add(a);
			A.add(a);
			A.add(c);
		} catch (RarrayError e) {
			//如果失败
			fail();
		}
	}

	// objectif : tester la suppression d'un objet present plusieurs fois
	//测试目标：测试删除对象（同时拥有多个对象）操作
	// resultat attendu : une seule occurrence de l'objet est supprimée
	//预期结果：只有一个对象被删除
	
	@Test
	public void removeMult() {
		
		Boolean r = A.remove(a);// appel de remove avec l'objet a present 3 fois
								//对拥有3次的a对象进行删除操作
		
		// on verifie que remove a renvoye vrai,检查是否删除成功
		assertTrue(r);
		// que la taille du Rarray est egale a 5,判断是都还有五个对象
		assertEquals(5,A.size());
		System.out.println(A.size()+"------A.size");
		// qu'il contient toujours a, b et c判断是否还包含对象a,b,c
		assertTrue(A.contains(a));
		assertTrue(A.contains(b));
		assertTrue(A.contains(c));

		// avec 2 occurrences de a et de c et 1 de 判断还有几个对应的a,b,c对象
		assertEquals(2,A.nbOcc(a));
		System.out.println(A.nbOcc(b)+"------A.nbocc");
		assertEquals(1,A.nbOcc(b));
		assertEquals(2,A.nbOcc(c));
	}
	
	// objectif : l'ajout d'un element existant dans le tableau
	//测试目标：测试添加对象操作
	// resulat attendu : l'ajout a bien ete fait
	//预期结果：对象被成功添加
	@Test
	public void addExistant () {
		
		A.add(a); //Rarray 中新添加对象a
		
		assertEquals(7,A.size());//判断是否已经有七个对象
		assertTrue(A.contains(a));
		assertTrue(A.contains(b));
		assertTrue(A.contains(c));

		assertEquals(4,A.nbOcc(a));//对应的对象a一共四个
		assertEquals(1,A.nbOcc(b));//对应的对象b一共一个
		assertEquals(2,A.nbOcc(c));//对应的对象c一共两个
	}
	
	
	// objectif : test remove all 
	//测试目标：移除所有的对象操作
	// resulat attendu : remove a bien ete fait 
	//预期结果：所有对象被成功移除
	@Test
	public void removeAll () {
		Boolean bremoveAll = A.removeAll(a);
		System.out.println(bremoveAll +"------A.removeAll(a)");
		assertTrue(bremoveAll);
	}
	

	
	// objectif : clear existant dans le tableau
	//测试目标：清除所有的对象操作
	// resulat attendu : clear a bien ete fait
	//预期结果：清所有对象被成功清除
	@Test
	public void clear () {
		A.clear();
		System.out.println("------A.clear");
	}
	
	
	// objectif : contains quelque chose dans le tableau
	//测试目标：是否包含对象
	// resulat attendu : si contains return v sinon f
	//预期结果：清所有对象被成功清除
		@Test
	public void  contains () {
			
			assertTrue(A.contains(a));
			System.out.println("------A.contains(a)");
	}
		
		
	// objectif : nbocc quelque chose dans le tableau
	//测试目标：是否包含对象-------？
	// resulat attendu : -----？
	@Test
	public void nbOcc() { 
	    assertNotNull(A.nbOcc(c));
	
	}
	
	// objectif : 测试rarray中的容量
	// resulat attendu :显示正确的容量大小
	@Test
	public void size() { 
		A.add(a); //Rarray 中新添加对象a
		
		assertEquals(7,A.size());//判断是否已经有七个对象
	
	}
		
	
	
}
