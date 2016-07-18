package chapter03;
import static com.maoruxin.javabook.util.Print.*;
// Default equals() does not compare contents
class Value{
	int i;
	public Value(int i){
		this.i = i;
	}
	@Override
	public boolean equals(Object obj) {
		if(this.i == ((Value)obj).i ){
			return true;
		}else{
			return false;
		}
	}
	
}
/*必须重写equal 才能比较内容，默认比较引用
 * 
 */
public class EqualsMethod2 {
	public static void main(String[] args) {
		Value v1 = new Value(100);
		Value v2 = new Value(100);
		print(v1.equals(v2));
		
	}

}
