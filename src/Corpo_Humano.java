public class Corpo_Humano {

    private float massa;
    private float densidade;
    private float volume;
  
    public void setMassa(float massa){
      this.massa = massa;
    }

    public void setVolume(float volume){
      this.volume = volume;
    }

    public void calculardensidade(){
      densidade = massa/volume;
    }

    public float getDensidade(){
      return this.densidade;
    }
}
