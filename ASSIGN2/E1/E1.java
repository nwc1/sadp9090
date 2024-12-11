interface Beat {
    void checkHeartbeat();
}

class Heart {
    public void pumpBlood() {
        System.out.println("Heart is pumping blood.");
    }
}

class HeartBeatAdapter implements Beat {
    private final Heart heart;

    public HeartBeatAdapter(Heart heart) {
        this.heart = heart;
    }

    @Override
    public void checkHeartbeat() {
        heart.pumpBlood(); 
    }
}

public class E1 {
    public static void main(String[] args) {
     
        Heart heart = new Heart();
        
        Beat heartBeat = new HeartBeatAdapter(heart);
        
        heartBeat.checkHeartbeat();
    }
}
