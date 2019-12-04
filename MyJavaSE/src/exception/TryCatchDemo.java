package exception;
/**
 * 异常处理机制中的try-catch
 * 语法：
 * try {
 * 	代码片段
 * }catch(XXXException e){
 * 	当try中的代码XXXException时的处理代码
 * }
 * @author QAIU
 *
 */
public class TryCatchDemo {
	public static void main(String[] args) {
		/*
		 * 当jvm指定代码出现异常时，会自动实例化对应的异常实例
		 * 并将执行过设置好然后将其抛出
		 */
		System.out.println("程序开始了");
		try {
			String str = "a";
			System.out.println(str.length());
			System.out.println(str.charAt(0));
			System.out.println(Integer.parseInt(str));
			/*
			 * try语句中的某一个语句出现了异常，则后续的内容不会在执行
			 * 执行下面对应的catch后就从catch之后继续运行了
			 */
			System.out.println("!!!!!!!!");
		} catch (NullPointerException e) {
			e.printStackTrace();
		}
		catch (StringIndexOutOfBoundsException e) {
			System.out.println("下标越界异常");
		}
		/*
		 * 在最后一个catch捕获最大的Exception可以
		 * 最大程度避免因为一个未处理的异常导致程序中断
		 */
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("错了");
		}
		System.out.println("程序结束了");
	}

}
