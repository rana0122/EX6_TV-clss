
public class TV {
	private int channel;
	private int volume;
	private boolean power;
	
	public TV(int c, int v, boolean p){
		channel=c;
		volume=v;
		power=p;
	}

	public int getChannel() {
		return channel;
	}

	public int getVolume() {
		return volume;
	}

	public boolean isPower() {
		return power;
	}
	
	public void power(boolean on){
		if(on==true) this.power=true;
		else this.power=false;
	}
	public void channel(int channel){
		if(channel>255||channel<1)
			return;
		else this.channel=channel;
	}
	public void channel(boolean up){
		if(channel<256&&channel>0){
			if(up==true)
				channel++;
			else channel--;
		}else return;
		
	}
	public void volume(int volume){
		if(volume<0||volume>100){
			return;
		}else{
			this.volume=volume;
		}
	}
	public void volume(boolean up){
		if(this.volume<101&&this.volume>-1){
			if(up==true) this.volume++;
			else this.volume--;
		}else return;
	}
	public void status(){
		System.out.println("TV정보입니다.");
		System.out.println("채널"+channel);
		System.out.println("소리"+volume);
		System.out.println("전원"+power);
	}


}
