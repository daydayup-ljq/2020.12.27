package jiaojiao;
import jiaojiao.JianJian;

class JianJian{
		public void meetyou(){
			System.out.println("I lOVE YOU");
		}
	}


	class jiaojiao{
		public void meetwith(JianJian liu) {
			liu.meetyou();
		}
	}

public class TEST1 {

	public static void main(String[] args) {
				jiaojiao j=new jiaojiao();
				JianJian liu= new JianJian();
				j.meetwith(liu);
			}


		}
		
	
