 class Book{
	private String title;
	private int pageNum;
	public String getTitle(){
	return title;
	}
	public void setTitle(String a){
	
	title=a;
		}

			public int getPageNum(){
	return pageNum;
	}
	public void setPageNum(int a){
	if(pageNum<200){
	System.out.println("����");
	pageNum=200;
	return;
	}
	pageNum=a;
		}
public void detail(){
System.out.println("����:"+title+"ҳ��:"+pageNum);

}

}