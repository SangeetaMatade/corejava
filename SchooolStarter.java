class SchooolStarter{
	public static void main(String args[])
	{
		Schoool schoool=new Schoool("CHANDAN",200,10000.0f);
		System.out.println(schoool.name);
		System.out.println(schoool.noOfStudents);
		System.out.println(schoool.fees);
		
		schoool.subject=new Subject("ENGLISH",6,"Hindi");
		Subject subject=schoool.subject;
		System.out.println(subject.name);
		System.out.println(subject.noOfSubjects);
		System.out.println(subject.favsubject);
	}
}