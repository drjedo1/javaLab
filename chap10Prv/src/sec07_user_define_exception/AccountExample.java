package sec07_user_define_exception;

public class AccountExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account account = new Account();
		
//		 예금하기
		account.deposit(10000);
		System.out.println("예금액: "+account.getBalance());
		
//		출금하기 - 여기서 오류발생할수잇으니깐 try catch를 사용하자.
		try{
			account.withdraw(30000);
		} catch(BalanceInsufficientException e) {
			String message =  e.getMessage(); // 예외객체의 메시지만 반환한다.
			System.out.println(message);
			System.out.println();
			e.printStackTrace(); // 예외객체에 대한 자세한 정보(메시지, 예외클래스, 위치)를 출력해준다.
			
//
//			  Open Declaration   void java.lang.Throwable.printStackTrace()
//
//
//			Prints this throwable and its backtrace to thestandard error stream. This method prints a stack trace for this Throwable object on the error output stream that isthe value of the field System.err. The first line ofoutput contains the result of the toString() method forthis object. Remaining lines represent data previously recorded bythe method fillInStackTrace(). The format of thisinformation depends on the implementation, but the followingexample may be regarded as typical: 
//
//			 java.lang.NullPointerException
//			         at MyClass.mash(MyClass.java:9)
//			         at MyClass.crunch(MyClass.java:6)
//			         at MyClass.main(MyClass.java:3)
//			 
//			This example was produced by running the program:  class MyClass {
//			     public static void main(String[] args) {
//			         crunch(null);
//			     }
//			     static void crunch(int[] a) {
//			         mash(a);
//			     }
//			     static void mash(int[] b) {
//			         System.out.println(b[0]);
//			     }
//			 }
//			 
//			The backtrace for a throwable with an initialized, non-null causeshould generally include the backtrace for the cause. The formatof this information depends on the implementation, but the followingexample may be regarded as typical:  HighLevelException: MidLevelException: LowLevelException
//			         at Junk.a(Junk.java:13)
//			         at Junk.main(Junk.java:4)
//			 Caused by: MidLevelException: LowLevelException
//			         at Junk.c(Junk.java:23)
//			         at Junk.b(Junk.java:17)
//			         at Junk.a(Junk.java:11)
//			         ... 1 more
//			 Caused by: LowLevelException
//			         at Junk.e(Junk.java:30)
//			         at Junk.d(Junk.java:27)
//			         at Junk.c(Junk.java:21)
//			         ... 3 more
//			 
//			Note the presence of lines containing the characters "...".These lines indicate that the remainder of the stack trace for thisexception matches the indicated number of frames from the bottom of thestack trace of the exception that was caused by this exception (the"enclosing" exception). This shorthand can greatly reduce the lengthof the output in the common case where a wrapped exception is thrownfrom same method as the "causative exception" is caught. The aboveexample was produced by running the program:  public class Junk {
//			     public static void main(String args[]) {
//			         try {
//			             a();
//			         } catch(HighLevelException e) {
//			             e.printStackTrace();
//			         }
//			     }
//			     static void a() throws HighLevelException {
//			         try {
//			             b();
//			         } catch(MidLevelException e) {
//			             throw new HighLevelException(e);
//			         }
//			     }
//			     static void b() throws MidLevelException {
//			         c();
//			     }
//			     static void c() throws MidLevelException {
//			         try {
//			             d();
//			         } catch(LowLevelException e) {
//			             throw new MidLevelException(e);
//			         }
//			     }
//			     static void d() throws LowLevelException {
//			        e();
//			     }
//			     static void e() throws LowLevelException {
//			         throw new LowLevelException();
//			     }
//			 }
//
//			 class HighLevelException extends Exception {
//			     HighLevelException(Throwable cause) { super(cause); }
//			 }
//
//			 class MidLevelException extends Exception {
//			     MidLevelException(Throwable cause)  { super(cause); }
//			 }
//
//			 class LowLevelException extends Exception {
//			 }
//			 
//			As of release 7, the platform supports the notion of suppressed exceptions (in conjunction with the try-with-resources statement). Any exceptions that weresuppressed in order to deliver an exception are printed outbeneath the stack trace. The format of this informationdepends on the implementation, but the following example may beregarded as typical:  Exception in thread "main" java.lang.Exception: Something happened
//			  at Foo.bar(Foo.java:10)
//			  at Foo.main(Foo.java:5)
//			  Suppressed: Resource$CloseFailException: Resource ID = 0
//			          at Resource.close(Resource.java:26)
//			          at Foo.bar(Foo.java:9)
//			          ... 1 more
//			 
//			Note that the "... n more" notation is used on suppressed exceptionsjust at it is used on causes. Unlike causes, suppressed exceptions areindented beyond their "containing exceptions." 
//			An exception can have both a cause and one or more suppressedexceptions: 
//			 Exception in thread "main" java.lang.Exception: Main block
//			  at Foo3.main(Foo3.java:7)
//			  Suppressed: Resource$CloseFailException: Resource ID = 2
//			          at Resource.close(Resource.java:26)
//			          at Foo3.main(Foo3.java:5)
//			  Suppressed: Resource$CloseFailException: Resource ID = 1
//			          at Resource.close(Resource.java:26)
//			          at Foo3.main(Foo3.java:5)
//			 Caused by: java.lang.Exception: I did it
//			  at Foo3.main(Foo3.java:8)
//			 
//			Likewise, a suppressed exception can have a cause:  Exception in thread "main" java.lang.Exception: Main block
//			  at Foo4.main(Foo4.java:6)
//			  Suppressed: Resource2$CloseFailException: Resource ID = 1
//			          at Resource2.close(Resource2.java:20)
//			          at Foo4.main(Foo4.java:5)
//			  Caused by: java.lang.Exception: Rats, you caught me
//			          at Resource2$CloseFailException.<init>(Resource2.java:45)
//			          ... 2 more
//			 

		}
	}

}
