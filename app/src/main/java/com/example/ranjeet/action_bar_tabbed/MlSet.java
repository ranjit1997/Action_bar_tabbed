package com.example.ranjeet.action_bar_tabbed;

import java.util.Scanner;

class Dis1{
	String name=" ";
	int c=0;
}
class Count{
	public static Dis1 a[]=new Dis1[10];
}
/*Diseases*/
class Diseases{
	void Dis(){
		int i;
		for(i=0;i<10;i++){
			Count.a[i]=new Dis1();
		}
	}
	void Cholera(){		
		Count.a[0].name="Cholera";
		Count.a[0].c++;
	}
	void Chickenpox(){
		Count.a[1].name="Chicken Pox";
		Count.a[1].c++;
	}
	void Pneumonia(){
		Count.a[2].name="Pneumonia";
		Count.a[2].c++;
	}
	void Typhoid(){
		Count.a[3].name="Typhoid";
		Count.a[3].c++;
	}
	void Malaria(){
		Count.a[4].name="Malaria";
		Count.a[4].c++;
	}
	void Dengue(){
		Count.a[5].name="Dengue";
		Count.a[5].c++;
	}
	void Tuberculosis(){
		Count.a[6].name="Tuberculosis";
		Count.a[6].c++;
	}
	void Bronchitis(){
		Count.a[7].name="Bronchitis";
		Count.a[7].c++;
	}
	void Influenza(){
		Count.a[8].name="Influenza";
		Count.a[8].c++;
	}
	void Hepatitis(){
		Count.a[9].name="Hepatitis";
		Count.a[9].c++;
	}

}
/*Common Symptoms*/
interface symp1{

	void fever();


	void cough();

		
	void cold();

	
	void headache();


	void diarrhoea();

	
	void bodyache();

	
	void stomachache();

}
/*Only Child Symptoms*/
interface symp2{

	void skinrash();

}
/*Only Adult Symptoms*/
interface symp3{

	void bloodinstool();

	
	void chestpain();
	
}
/*Child Diseases*/
class ChildSymp implements symp1,symp2{
	Diseases E=new Diseases();
	void Symp(){
		E.Dis();		
	}
	public void fever(){
		E.Chickenpox();
		E.Pneumonia();
		E.Dengue();
		E.Hepatitis();
		E.Influenza();
		E.Malaria();
		E.Tuberculosis();
		E.Typhoid();
	}	
	public void cold(){
		E.Pneumonia();
		E.Influenza();
		E.Bronchitis();
	}
	public void cough(){
		E.Pneumonia();
		E.Influenza();;
		E.Tuberculosis();
		E.Bronchitis();
	}
	public void headache(){
		E.Chickenpox();
		E.Typhoid();
		E.Malaria();
		E.Influenza();
		E.Bronchitis();
	}
	public void bodyache(){
		E.Dengue();
		E.Influenza();
		E.Malaria();
		E.Tuberculosis();
	}
	public void stomachache(){
		E.Hepatitis();
		E.Malaria();
		E.Typhoid();
		E.Cholera();
	}
	public void skinrash(){
		E.Chickenpox();
	}
	public void diarrhoea(){
		E.Cholera();
		E.Pneumonia();
		E.Typhoid();
		E.Malaria();
	}

}
/*Adult Diseases*/
class AdultSymp implements symp1,symp3{
	Diseases D=new Diseases();
	void Symp(){
		D.Dis();		
	}
	public void fever(){
		D.Chickenpox();
		D.Pneumonia();
		D.Dengue();
		D.Hepatitis();
		D.Influenza();
		D.Malaria();
		D.Tuberculosis();
		D.Typhoid();
	}	
	public void cold(){
		D.Pneumonia();
		D.Influenza();
		D.Bronchitis();
	}
	public void cough(){
		D.Pneumonia();
		D.Influenza();
		D.Tuberculosis();
		D.Bronchitis();
	}
	public void headache(){
		D.Chickenpox();
		D.Typhoid();
		D.Malaria();
		D.Influenza();
		D.Bronchitis();
	}
	public void bodyache(){
		D.Dengue();
		D.Influenza();
		D.Malaria();
		D.Tuberculosis();
	}
	public void stomachache(){
		D.Hepatitis();
		D.Malaria();
		D.Typhoid();
		D.Cholera();
	}
	public void bloodinstool(){
		D.Tuberculosis();
		D.Typhoid();
	}
	public void chestpain(){
		D.Pneumonia();
		D.Influenza();
		D.Bronchitis();
	}
	public void diarrhoea(){
		D.Cholera();
		D.Pneumonia();
		D.Typhoid();
		D.Malaria();
	}

}
/*Main class*/
class check{
	public static void main(String[] args)throws Exception {
		Scanner s=new Scanner(System.in);
		System.out.println("Welcome to Disease checker");
		System.out.print("Enter 1 if u r a child or 2 if u r an Adult:");
		int i=s.nextInt();
		if(i==1){
			ChildSymp p=new ChildSymp();
			p.Symp();
			System.out.println("Choose the number corresponding to the symptom u have");
			while (true){
				System.out.println("1)Fever\n2)Cough\n3)Cold\n4)Headache\n5)Diarrhoea\n6)Bodyache\n7)Stomachache\n8)Skinrash");
				System.out.println("Enter 0) to Exit");
				int c=s.nextInt();
				if (c==1){
					p.fever();
				}
				if (c==2){
					p.cough();
				}
				if (c==3){
					p.cold();
				}
				if (c==4){
					p.headache();
				}
				if (c==5){
					p.diarrhoea();
				}
				if (c==6){
					p.bodyache();
				}
				if (c==7){
					p.stomachache();
				}
				if (c==8){
					p.skinrash();
				}
				if (c==0){
					break;
				}
			}
		}
		if(i==2){
			AdultSymp p=new AdultSymp();
			p.Symp();
			System.out.println("Choose the number corresponding to the symptom u have");
			while (true){
				System.out.println("1)Fever\n2)Cough\n3)Cold\n4)Headache\n5)Diarrhoea\n6)Bodyache\n7)Stomachache\n8)Bloodinstool\n9)Chestpain");
				System.out.println("Enter 0) to Exit");
				int c=s.nextInt();
				if (c==1){
					p.fever();
				}
				if (c==2){
					p.cough();
				}
				if (c==3){
					p.cold();
				}
				if (c==4){
					p.headache();
				}
				if (c==5){
					p.diarrhoea();
				}
				if (c==6){
					p.bodyache();
				}
				if (c==7){
					p.stomachache();
				}
				if (c==8){
					p.bloodinstool();
				}
				if (c==9){
					p.chestpain();
				}
				if (c==0){
					break;
				}
			}
		}
		int j;
		Dis1 tmp=new Dis1();
		for(i=0;i<10;i++){
			for(j=0;j<(10-i-1);j++){
				if(Count.a[j].c<Count.a[j+1].c){
					tmp=Count.a[j];
					Count.a[j]=Count.a[j+1];
					Count.a[j+1]=tmp;
				}
			}
		}
		int flag=0;
		System.out.println("You could have(most probable to least probable):");
		for(j=0;j<10;j++){
			if (Count.a[j].c>1){
				System.out.println(Count.a[j].name);
				flag=1;
			}
		}
		if (flag==0)
			System.out.println("None!");
	}
}
