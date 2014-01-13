package headfirst.proxy.javaproxy;
 
import java.lang.reflect.*;
 
public class NonOwnerInvocationHandler implements InvocationHandler { 
	PersonBean person;
 
	public NonOwnerInvocationHandler(final PersonBean person) {
		this.person = person;
	}
 
	public Object invoke(final Object proxy,
final  Method method,
final  Object[] args) 
			throws IllegalAccessException {
  
		try {
			if (method.getName().startsWith("get")) {
				return method.invoke(person, args);
   			} else if (method.getName().equals("setHotOrNotRating")) {
				return method.invoke(person, args);
			} else if (method.getName().startsWith("set")) {
				throw new IllegalAccessException();
			} 
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } 
		return null;
	}
}
