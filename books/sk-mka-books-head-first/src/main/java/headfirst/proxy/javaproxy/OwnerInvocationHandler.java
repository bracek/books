package headfirst.proxy.javaproxy;
 
import java.lang.reflect.*;
 
public class OwnerInvocationHandler implements InvocationHandler { 
	PersonBean person;
 
	public OwnerInvocationHandler(final PersonBean person) {
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
				throw new IllegalAccessException();
			} else if (method.getName().startsWith("set")) {
				return method.invoke(person, args);
			} 
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } 
		return null;
	}
}
