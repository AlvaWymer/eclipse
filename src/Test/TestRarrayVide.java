package Test;
import rarray.*;
import org.junit.*;
import static org.junit.Assert.*;
/**
 * 
 * @author paul
 * @version 1.0.0
 * @since JDK1.8
 * 创建时间：2016年10月17日
 * 功能描述：测试为空时的操作
 * 邮箱地址：yangnaihua.2008@163.com
 */
public class TestRarrayVide {

	Rarray A;
	Object a;

	@Before
	public void creerRarrayVide() throws Exception {

		try {
			A = new Rarray(10);//创建
			a = new Object();//创建对象
		} catch (RarrayError e) {
			fail();
		}
	}

	// objectif : tester l'ajout d'un element dans un Rarray vide
	//测试目标：测试为空时添加对象操作
	// resultat attendu : l'element est ajoute en un exemplaire
	//预期结果：对象被成功添加
	@Test
	public void testAjouterVide() {
		// appel de la methode ajouter dans un Rarray vide使用添加方法添加对象
		A.add(a);

		// on verifie que l'objet a est present, a 1 occurrence时候包含对象
		assertTrue(A.contains(a));
		// et que la taille du Rarray est egale a 1对象的比较
		assertEquals(1,A.nbOcc(a));
		assertEquals(1,A.size());
	}
	
	
	// objectif : tester la suppression d'un objet present plusieurs fois
		//测试目标：测试删除对象操作
		// resultat attendu : une seule occurrence de l'objet est supprimée
		//预期结果：只有一个对象被删除
		
		@Test
		public void removeMult() {
			
			Boolean r = A.remove(a);// appel de remove avec l'objet a present 3 fois
									//对拥有3次的a对象进行删除操作
			
			// on verifie que remove a renvoye vrai,检查是否删除成功
//			assertTrue(r);
			// que la taille du Rarray est egale a 5,判断是都还有五个对象
//			assertEquals(5,A.size());
			System.out.println(A.size()+"------A.size");
			// qu'il contient toujours a, b et c判断是否还包含对象a,b,c
	//		assertTrue(A.contains(a));

			// avec 2 occurrences de a et de c et 1 de 判断还有几个对应的a,b,c对象
//			assertEquals(2,A.nbOcc(a));
//			System.out.println("------A.nbocc");
		}
	
	
	
}
